package ca.mcgill.ecse223.block.controller;

import java.util.List;

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
	}

	public static void removeBlock(int level, int gridHorizontalPosition, int gridVerticalPosition)
			throws InvalidInputException {
	}

	public static void saveGame() throws InvalidInputException {
	}

	public static void register(String username, String playerPassword, String adminPassword)
			throws InvalidInputException {
		Block223 block223=getBlock223();
		try {
			block223.currentUserRole!=null;
			throw new InvalidInputException("Cannot register a new user while a user is logged in.")
		}
		try {
			playerPassword==adminPassword;
			throw new InvalidInputException("Player and Admin passwords must be different.");	
		}
		try {
			playerPassword==null; //needs to be rethrown
			playerPassword=="";
			throw new InvalidInputException("The player password must be specified.");
		}
		try {
			getWithUsername(username)!=null; //needs to be rethrown
			throw new InvalidInputException("This username has already been taken.");
		}
		try {
			username==null; //needs to be rethrown
			username=="";
			throw new InvalidInputException("The username must be specified.");
		}
		Player player= new Player(playerPassword, block223);
		User user= new User(username, block223, player);
		if(adminPassword!=null&&adminPassword!= "") {
			Admin admin=new Admin(adminPassword, block223);
			user.addUserRole(admin);
		}
		save(block223);
	}

	public static void login(String username, String password) throws InvalidInputException {
		try {
			block223.currentUserRole!=null;
			throw new InvalidInputException("Cannot login a user while a user is logged in.")
		}
		User user=getWithUsername(username);
		try {
			getWithUsername(username)==null;
			throw new InvalidInputException("There is no user with this username.");
		}
		Role[] roles=user.getRoles();
		for (int i=0; i<user.numberOfRoles;i++) {
			rolePassword=roles[i].getPassword();
			if (RolePassword==password) {
				setCurrentUserRole(roles[i]);
				resetBlock223();
			}
			try {
				rolePassword!=roles[0].getPassword() && rolePassword!=roles[1].getPassword();
				throw new InvalidInputException("The username and password do not match.")
			}
		}
	}

	public static void logout() {
		setCurrentUserRole(null);
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
		userRole=getCurrentUserRole();
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