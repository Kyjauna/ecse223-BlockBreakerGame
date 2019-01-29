/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse.btms.model;
import java.util.*;

// line 43 "../../../../../blockGame.ump"
public class Game
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static Map<String, Game> gamesByGameName = new HashMap<String, Game>();

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Game Attributes
  private String gameName;
  private int numberOfBlocks;
  private int speedFactor;

  //Game Associations
  private Block223 block223;
  private Admin admin;
  private List<GameLevel> gameLevels;
  private List<Block> blocks;
  private PlayArea playArea;
  private Ball ball;
  private Paddle paddle;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Game(String aGameName, int aNumberOfBlocks, int aSpeedFactor, Block223 aBlock223, Admin aAdmin, PlayArea aPlayArea, Ball aBall, Paddle aPaddle)
  {
    numberOfBlocks = aNumberOfBlocks;
    speedFactor = aSpeedFactor;
    if (!setGameName(aGameName))
    {
      throw new RuntimeException("Cannot create due to duplicate gameName");
    }
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create game due to block223");
    }
    boolean didAddAdmin = setAdmin(aAdmin);
    if (!didAddAdmin)
    {
      throw new RuntimeException("Unable to create game due to admin");
    }
    gameLevels = new ArrayList<GameLevel>();
    blocks = new ArrayList<Block>();
    if (aPlayArea == null || aPlayArea.getGame() != null)
    {
      throw new RuntimeException("Unable to create Game due to aPlayArea");
    }
    playArea = aPlayArea;
    if (aBall == null || aBall.getGame() != null)
    {
      throw new RuntimeException("Unable to create Game due to aBall");
    }
    ball = aBall;
    if (aPaddle == null || aPaddle.getGame() != null)
    {
      throw new RuntimeException("Unable to create Game due to aPaddle");
    }
    paddle = aPaddle;
  }

  public Game(String aGameName, int aNumberOfBlocks, int aSpeedFactor, Block223 aBlock223, Admin aAdmin, int aGameHeightForPlayArea, int aGameWidthForPlayArea, Block223 aBlock223ForPlayArea, int aBallSpeedForBall, int aMinimumSpeedForBall, int aMaximumSpeedForBall, Block223 aBlock223ForBall, int aPaddleLengthForPaddle, int aMinimumLengthForPaddle, int aMaximumLengthForPaddle, Block223 aBlock223ForPaddle)
  {
    gameName = aGameName;
    numberOfBlocks = aNumberOfBlocks;
    speedFactor = aSpeedFactor;
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create game due to block223");
    }
    boolean didAddAdmin = setAdmin(aAdmin);
    if (!didAddAdmin)
    {
      throw new RuntimeException("Unable to create game due to admin");
    }
    gameLevels = new ArrayList<GameLevel>();
    blocks = new ArrayList<Block>();
    playArea = new PlayArea(aGameHeightForPlayArea, aGameWidthForPlayArea, aBlock223ForPlayArea, this);
    ball = new Ball(aBallSpeedForBall, aMinimumSpeedForBall, aMaximumSpeedForBall, aBlock223ForBall, this);
    paddle = new Paddle(aPaddleLengthForPaddle, aMinimumLengthForPaddle, aMaximumLengthForPaddle, aBlock223ForPaddle, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGameName(String aGameName)
  {
    boolean wasSet = false;
    String anOldGameName = getGameName();
    if (hasWithGameName(aGameName)) {
      return wasSet;
    }
    gameName = aGameName;
    wasSet = true;
    if (anOldGameName != null) {
      gamesByGameName.remove(anOldGameName);
    }
    gamesByGameName.put(aGameName, this);
    return wasSet;
  }

  public boolean setNumberOfBlocks(int aNumberOfBlocks)
  {
    boolean wasSet = false;
    numberOfBlocks = aNumberOfBlocks;
    wasSet = true;
    return wasSet;
  }

  public boolean setSpeedFactor(int aSpeedFactor)
  {
    boolean wasSet = false;
    speedFactor = aSpeedFactor;
    wasSet = true;
    return wasSet;
  }

  public String getGameName()
  {
    return gameName;
  }
  /* Code from template attribute_GetUnique */
  public static Game getWithGameName(String aGameName)
  {
    return gamesByGameName.get(aGameName);
  }
  /* Code from template attribute_HasUnique */
  public static boolean hasWithGameName(String aGameName)
  {
    return getWithGameName(aGameName) != null;
  }

  public int getNumberOfBlocks()
  {
    return numberOfBlocks;
  }

  public int getSpeedFactor()
  {
    return speedFactor;
  }
  /* Code from template association_GetOne */
  public Block223 getBlock223()
  {
    return block223;
  }
  /* Code from template association_GetOne */
  public Admin getAdmin()
  {
    return admin;
  }
  /* Code from template association_GetMany */
  public GameLevel getGameLevel(int index)
  {
    GameLevel aGameLevel = gameLevels.get(index);
    return aGameLevel;
  }

  public List<GameLevel> getGameLevels()
  {
    List<GameLevel> newGameLevels = Collections.unmodifiableList(gameLevels);
    return newGameLevels;
  }

  public int numberOfGameLevels()
  {
    int number = gameLevels.size();
    return number;
  }

  public boolean hasGameLevels()
  {
    boolean has = gameLevels.size() > 0;
    return has;
  }

  public int indexOfGameLevel(GameLevel aGameLevel)
  {
    int index = gameLevels.indexOf(aGameLevel);
    return index;
  }
  /* Code from template association_GetMany */
  public Block getBlock(int index)
  {
    Block aBlock = blocks.get(index);
    return aBlock;
  }

  public List<Block> getBlocks()
  {
    List<Block> newBlocks = Collections.unmodifiableList(blocks);
    return newBlocks;
  }

  public int numberOfBlocks()
  {
    int number = blocks.size();
    return number;
  }

  public boolean hasBlocks()
  {
    boolean has = blocks.size() > 0;
    return has;
  }

  public int indexOfBlock(Block aBlock)
  {
    int index = blocks.indexOf(aBlock);
    return index;
  }
  /* Code from template association_GetOne */
  public PlayArea getPlayArea()
  {
    return playArea;
  }
  /* Code from template association_GetOne */
  public Ball getBall()
  {
    return ball;
  }
  /* Code from template association_GetOne */
  public Paddle getPaddle()
  {
    return paddle;
  }
  /* Code from template association_SetOneToMany */
  public boolean setBlock223(Block223 aBlock223)
  {
    boolean wasSet = false;
    if (aBlock223 == null)
    {
      return wasSet;
    }

    Block223 existingBlock223 = block223;
    block223 = aBlock223;
    if (existingBlock223 != null && !existingBlock223.equals(aBlock223))
    {
      existingBlock223.removeGame(this);
    }
    block223.addGame(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setAdmin(Admin aAdmin)
  {
    boolean wasSet = false;
    if (aAdmin == null)
    {
      return wasSet;
    }

    Admin existingAdmin = admin;
    admin = aAdmin;
    if (existingAdmin != null && !existingAdmin.equals(aAdmin))
    {
      existingAdmin.removeGame(this);
    }
    admin.addGame(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfGameLevelsValid()
  {
    boolean isValid = numberOfGameLevels() >= minimumNumberOfGameLevels() && numberOfGameLevels() <= maximumNumberOfGameLevels();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGameLevels()
  {
    return 1;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfGameLevels()
  {
    return 99;
  }
  /* Code from template association_AddMNToOnlyOne */
  public GameLevel addGameLevel(int aLevelNumber, boolean aRandomLevel, Block223 aBlock223)
  {
    if (numberOfGameLevels() >= maximumNumberOfGameLevels())
    {
      return null;
    }
    else
    {
      return new GameLevel(aLevelNumber, aRandomLevel, aBlock223, this);
    }
  }

  public boolean addGameLevel(GameLevel aGameLevel)
  {
    boolean wasAdded = false;
    if (gameLevels.contains(aGameLevel)) { return false; }
    if (numberOfGameLevels() >= maximumNumberOfGameLevels())
    {
      return wasAdded;
    }

    Game existingGame = aGameLevel.getGame();
    boolean isNewGame = existingGame != null && !this.equals(existingGame);

    if (isNewGame && existingGame.numberOfGameLevels() <= minimumNumberOfGameLevels())
    {
      return wasAdded;
    }

    if (isNewGame)
    {
      aGameLevel.setGame(this);
    }
    else
    {
      gameLevels.add(aGameLevel);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGameLevel(GameLevel aGameLevel)
  {
    boolean wasRemoved = false;
    //Unable to remove aGameLevel, as it must always have a game
    if (this.equals(aGameLevel.getGame()))
    {
      return wasRemoved;
    }

    //game already at minimum (1)
    if (numberOfGameLevels() <= minimumNumberOfGameLevels())
    {
      return wasRemoved;
    }
    gameLevels.remove(aGameLevel);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGameLevelAt(GameLevel aGameLevel, int index)
  {  
    boolean wasAdded = false;
    if(addGameLevel(aGameLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGameLevels()) { index = numberOfGameLevels() - 1; }
      gameLevels.remove(aGameLevel);
      gameLevels.add(index, aGameLevel);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGameLevelAt(GameLevel aGameLevel, int index)
  {
    boolean wasAdded = false;
    if(gameLevels.contains(aGameLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGameLevels()) { index = numberOfGameLevels() - 1; }
      gameLevels.remove(aGameLevel);
      gameLevels.add(index, aGameLevel);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGameLevelAt(aGameLevel, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBlocks()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Block addBlock(String aColor, int aPointWorth, Block223 aBlock223)
  {
    return new Block(aColor, aPointWorth, aBlock223, this);
  }

  public boolean addBlock(Block aBlock)
  {
    boolean wasAdded = false;
    if (blocks.contains(aBlock)) { return false; }
    Game existingGame = aBlock.getGame();
    boolean isNewGame = existingGame != null && !this.equals(existingGame);
    if (isNewGame)
    {
      aBlock.setGame(this);
    }
    else
    {
      blocks.add(aBlock);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBlock(Block aBlock)
  {
    boolean wasRemoved = false;
    //Unable to remove aBlock, as it must always have a game
    if (!this.equals(aBlock.getGame()))
    {
      blocks.remove(aBlock);
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
      if(index > numberOfBlocks()) { index = numberOfBlocks() - 1; }
      blocks.remove(aBlock);
      blocks.add(index, aBlock);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBlockAt(Block aBlock, int index)
  {
    boolean wasAdded = false;
    if(blocks.contains(aBlock))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBlocks()) { index = numberOfBlocks() - 1; }
      blocks.remove(aBlock);
      blocks.add(index, aBlock);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBlockAt(aBlock, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    gamesByGameName.remove(getGameName());
    Block223 placeholderBlock223 = block223;
    this.block223 = null;
    if(placeholderBlock223 != null)
    {
      placeholderBlock223.removeGame(this);
    }
    Admin placeholderAdmin = admin;
    this.admin = null;
    if(placeholderAdmin != null)
    {
      placeholderAdmin.removeGame(this);
    }
    while (gameLevels.size() > 0)
    {
      GameLevel aGameLevel = gameLevels.get(gameLevels.size() - 1);
      aGameLevel.delete();
      gameLevels.remove(aGameLevel);
    }
    
    for(int i=blocks.size(); i > 0; i--)
    {
      Block aBlock = blocks.get(i - 1);
      aBlock.delete();
    }
    PlayArea existingPlayArea = playArea;
    playArea = null;
    if (existingPlayArea != null)
    {
      existingPlayArea.delete();
    }
    Ball existingBall = ball;
    ball = null;
    if (existingBall != null)
    {
      existingBall.delete();
    }
    Paddle existingPaddle = paddle;
    paddle = null;
    if (existingPaddle != null)
    {
      existingPaddle.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "gameName" + ":" + getGameName()+ "," +
            "numberOfBlocks" + ":" + getNumberOfBlocks()+ "," +
            "speedFactor" + ":" + getSpeedFactor()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "block223 = "+(getBlock223()!=null?Integer.toHexString(System.identityHashCode(getBlock223())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "admin = "+(getAdmin()!=null?Integer.toHexString(System.identityHashCode(getAdmin())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "playArea = "+(getPlayArea()!=null?Integer.toHexString(System.identityHashCode(getPlayArea())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "ball = "+(getBall()!=null?Integer.toHexString(System.identityHashCode(getBall())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "paddle = "+(getPaddle()!=null?Integer.toHexString(System.identityHashCode(getPaddle())):"null");
  }
}