/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/



// line 1 "Block223States.ump"
public class PlayedGame
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PlayedGame State Machines
  public enum PlayStatus { Ready, Moving, Paused, GameOver }
  private PlayStatus playStatus;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PlayedGame()
  {
    setPlayStatus(PlayStatus.Ready);
  }

  //------------------------
  // INTERFACE
  //------------------------

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
        // line 12 "Block223States.ump"
          doHitPaddleOrWall();
          setPlayStatus(PlayStatus.Moving);
          wasEventProcessed = true;
          break;
        }
        if (isOutOfBoundsAndLastLife())
        {
        // line 13 "Block223States.ump"
          doOutOfBounds();
          setPlayStatus(PlayStatus.GameOver);
          wasEventProcessed = true;
          break;
        }
        if (isOutOfBounds())
        {
        // line 14 "Block223States.ump"
          doOutOfBounds();
          setPlayStatus(PlayStatus.Paused);
          wasEventProcessed = true;
          break;
        }
        if (hitLastBlockAndLastLevel())
        {
        // line 15 "Block223States.ump"
          doHitBlock();
          setPlayStatus(PlayStatus.GameOver);
          wasEventProcessed = true;
          break;
        }
        if (hitLastBlock())
        {
        // line 16 "Block223States.ump"
          doHitBlockNextLevel();
          setPlayStatus(PlayStatus.Ready);
          wasEventProcessed = true;
          break;
        }
        if (hitBlock())
        {
        // line 17 "Block223States.ump"
          doHitBlock();
          setPlayStatus(PlayStatus.Moving);
          wasEventProcessed = true;
          break;
        }
        if (hitWall())
        {
        // line 18 "Block223States.ump"
          doHitPaddleOrWall();
          setPlayStatus(PlayStatus.Moving);
          wasEventProcessed = true;
          break;
        }
        // line 19 "Block223States.ump"
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
        // line 7 "Block223States.ump"
        doSetup();
        break;
      case GameOver:
        // line 25 "Block223States.ump"
        doGameOver();
        break;
    }
  }

  public void delete()
  {}


  /**
   * Guards
   */
  // line 32 "Block223States.ump"
   private boolean hitPaddle(){
    BouncePoint bp = calculateBouncePointPaddle();
	   
	   if (bp != null) {
		   setBounce(bp);
		   return true;
	   }
	   else 
		   return false;
  }

  // line 43 "Block223States.ump"
   private BouncePoint calculateBouncePointPaddle(){
    // Current position of the ball
	   double x = getCurrentBallX();
	   double y = getCurrentBallY();
	   // Where the ball is going
	   double dx = getBallDirectionX();
	   double dy = getBallDirectionY();
	   // New position of the ball
	   setCurrentBallX(x+dx);
	   setCurrentBallY(y+dy);
	   
	   BouncePoint bp = null;
	   
	   // Add 5 to all the variables to account for the radius of the ball
	   // Rectangle2D paddle = new Rectangle2D.Double(getCurrentPaddleX()+(double)5, getCurrentPaddleY()+(double)5, (double) 10, getCurrentPaddleLength()+(double)5);
	   // if (paddle.intersects(getCurrentBallX(), getCurrentBallY(), 5, 5)) { // not sure about these 5s
		   // BOUNCE
		   // Section A
		   if (getCurrentBallY() == 350 && getCurrentBallX() >= getCurrentPaddleX() && getCurrentBallX() <= (getCurrentPaddleX() + getCurrentPaddleLength())) {
			   bp.setX(getCurrentBallX());
			   bp.setY(getCurrentBallY());
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_Y);
		   }
		   
		   // Section B
		   if (getCurrentBallX() == (getCurrentPaddleX()+5) && getCurrentBallY() >= 355 && getCurrentBallY() <= 360) {
			   bp.setX(getCurrentBallX());
			   bp.setY(getCurrentBallY());
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
		   }
		   
		   // Section C
		   if (getCurrentBallX() == (getCurrentPaddleX()+getCurrentPaddleLength()+5) && getCurrentBallY() >= 355 && getCurrentBallY() <= 360) {
			   bp.setX(getCurrentBallX());
			   bp.setY(getCurrentBallY());
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
		   }
		   
		   // Section E
		   // Incomplete; does not account for the whole curvature; only for the corner
		   if (getCurrentBallX() == (getCurrentPaddleX()+5) && getCurrentBallY() == 350) {
			   bp.setX(getCurrentBallX());
			   bp.setY(getCurrentBallY());
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
		   }
		   
		   // Section F
		   if (getCurrentBallX() == (getCurrentPaddleX()+getCurrentPaddleLength()+5) && getCurrentBallY() == 350) {
			   bp.setX(getCurrentBallX());
			   bp.setY(getCurrentBallY());
			   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
		   }
	  // }
	   return bp;
  }

  // line 100 "Block223States.ump"
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

  // line 146 "Block223States.ump"
   private boolean isOutOfBoundsAndLastLife(){
    // TODO implement
    return false;
  }

  // line 151 "Block223States.ump"
   private boolean isOutOfBounds(){
    // TODO implement
    return false;
  }

  // line 156 "Block223States.ump"
   private boolean hitLastBlockAndLastLevel(){
    // TODO implement
    return false;
  }

  // line 161 "Block223States.ump"
   private boolean hitLastBlock(){
    // TODO implement
    return false;
  }

  // line 166 "Block223States.ump"
   private boolean hitBlock(){
    // TODO implement
    return false;
  }

  // line 171 "Block223States.ump"
   private boolean hitWall(){
    BouncePoint bp = calculateBouncePointWall();
	
	   if (bp != null) {
		   setBounce(bp);
		   return true;
	   }
	   else
		   return false;
  }

  // line 183 "Block223States.ump"
   private BouncePoint calculateBouncePointWall(){
    // Current position of the ball
	   double x = getCurrentBallX();
	   double y = getCurrentBallY();
	   // Where the ball is going
	   double dx = getBallDirectionX();
	   double dy = getBallDirectionY();
	   // New position of the ball
	   setCurrentBallX(x+dx);
	   setCurrentBallY(y+dy);
	   
	   BouncePoint bp = null;
	   
	   // Section A
	   if (getCurrentBallX() == 5 && getCurrentBallY() > 5 && getCurrentBallY() < 385) {
		   bp.setX(getCurrentBallX());
		   bp.setY(getCurrentBallY());
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
	   }
	   
	   // Section B
	   if (getCurrentBallY() == 5 && getCurrentBallX() > 5 && getCurrentBallX() < 385) {
		   bp.setX(getCurrentBallX());
		   bp.setY(getCurrentBallY());
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_Y);
	   }
	   
	   // Section C
	   if (getCurrentBallX() == 385 && getCurrentBallY() > 5 && getCurrentBallY() < 385) {
		   bp.setX(getCurrentBallX());
		   bp.setY(getCurrentBallY());
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
	   }
	   
	   // A-B Corner
	   if (getCurrentBallX() == 5 && getCurrentBallY() == 5) {
		   bp.setX(getCurrentBallX());
		   bp.setY(getCurrentBallY());
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
	   }
	   
	   // B-C Corner
	   if (getCurrentBallX() == 385 && getCurrentBallY() == 5) {
		   bp.setX(getCurrentBallX());
		   bp.setY(getCurrentBallY());
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
	   }
	   
	   return bp;
  }


  /**
   * Actions
   */
  // line 237 "Block223States.ump"
   private void doSetup(){
    // TODO implement
  }

  // line 242 "Block223States.ump"
   private void doHitPaddleOrWall(){
    bounceBall();
  }

  // line 247 "Block223States.ump"
   private void doOutOfBounds(){
    // TODO implement
  }

  // line 251 "Block223States.ump"
   private void doHitBlock(){
    // TODO implement
  }

  // line 255 "Block223States.ump"
   private void doHitBlockNextLevel(){
    // TODO implement
  }

  // line 259 "Block223States.ump"
   private void doHitNothingAndNotOutOfBounds(){
    // TODO implement
  }

  // line 263 "Block223States.ump"
   private void doGameOver(){
    // TODO implement
  }

}