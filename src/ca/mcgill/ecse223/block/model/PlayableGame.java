/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.util.*;

// line 3 "../../../../../PlayableGameStateMachine.ump"
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

  //PlayableGame State Machines
  public enum Statemachine { Idle, Suspended, Playing, Finished }
  private Statemachine statemachine;

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

  public PlayableGame(boolean aIsInTestMode, int aCurrentScore, Game aGame, Player aPlayer, Block223 aBlock223)
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
    blockAssingmentOccurances = new ArrayList<BlockAssingmentOccurance>();
    setStatemachine(Statemachine.Idle);
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

  public String getStatemachineFullName()
  {
    String answer = statemachine.toString();
    return answer;
  }

  public Statemachine getStatemachine()
  {
    return statemachine;
  }

  public boolean setupComplete()
  {
    boolean wasEventProcessed = false;
    
    Statemachine aStatemachine = statemachine;
    switch (aStatemachine)
    {
      case Idle:
        setStatemachine(Statemachine.Suspended);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean spacebarPushed()
  {
    boolean wasEventProcessed = false;
    
    Statemachine aStatemachine = statemachine;
    switch (aStatemachine)
    {
      case Suspended:
        setStatemachine(Statemachine.Playing);
        wasEventProcessed = true;
        break;
      case Playing:
        setStatemachine(Statemachine.Suspended);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean moveBall()
  {
    boolean wasEventProcessed = false;
    
    Statemachine aStatemachine = statemachine;
    switch (aStatemachine)
    {
      case Playing:
        if (!(isBlockHit())&&!(isWallHit())&&!(isPaddleHit())&&!(isOutOfBounds()))
        {
        // line 24 "../../../../../PlayableGameStateMachine.ump"
          doMoveBall();
          setStatemachine(Statemachine.Playing);
          wasEventProcessed = true;
          break;
        }
        if (isBlockHit()&&!(isLastBlockHit()))
        {
        // line 29 "../../../../../PlayableGameStateMachine.ump"
          doBlockHit();
          setStatemachine(Statemachine.Playing);
          wasEventProcessed = true;
          break;
        }
        if (isOutOfBounds()&&!(isOnLastLife()))
        {
        // line 34 "../../../../../PlayableGameStateMachine.ump"
          doOutOfBounds();
          setStatemachine(Statemachine.Suspended);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setStatemachine(Statemachine aStatemachine)
  {
    statemachine = aStatemachine;

    // entry actions and do activities
    switch(statemachine)
    {
      case Idle:
        // line 9 "../../../../../PlayableGameStateMachine.ump"
        setUpGame();
        break;
      case Finished:
        // line 70 "../../../../../PlayableGameStateMachine.ump"
        addToHallOfFame();
        break;
    }
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

  public boolean hasPaddleOccurance()
  {
    boolean has = paddleOccurance != null;
    return has;
  }
  /* Code from template association_GetOne */
  public BallOccurance getBallOccurance()
  {
    return ballOccurance;
  }

  public boolean hasBallOccurance()
  {
    boolean has = ballOccurance != null;
    return has;
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
  /* Code from template association_SetOptionalOneToOne */
  public boolean setPaddleOccurance(PaddleOccurance aNewPaddleOccurance)
  {
    boolean wasSet = false;
    if (paddleOccurance != null && !paddleOccurance.equals(aNewPaddleOccurance) && equals(paddleOccurance.getPlayableGame()))
    {
      //Unable to setPaddleOccurance, as existing paddleOccurance would become an orphan
      return wasSet;
    }

    paddleOccurance = aNewPaddleOccurance;
    PlayableGame anOldPlayableGame = aNewPaddleOccurance != null ? aNewPaddleOccurance.getPlayableGame() : null;

    if (!this.equals(anOldPlayableGame))
    {
      if (anOldPlayableGame != null)
      {
        anOldPlayableGame.paddleOccurance = null;
      }
      if (paddleOccurance != null)
      {
        paddleOccurance.setPlayableGame(this);
      }
    }

    wasSet = true;
    return wasSet;

  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setBallOccurance(BallOccurance aNewBallOccurance)
  {
    boolean wasSet = false;
    if (ballOccurance != null && !ballOccurance.equals(aNewBallOccurance) && equals(ballOccurance.getPlayableGame()))
    {
      //Unable to setBallOccurance, as existing ballOccurance would become an orphan
      return wasSet;
    }

    ballOccurance = aNewBallOccurance;
    PlayableGame anOldPlayableGame = aNewBallOccurance != null ? aNewBallOccurance.getPlayableGame() : null;

    if (!this.equals(anOldPlayableGame))
    {
      if (anOldPlayableGame != null)
      {
        anOldPlayableGame.ballOccurance = null;
      }
      if (ballOccurance != null)
      {
        ballOccurance.setPlayableGame(this);
      }
    }
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

  // line 77 "../../../../../PlayableGameStateMachine.ump"
   private boolean isWallHit(){
    return false;
  }

  // line 82 "../../../../../PlayableGameStateMachine.ump"
   private void doWallHit(){
    
  }

  // line 85 "../../../../../PlayableGameStateMachine.ump"
   private boolean isPaddleHit(){
    return false;
  }

  // line 90 "../../../../../PlayableGameStateMachine.ump"
   private void doPaddleHit(){
    
  }

  // line 93 "../../../../../PlayableGameStateMachine.ump"
   private boolean isOutOfBounds(){
    return false;
  }

  // line 98 "../../../../../PlayableGameStateMachine.ump"
   private void doOutOfBounds(){
    
  }

  // line 101 "../../../../../PlayableGameStateMachine.ump"
   private boolean isOnLastLife(){
    return false;
  }

  // line 105 "../../../../../PlayableGameStateMachine.ump"
   private boolean isLastBlockHit(){
    return false;
  }

  // line 110 "../../../../../PlayableGameStateMachine.ump"
   private void doBlockHit(){
    
  }

  // line 113 "../../../../../PlayableGameStateMachine.ump"
   private boolean isBlockHit(){
    return false;
  }

  // line 117 "../../../../../PlayableGameStateMachine.ump"
   private boolean isLastLevel(){
    return false;
  }

  // line 121 "../../../../../PlayableGameStateMachine.ump"
   private boolean isLeftKeyPushed(){
    return false;
  }

  // line 125 "../../../../../PlayableGameStateMachine.ump"
   private boolean isTestGame(){
    return false;
  }

  // line 130 "../../../../../PlayableGameStateMachine.ump"
   private void addToHallOfFame(){
    
  }

  // line 134 "../../../../../PlayableGameStateMachine.ump"
   private void doMovePaddle(){
    
  }

  // line 138 "../../../../../PlayableGameStateMachine.ump"
   private void doMoveBall(){
    
  }

  // line 142 "../../../../../PlayableGameStateMachine.ump"
   private void setUpGame(){
    
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