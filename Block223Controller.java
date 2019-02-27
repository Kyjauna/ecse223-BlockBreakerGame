package ca.mcgill.ecse223.block.controller;

import java.util.List;

import ca.mcgill.ecse223.block.controller.InvalidInputException;
import ca.mcgill.ecse223.block.application.Block223Application;
import ca.mcgill.ecse223.block.controller.TOUserMode.Mode;
import ca.mcgill.ecse223.block.model.Admin;
import ca.mcgill.ecse223.block.model.Block223;
import ca.mcgill.ecse223.block.model.Player;
import ca.mcgill.ecse223.block.model.User;
import ca.mcgill.ecse223.block.model.UserRole;;


public class Block223Controller {

	// ****************************
	// Modifier methods
	// ****************************
	public static void createGame(String name) throws InvalidInputException {
	}

	public static void setGameDetails(int nrLevels, int nrBlocksPerLevel, int minBallSpeedX, int minBallSpeedY,
			Double ballSpeedIncreaseFactor, int maxPaddleLength, int minPaddleLength) throws InvalidInputException {
	}

	public static void deleteGame(String name) throws InvalidInputException {
	}

	public static void selectGame(String name) throws InvalidInputException {
	}

	public static void updateGame(String name, int nrLevels, int nrBlocksPerLevel, int minBallSpeedX, int minBallSpeedY,
			Double ballSpeedIncreaseFactor, int maxPaddleLength, int minPaddleLength) throws InvalidInputException {
	}

	public static void addBlock(int red, int green, int blue, int points) throws InvalidInputException {
	}

	public static void deleteBlock(int id) throws InvalidInputException {
	}

	public static void updateBlock(int id, int red, int green, int blue, int points) throws InvalidInputException {
	}

	public static void positionBlock(int id, int level, int gridHorizontalPosition, int gridVerticalPosition)
			throws InvalidInputException {
	}

	public static void moveBlock(int level, int oldGridHorizontalPosition, int oldGridVerticalPosition,
			int newGridHorizontalPosition, int newGridVerticalPosition) throws InvalidInputException {
		
		if (getCurrentUserRole()!= )	//instance of an admin
			throw new InvalidInputException ("Admin Privileges are required to move a block.");
		
		if (getCurrentGame()==null)
			throw new InvalidInputException ("A game must be selected to move a block.");
		
		if(getCurrentGame().getAdmin()!=getCurrentUserRole())
			throw new InvalidInputException ("Only the admin who created the game may move a block.");

		Game game=getCurrentGame();
		
		try {
			Level level=getLevel(level);
			BlockAssignment assignment=level.findBlockAssignment(oldGridHorizontalPosition, oldGridVerticalPosition);
			assignment.setGridHorizontalPosition(newGridHorizontalPosition);
			assignment.setGridVerticalPosition(newGridVerticalPosition);
		}
		catch (IndexOutOfBoundsException e) {
			throw new InvalidInputException ("Level"+level+"does not exist for this game.");
		}
	}

	public static void removeBlock(int level, int gridHorizontalPosition, int gridVerticalPosition)
			throws InvalidInputException {
	}

	public static void saveGame() throws InvalidInputException {
	}

	public static void register(String username, String playerPassword, String adminPassword)
			throws InvalidInputException {
		
		String error = "";
		Block223 block223=Block223Application.getBlock223();
		
		if (Block223Application.getCurrentUserRole()!=null)
			error = "Cannot register a new user while a user is logged in. ";
		
		if(playerPassword==adminPassword)
			error = error + "Player and Admin passwords must be different. ";	
		
		if (error.length() > 0) {
			throw new InvalidInputException(error.trim());
		}
		
		try{ 
			Player player= new Player(playerPassword, block223);
			User user= new User(username, block223, player);
			
			if(adminPassword!=null&&adminPassword!= "") {
				Admin admin=new Admin(adminPassword, block223);
				user.addRole(admin);
			}
		}
		catch(RuntimeException e) {
			
			if (e.getMessage()=="The password must be specified."||e.getMessage()=="The username must be specified.")
				//player.delete();
			throw new InvalidInputException(e.getMessage());
		}
		//save(block223);
	}

	public static void login(String username, String password) throws InvalidInputException {
		String error = "";
		
		if(Block223Application.getCurrentUserRole()!=null)
			error= "Cannot login a user while a user is logged in. ";

		User user=Block223Application.getWithUsername(username);
		
		if(user==null)
			error=error+"There is no user with this username. ";
		
		for (int i=0; i<user.numberOfRoles();i++) {
			String rolePassword= user.getRole(i).getPassword();
			
			if (rolePassword==password) {
				Block223Application.setCurrentUserRole(user.getRole(i));
				//resetBlock223();
			}
		}
			
		if(password!=user.getRole(0).getPassword() && password!=user.getRole(1).getPassword())
			error=error+"The username and password do not match. ";
		
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
	}

	public static TOGame getCurrentDesignableGame() throws InvalidInputException {
	}

	public static List<TOBlock> getBlocksOfCurrentDesignableGame() throws InvalidInputException {
	}

	public static TOBlock getBlockOfCurrentDesignableGame(int id) throws InvalidInputException {
	}

	public List<TOGridCell> getBlocksAtLevelOfCurrentDesignableGame(int level) throws InvalidInputException {
	}

	public static TOUserMode getUserMode() {
		UserRole userRole=Block223Application.getCurrentUserRole();
		
		if (userRole==null) {
			TOUserMode to=new TOUserMode(Mode.None);
			return to;
	}
		if () { //check if userRole is an instance of an admin
			TOUserMode to=new TOUserMode(Mode.Design);
			return to;
		}
		if () { //check if userRole is an instance of a player
			TOUserMode to=new TOUserMode(Mode.Play);
			return to;
		}
}