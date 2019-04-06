/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;
import java.util.*;

// line 11 "../../../../../Block223PlayMode.ump"
// line 110 "../../../../../Block223Persistence.ump"
// line 1 "../../../../../Block223States.ump"
public class PlayedGame implements Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------


  /**
   * at design time, the initial wait time may be adjusted as seen fit
   */
  public static final int INITIAL_WAIT_TIME = 1000;
  private static int nextId = 1;
  public static final int NR_LIVES = 3;

  /**
   * the PlayedBall and PlayedPaddle are not in a separate class to avoid the bug in Umple that occurred for the second constructor of Game
   * no direct link to Ball, because the ball can be found by navigating to Game and then Ball
   */
  public static final int BALL_INITIAL_X = Game.PLAY_AREA_SIDE / 2;
  public static final int BALL_INITIAL_Y = Game.PLAY_AREA_SIDE / 2;

  /**
   * no direct link to Paddle, because the paddle can be found by navigating to Game and then Paddle
   * pixels moved when right arrow key is pressed
   */
  public static final int PADDLE_MOVE_RIGHT = 1;

  /**
   * pixels moved when left arrow key is pressed
   */
  public static final int PADDLE_MOVE_LEFT = -1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PlayedGame Attributes
  private int score;
  private int lives;
  private int currentLevel;
  private double waitTime;
  private String playername;
  private double ballDirectionX;
  private double ballDirectionY;
  private double currentBallX;
  private double currentBallY;
  private double currentPaddleLength;
  private double currentPaddleX;
  private double currentPaddleY;

  //Autounique Attributes
  private int id;

  //PlayedGame State Machines
  public enum PlayStatus { Ready, Moving, Paused, GameOver }
  private PlayStatus playStatus;

  //PlayedGame Associations
  private Player player;
  private Game game;
  private List<PlayedBlockAssignment> blocks;
  private BouncePoint bounce;
  private Block223 block223;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PlayedGame(String aPlayername, Game aGame, Block223 aBlock223)
  {
    // line 47 "../../../../../Block223PlayMode.ump"
    boolean didAddGameResult = setGame(aGame);
          if (!didAddGameResult)
          {
             throw new RuntimeException("Unable to create playedGame due to game");
          }
    // END OF UMPLE BEFORE INJECTION
    score = 0;
    lives = NR_LIVES;
    currentLevel = 1;
    waitTime = INITIAL_WAIT_TIME;
    playername = aPlayername;
    resetBallDirectionX();
    resetBallDirectionY();
    resetCurrentBallX();
    resetCurrentBallY();
    currentPaddleLength = getGame().getPaddle().getMaxPaddleLength();
    resetCurrentPaddleX();
    currentPaddleY = Game.PLAY_AREA_SIDE - Paddle.VERTICAL_DISTANCE - Paddle.PADDLE_WIDTH;
    id = nextId++;
    boolean didAddGame = setGame(aGame);
    if (!didAddGame)
    {
      throw new RuntimeException("Unable to create playedGame due to game");
    }
    blocks = new ArrayList<PlayedBlockAssignment>();
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create playedGame due to block223");
    }
    setPlayStatus(PlayStatus.Ready);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setScore(int aScore)
  {
    boolean wasSet = false;
    score = aScore;
    wasSet = true;
    return wasSet;
  }

  public boolean setLives(int aLives)
  {
    boolean wasSet = false;
    lives = aLives;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentLevel(int aCurrentLevel)
  {
    boolean wasSet = false;
    currentLevel = aCurrentLevel;
    wasSet = true;
    return wasSet;
  }

  public boolean setWaitTime(double aWaitTime)
  {
    boolean wasSet = false;
    waitTime = aWaitTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setPlayername(String aPlayername)
  {
    boolean wasSet = false;
    playername = aPlayername;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setBallDirectionX(double aBallDirectionX)
  {
    boolean wasSet = false;
    ballDirectionX = aBallDirectionX;
    wasSet = true;
    return wasSet;
  }

  public boolean resetBallDirectionX()
  {
    boolean wasReset = false;
    ballDirectionX = getDefaultBallDirectionX();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setBallDirectionY(double aBallDirectionY)
  {
    boolean wasSet = false;
    ballDirectionY = aBallDirectionY;
    wasSet = true;
    return wasSet;
  }

  public boolean resetBallDirectionY()
  {
    boolean wasReset = false;
    ballDirectionY = getDefaultBallDirectionY();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setCurrentBallX(double aCurrentBallX)
  {
    boolean wasSet = false;
    currentBallX = aCurrentBallX;
    wasSet = true;
    return wasSet;
  }

  public boolean resetCurrentBallX()
  {
    boolean wasReset = false;
    currentBallX = getDefaultCurrentBallX();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setCurrentBallY(double aCurrentBallY)
  {
    boolean wasSet = false;
    currentBallY = aCurrentBallY;
    wasSet = true;
    return wasSet;
  }

  public boolean resetCurrentBallY()
  {
    boolean wasReset = false;
    currentBallY = getDefaultCurrentBallY();
    wasReset = true;
    return wasReset;
  }

  public boolean setCurrentPaddleLength(double aCurrentPaddleLength)
  {
    boolean wasSet = false;
    currentPaddleLength = aCurrentPaddleLength;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setCurrentPaddleX(double aCurrentPaddleX)
  {
    boolean wasSet = false;
    currentPaddleX = aCurrentPaddleX;
    wasSet = true;
    return wasSet;
  }

  public boolean resetCurrentPaddleX()
  {
    boolean wasReset = false;
    currentPaddleX = getDefaultCurrentPaddleX();
    wasReset = true;
    return wasReset;
  }

  public int getScore()
  {
    return score;
  }

  public int getLives()
  {
    return lives;
  }

  public int getCurrentLevel()
  {
    return currentLevel;
  }

  public double getWaitTime()
  {
    return waitTime;
  }

  /**
   * added here so that it only needs to be determined once
   */
  public String getPlayername()
  {
    return playername;
  }

  /**
   * 0/0 is the top left corner of the play area, i.e., a directionX/Y of 0/1 moves the ball down in a straight line
   */
  public double getBallDirectionX()
  {
    return ballDirectionX;
  }
  /* Code from template attribute_GetDefaulted */
  public double getDefaultBallDirectionX()
  {
    return getGame().getBall().getMinBallSpeedX();
  }

  public double getBallDirectionY()
  {
    return ballDirectionY;
  }
  /* Code from template attribute_GetDefaulted */
  public double getDefaultBallDirectionY()
  {
    return getGame().getBall().getMinBallSpeedY();
  }

  /**
   * the position of the ball is at the center of the ball
   */
  public double getCurrentBallX()
  {
    return currentBallX;
  }
  /* Code from template attribute_GetDefaulted */
  public double getDefaultCurrentBallX()
  {
    return BALL_INITIAL_X;
  }

  public double getCurrentBallY()
  {
    return currentBallY;
  }
  /* Code from template attribute_GetDefaulted */
  public double getDefaultCurrentBallY()
  {
    return BALL_INITIAL_Y;
  }

  public double getCurrentPaddleLength()
  {
    return currentPaddleLength;
  }

  /**
   * the position of the paddle is at its top left corner
   */
  public double getCurrentPaddleX()
  {
    return currentPaddleX;
  }
  /* Code from template attribute_GetDefaulted */
  public double getDefaultCurrentPaddleX()
  {
    return (Game.PLAY_AREA_SIDE - currentPaddleLength) / 2;
  }

  public double getCurrentPaddleY()
  {
    return currentPaddleY;
  }

  public int getId()
  {
    return id;
  }

  public String getPlayStatusFullName()
  {
    String answer = playStatus.toString();
    return answer;
  }

  public PlayStatus getPlayStatus()
  {
    return playStatus;
  }

  public boolean play()
  {
    boolean wasEventProcessed = false;
    
    PlayStatus aPlayStatus = playStatus;
    switch (aPlayStatus)
    {
      case Ready:
        setPlayStatus(PlayStatus.Moving);
        wasEventProcessed = true;
        break;
      case Paused:
        setPlayStatus(PlayStatus.Moving);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean pause()
  {
    boolean wasEventProcessed = false;
    
    PlayStatus aPlayStatus = playStatus;
    switch (aPlayStatus)
    {
      case Moving:
        setPlayStatus(PlayStatus.Paused);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean move()
  {
    boolean wasEventProcessed = false;
    
    PlayStatus aPlayStatus = playStatus;
    switch (aPlayStatus)
    {
      case Moving:
        if (hitPaddle())
        {
        // line 12 "../../../../../Block223States.ump"
          doHitPaddleOrWall();
          setPlayStatus(PlayStatus.Moving);
          wasEventProcessed = true;
          break;
        }
        if (isOutOfBoundsAndLastLife())
        {
        // line 13 "../../../../../Block223States.ump"
          doOutOfBounds();
          setPlayStatus(PlayStatus.GameOver);
          wasEventProcessed = true;
          break;
        }
        if (isOutOfBounds())
        {
        // line 14 "../../../../../Block223States.ump"
          doOutOfBounds();
          setPlayStatus(PlayStatus.Paused);
          wasEventProcessed = true;
          break;
        }
        if (hitLastBlockAndLastLevel())
        {
        // line 15 "../../../../../Block223States.ump"
          doHitBlock();
          setPlayStatus(PlayStatus.GameOver);
          wasEventProcessed = true;
          break;
        }
        if (hitLastBlock())
        {
        // line 16 "../../../../../Block223States.ump"
          doHitBlockNextLevel();
          setPlayStatus(PlayStatus.Ready);
          wasEventProcessed = true;
          break;
        }
        if (hitBlock())
        {
        // line 17 "../../../../../Block223States.ump"
          doHitBlock();
          setPlayStatus(PlayStatus.Moving);
          wasEventProcessed = true;
          break;
        }
        if (hitWall())
        {
        // line 18 "../../../../../Block223States.ump"
          doHitPaddleOrWall();
          setPlayStatus(PlayStatus.Moving);
          wasEventProcessed = true;
          break;
        }
        // line 19 "../../../../../Block223States.ump"
        doHitNothingAndNotOutOfBounds();
        setPlayStatus(PlayStatus.Moving);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setPlayStatus(PlayStatus aPlayStatus)
  {
    playStatus = aPlayStatus;

    // entry actions and do activities
    switch(playStatus)
    {
      case Ready:
        // line 7 "../../../../../Block223States.ump"
        doSetup();
        break;
      case GameOver:
        // line 25 "../../../../../Block223States.ump"
        doGameOver();
        break;
    }
  }
  /* Code from template association_GetOne */
  public Player getPlayer()
  {
    return player;
  }

  public boolean hasPlayer()
  {
    boolean has = player != null;
    return has;
  }
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
  }
  /* Code from template association_GetMany */
  public PlayedBlockAssignment getBlock(int index)
  {
    PlayedBlockAssignment aBlock = blocks.get(index);
    return aBlock;
  }

  public List<PlayedBlockAssignment> getBlocks()
  {
    List<PlayedBlockAssignment> newBlocks = Collections.unmodifiableList(blocks);
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

  public int indexOfBlock(PlayedBlockAssignment aBlock)
  {
    int index = blocks.indexOf(aBlock);
    return index;
  }
  /* Code from template association_GetOne */
  public BouncePoint getBounce()
  {
    return bounce;
  }

  public boolean hasBounce()
  {
    boolean has = bounce != null;
    return has;
  }
  /* Code from template association_GetOne */
  public Block223 getBlock223()
  {
    return block223;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setPlayer(Player aPlayer)
  {
    boolean wasSet = false;
    Player existingPlayer = player;
    player = aPlayer;
    if (existingPlayer != null && !existingPlayer.equals(aPlayer))
    {
      existingPlayer.removePlayedGame(this);
    }
    if (aPlayer != null)
    {
      aPlayer.addPlayedGame(this);
    }
    wasSet = true;
    return wasSet;
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
      existingGame.removePlayedGame(this);
    }
    game.addPlayedGame(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBlocks()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PlayedBlockAssignment addBlock(int aX, int aY, Block aBlock)
  {
    return new PlayedBlockAssignment(aX, aY, aBlock, this);
  }

  public boolean addBlock(PlayedBlockAssignment aBlock)
  {
    boolean wasAdded = false;
    if (blocks.contains(aBlock)) { return false; }
    PlayedGame existingPlayedGame = aBlock.getPlayedGame();
    boolean isNewPlayedGame = existingPlayedGame != null && !this.equals(existingPlayedGame);
    if (isNewPlayedGame)
    {
      aBlock.setPlayedGame(this);
    }
    else
    {
      blocks.add(aBlock);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBlock(PlayedBlockAssignment aBlock)
  {
    boolean wasRemoved = false;
    //Unable to remove aBlock, as it must always have a playedGame
    if (!this.equals(aBlock.getPlayedGame()))
    {
      blocks.remove(aBlock);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBlockAt(PlayedBlockAssignment aBlock, int index)
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

  public boolean addOrMoveBlockAt(PlayedBlockAssignment aBlock, int index)
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
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setBounce(BouncePoint aNewBounce)
  {
    boolean wasSet = false;
    bounce = aNewBounce;
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
      existingBlock223.removePlayedGame(this);
    }
    block223.addPlayedGame(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (player != null)
    {
      Player placeholderPlayer = player;
      this.player = null;
      placeholderPlayer.removePlayedGame(this);
    }
    Game placeholderGame = game;
    this.game = null;
    if(placeholderGame != null)
    {
      placeholderGame.removePlayedGame(this);
    }
    while (blocks.size() > 0)
    {
      PlayedBlockAssignment aBlock = blocks.get(blocks.size() - 1);
      aBlock.delete();
      blocks.remove(aBlock);
    }
    
    bounce = null;
    Block223 placeholderBlock223 = block223;
    this.block223 = null;
    if(placeholderBlock223 != null)
    {
      placeholderBlock223.removePlayedGame(this);
    }
  }

  // line 55 "../../../../../Block223PlayMode.ump"
   private boolean isCloser(BouncePoint bp1, BouncePoint bp2){
    if(bp2==null)
	   		return true;
	   	else{
	   		double diff1=Math.abs(bp1.getX()-getCurrentBallX())+Math.abs(bp1.getY()-getCurrentBallY());
	   		double diff2=Math.abs(bp2.getX()-getCurrentBallY())+Math.abs(bp2.getY()-getCurrentBallY());
	   		return diff2>diff1;
	   	}
  }

  // line 116 "../../../../../Block223Persistence.ump"
   public static  void reinitializeAutouniquePgameID(List<PlayedGame> pgames){
    nextId = 0; 
    	for (PlayedGame pgame : pgames) {
      		if (pgame.getId() > nextId) {
       		nextId = pgame.getId();
      		}
   		}
    	nextId++;
  }


  /**
   * Guards
   */
  // line 32 "../../../../../Block223States.ump"
   private boolean hitPaddle(){
    BouncePoint bp = calculateBouncePointPaddle();
	   
	   if (bp != null) {
		   setBounce(bp);
		   return true;
	   }
	   else 
		   return false;
  }

  // line 43 "../../../../../Block223States.ump"
   private BouncePoint calculateBouncePointPaddle(){
    // Current position of the ball
	   double x = getCurrentBallX();
	   double y = getCurrentBallY();
	   // Where the ball is going
	   double dx = getBallDirectionX();
	   double dy = getBallDirectionY();
	   // New position of the ball
	   double positionX = (x+dx);
	   double positionY = (y+dy);
	   
	   BouncePoint bp = null;
	   
	   // Add 5 to all the variables to account for the radius of the ball
	   // Rectangle2D paddle = new Rectangle2D.Double(getCurrentPaddleX()+(double)5, getCurrentPaddleY()+(double)5, (double) 10, getCurrentPaddleLength()+(double)5);
	   // if (paddle.intersects(getCurrentBallX(), getCurrentBallY(), 5, 5)) { // not sure about these 5s
		   // BOUNCE
		   // Section A
		   if (positionY == 350 && positionX >= getCurrentPaddleX() && positionX <= (getCurrentPaddleX() + getCurrentPaddleLength())) {
			   bp = new BouncePoint(0,0,null);
			   bp.setX(positionX);
			   bp.setY(positionY);
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_Y);
		   }
		   
		   // Section B
		   if (positionX == (getCurrentPaddleX()+5) && positionY >= 355 && positionY <= 360) {
			   bp = new BouncePoint(0,0,null);
			   bp.setX(positionX);
			   bp.setY(positionY);
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
		   }
		   
		   // Section C
		   if (positionX == (getCurrentPaddleX()+getCurrentPaddleLength()+5) && positionY >= 355 && positionY <= 360) {
			   bp = new BouncePoint(0,0,null);
			   bp.setX(positionX);
			   bp.setY(positionY);
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
		   }
		   
		   // Section E
		   // Incomplete; does not account for the whole curvature; only for the corner
		   if (positionX == (getCurrentPaddleX()+5) && positionY == 350) {
			   bp = new BouncePoint(0,0,null);
			   bp.setX(positionX);
			   bp.setY(positionY);
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
		   }
		   
		   // Section F
		   if (positionX == (getCurrentPaddleX()+getCurrentPaddleLength()+5) && positionY == 350) {
			   bp = new BouncePoint(0,0,null);
			   bp.setX(positionX);
			   bp.setY(positionY);
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
		   }
	  // }
	   return bp;
  }

  // line 105 "../../../../../Block223States.ump"
   private void bounceBall(){
    double incomingX;
	   double remainingX;
	   double incomingY;
	   double remainingY;
	   
	   // Flip_X case
	   if (bounce.getDirection() == BouncePoint.BounceDirection.FLIP_X) {
		   // Incoming distance
		   incomingX = (bounce.getX() - getCurrentBallX());
		   remainingX = getBallDirectionX() - incomingX;
		   if (remainingX == 0) {
			   setCurrentBallX(bounce.getX());
			   setCurrentBallY(bounce.getY());
		   }
		   else
		   {
			   setBallDirectionX(getBallDirectionX()*(-1));
			   setBallDirectionY(getCurrentBallY() + Math.signum(getBallDirectionY())*0.1*Math.abs(getBallDirectionX()));
			   // No variable "newBallDirectionY to distinguish from the old one, thus *(-1)
			   setCurrentBallX(bounce.getX() + (remainingX/getBallDirectionX())*(-1)*(getBallDirectionX()));
			   setCurrentBallY(bounce.getY() + (remainingX/getBallDirectionX())*(-1)*(getBallDirectionY()));
		   }
	   }
	   
	   // Flip_Y case
	   if (bounce.getDirection() == BouncePoint.BounceDirection.FLIP_Y) {
		   // Incoming distance
		   incomingY = (bounce.getY() - getCurrentBallY());
		   remainingY = getBallDirectionY() - incomingY;
		   if (remainingY == 0) {
			   setCurrentBallX(bounce.getX());
			   setCurrentBallY(bounce.getY());
		   }
		   else
		   {
			   setBallDirectionX(getCurrentBallX() + Math.signum(getBallDirectionX()*0.1*Math.abs(getBallDirectionY())));
			   setBallDirectionY(getBallDirectionY()*(-1));
			   // No variable "newBallDirectionY to distinguish from the old one, thus *(-1)
			   setCurrentBallX(bounce.getX() + (remainingY/getBallDirectionY())*(-1)*(getBallDirectionX()));
			   setCurrentBallY(bounce.getY() + (remainingY/getBallDirectionY())*(-1)*(getBallDirectionY()));
		   } 
	   }
  }

  // line 151 "../../../../../Block223States.ump"
   private boolean isOutOfBoundsAndLastLife(){
    boolean outOfBounds = false;
	   if(lives == 1)
		   outOfBounds = isBallOutOfBounds();
	   return outOfBounds;
  }

  // line 158 "../../../../../Block223States.ump"
   private boolean isBallOutOfBounds(){
    if (getCurrentBallY() > 385)
		   return true;
	   else return false;
  }

  // line 164 "../../../../../Block223States.ump"
   private boolean isOutOfBounds(){
    boolean outOfBounds = isBallOutOfBounds();
	   return outOfBounds;
  }

  // line 170 "../../../../../Block223States.ump"
   private boolean hitLastBlockAndLastLevel(){
    Game game = getGame();
	 int nrLevels = game.numberOfLevels();
	 setBounce(null);
	 
	 if(nrLevels == currentLevel) {
		 int nrBlocks = numberOfBlocks();
		 
		 if(nrBlocks == 1) {
			 
			 PlayedBlockAssignment block = getBlock(0);
			 BouncePoint bp = calculateBouncePointBlock(block);
			 setBounce(bp);
			 return true;
		 }
	 }
    return false;
  }

  // line 190 "../../../../../Block223States.ump"
   private boolean hitLastBlock(){
    int nrBlocks = numberOfBlocks();
	   setBounce(null);
	   if(nrBlocks == 1) {
		   PlayedBlockAssignment block = getBlock(0);
		   BouncePoint bp = calculateBouncePointBlock(block);
		   this.setBounce(bp);
		   return true;
	   }
	   return false;
  }

  // line 202 "../../../../../Block223States.ump"
   private boolean hitBlock(){
    int nrBlocks = this.numberOfBlocks();
    setBounce(null);
    
    for(int i=0; i<numberOfBlocks()-1; i++) {	
    	PlayedBlockAssignment block = getBlock(i);
    	BouncePoint bp = calculateBouncePointBlock(block);
    	BouncePoint bounce = getBounce();
    	boolean closer = isCloser(bp, bounce);
    	if(closer == true) {
    		setBounce(bp);
    	}
    }
    return getBounce()!=null;
  }

  // line 218 "../../../../../Block223States.ump"
   private boolean hitWall(){
    BouncePoint bp = calculateBouncePointWall();
	
	   if (bp != null) {
		   setBounce(bp);
		   return true;
	   }
	   else
		   return false;
  }

  // line 230 "../../../../../Block223States.ump"
   private BouncePoint calculateBouncePointWall(){
    // Current position of the ball
	   double x = getCurrentBallX();
	   double y = getCurrentBallY();
	   // Where the ball is going
	   double dx = getBallDirectionX();
	   double dy = getBallDirectionY();
	   // New position of the ball
	   double positionX = (x+dx);
	   double positionY = (y+dy);
	   
	   BouncePoint bp = null;
	   
	   // Section A
	   if (positionX == 5 && positionY > 5 && positionY < 385) {
		   bp = new BouncePoint(0,0,null);
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
	   }
	   
	   // Section B
	   if (positionY == 5 && positionX > 5 && positionX < 385) {
		   bp = new BouncePoint(0,0,null);
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_Y);
	   }
	   
	   // Section C
	   if (positionX == 385 && positionY > 5 && positionY < 385) {
		   bp = new BouncePoint(0,0,null);
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
	   }
	   
	   // A-B Corner
	   if (positionX == 5 && positionY == 5) {
		   bp = new BouncePoint(0,0,null);
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
	   }
	   
	   // B-C Corner
	   if (positionX == 385 && positionY == 5) {
		   bp = new BouncePoint(0,0,null);
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
	   }
	   
	   return bp;
  }

  // line 287 "../../../../../Block223States.ump"
   private BouncePoint calculateBouncePointBlock(PlayedBlockAssignment pblock){
    // Current position of the ball
		   double x = getCurrentBallX();
		   double y = getCurrentBallY();
		   // Where the ball is going
		   double dx = getBallDirectionX();
		   double dy = getBallDirectionY();
		   // New position of the ball
		   double positionX = (x+dx);
		   double positionY = (y+dy);
		   
		   BouncePoint bp = null; 
		java.awt.geom.Rectangle2D physicalblock=new java.awt.geom.Rectangle2D.Double(pblock.getX()-10, pblock.getY()-10, 30.0, 30.0);
			
			if (physicalblock.contains(positionX,positionY)){
				
				// Section A and D
				   if ((positionX+5 >= (pblock.getX()-5) && positionX+5 <= (pblock.getX()) && positionY+5<=(pblock.getY()+20) && positionY-5>=(pblock.getY()))||(positionX-5 <= (pblock.getX()+25) && positionX-5 >= (pblock.getX()+20) && positionY+5<=(pblock.getY()+20) && positionY-5>=(pblock.getY()))) {
					   bp = new BouncePoint(0,0,null);
					   bp.setX(positionX);
					   bp.setY(positionY);
					   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
				   }
				   
				   // Section B and C
				   if ((positionY-5 >= (pblock.getY()-5) && positionY-5 <= (pblock.getY())) && positionX+5 >= (pblock.getX()) && positionX-5 <= (pblock.getX()+20)||(positionY+5 <= (pblock.getY()+25)&& positionY+5 >= (pblock.getY()+20) && positionX+5 >= (pblock.getX()) && positionX-5 <= (pblock.getX()+20))) {
					   bp = new BouncePoint(0,0,null);
					   bp.setX(positionX);
					   bp.setY(positionY);
					   bp.setDirection(BouncePoint.BounceDirection.FLIP_Y);
				}
					
					 //Section E and G
					   if ((positionY-5 >= (pblock.getY()-5) && positionY-5 <= (pblock.getY())) && positionX-5 <= (pblock.getX()) && positionX-5 >= (pblock.getX()-5)||(positionY+5 <= (pblock.getY()+25)&& positionY+5 >= (pblock.getY()+20) && positionX-5 <= (pblock.getX()) && positionX-5 >= (pblock.getX()-5))) {
						   bp = new BouncePoint(0,0,null);
						   bp.setX(positionX);
						   bp.setY(positionY);
						   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
						   //flip Y if ball approaches from right and Flip X if ball approaches from left
						   }
						   
						   //Section F and H
						   if ((positionY+5 >= (pblock.getY()-5) && positionY-5 <= (pblock.getY())) && positionX+5 <= (pblock.getX()+25) && positionX+5 >= (pblock.getX()+20)||(positionY+5 <= (pblock.getY()+25)&& positionY+5 >= (pblock.getY()+20) && positionX+5 <= (pblock.getX()+25) && positionX+5 >= (pblock.getX()+20))) {
							   bp = new BouncePoint(0,0,null);
							   bp.setX(positionX);
							   bp.setY(positionY);
							   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
							   //Flip X of ball approaches from right and Flip Y if ball approaches from left
					   }   
			}
		
		   return bp;
  }


  /**
   * Actions
   */
  // line 342 "../../../../../Block223States.ump"
   private void doSetup(){
    Random rgen=new Random();
	   	doReset();
	    Game game=getGame();
	    Level level = game.getLevel(currentLevel-1);
	    List<BlockAssignment> assignments= level.getBlockAssignments();
	    
	    for (BlockAssignment a: assignments){
	    	PlayedBlockAssignment pblock=new PlayedBlockAssignment(game.WALL_PADDING+(Block.SIZE+game.COLUMNS_PADDING)*(a.getGridHorizontalPosition()-1),
	    			game.WALL_PADDING+(Block.SIZE+game.ROW_PADDING)*(a.getGridVerticalPosition()-1), a.getBlock(), this);
	    }
	    
	    while (numberOfBlocks()<game.getNrBlocksPerLevel()) {
	   		int x=rgen.nextInt(15)+1;
			int y=rgen.nextInt(10)+1;
			while (level.findBlockAssignment(x,y)!=null) {
				x++;
				if (x==15) {
					y++;
					x=1;
				}
			}
	    	PlayedBlockAssignment pblock=new PlayedBlockAssignment(Game.WALL_PADDING+(Block.SIZE+Game.COLUMNS_PADDING)*(x-1),
	    			Game.WALL_PADDING+(Block.SIZE+Game.ROW_PADDING)*(y-1), game.getRandomBlock(), this);
	    
	    }
  }

  // line 371 "../../../../../Block223States.ump"
   private void doReset(){
    resetCurrentBallX();
  	resetCurrentBallY();
  	resetBallDirectionX();
  	resetBallDirectionY();
  	resetCurrentPaddleX();
  }

  // line 379 "../../../../../Block223States.ump"
   private void doHitPaddleOrWall(){
    bounceBall();
  }

  // line 384 "../../../../../Block223States.ump"
   private void doOutOfBounds(){
    setLives(lives-1);
	   doReset();
  }

  // line 389 "../../../../../Block223States.ump"
   private void doHitBlock(){
    score = getScore();
	   
	   bounce = getBounce();
	   if (bounce!=null) {
		   PlayedBlockAssignment pblock = bounce.getHitBlock();
		   Block block = pblock.getBlock();
		   int bscore = block.getPoints();
		   setScore(score+bscore);
		   pblock.delete();
		   bounceBall();
	   }
  }

  // line 403 "../../../../../Block223States.ump"
   private void doHitBlockNextLevel(){
    doHitBlock();
    	int level = this.getCurrentLevel();
    
    	setCurrentLevel(level+1);
    	setCurrentPaddleLength(getGame().getPaddle().getMaxPaddleLength()-(getGame().getPaddle().getMaxPaddleLength()-getGame().getPaddle().getMinPaddleLength())/(getGame().numberOfLevels()-1)*(getCurrentLevel()-1));
    	setWaitTime(INITIAL_WAIT_TIME*(int)getGame().getBall().getBallSpeedIncreaseFactor()^(getCurrentLevel()-1));
  }

  // line 413 "../../../../../Block223States.ump"
   private void doHitNothingAndNotOutOfBounds(){
    double x = getCurrentBallX();
	   double y = getCurrentBallY();
	   
	   double dx = getBallDirectionX();
	   double dy = getBallDirectionY();
	   
	   setCurrentBallX(x+dx);
	   setCurrentBallY(y+dy);
  }

  // line 425 "../../../../../Block223States.ump"
   private void doGameOver(){
    Block223 block223=this.getBlock223();
    	Player p=this.getPlayer();
    	
    	if (p!=null){
    		Game game=this.getGame();
    		HallOfFameEntry hof=new HallOfFameEntry(score, playername, p, game, block223);
    		game.setMostRecentEntry(hof);
    		this.delete();
    	}
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "score" + ":" + getScore()+ "," +
            "lives" + ":" + getLives()+ "," +
            "currentLevel" + ":" + getCurrentLevel()+ "," +
            "waitTime" + ":" + getWaitTime()+ "," +
            "playername" + ":" + getPlayername()+ "," +
            "ballDirectionX" + ":" + getBallDirectionX()+ "," +
            "ballDirectionY" + ":" + getBallDirectionY()+ "," +
            "currentBallX" + ":" + getCurrentBallX()+ "," +
            "currentBallY" + ":" + getCurrentBallY()+ "," +
            "currentPaddleLength" + ":" + getCurrentPaddleLength()+ "," +
            "currentPaddleX" + ":" + getCurrentPaddleX()+ "," +
            "currentPaddleY" + ":" + getCurrentPaddleY()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "player = "+(getPlayer()!=null?Integer.toHexString(System.identityHashCode(getPlayer())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "bounce = "+(getBounce()!=null?Integer.toHexString(System.identityHashCode(getBounce())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "block223 = "+(getBlock223()!=null?Integer.toHexString(System.identityHashCode(getBlock223())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 113 "../../../../../Block223Persistence.ump"
  private static final long serialVersionUID = 11789647876L ;

  
}