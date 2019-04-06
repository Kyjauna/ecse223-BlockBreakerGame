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

  // line 105 "Block223States.ump"
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

  // line 151 "Block223States.ump"
   private boolean isOutOfBoundsAndLastLife(){
    boolean outOfBounds = false;
	   if(lives == 1)
		   outOfBounds = isBallOutOfBounds();
	   return outOfBounds;
  }

  // line 158 "Block223States.ump"
   private boolean isBallOutOfBounds(){
    if (getCurrentBallY() > 385)
		   return true;
	   else return false;
  }

  // line 164 "Block223States.ump"
   private boolean isOutOfBounds(){
    boolean outOfBounds = isBallOutOfBounds();
	   return outOfBounds;
  }

  // line 170 "Block223States.ump"
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

  // line 190 "Block223States.ump"
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

  // line 202 "Block223States.ump"
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

  // line 218 "Block223States.ump"
   private boolean hitWall(){
    BouncePoint bp = calculateBouncePointWall();
	
	   if (bp != null) {
		   setBounce(bp);
		   return true;
	   }
	   else
		   return false;
  }

  // line 230 "Block223States.ump"
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
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
	   }
	   
	   // Section B
	   if (positionY == 5 && positionX > 5 && positionX < 385) {
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_Y);
	   }
	   
	   // Section C
	   if (positionX == 385 && positionY > 5 && positionY < 385) {
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
	   }
	   
	   // A-B Corner
	   if (positionX == 5 && positionY == 5) {
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
	   }
	   
	   // B-C Corner
	   if (positionX == 385 && positionY == 5) {
		   bp.setX(positionX);
		   bp.setY(positionY);
		   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
	   }
	   
	   return bp;
  }

  // line 282 "Block223States.ump"
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
					   bp.setX(positionX);
					   bp.setY(positionY);
					   bp.setDirection(BouncePoint.BounceDirection.FLIP_X);
				   }
				   
				   // Section B and C
				   if ((positionY-5 >= (pblock.getY()-5) && positionY-5 <= (pblock.getY())) && positionX+5 >= (pblock.getX()) && positionX-5 <= (pblock.getX()+20)||(positionY+5 <= (pblock.getY()+25)&& positionY+5 >= (pblock.getY()+20) && positionX+5 >= (pblock.getX()) && positionX-5 <= (pblock.getX()+20))) {
					   bp.setX(positionX);
					   bp.setY(positionY);
					   bp.setDirection(BouncePoint.BounceDirection.FLIP_Y);
				}
					
					 //Section E and G
					   if ((positionY-5 >= (pblock.getY()-5) && positionY-5 <= (pblock.getY())) && positionX-5 <= (pblock.getX()) && positionX-5 >= (pblock.getX()-5)||(positionY+5 <= (pblock.getY()+25)&& positionY+5 >= (pblock.getY()+20) && positionX-5 <= (pblock.getX()) && positionX-5 >= (pblock.getX()-5))) {
						   bp.setX(positionX);
						   bp.setY(positionY);
						   bp.setDirection(BouncePoint.BounceDirection.FLIP_BOTH);
						   //flip Y if ball approaches from right and Flip X if ball approaches from left
						   }
						   
						   //Section F and H
						   if ((positionY+5 >= (pblock.getY()-5) && positionY-5 <= (pblock.getY())) && positionX+5 <= (pblock.getX()+25) && positionX+5 >= (pblock.getX()+20)||(positionY+5 <= (pblock.getY()+25)&& positionY+5 >= (pblock.getY()+20) && positionX+5 <= (pblock.getX()+25) && positionX+5 >= (pblock.getX()+20))) {
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
  // line 333 "Block223States.ump"
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

  // line 362 "Block223States.ump"
   private void doReset(){
    resetCurrentBallX();
  	resetCurrentBallY();
  	resetBallDirectionX();
  	resetBallDirectionY();
  	resetCurrentPaddleX();
  }

  // line 370 "Block223States.ump"
   private void doHitPaddleOrWall(){
    bounceBall();
  }

  // line 375 "Block223States.ump"
   private void doOutOfBounds(){
    setLives(lives-1);
	   doReset();
  }

  // line 380 "Block223States.ump"
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

  // line 394 "Block223States.ump"
   private void doHitBlockNextLevel(){
    doHitBlock();
    	int level = this.getCurrentLevel();
    
    	setCurrentLevel(level+1);
    	setCurrentPaddleLength(getGame().getPaddle().getMaxPaddleLength()-(getGame().getPaddle().getMaxPaddleLength()-getGame().getPaddle().getMinPaddleLength())/(getGame().numberOfLevels()-1)*(getCurrentLevel()-1));
    	setWaitTime(INITIAL_WAIT_TIME*(int)getGame().getBall().getBallSpeedIncreaseFactor()^(getCurrentLevel()-1));
  }

  // line 404 "Block223States.ump"
   private void doHitNothingAndNotOutOfBounds(){
    double x = getCurrentBallX();
	   double y = getCurrentBallY();
	   
	   double dx = getBallDirectionX();
	   double dy = getBallDirectionY();
	   
	   setCurrentBallX(x+dx);
	   setCurrentBallY(y+dy);
  }

  // line 416 "Block223States.ump"
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

}