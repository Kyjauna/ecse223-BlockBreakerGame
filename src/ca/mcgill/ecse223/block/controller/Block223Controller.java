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
import ca.mcgill.ecse223.block.model.Level;
import ca.mcgill.ecse223.block.model.Paddle;
import ca.mcgill.ecse223.block.model.Player;
import ca.mcgill.ecse223.block.model.User;
import ca.mcgill.ecse223.block.model.UserRole;
import ca.mcgill.ecse223.block.persistence.Block223Persistence;
import ca.mcgill.ecse223.block.persistence.PersistenceObjectStream;
import ca.mcgill.ecse223.block.controller.TOGame;


public class Block223Controller {

	// ****************************
	// Modifier methods
	// ****************************
	public static void createGame(String name) throws InvalidInputException {

		String error="";
		if (Block223Application.getCurrentUserRole() instanceof Admin == false) 
			error="Admin priveleges are required to create a game. ";
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		Block223 block223 = Block223Application.getBlock223();
		UserRole admin = Block223Application.getCurrentUserRole();
		int numberofblocks=1;
		try {

			Game game=new Game(name, numberofblocks, (Admin) admin, 1, 1, 1, 10, 10, block223);
			System.out.println(game.getNrBlocksPerLevel());
		}
		catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
	}

	public static void setGameDetails(int nrLevels, int nrBlocksPerLevel, int minBallSpeedX, int minBallSpeedY,
			Double ballSpeedIncreaseFactor, int maxPaddleLength, int minPaddleLength) throws InvalidInputException {
		// I'm not 100% sure my code's right cuz some of the things I'm a little meh about but yeah
		// Should I put this after the error checks
		
		String error = "";
		
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin privileges are required to define game settings. ";
		
		if (Block223Application.getCurrentGame() == null)
			error = error + "A game must be selected to define game settings. ";
		
		if (Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can define its game settings. ";
		
		if (nrLevels < 1 || nrLevels > 99)
			error = error + "The number of levels must be between 1 and 99. ";
		
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

	public static void deleteGame(String name) throws InvalidInputException {
		
		Block223 block223 = Block223Application.getBlock223();
		Game game = block223.findGame(name);
		String error="";
		// We must check that the user is an admin AND the admin of the game!
		
		if (!(Block223Application.getCurrentUserRole() instanceof Admin)) { 	
			error="Admin privileges are required to delete a game.";
		}
		
		if (error.length() > 0)
			throw new InvalidInputException(error.trim());
		
		if (game != null) {
			game.delete();
			Block223Persistence.save(block223);
		}
		
	}

	public static void selectGame(String name) throws InvalidInputException {
		String error = "";
		if(!(Block223Application.getCurrentUserRole() instanceof Admin))
			error = "Admin privledges are required to select a game.";			
		
		if (Block223Application.getCurrentUserRole() != Block223Application.getCurrentGame().getAdmin())
			error = "Only the admin who created the game can select the game.";
		
		if (error.length() > 0) 
			throw new InvalidInputException(error.trim());
	
		Game game = Block223Application.getBlock223().findGame(name);
			if ( game == null) 
				error = "A game with name" +name+ "does not exist.";
			if (error.length() > 0) 
				throw new InvalidInputException(error.trim());
		Block223Application.setCurrentGame(game);
	}

	public static void updateGame(String name, int nrLevels, int nrBlocksPerLevel, int minBallSpeedX, int minBallSpeedY,
			Double ballSpeedIncreaseFactor, int maxPaddleLength, int minPaddleLength) throws InvalidInputException {
		String error = "";
		if(!(Block223Application.getCurrentUserRole() instanceof Admin))
			error += "Admin privledges are required to define game settings.";		
		
		if(Block223Application.getCurrentGame() == null) 
				error += "A game must be selected to define game settings.";
		
		if (Block223Application.getCurrentGame().getAdmin() != Block223Application.getCurrentUserRole())
			error += "Only the admin who created the game can define its game settings.";
		
		if (error.length() > 0) 
			throw new InvalidInputException(error.trim());
		
		Game game = Block223Application.getCurrentGame();
		String currentName = Block223Application.getCurrentGame().getName();
			if(!(currentName.equals(name))) {
				try {
					game.setName(name);
				} catch(RuntimeException e) {
					error = e.getMessage();
					if(error.equals("name is not unique"))
						error = "the name of the game must be unique.";
				}
				throw new InvalidInputException(error);
				}
				setGameDetails(nrLevels, nrBlocksPerLevel, minBallSpeedX, minBallSpeedY, ballSpeedIncreaseFactor, maxPaddleLength, minPaddleLength);
				
	}

	public static void addBlock(int red, int green, int blue, int points) throws InvalidInputException {
		String error = "";
		if(!(Block223Application.getCurrentUserRole() instanceof Admin))
			error += "Admin privledges are required to add a block.";		
		
		if(Block223Application.CurrentGame == null)
				error += "A game must be selected to add a block.";
		
		if (Block223Application.getCurrentGame().getAdmin() != Block223Application.getCurrentUserRole())
			error += "Only the admin who created the game can add a block.";
		
		if (error.length() > 0) 
			throw new InvalidInputException(error.trim());
		
		Game game = Block223Application.getCurrentGame();
		List<Block> blocks = game.getBlocks();
			for (Block block : blocks) {
				if (block.getBlue() == blue && block.getRed() == red && block.getGreen()== green)
					throw new InvalidInputException ("A block with the same colour already exists for the game.");
			}
			try {
				game.addBlock(red, green, blue, points);
			}
			catch (RuntimeException e)	{
				throw new InvalidInputException(e.getMessage());
			}
	}

	public static void deleteBlock(int id) throws InvalidInputException {
		
		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)	
			error="Admin Privileges are required to delete a block. ";
		
		if (Block223Application.getCurrentGame()==null)
			error=error+"A game must be selected to delete a block. ";
		
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can delete a block. ";
		
		Block block = Block223Application.getCurrentGame().findBlock(id);
		
		if (block != null) {
			block.delete();
		}
		
	}

	public static void updateBlock(int id, int red, int green, int blue, int points) throws InvalidInputException {
		
		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)	
			error="Admin Privileges are required to update a block. ";
		
		if (Block223Application.getCurrentGame()==null)
			error=error+"A game must be selected to update a block. ";
		
		if (Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can update a block. ";
		
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
			error="Admin Privileges are required to move a block. ";
		
		if (Block223Application.getCurrentGame()==null)
			error=error+"A game must be selected to move a block. ";
		
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game may move a block. ";
	
		Game game=Block223Application.getCurrentGame();
		Level gameLevel;
		
		try {
			gameLevel=game.getLevel(level);
		}
		catch (IndexOutOfBoundsException e) {
			throw new InvalidInputException ("Level"+level+"does not exist for this game.");
		}
		
		int maxNrBlocksPerLevel = Block223Application.getCurrentGame().getNrBlocksPerLevel();
		if(gameLevel.numberOfBlockAssignments() == maxNrBlocksPerLevel) {
			throw new InvalidInputException ("The numer of blocks has reached the maximum number"+ maxNrBlocksPerLevel + "allowed for this game.");
		}
		
		for (BlockAssignment BA : gameLevel.getBlockAssignments()) {
			if(BA.getGridHorizontalPosition() == gridHorizontalPosition && BA.getGridVerticalPosition() == gridVerticalPosition) {
				throw new InvalidInputException("A block already exists at that location"+gridHorizontalPosition+"/"+gridVerticalPosition+".");
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

		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)	//instance of an admin
			error="Admin Privileges are required to move a block. ";
		
		if (Block223Application.getCurrentGame()==null)
			error=error+"A game must be selected to move a block. ";
		
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game may move a block. ";

		
		Game game=Block223Application.getCurrentGame();
		
		try {
			Level gameLevel=game.getLevel(level);
			BlockAssignment assignment=gameLevel.findBlockAssignment(oldGridHorizontalPosition, oldGridVerticalPosition);

			assignment.setGridHorizontalPosition(newGridHorizontalPosition);
			assignment.setGridVerticalPosition(newGridVerticalPosition);
		}
		catch (IndexOutOfBoundsException e) {
			throw new InvalidInputException ("Level"+level+"does not exist for this game.");
		}

	}
	public static void removeBlock(int level, int gridHorizontalPosition, int gridVerticalPosition)
			throws InvalidInputException {
		// Should I put this after the error checks
		String error = "";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin Privileges are required to define game settings. ";
		
		if (Block223Application.getCurrentGame() == null)
			error = error + "A game must be selected to remove a block. ";
		
		if (Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game may move a block. ";
		
		Game game = Block223Application.getCurrentGame();
		Level gameLevel = game.getLevel(level);
		BlockAssignment assignment = gameLevel.findBlockAssignment(gridHorizontalPosition, gridVerticalPosition);
		if (assignment != null) {
			assignment.delete();
		}
	}

	public static void saveGame() throws InvalidInputException {
		Block223 b=Block223Application.getBlock223();
		Block223Persistence.save(b);
	}

	public static void register(String username, String playerPassword, String adminPassword)
			throws InvalidInputException {
		
		String error = "";

		if (Block223Application.getCurrentUserRole()!=null)
			error = "Cannot register a new user while a user is logged in. ";
		
		if(playerPassword.equals(adminPassword))
			error += "Player and Admin passwords must be different. ";	
		
		if (error.length() > 0) {
			System.out.println(error.trim());
			throw new InvalidInputException(error.trim());
		}
		
		
		Block223 block223=Block223Application.resetBlock223();
		Player player = null;
		
		try{ 
			player= new Player(playerPassword, block223);
			User user= new User(username, block223, player);
			
			if(adminPassword!=null && adminPassword!= "") {
				Admin admin=new Admin(adminPassword, block223);
				user.addRole(admin);
			}
			saveGame();
		}
		catch(RuntimeException e) {
			if (e.getMessage().equals("The password must be specified.")||e.getMessage().equals("The username must be specified."))
				player.delete();
			throw new InvalidInputException(e.getMessage());
		}
	}

	public static void login(String username, String password) throws InvalidInputException {
		String error = "";
		
		if(Block223Application.getCurrentUserRole()!=null)
			error= "Cannot login a user while a user is logged in. ";

		
		Block223 b=Block223Application.resetBlock223();
		User user=b.findWithUsername(username);
		
		if(user==null)
			error=error+"There is no user with this username. ";
		
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


	// ****************************
	// Query methods
	// ****************************
	public static List<TOGame> getDesignableGames() throws InvalidInputException {

		Block223 block223 = Block223Application.getBlock223();
		// Is there a line for getCurrentUserRole() ?
		// I'm pretty sure there is because I need to throw an exception if the role is not AdminRole
		ArrayList<TOGame> result = new ArrayList<TOGame>();
		
		for (Game game: block223.getGames()) {
			if (game.getAdmin().equals(Block223Application.getCurrentUserRole())) { //CHECK THIS LINE -- based on sequence diagram
				TOGame togame= new TOGame(game.getName(), game.getLevels().size(), game.getNrBlocksPerLevel(), game.getBall().getMinBallSpeedX(), game.getBall().getMinBallSpeedY(), game.getBall().getBallSpeedIncreaseFactor(), game.getPaddle().getMaxPaddleLength(), game.getPaddle().getMinPaddleLength());
				result.add(togame);
			}
		}
		return result;

	}

	public static TOGame getCurrentDesignableGame() throws InvalidInputException {
		String error = "";
		if (!(Block223Application.getCurrentUserRole() instanceof Admin))
			error = "Admin privledges are required to access game information.";
		
		if (!(Block223Application.getCurrentGame() == null))
			error = "A game must be selected to acces its information.";
		
		if(Block223Application.getCurrentGame().getAdmin() != Block223Application.getCurrentUserRole())
			error = "Only the admin who created the game can acces the information.";
					if (error.length() > 0) {
						throw new InvalidInputException(error.trim());
				}

		Game game = Block223Application.getCurrentGame();
		TOGame to = new TOGame(game.getName(), game.getLevels().size(),game.getNrBlocksPerLevel(), game.getBall().getMinBallSpeedX(), game.getBall().getMinBallSpeedY(), game.getBall().getBallSpeedIncreaseFactor(), game.getPaddle().getMaxPaddleLength(), game.getPaddle().getMinPaddleLength());
		return to;
	}

	public static List<TOBlock> getBlocksOfCurrentDesignableGame() throws InvalidInputException {
		
		String error="";
		if (Block223Application.getCurrentUserRole()instanceof Admin == false)
			error="Admin Privileges are required to access game information. ";
		
		if (Block223Application.getCurrentGame()==null)
			error=error+"A game must be selected to access its information ";
		
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can access its information. ";
		
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
			error=error+"A game must be selected to access its information ";
		
		if(Block223Application.getCurrentGame().getAdmin()!=Block223Application.getCurrentUserRole())
			error=error+"Only the admin who created the game can access its information. ";
		
		if (Block223Application.getCurrentGame().findBlock(id) == null)
			error=error+"The block does not exist. ";
		
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

}