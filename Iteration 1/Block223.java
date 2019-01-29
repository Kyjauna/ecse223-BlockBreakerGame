/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse.btms.model;
import java.util.*;

// line 3 "../../../../../blockGame.ump"
public class Block223
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Block223 Associations
  private List<User> user;
  private List<Player> players;
  private List<Admin> admin;
  private List<Game> game;
  private List<GameLevel> level;
  private List<Block> block;
  private List<SpecificBlock> specificBlock;
  private List<PlayArea> playArea;
  private List<Ball> ball;
  private List<Paddle> paddle;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Block223()
  {
    user = new ArrayList<User>();
    players = new ArrayList<Player>();
    admin = new ArrayList<Admin>();
    game = new ArrayList<Game>();
    level = new ArrayList<GameLevel>();
    block = new ArrayList<Block>();
    specificBlock = new ArrayList<SpecificBlock>();
    playArea = new ArrayList<PlayArea>();
    ball = new ArrayList<Ball>();
    paddle = new ArrayList<Paddle>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public User getUser(int index)
  {
    User aUser = user.get(index);
    return aUser;
  }

  public List<User> getUser()
  {
    List<User> newUser = Collections.unmodifiableList(user);
    return newUser;
  }

  public int numberOfUser()
  {
    int number = user.size();
    return number;
  }

  public boolean hasUser()
  {
    boolean has = user.size() > 0;
    return has;
  }

  public int indexOfUser(User aUser)
  {
    int index = user.indexOf(aUser);
    return index;
  }
  /* Code from template association_GetMany */
  public Player getPlayer(int index)
  {
    Player aPlayer = players.get(index);
    return aPlayer;
  }

  /**
   * 1 <@>- * Role role;
   */
  public List<Player> getPlayers()
  {
    List<Player> newPlayers = Collections.unmodifiableList(players);
    return newPlayers;
  }

  public int numberOfPlayers()
  {
    int number = players.size();
    return number;
  }

  public boolean hasPlayers()
  {
    boolean has = players.size() > 0;
    return has;
  }

  public int indexOfPlayer(Player aPlayer)
  {
    int index = players.indexOf(aPlayer);
    return index;
  }
  /* Code from template association_GetMany */
  public Admin getAdmin(int index)
  {
    Admin aAdmin = admin.get(index);
    return aAdmin;
  }

  public List<Admin> getAdmin()
  {
    List<Admin> newAdmin = Collections.unmodifiableList(admin);
    return newAdmin;
  }

  public int numberOfAdmin()
  {
    int number = admin.size();
    return number;
  }

  public boolean hasAdmin()
  {
    boolean has = admin.size() > 0;
    return has;
  }

  public int indexOfAdmin(Admin aAdmin)
  {
    int index = admin.indexOf(aAdmin);
    return index;
  }
  /* Code from template association_GetMany */
  public Game getGame(int index)
  {
    Game aGame = game.get(index);
    return aGame;
  }

  public List<Game> getGame()
  {
    List<Game> newGame = Collections.unmodifiableList(game);
    return newGame;
  }

  public int numberOfGame()
  {
    int number = game.size();
    return number;
  }

  public boolean hasGame()
  {
    boolean has = game.size() > 0;
    return has;
  }

  public int indexOfGame(Game aGame)
  {
    int index = game.indexOf(aGame);
    return index;
  }
  /* Code from template association_GetMany */
  public GameLevel getLevel(int index)
  {
    GameLevel aLevel = level.get(index);
    return aLevel;
  }

  public List<GameLevel> getLevel()
  {
    List<GameLevel> newLevel = Collections.unmodifiableList(level);
    return newLevel;
  }

  public int numberOfLevel()
  {
    int number = level.size();
    return number;
  }

  public boolean hasLevel()
  {
    boolean has = level.size() > 0;
    return has;
  }

  public int indexOfLevel(GameLevel aLevel)
  {
    int index = level.indexOf(aLevel);
    return index;
  }
  /* Code from template association_GetMany */
  public Block getBlock(int index)
  {
    Block aBlock = block.get(index);
    return aBlock;
  }

  public List<Block> getBlock()
  {
    List<Block> newBlock = Collections.unmodifiableList(block);
    return newBlock;
  }

  public int numberOfBlock()
  {
    int number = block.size();
    return number;
  }

  public boolean hasBlock()
  {
    boolean has = block.size() > 0;
    return has;
  }

  public int indexOfBlock(Block aBlock)
  {
    int index = block.indexOf(aBlock);
    return index;
  }
  /* Code from template association_GetMany */
  public SpecificBlock getSpecificBlock(int index)
  {
    SpecificBlock aSpecificBlock = specificBlock.get(index);
    return aSpecificBlock;
  }

  public List<SpecificBlock> getSpecificBlock()
  {
    List<SpecificBlock> newSpecificBlock = Collections.unmodifiableList(specificBlock);
    return newSpecificBlock;
  }

  public int numberOfSpecificBlock()
  {
    int number = specificBlock.size();
    return number;
  }

  public boolean hasSpecificBlock()
  {
    boolean has = specificBlock.size() > 0;
    return has;
  }

  public int indexOfSpecificBlock(SpecificBlock aSpecificBlock)
  {
    int index = specificBlock.indexOf(aSpecificBlock);
    return index;
  }
  /* Code from template association_GetMany */
  public PlayArea getPlayArea(int index)
  {
    PlayArea aPlayArea = playArea.get(index);
    return aPlayArea;
  }

  public List<PlayArea> getPlayArea()
  {
    List<PlayArea> newPlayArea = Collections.unmodifiableList(playArea);
    return newPlayArea;
  }

  public int numberOfPlayArea()
  {
    int number = playArea.size();
    return number;
  }

  public boolean hasPlayArea()
  {
    boolean has = playArea.size() > 0;
    return has;
  }

  public int indexOfPlayArea(PlayArea aPlayArea)
  {
    int index = playArea.indexOf(aPlayArea);
    return index;
  }
  /* Code from template association_GetMany */
  public Ball getBall(int index)
  {
    Ball aBall = ball.get(index);
    return aBall;
  }

  public List<Ball> getBall()
  {
    List<Ball> newBall = Collections.unmodifiableList(ball);
    return newBall;
  }

  public int numberOfBall()
  {
    int number = ball.size();
    return number;
  }

  public boolean hasBall()
  {
    boolean has = ball.size() > 0;
    return has;
  }

  public int indexOfBall(Ball aBall)
  {
    int index = ball.indexOf(aBall);
    return index;
  }
  /* Code from template association_GetMany */
  public Paddle getPaddle(int index)
  {
    Paddle aPaddle = paddle.get(index);
    return aPaddle;
  }

  public List<Paddle> getPaddle()
  {
    List<Paddle> newPaddle = Collections.unmodifiableList(paddle);
    return newPaddle;
  }

  public int numberOfPaddle()
  {
    int number = paddle.size();
    return number;
  }

  public boolean hasPaddle()
  {
    boolean has = paddle.size() > 0;
    return has;
  }

  public int indexOfPaddle(Paddle aPaddle)
  {
    int index = paddle.indexOf(aPaddle);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUser()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public User addUser(String aUsername)
  {
    return new User(aUsername, this);
  }

  public boolean addUser(User aUser)
  {
    boolean wasAdded = false;
    if (user.contains(aUser)) { return false; }
    Block223 existingBlock223 = aUser.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aUser.setBlock223(this);
    }
    else
    {
      user.add(aUser);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUser(User aUser)
  {
    boolean wasRemoved = false;
    //Unable to remove aUser, as it must always have a block223
    if (!this.equals(aUser.getBlock223()))
    {
      user.remove(aUser);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUserAt(User aUser, int index)
  {  
    boolean wasAdded = false;
    if(addUser(aUser))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUser()) { index = numberOfUser() - 1; }
      user.remove(aUser);
      user.add(index, aUser);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUserAt(User aUser, int index)
  {
    boolean wasAdded = false;
    if(user.contains(aUser))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUser()) { index = numberOfUser() - 1; }
      user.remove(aUser);
      user.add(index, aUser);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUserAt(aUser, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPlayers()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Player addPlayer(String aPassword, User aUser)
  {
    return new Player(aPassword, aUser, this);
  }

  public boolean addPlayer(Player aPlayer)
  {
    boolean wasAdded = false;
    if (players.contains(aPlayer)) { return false; }
    Block223 existingBlock223 = aPlayer.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aPlayer.setBlock223(this);
    }
    else
    {
      players.add(aPlayer);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePlayer(Player aPlayer)
  {
    boolean wasRemoved = false;
    //Unable to remove aPlayer, as it must always have a block223
    if (!this.equals(aPlayer.getBlock223()))
    {
      players.remove(aPlayer);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPlayerAt(Player aPlayer, int index)
  {  
    boolean wasAdded = false;
    if(addPlayer(aPlayer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayers()) { index = numberOfPlayers() - 1; }
      players.remove(aPlayer);
      players.add(index, aPlayer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePlayerAt(Player aPlayer, int index)
  {
    boolean wasAdded = false;
    if(players.contains(aPlayer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayers()) { index = numberOfPlayers() - 1; }
      players.remove(aPlayer);
      players.add(index, aPlayer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPlayerAt(aPlayer, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAdmin()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Admin addAdmin(String aPassword, User aUser)
  {
    return new Admin(aPassword, aUser, this);
  }

  public boolean addAdmin(Admin aAdmin)
  {
    boolean wasAdded = false;
    if (admin.contains(aAdmin)) { return false; }
    Block223 existingBlock223 = aAdmin.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aAdmin.setBlock223(this);
    }
    else
    {
      admin.add(aAdmin);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAdmin(Admin aAdmin)
  {
    boolean wasRemoved = false;
    //Unable to remove aAdmin, as it must always have a block223
    if (!this.equals(aAdmin.getBlock223()))
    {
      admin.remove(aAdmin);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAdminAt(Admin aAdmin, int index)
  {  
    boolean wasAdded = false;
    if(addAdmin(aAdmin))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAdmin()) { index = numberOfAdmin() - 1; }
      admin.remove(aAdmin);
      admin.add(index, aAdmin);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAdminAt(Admin aAdmin, int index)
  {
    boolean wasAdded = false;
    if(admin.contains(aAdmin))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAdmin()) { index = numberOfAdmin() - 1; }
      admin.remove(aAdmin);
      admin.add(index, aAdmin);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAdminAt(aAdmin, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGame()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Game addGame(String aGameName, int aNumberOfBlocks, int aSpeedFactor, Admin aAdmin, PlayArea aPlayArea, Ball aBall, Paddle aPaddle)
  {
    return new Game(aGameName, aNumberOfBlocks, aSpeedFactor, this, aAdmin, aPlayArea, aBall, aPaddle);
  }

  public boolean addGame(Game aGame)
  {
    boolean wasAdded = false;
    if (game.contains(aGame)) { return false; }
    Block223 existingBlock223 = aGame.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aGame.setBlock223(this);
    }
    else
    {
      game.add(aGame);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGame(Game aGame)
  {
    boolean wasRemoved = false;
    //Unable to remove aGame, as it must always have a block223
    if (!this.equals(aGame.getBlock223()))
    {
      game.remove(aGame);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGameAt(Game aGame, int index)
  {  
    boolean wasAdded = false;
    if(addGame(aGame))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGame()) { index = numberOfGame() - 1; }
      game.remove(aGame);
      game.add(index, aGame);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGameAt(Game aGame, int index)
  {
    boolean wasAdded = false;
    if(game.contains(aGame))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGame()) { index = numberOfGame() - 1; }
      game.remove(aGame);
      game.add(index, aGame);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGameAt(aGame, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfLevel()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public GameLevel addLevel(int aLevelNumber, boolean aRandomLevel, Game aGame)
  {
    return new GameLevel(aLevelNumber, aRandomLevel, this, aGame);
  }

  public boolean addLevel(GameLevel aLevel)
  {
    boolean wasAdded = false;
    if (level.contains(aLevel)) { return false; }
    Block223 existingBlock223 = aLevel.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aLevel.setBlock223(this);
    }
    else
    {
      level.add(aLevel);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeLevel(GameLevel aLevel)
  {
    boolean wasRemoved = false;
    //Unable to remove aLevel, as it must always have a block223
    if (!this.equals(aLevel.getBlock223()))
    {
      level.remove(aLevel);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addLevelAt(GameLevel aLevel, int index)
  {  
    boolean wasAdded = false;
    if(addLevel(aLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLevel()) { index = numberOfLevel() - 1; }
      level.remove(aLevel);
      level.add(index, aLevel);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLevelAt(GameLevel aLevel, int index)
  {
    boolean wasAdded = false;
    if(level.contains(aLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLevel()) { index = numberOfLevel() - 1; }
      level.remove(aLevel);
      level.add(index, aLevel);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLevelAt(aLevel, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBlock()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Block addBlock(String aColor, int aPointWorth, Game aGame)
  {
    return new Block(aColor, aPointWorth, this, aGame);
  }

  public boolean addBlock(Block aBlock)
  {
    boolean wasAdded = false;
    if (block.contains(aBlock)) { return false; }
    Block223 existingBlock223 = aBlock.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aBlock.setBlock223(this);
    }
    else
    {
      block.add(aBlock);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBlock(Block aBlock)
  {
    boolean wasRemoved = false;
    //Unable to remove aBlock, as it must always have a block223
    if (!this.equals(aBlock.getBlock223()))
    {
      block.remove(aBlock);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBlockAt(Block aBlock, int index)
  {  
    boolean wasAdded = false;
    if(addBlock(aBlock))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBlock()) { index = numberOfBlock() - 1; }
      block.remove(aBlock);
      block.add(index, aBlock);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBlockAt(Block aBlock, int index)
  {
    boolean wasAdded = false;
    if(block.contains(aBlock))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBlock()) { index = numberOfBlock() - 1; }
      block.remove(aBlock);
      block.add(index, aBlock);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBlockAt(aBlock, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSpecificBlock()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public SpecificBlock addSpecificBlock(int aXGridPosition, int aYGridPosition, GameLevel aGameLevel, Block aBlock, PlayArea aPlayArea)
  {
    return new SpecificBlock(aXGridPosition, aYGridPosition, this, aGameLevel, aBlock, aPlayArea);
  }

  public boolean addSpecificBlock(SpecificBlock aSpecificBlock)
  {
    boolean wasAdded = false;
    if (specificBlock.contains(aSpecificBlock)) { return false; }
    Block223 existingBlock223 = aSpecificBlock.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aSpecificBlock.setBlock223(this);
    }
    else
    {
      specificBlock.add(aSpecificBlock);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeSpecificBlock(SpecificBlock aSpecificBlock)
  {
    boolean wasRemoved = false;
    //Unable to remove aSpecificBlock, as it must always have a block223
    if (!this.equals(aSpecificBlock.getBlock223()))
    {
      specificBlock.remove(aSpecificBlock);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSpecificBlockAt(SpecificBlock aSpecificBlock, int index)
  {  
    boolean wasAdded = false;
    if(addSpecificBlock(aSpecificBlock))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpecificBlock()) { index = numberOfSpecificBlock() - 1; }
      specificBlock.remove(aSpecificBlock);
      specificBlock.add(index, aSpecificBlock);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSpecificBlockAt(SpecificBlock aSpecificBlock, int index)
  {
    boolean wasAdded = false;
    if(specificBlock.contains(aSpecificBlock))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpecificBlock()) { index = numberOfSpecificBlock() - 1; }
      specificBlock.remove(aSpecificBlock);
      specificBlock.add(index, aSpecificBlock);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSpecificBlockAt(aSpecificBlock, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPlayArea()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PlayArea addPlayArea(int aGameHeight, int aGameWidth, Game aGame)
  {
    return new PlayArea(aGameHeight, aGameWidth, this, aGame);
  }

  public boolean addPlayArea(PlayArea aPlayArea)
  {
    boolean wasAdded = false;
    if (playArea.contains(aPlayArea)) { return false; }
    Block223 existingBlock223 = aPlayArea.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aPlayArea.setBlock223(this);
    }
    else
    {
      playArea.add(aPlayArea);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePlayArea(PlayArea aPlayArea)
  {
    boolean wasRemoved = false;
    //Unable to remove aPlayArea, as it must always have a block223
    if (!this.equals(aPlayArea.getBlock223()))
    {
      playArea.remove(aPlayArea);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPlayAreaAt(PlayArea aPlayArea, int index)
  {  
    boolean wasAdded = false;
    if(addPlayArea(aPlayArea))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayArea()) { index = numberOfPlayArea() - 1; }
      playArea.remove(aPlayArea);
      playArea.add(index, aPlayArea);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePlayAreaAt(PlayArea aPlayArea, int index)
  {
    boolean wasAdded = false;
    if(playArea.contains(aPlayArea))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayArea()) { index = numberOfPlayArea() - 1; }
      playArea.remove(aPlayArea);
      playArea.add(index, aPlayArea);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPlayAreaAt(aPlayArea, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBall()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Ball addBall(int aBallSpeed, int aMinimumSpeed, int aMaximumSpeed, Game aGame)
  {
    return new Ball(aBallSpeed, aMinimumSpeed, aMaximumSpeed, this, aGame);
  }

  public boolean addBall(Ball aBall)
  {
    boolean wasAdded = false;
    if (ball.contains(aBall)) { return false; }
    Block223 existingBlock223 = aBall.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aBall.setBlock223(this);
    }
    else
    {
      ball.add(aBall);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBall(Ball aBall)
  {
    boolean wasRemoved = false;
    //Unable to remove aBall, as it must always have a block223
    if (!this.equals(aBall.getBlock223()))
    {
      ball.remove(aBall);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBallAt(Ball aBall, int index)
  {  
    boolean wasAdded = false;
    if(addBall(aBall))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBall()) { index = numberOfBall() - 1; }
      ball.remove(aBall);
      ball.add(index, aBall);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBallAt(Ball aBall, int index)
  {
    boolean wasAdded = false;
    if(ball.contains(aBall))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBall()) { index = numberOfBall() - 1; }
      ball.remove(aBall);
      ball.add(index, aBall);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBallAt(aBall, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPaddle()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Paddle addPaddle(int aPaddleLength, int aMinimumLength, int aMaximumLength, Game aGame)
  {
    return new Paddle(aPaddleLength, aMinimumLength, aMaximumLength, this, aGame);
  }

  public boolean addPaddle(Paddle aPaddle)
  {
    boolean wasAdded = false;
    if (paddle.contains(aPaddle)) { return false; }
    Block223 existingBlock223 = aPaddle.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aPaddle.setBlock223(this);
    }
    else
    {
      paddle.add(aPaddle);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePaddle(Paddle aPaddle)
  {
    boolean wasRemoved = false;
    //Unable to remove aPaddle, as it must always have a block223
    if (!this.equals(aPaddle.getBlock223()))
    {
      paddle.remove(aPaddle);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPaddleAt(Paddle aPaddle, int index)
  {  
    boolean wasAdded = false;
    if(addPaddle(aPaddle))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPaddle()) { index = numberOfPaddle() - 1; }
      paddle.remove(aPaddle);
      paddle.add(index, aPaddle);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePaddleAt(Paddle aPaddle, int index)
  {
    boolean wasAdded = false;
    if(paddle.contains(aPaddle))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPaddle()) { index = numberOfPaddle() - 1; }
      paddle.remove(aPaddle);
      paddle.add(index, aPaddle);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPaddleAt(aPaddle, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (user.size() > 0)
    {
      User aUser = user.get(user.size() - 1);
      aUser.delete();
      user.remove(aUser);
    }
    
    while (players.size() > 0)
    {
      Player aPlayer = players.get(players.size() - 1);
      aPlayer.delete();
      players.remove(aPlayer);
    }
    
    while (admin.size() > 0)
    {
      Admin aAdmin = admin.get(admin.size() - 1);
      aAdmin.delete();
      admin.remove(aAdmin);
    }
    
    while (game.size() > 0)
    {
      Game aGame = game.get(game.size() - 1);
      aGame.delete();
      game.remove(aGame);
    }
    
    while (level.size() > 0)
    {
      GameLevel aLevel = level.get(level.size() - 1);
      aLevel.delete();
      level.remove(aLevel);
    }
    
    while (block.size() > 0)
    {
      Block aBlock = block.get(block.size() - 1);
      aBlock.delete();
      block.remove(aBlock);
    }
    
    while (specificBlock.size() > 0)
    {
      SpecificBlock aSpecificBlock = specificBlock.get(specificBlock.size() - 1);
      aSpecificBlock.delete();
      specificBlock.remove(aSpecificBlock);
    }
    
    while (playArea.size() > 0)
    {
      PlayArea aPlayArea = playArea.get(playArea.size() - 1);
      aPlayArea.delete();
      playArea.remove(aPlayArea);
    }
    
    while (ball.size() > 0)
    {
      Ball aBall = ball.get(ball.size() - 1);
      aBall.delete();
      ball.remove(aBall);
    }
    
    while (paddle.size() > 0)
    {
      Paddle aPaddle = paddle.get(paddle.size() - 1);
      aPaddle.delete();
      paddle.remove(aPaddle);
    }
    
  }

}