/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.util.*;

// line 22 "../../../../../I4.Updated.Domain.Model.ump"
public class PlayableGame
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static int nextGameId = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PlayableGame Attributes
  private int numberOfLives;
  private boolean isInTestMode;
  private int currentScore;

  //Autounique Attributes
  private int gameId;

  //PlayableGame Associations
  private Game game;
  private Player player;
  private Block223 block223;
  private PaddleOccurance paddleOccurance;
  private BallOccurance ballOccurance;
  private List<BlockAssingmentOccurance> blockAssingmentOccurances;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PlayableGame(boolean aIsInTestMode, int aCurrentScore, Game aGame, Player aPlayer, Block223 aBlock223, PaddleOccurance aPaddleOccurance, BallOccurance aBallOccurance)
  {
    numberOfLives = 3;
    isInTestMode = aIsInTestMode;
    currentScore = aCurrentScore;
    gameId = nextGameId++;
    boolean didAddGame = setGame(aGame);
    if (!didAddGame)
    {
      throw new RuntimeException("Unable to create playableGame due to game");
    }
    boolean didAddPlayer = setPlayer(aPlayer);
    if (!didAddPlayer)
    {
      throw new RuntimeException("Unable to create playableGame due to player");
    }
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create playableGame due to block223");
    }
    if (aPaddleOccurance == null || aPaddleOccurance.getPlayableGame() != null)
    {
      throw new RuntimeException("Unable to create PlayableGame due to aPaddleOccurance");
    }
    paddleOccurance = aPaddleOccurance;
    if (aBallOccurance == null || aBallOccurance.getPlayableGame() != null)
    {
      throw new RuntimeException("Unable to create PlayableGame due to aBallOccurance");
    }
    ballOccurance = aBallOccurance;
    blockAssingmentOccurances = new ArrayList<BlockAssingmentOccurance>();
  }

  public PlayableGame(boolean aIsInTestMode, int aCurrentScore, Game aGame, Player aPlayer, Block223 aBlock223, int aCurrentPaddleXPositionForPaddleOccurance, int aCurrentPaddleYPositionForPaddleOccurance, int aCurrentPaddleLengthForPaddleOccurance, Paddle aPaddleForPaddleOccurance, int aCurrentBallOXPositionForBallOccurance, int aCurrentBallOYPositionForBallOccurance, Ball aBallForBallOccurance)
  {
    numberOfLives = 3;
    isInTestMode = aIsInTestMode;
    currentScore = aCurrentScore;
    gameId = nextGameId++;
    boolean didAddGame = setGame(aGame);
    if (!didAddGame)
    {
      throw new RuntimeException("Unable to create playableGame due to game");
    }
    boolean didAddPlayer = setPlayer(aPlayer);
    if (!didAddPlayer)
    {
      throw new RuntimeException("Unable to create playableGame due to player");
    }
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create playableGame due to block223");
    }
    paddleOccurance = new PaddleOccurance(aCurrentPaddleXPositionForPaddleOccurance, aCurrentPaddleYPositionForPaddleOccurance, aCurrentPaddleLengthForPaddleOccurance, aPaddleForPaddleOccurance, this);
    ballOccurance = new BallOccurance(aCurrentBallOXPositionForBallOccurance, aCurrentBallOYPositionForBallOccurance, aBallForBallOccurance, this);
    blockAssingmentOccurances = new ArrayList<BlockAssingmentOccurance>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumberOfLives(int aNumberOfLives)
  {
    boolean wasSet = false;
    numberOfLives = aNumberOfLives;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInTestMode(boolean aIsInTestMode)
  {
    boolean wasSet = false;
    isInTestMode = aIsInTestMode;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentScore(int aCurrentScore)
  {
    boolean wasSet = false;
    currentScore = aCurrentScore;
    wasSet = true;
    return wasSet;
  }

  public int getNumberOfLives()
  {
    return numberOfLives;
  }

  public boolean getIsInTestMode()
  {
    return isInTestMode;
  }

  public int getCurrentScore()
  {
    return currentScore;
  }

  public int getGameId()
  {
    return gameId;
  }
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
  }
  /* Code from template association_GetOne */
  public Player getPlayer()
  {
    return player;
  }
  /* Code from template association_GetOne */
  public Block223 getBlock223()
  {
    return block223;
  }
  /* Code from template association_GetOne */
  public PaddleOccurance getPaddleOccurance()
  {
    return paddleOccurance;
  }
  /* Code from template association_GetOne */
  public BallOccurance getBallOccurance()
  {
    return ballOccurance;
  }
  /* Code from template association_GetMany */
  public BlockAssingmentOccurance getBlockAssingmentOccurance(int index)
  {
    BlockAssingmentOccurance aBlockAssingmentOccurance = blockAssingmentOccurances.get(index);
    return aBlockAssingmentOccurance;
  }

  public List<BlockAssingmentOccurance> getBlockAssingmentOccurances()
  {
    List<BlockAssingmentOccurance> newBlockAssingmentOccurances = Collections.unmodifiableList(blockAssingmentOccurances);
    return newBlockAssingmentOccurances;
  }

  public int numberOfBlockAssingmentOccurances()
  {
    int number = blockAssingmentOccurances.size();
    return number;
  }

  public boolean hasBlockAssingmentOccurances()
  {
    boolean has = blockAssingmentOccurances.size() > 0;
    return has;
  }

  public int indexOfBlockAssingmentOccurance(BlockAssingmentOccurance aBlockAssingmentOccurance)
  {
    int index = blockAssingmentOccurances.indexOf(aBlockAssingmentOccurance);
    return index;
  }
  /* Code from template association_SetOneToMany */
  public boolean setGame(Game aGame)
  {
    boolean wasSet = false;
    if (aGame == null)
    {
      return wasSet;
    }

    Game existingGame = game;
    game = aGame;
    if (existingGame != null && !existingGame.equals(aGame))
    {
      existingGame.removePlayableGame(this);
    }
    game.addPlayableGame(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setPlayer(Player aPlayer)
  {
    boolean wasSet = false;
    if (aPlayer == null)
    {
      return wasSet;
    }

    Player existingPlayer = player;
    player = aPlayer;
    if (existingPlayer != null && !existingPlayer.equals(aPlayer))
    {
      existingPlayer.removePlayableGame(this);
    }
    player.addPlayableGame(this);
    wasSet = true;
    return wasSet;
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
      existingBlock223.removePlayableGame(this);
    }
    block223.addPlayableGame(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBlockAssingmentOccurances()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public BlockAssingmentOccurance addBlockAssingmentOccurance(BlockAssignment aBlockAssignment)
  {
    return new BlockAssingmentOccurance(this, aBlockAssignment);
  }

  public boolean addBlockAssingmentOccurance(BlockAssingmentOccurance aBlockAssingmentOccurance)
  {
    boolean wasAdded = false;
    if (blockAssingmentOccurances.contains(aBlockAssingmentOccurance)) { return false; }
    PlayableGame existingPlayableGame = aBlockAssingmentOccurance.getPlayableGame();
    boolean isNewPlayableGame = existingPlayableGame != null && !this.equals(existingPlayableGame);
    if (isNewPlayableGame)
    {
      aBlockAssingmentOccurance.setPlayableGame(this);
    }
    else
    {
      blockAssingmentOccurances.add(aBlockAssingmentOccurance);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBlockAssingmentOccurance(BlockAssingmentOccurance aBlockAssingmentOccurance)
  {
    boolean wasRemoved = false;
    //Unable to remove aBlockAssingmentOccurance, as it must always have a playableGame
    if (!this.equals(aBlockAssingmentOccurance.getPlayableGame()))
    {
      blockAssingmentOccurances.remove(aBlockAssingmentOccurance);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBlockAssingmentOccuranceAt(BlockAssingmentOccurance aBlockAssingmentOccurance, int index)
  {  
    boolean wasAdded = false;
    if(addBlockAssingmentOccurance(aBlockAssingmentOccurance))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBlockAssingmentOccurances()) { index = numberOfBlockAssingmentOccurances() - 1; }
      blockAssingmentOccurances.remove(aBlockAssingmentOccurance);
      blockAssingmentOccurances.add(index, aBlockAssingmentOccurance);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBlockAssingmentOccuranceAt(BlockAssingmentOccurance aBlockAssingmentOccurance, int index)
  {
    boolean wasAdded = false;
    if(blockAssingmentOccurances.contains(aBlockAssingmentOccurance))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBlockAssingmentOccurances()) { index = numberOfBlockAssingmentOccurances() - 1; }
      blockAssingmentOccurances.remove(aBlockAssingmentOccurance);
      blockAssingmentOccurances.add(index, aBlockAssingmentOccurance);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBlockAssingmentOccuranceAt(aBlockAssingmentOccurance, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    Game placeholderGame = game;
    this.game = null;
    if(placeholderGame != null)
    {
      placeholderGame.removePlayableGame(this);
    }
    Player placeholderPlayer = player;
    this.player = null;
    if(placeholderPlayer != null)
    {
      placeholderPlayer.removePlayableGame(this);
    }
    Block223 placeholderBlock223 = block223;
    this.block223 = null;
    if(placeholderBlock223 != null)
    {
      placeholderBlock223.removePlayableGame(this);
    }
    PaddleOccurance existingPaddleOccurance = paddleOccurance;
    paddleOccurance = null;
    if (existingPaddleOccurance != null)
    {
      existingPaddleOccurance.delete();
    }
    BallOccurance existingBallOccurance = ballOccurance;
    ballOccurance = null;
    if (existingBallOccurance != null)
    {
      existingBallOccurance.delete();
    }
    for(int i=blockAssingmentOccurances.size(); i > 0; i--)
    {
      BlockAssingmentOccurance aBlockAssingmentOccurance = blockAssingmentOccurances.get(i - 1);
      aBlockAssingmentOccurance.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "gameId" + ":" + getGameId()+ "," +
            "numberOfLives" + ":" + getNumberOfLives()+ "," +
            "isInTestMode" + ":" + getIsInTestMode()+ "," +
            "currentScore" + ":" + getCurrentScore()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "player = "+(getPlayer()!=null?Integer.toHexString(System.identityHashCode(getPlayer())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "block223 = "+(getBlock223()!=null?Integer.toHexString(System.identityHashCode(getBlock223())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "paddleOccurance = "+(getPaddleOccurance()!=null?Integer.toHexString(System.identityHashCode(getPaddleOccurance())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "ballOccurance = "+(getBallOccurance()!=null?Integer.toHexString(System.identityHashCode(getBallOccurance())):"null");
  }
}