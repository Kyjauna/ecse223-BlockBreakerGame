package ca.mcgill.ecse223.block.controller;

import java.util.ArrayList;
import java.util.List;


import ca.mcgill.ecse223.block.controller.InvalidInputException;
import ca.mcgill.ecse223.block.application.Block223Application;
import ca.mcgill.ecse223.block.controller.TOUserMode.Mode;
import ca.mcgill.ecse223.block.model.Admin;
import ca.mcgill.ecse223.block.model.Ball;
import ca.mcgill.ecse223.block.model.Block;
import ca.mcgill.ecse223.block.model.Block223;
import ca.mcgill.ecse223.block.model.BlockAssignment;
import ca.mcgill.ecse223.block.model.Game;
import ca.mcgill.ecse223.block.model.HallOfFameEntry;
import ca.mcgill.ecse223.block.model.Level;
import ca.mcgill.ecse223.block.model.Paddle;
import ca.mcgill.ecse223.block.model.PlayedGame;
import ca.mcgill.ecse223.block.model.Player;
import ca.mcgill.ecse223.block.model.User;
import ca.mcgill.ecse223.block.model.UserRole;
import ca.mcgill.ecse223.block.persistence.Block223Persistence;
import ca.mcgill.ecse223.block.view.Block223PlayModeInterface;
import ca.mcgill.ecse223.block.controller.TOGame;


public class Block223Controller {

	// ****************************
	// Modifier methods
	// ****************************
	public static void createGame(String name) throws InvalidInputException {

		String error="";
		if (Block223Application.getCurrentUserRole() instanceof Admin == false) 
			error="Admin privileges are required to create a game. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		Block223 block223 = Block223Application.getBlock223();
		UserRole admin = Block223Application.getCurrentUserRole();
		Game game;
		
		if (Block223Application.getBlock223().findGame(name) != null) {
			throw new InvalidInputException("The name of a game must be unique.");
		}
		
		try {
			game=new Game(name, 1, (Admin) admin, 1, 1, 1, 1, 1, block223);
		}
		catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
		Block223Application.setCurrentGame(game);
	}

	public static void setGameDetails(int nrLevels, int nrBlocksPerLevel, int minBallSpeedX, int minBallSpeedY,
			Double ballSpeedIncreaseFactor, int maxPaddleLength, int minPaddleLength) throws InvalidInputException {
		// I'm not 100% sure my code's right cuz some of the things I'm a little meh about but yeah
		// Should I put this after the error checks
		
		String error = "";
		
		if (Block223Application.getCurrentGame() == null)
			throw new InvalidInputException("A game must be selected to define game settings.");
		
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin privileges are required to define game settings. ";
		
		if (Block223Application.getCurrentGame().getAdmin()!= Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can define its game settings. ";
		
		if (nrLevels < 1 || nrLevels > 99)
			error = error + "The number of levels must be between 1 and 99. ";
      	
		if (minPaddleLength <= 0)
   			throw new InvalidInputException("The minimum length of the paddle must be greater than zero.");
		
		if (maxPaddleLength <= 0 || maxPaddleLength > 390)
   			throw new InvalidInputException("The maximum length of the paddle must be greater than zero and less than or equal to 390.");
		
	 	if (nrBlocksPerLevel <= 0)
	   			throw new InvalidInputException("The number of blocks per level must be greater than zero.");
		
	 	if (ballSpeedIncreaseFactor <= 0)
   			throw new InvalidInputException("The speed increase factor of the ball must be greater than zero.");  
	 	
	 	if (minBallSpeedY <= 0 && minBallSpeedX <= 0)
   			throw new InvalidInputException("The minimum speed of the ball must be greater than zero.");  
	 	
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		if (checkNumberOfBAs(nrBlocksPerLevel)) 
			throw new InvalidInputException("The maximum number of blocks per level cannot be less than the number of existing blocks in a level.");
		
		Game game = Block223Application.getCurrentGame();
		game.setNrBlocksPerLevel(nrBlocksPerLevel);
		Ball gameBall = game.getBall();
		gameBall.setMinBallSpeedX(minBallSpeedX);
		gameBall.setMinBallSpeedY(minBallSpeedY);
		gameBall.setBallSpeedIncreaseFactor(ballSpeedIncreaseFactor);
		Paddle gamePaddle = game.getPaddle();
		gamePaddle.setMaxPaddleLength(maxPaddleLength);
		gamePaddle.setMinPaddleLength(minPaddleLength);

		while (nrLevels > game.numberOfLevels()) {
			game.addLevel();
		}
		while (nrLevels < game.numberOfLevels()) {
			Level level = game.getLevel(game.numberOfLevels()-1);
			level.delete();
		}
	}
	
	public static boolean checkNumberOfBAs(int nrBlocksPerLevel) {
		for (Level level: Block223Application.getCurrentGame().getLevels()) {
			int currentNumberofBlocks=level.numberOfBlockAssignments();
			if (currentNumberofBlocks > nrBlocksPerLevel)
				return true;
		}
		return false;
	}

	public static void deleteGame(String name) throws InvalidInputException {
		
		Block223 block223 = Block223Application.getBlock223();
		Game game = block223.findGame(name);
		String error="";
		// We must check that the user is an admin AND the admin of the game!
		
		if (!(Block223Application.getCurrentUserRole() instanceof Admin)) { 	
			error= "Admin privileges are required to delete a game. ";
		}
		/*if (Block223Application.getCurrentGame().getAdmin()!= Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can delete the game. ";*/
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		if (game != null) {
			game.delete();
			saveGame();
		}
		
	}

	public static void selectGame(String name) throws InvalidInputException {
		
		String error = "";
		Game game = Block223Application.getBlock223().findGame(name);
		
		if (game == null) 
			throw new InvalidInputException("A game with name " +name+ " does not exist.");
		
		if(!(Block223Application.getCurrentUserRole() instanceof Admin)) {
			error = "Admin privileges are required to select a game. ";	
		throw new InvalidInputException(error);
		}

		if (Block223Application.getCurrentUserRole() != game.getAdmin()) {
			error += "Only the admin who created the game can select the game. ";
			
			throw new InvalidInputException(error);
		}
		
		Block223Application.setCurrentGame(game);
	}

	public static void updateGame(String name, int nrLevels, int nrBlocksPerLevel, int minBallSpeedX, int minBallSpeedY,
			Double ballSpeedIncreaseFactor, int maxPaddleLength, int minPaddleLength) throws InvalidInputException {
		String error = "";
		
		if(Block223Application.getCurrentGame() == null) 
			throw new InvalidInputException("A game must be selected to define game settings.");
		
		if(!(Block223Application.getCurrentUserRole() instanceof Admin))
			error += "Admin privileges are required to define game settings. ";		
		
		if (Block223Application.getCurrentGame().getAdmin() != Block223Application.getCurrentUserRole())
			error += "Only the admin who created the game can define its game settings. ";
		
		if (error.length() > 0) 
			throw new InvalidInputException(error.trim());
		
		if (name == null || name.equals("")) 
			throw new InvalidInputException("The name of a game must be specified.");
		
		if ((Block223Application.getBlock223().findGame(name))!=null&&(!(Block223Application.getCurrentGame().getName()).equals(name)))
			throw new InvalidInputException("The name of a game must be unique.");
		
		
		
		Game game = Block223Application.getCurrentGame();
		
		String currentName = Block223Application.getCurrentGame().getName();
		
			if(!(currentName.equals(name))) {
				try {
					game.setName(name);
					setGameDetails(nrLevels, nrBlocksPerLevel, minBallSpeedX, minBallSpeedY, ballSpeedIncreaseFactor, maxPaddleLength, minPaddleLength);
				} 
				catch(InvalidInputException e) {
					throw new InvalidInputException(e.getMessage());
				}
				
			}		
	}

	public static void addBlock(int red, int green, int blue, int points) throws InvalidInputException {
		
		if(Block223Application.getCurrentGame() == null)
			throw new InvalidInputException("A game must be selected to add a block.");
					
		String error = "";
		if(!(Block223Application.getCurrentUserRole() instanceof Admin))
			error += "Admin privileges are required to add a block.";		
		

		
		if (Block223Application.getCurrentGame().getAdmin() != Block223Application.getCurrentUserRole())
			error += "Only the admin who created the game can add a block.";
		
		if (error.length() > 0) 
			throw new InvalidInputException(error.trim());
		
		Game game = Block223Application.getCurrentGame();
		List<Block> blocks = game.getBlocks();
			for (Block block : blocks) {
				if (block.getBlue() == blue && block.getRed() == red && block.getGreen()== green)
					throw new InvalidInputException ("A block with the same color already exists for the game.");
			}
			try {
				game.addBlock(red, green, blue, points);
			}
			catch (RuntimeException e)	{
				throw new InvalidInputException(e.getMessage());
			}
	}

	public static void deleteBlock(int id) throws InvalidInputException {
		
		if (Block223Application.getCurrentGame()==null)
			throw new InvalidInputException("A game must be selected to delete a block.");
		
		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)	
			error="Admin privileges are required to delete a block. ";
		

		
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can delete a block. ";
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		Block block = Block223Application.getCurrentGame().findBlock(id);
		
		if (block != null) {
			block.delete();
		}
		
	}

	public static void updateBlock(int id, int red, int green, int blue, int points) throws InvalidInputException {
		
		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)	
			error="Admin privileges are required to update a block. ";
		
		if (Block223Application.getCurrentGame()==null)
			error=error+"A game must be selected to update a block. ";
		
		if (Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can update a block. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		for (Block B : Block223Application.getCurrentGame().getBlocks())
			if (B.getRed()== red && B.getBlue()== blue && B.getGreen() == green)
			error=error+"A block with the sames color already exists for the game. ";
			
		
		//Game game = Block223Application.getCurrentGame();
		Block block = Block223Application.getCurrentGame().findBlock(id);
		
		if (Block223Application.getCurrentGame().findBlock(id) == null)
			error=error+"The block does not exist. ";
		
		block.setRed(red);
		block.setGreen(green);
		block.setBlue(blue);
		block.setPoints(points);
		
			
	}

	public static void positionBlock(int id, int level, int gridHorizontalPosition, int gridVerticalPosition)
			throws InvalidInputException {
		
		String error="";
		
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin Privileges are required to position a block. ";
		
		if (Block223Application.getCurrentGame()==null)
			error=error+"A game must be selected to position a block. ";
		
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can position a block. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		Game game=Block223Application.getCurrentGame();
		Level gameLevel;
		
		try {
			gameLevel=game.getLevel(level-1);
		}
		catch (IndexOutOfBoundsException e) {
			throw new InvalidInputException ("Level"+(level-1)+"does not exist for this game.");
		}
		
		int maxNrBlocksPerLevel = Block223Application.getCurrentGame().getNrBlocksPerLevel();
		if(gameLevel.numberOfBlockAssignments() == maxNrBlocksPerLevel) {
			throw new InvalidInputException ("The number of blocks has reached the maximum number "+ maxNrBlocksPerLevel + " allowed for this game.");
		}
		
		for (BlockAssignment BA : gameLevel.getBlockAssignments()) {
			if(BA.getGridHorizontalPosition() == gridHorizontalPosition && BA.getGridVerticalPosition() == gridVerticalPosition) {
				throw new InvalidInputException("A block already exists at that location "+gridHorizontalPosition+"/"+gridVerticalPosition+".");
			}
		}

		Block block = game.findBlock(id);
		
		if(game.findBlock(id) == null) {
			throw new InvalidInputException("The block does not exist.");
		}
		
		BlockAssignment newBlock = new BlockAssignment(gridHorizontalPosition, gridVerticalPosition,gameLevel, block, game);
	}

	public static void moveBlock(int level, int oldGridHorizontalPosition, int oldGridVerticalPosition,
			int newGridHorizontalPosition, int newGridVerticalPosition) throws InvalidInputException {

		if (Block223Application.getCurrentGame()==null)
			throw new InvalidInputException("A game must be selected to move a block. ");
		
		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)	//instance of an admin
			error="Admin Privileges are required to move a block. ";

		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can move a block. ";

		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		Game game=Block223Application.getCurrentGame();
		Level gameLevel;
		
		try {
			gameLevel=game.getLevel(level-1);
			BlockAssignment assignment = gameLevel.findBlockAssignment(oldGridHorizontalPosition, oldGridVerticalPosition);

			for (BlockAssignment BA : gameLevel.getBlockAssignments()) {
				if(BA.getGridHorizontalPosition() == newGridHorizontalPosition && BA.getGridVerticalPosition() == newGridVerticalPosition) {
					throw new InvalidInputException("A block already exists at that location "+newGridHorizontalPosition+"/"+newGridVerticalPosition+".");
				}
			}
			
			if (assignment != null) {
				assignment.setGridHorizontalPosition(newGridHorizontalPosition);
				assignment.setGridVerticalPosition(newGridVerticalPosition);
			}
			
		}
		catch (IndexOutOfBoundsException e) {
			throw new InvalidInputException ("Level "+level+" does not exist for the game.");
		}

	}
	public static void removeBlock(int level, int gridHorizontalPosition, int gridVerticalPosition)
			throws InvalidInputException {
		// Should I put this after the error checks
		
		String error = "";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin privileges are required to remove a block. ";
		
		if (Block223Application.getCurrentGame() == null)
			throw new InvalidInputException("A game must be selected to remove a block.");
		
		if (Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can remove a block. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		Game game = Block223Application.getCurrentGame();
		Level gameLevel = game.getLevel(level-1);
		BlockAssignment assignment = gameLevel.findBlockAssignment(gridHorizontalPosition, gridVerticalPosition);
		if (assignment != null) {
			assignment.delete();
		}
	}

	public static void saveGame() throws InvalidInputException {
		
		String error = "";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin privileges are required to save a game. ";
		
		if (Block223Application.getCurrentGame() == null)
			error = error + "A game must be selected to save it. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		if (Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can save it. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		Block223 b=Block223Application.getBlock223();
		
		Block223Persistence.save(b);
	
	}

	public static void register(String username, String playerPassword, String adminPassword)
			throws InvalidInputException {
		
		Block223 block223=Block223Application.getBlock223();

		String error = "";
				
		if (playerPassword == null||playerPassword.equals(""))
			throw new InvalidInputException("The player password needs to be specified.");
		
		if (Block223Application.getCurrentUserRole()!=null)
			error = "Cannot register a new user while a user is logged in. ";
	
		if (playerPassword.equals(adminPassword))
			error += "The passwords have to be different. ";	
			
		if (error.length() > 0) {
			throw new InvalidInputException(error.trim());
		}
		
		Player player = null;
		Admin admin = null;
		
		try{ 
			player= new Player(playerPassword, block223);
			User user= new User(username, block223, player);
			
			if(!(adminPassword==null||adminPassword.equals(""))) {
				admin=new Admin(adminPassword, block223);
				user.addRole(admin);
			}
			
			Block223Persistence.save(block223);
		}
		catch(RuntimeException e) {	
			if (e.getMessage().equals("The username must be specified.")) {
				player.delete();
				throw new InvalidInputException(e.getMessage());}
			if (e.getMessage().equals("Cannot create due to duplicate username")) {
				player.delete();
				throw new InvalidInputException("The username has already been taken.");}
			
			else if(player!=null) {player.delete();}
			
			else if(admin!=null) {admin.delete();}
			throw new InvalidInputException(e.getMessage());

			
		}
	}

	public static void login(String username, String password) throws InvalidInputException {
		String error = "";
		
		if(Block223Application.getCurrentUserRole()!=null)
			error= "Cannot login a user while a user is already logged in. ";

		Block223 b=Block223Application.resetBlock223();
		User user=b.findWithUsername(username);
		
		if(user==null||password.equals(""))
			error=error+"The username and password do not match. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		for (int i=0; i<user.numberOfRoles();i++) {
			String rolePassword= user.getRole(i).getPassword();
			
			if (rolePassword.equals(password)) {
				Block223Application.setCurrentUserRole(user.getRole(i));
			}
		}
			
		if(password.equals(user.getRole(0).getPassword())==false && password.equals(user.getRole(1).getPassword())==false)
			error= error+"The username and password do not match. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
	}

	public static void logout() {
		Block223Application.setCurrentUserRole(null);
	}

	public static void selectPlayableGame(String name, int id) throws InvalidInputException  {
	}

	public static void startGame(Block223PlayModeInterface ui) throws InvalidInputException {
	}

	public static void testGame(Block223PlayModeInterface ui) throws InvalidInputException {
	
		if (!(Block223Application.getCurrentUserRole() instanceof Admin))
			throw new InvalidInputException("Admin privileges are required to test a game.");
		
		if (Block223Application.getCurrentGame()==null)
			throw new InvalidInputException("A game must be selected to test it.");
		
		if (Block223Application.getCurrentUserRole()!=Block223Application.getCurrentGame().getAdmin())
			throw new InvalidInputException("Only the admin who created the game can test it.");
		
		Game game = Block223Application.getCurrentGame();
		UserRole admin= game.getAdmin();
		Block223 b =Block223Application.getBlock223();
		
		String username= b.findWithRole(admin).getUsername();
		PlayedGame pgame=new PlayedGame(username, game, b);
		pgame.setPlayer(null);
		Block223Application.setCurrentPlayableGame(pgame);
		
		startGame(ui);
		
	}

	public static void publishGame () throws InvalidInputException {
		
		if (!(Block223Application.getCurrentUserRole() instanceof Admin))
			throw new InvalidInputException("Admin privileges are required to publish a game.");
		
		if (Block223Application.getCurrentGame()==null)
			throw new InvalidInputException("A game must be selected to publish it.");
		
		if (Block223Application.getCurrentUserRole()!=Block223Application.getCurrentGame().getAdmin())
			throw new InvalidInputException("Only the admin who created the game can publish it.");
		
		if (Block223Application.getCurrentGame().getNrBlocksPerLevel()<1)
			throw new InvalidInputException("At least on block must be defined for a game to be published.");
		
		Game game =Block223Application.getCurrentGame();
		game.setPublished(true);
		
	}
	

	// ****************************
	// Query methods
	// ****************************
	public static List<TOGame> getDesignableGames() throws InvalidInputException {

		Block223 block223 = Block223Application.getBlock223();
		// Is there a line for getCurrentUserRole() ?
		// I'm pretty sure there is because I need to throw an exception if the role is not AdminRole
		ArrayList<TOGame> result = new ArrayList<TOGame>();
		UserRole user = Block223Application.getCurrentUserRole();
		
		if (!(user instanceof Admin)) {
			throw new InvalidInputException("Admin privileges are required to access game information.");
		}
		
		for (Game game: block223.getGames()) {
			Admin gameAdmin = game.getAdmin();
			if (gameAdmin.equals((Admin)user)) { 
				TOGame togame= new TOGame(game.getName(), game.getLevels().size(), game.getNrBlocksPerLevel(), game.getBall().getMinBallSpeedX(), game.getBall().getMinBallSpeedY(), game.getBall().getBallSpeedIncreaseFactor(), game.getPaddle().getMaxPaddleLength(), game.getPaddle().getMinPaddleLength());
				result.add(togame);
			}
		}
		return result;

	}

	public static TOGame getCurrentDesignableGame() throws InvalidInputException {
		
		if (Block223Application.getCurrentGame() == null)
			throw new InvalidInputException ("A game must be selected to access its information.");
		
		String error = "";
		
		if (!(Block223Application.getCurrentUserRole() instanceof Admin))
			throw new InvalidInputException ("Admin privileges are required to access game information.");
		
		if(Block223Application.getCurrentGame().getAdmin() != Block223Application.getCurrentUserRole())
			error = "Only the admin who created the game can access its information.";
		
		if (error.length() > 0) 
			throw new InvalidInputException(error.trim());
		

		Game game = Block223Application.getCurrentGame();
		TOGame to = new TOGame(game.getName(), game.getLevels().size(),game.getNrBlocksPerLevel(), game.getBall().getMinBallSpeedX(), game.getBall().getMinBallSpeedY(), game.getBall().getBallSpeedIncreaseFactor(), game.getPaddle().getMaxPaddleLength(), game.getPaddle().getMinPaddleLength());
		return to;
	}

	public static List<TOBlock> getBlocksOfCurrentDesignableGame() throws InvalidInputException {
		
		if (Block223Application.getCurrentGame()==null)
			throw new InvalidInputException("A game must be selected to access its information.");
	
		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin privileges are required to access game information. ";
	
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can access its information. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		Game game = Block223Application.getCurrentGame();
		ArrayList<TOBlock> result = new ArrayList<>();
		for (Block block : game.getBlocks()) {
			TOBlock tobck = new TOBlock(block.getId(), block.getRed(), block.getGreen(), block.getBlue(), block.getPoints());
			result.add(tobck);
		}
		
		return result;
		
	}

	public static TOBlock getBlockOfCurrentDesignableGame(int id) throws InvalidInputException {
		
		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin Privileges are required to access game information. ";
		
		if (Block223Application.getCurrentGame()==null)
			error=error+"A game must be selected to access its information. ";
		
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can access its information. ";
		
		if (Block223Application.getCurrentGame().findBlock(id) == null)
			error=error+"The block does not exist. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		//Game game = Block223Application.getCurrentGame();
		Block block = Block223Application.getCurrentGame().findBlock(id);
		TOBlock tobck1 = new TOBlock(block.getId(), block.getRed(), block.getGreen(), block.getBlue(), block.getPoints());
		
		return tobck1;
	
	}

	public static List<TOGridCell> getBlocksAtLevelOfCurrentDesignableGame(int level) throws InvalidInputException {
		
		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin Privileges are required to access game information. ";
		
		if (Block223Application.getCurrentGame()==null)
			error=error+"A game must be selected to access its information ";
		
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can access its information. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		Game game = Block223Application.getCurrentGame();
		Level gameLevel = game.getLevel(level);
		
		ArrayList<TOGridCell> result = new ArrayList<>();
		
		for(BlockAssignment bA: gameLevel.getBlockAssignments()) {
			TOGridCell toba = new TOGridCell(bA.getGridHorizontalPosition(),bA.getGridVerticalPosition(), bA.getBlock().getId(), 
					bA.getBlock().getRed(), bA.getBlock().getGreen(), bA.getBlock().getBlue(), bA.getBlock().getPoints());
			result.add(toba);
		}
		return result;
	}

	public static TOUserMode getUserMode() {

		UserRole userRole=Block223Application.getCurrentUserRole();

		if (userRole instanceof Admin) {
			TOUserMode to=new TOUserMode(Mode.Design);
			return to;
		}
		if (userRole instanceof Player) {
			TOUserMode to=new TOUserMode(Mode.Play);
			return to;
		}	
		else {
			TOUserMode to=new TOUserMode(Mode.None);
			return to;
		}
			
	}
	
	
	// play mode

	public static List<TOPlayableGame> getPlayableGames() throws InvalidInputException {
		return null;
	}

	public static List<TOCurrentlyPlayedGame> getCurrentPlayableGame() throws InvalidInputException {
		return null;
	}

	public static TOHallOfFame getHallOfFame(int start, int end) throws InvalidInputException {
		UserRole userRole=Block223Application.getCurrentUserRole();
		
		if (!(userRole instanceof Player))
			throw new InvalidInputException("Player privileges are required to access a game's hall of fame.");
		
		if (Block223Application.getCurrentPlayableGame() == null)
			throw new InvalidInputException("A game must be selected to view its hall of fame.");
		
		PlayedGame pgame = Block223Application.getCurrentPlayableGame();
		Game game = pgame.getGame();
		TOHallOfFame result = new TOHallOfFame(game.getName());
		
		for (int i = start ; i<= end; i++) {
			TOHallOfFameEntry entry = new TOHallOfFameEntry(i+1, game.getHallOfFameEntry(i).getPlayername(), game.getHallOfFameEntry(i).getScore(), result);
			result.addEntry(entry);
		}
		
		return result;
		
		
	}

	public static TOHallOfFame getHallOfFameWithMostRecentEntry(int numberOfEntries) throws InvalidInputException {
		UserRole userRole=Block223Application.getCurrentUserRole();
		
		if (!(userRole instanceof Player))
			throw new InvalidInputException("Player privileges are required to access a game's hall of fame.");
		
		if (Block223Application.getCurrentPlayableGame() == null)
			throw new InvalidInputException("A game must be selected to view its hall of fame.");
		
		PlayedGame pgame = Block223Application.getCurrentPlayableGame();
		Game game = pgame.getGame();
		
		TOHallOfFame result = new TOHallOfFame(game.getName()); 
		HallOfFameEntry mostRecent = game.getMostRecentEntry();
		
		int indexR = game.indexOfHallOfFameEntry(mostRecent);
		
		int start = indexR - (game.numberOfHallOfFameEntries() / 2 );
		
		if (start < 1 ) {
			start = 1;
		}
		
		int end = game.numberOfHallOfFameEntries();
			if(end > game.numberOfHallOfFameEntries()) {
				end = game.numberOfHallOfFameEntries();
			}
			
		start = start -1;
		end = end -1;
		 		
		for (int i = start ; i<= end; i++) {
			TOHallOfFameEntry entry = new TOHallOfFameEntry(i+1, game.getHallOfFameEntry(i).getPlayername(), game.getHallOfFameEntry(i).getScore(), result);		
		result.addEntry(entry);
	}
		return result;
}



}
