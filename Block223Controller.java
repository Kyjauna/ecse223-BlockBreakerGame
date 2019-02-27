package ca.mcgill.ecse223.block.controller;

import java.util.List;

public class Block223Controller {

	// ****************************
	// Modifier methods
	// ****************************
	public static void createGame(String name) throws InvalidInputException {
		Block223 block223 = Block223Application.getBlock223();
		/* try {
			block223.currentUserRole();
			Block223Persistence.save(block223); //not sure about this line
		}
		catch (RuntimeException e) {
			throw new InvalidInputException("Admin priveleges are required to create a game.");
		} */
		
		if (Block223Application.currentUserRole != admin) {
			throw new InvalidInputException("Admin priveleges are required to create a game.");
		}
		
		try {
			block223.create(name, 1, admin, 1, 1, 1, 10, 10, block223);
			Block223Persistence.save(block223);
		}
		catch (RuntimeException e) {
			throw new InvalidInputException("The name of a game must be specified."); //or e.getMessage()
		}
		
		Game game = findGame(name);
		if (game == null) {
			throw new InvalidInputException("The name of a game must be unique.");
		}
	}
	
	private static Game findGame(String name) {
		Game foundGame = null;
		for (Game game : Block223Application.getBlock223().getGames()) {
			if (game.getName() == name) {
				foundGame = game;
				break;
			}
		}
		return foundGame;
	}

	public static void setGameDetails(int nrLevels, int nrBlocksPerLevel, int minBallSpeedX, int minBallSpeedY,
			Double ballSpeedIncreaseFactor, int maxPaddleLength, int minPaddleLength) throws InvalidInputException {
	}

	public static void deleteGame(String name) throws InvalidInputException {
		Game game = findGame(name);
		// We must check that the user is an admin AND the admin of the game!
		AdminRole admin = getBlock223Application.currentUserRole(); //Is this right?
		if (admin != admin) { 	// FTW
			throw new InvalidInputException("Admin privileges are required to delete a game.");
		}
		if (game != null) {
			game.delete();
		}
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
	}

	public static void removeBlock(int level, int gridHorizontalPosition, int gridVerticalPosition)
			throws InvalidInputException {
	}

	public static void saveGame() throws InvalidInputException {
	}

	public static void register(String username, String playerPassword, String adminPassword)
			throws InvalidInputException {
	}

	public static void login(String username, String password) throws InvalidInputException {
	}

	public static void logout() {
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
			if (game.getAdmin().equals(admin)) { //CHECK THIS LINE -- based on sequence diagram
				TOGame = new TOGame(game.getName(), game.getLevels().size(), game.getNrBlocksPerLevel(), game.getBall().getMinBallSpeedX(), game.getBall().getMinBallSpeedY(), game.getBall().getBallSpeedIncreaseFactor(), game.getPaddle().getMaxPaddleLenghth(), game.getPaddle().getMinPaddleLength());
				result.add(toGame);
			}
		}
		return result;
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
	}

}