/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;

// line 48 "../../../../../I4.Updated.Domain.Model.ump"
public class BallOccurance
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BallOccurance Attributes
  private int currentBallOXPosition;
  private int currentBallOYPosition;
  private int currentBallOXDirection;
  private int currentBallOYDirection;

  //BallOccurance Associations
  private Ball ball;
  private PlayableGame playableGame;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BallOccurance(int aCurrentBallOXPosition, int aCurrentBallOYPosition, int aCurrentBallOXDirection, int aCurrentBallOYDirection, Ball aBall, PlayableGame aPlayableGame)
  {
    currentBallOXPosition = aCurrentBallOXPosition;
    currentBallOYPosition = aCurrentBallOYPosition;
    currentBallOXDirection = aCurrentBallOXDirection;
    currentBallOYDirection = aCurrentBallOYDirection;
    boolean didAddBall = setBall(aBall);
    if (!didAddBall)
    {
      throw new RuntimeException("Unable to create ballOccurance due to ball");
    }
    boolean didAddPlayableGame = setPlayableGame(aPlayableGame);
    if (!didAddPlayableGame)
    {
      throw new RuntimeException("Unable to create ballOccurance due to playableGame");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCurrentBallOXPosition(int aCurrentBallOXPosition)
  {
    boolean wasSet = false;
    currentBallOXPosition = aCurrentBallOXPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentBallOYPosition(int aCurrentBallOYPosition)
  {
    boolean wasSet = false;
    currentBallOYPosition = aCurrentBallOYPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentBallOXDirection(int aCurrentBallOXDirection)
  {
    boolean wasSet = false;
    currentBallOXDirection = aCurrentBallOXDirection;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentBallOYDirection(int aCurrentBallOYDirection)
  {
    boolean wasSet = false;
    currentBallOYDirection = aCurrentBallOYDirection;
    wasSet = true;
    return wasSet;
  }

  public int getCurrentBallOXPosition()
  {
    return currentBallOXPosition;
  }

  public int getCurrentBallOYPosition()
  {
    return currentBallOYPosition;
  }

  public int getCurrentBallOXDirection()
  {
    return currentBallOXDirection;
  }

  public int getCurrentBallOYDirection()
  {
    return currentBallOYDirection;
  }
  /* Code from template association_GetOne */
  public Ball getBall()
  {
    return ball;
  }
  /* Code from template association_GetOne */
  public PlayableGame getPlayableGame()
  {
    return playableGame;
  }
  /* Code from template association_SetOneToMany */
  public boolean setBall(Ball aBall)
  {
    boolean wasSet = false;
    if (aBall == null)
    {
      return wasSet;
    }

    Ball existingBall = ball;
    ball = aBall;
    if (existingBall != null && !existingBall.equals(aBall))
    {
      existingBall.removeBallOccurance(this);
    }
    ball.addBallOccurance(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setPlayableGame(PlayableGame aNewPlayableGame)
  {
    boolean wasSet = false;
    if (aNewPlayableGame == null)
    {
      //Unable to setPlayableGame to null, as ballOccurance must always be associated to a playableGame
      return wasSet;
    }
    
    BallOccurance existingBallOccurance = aNewPlayableGame.getBallOccurance();
    if (existingBallOccurance != null && !equals(existingBallOccurance))
    {
      //Unable to setPlayableGame, the current playableGame already has a ballOccurance, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    PlayableGame anOldPlayableGame = playableGame;
    playableGame = aNewPlayableGame;
    playableGame.setBallOccurance(this);

    if (anOldPlayableGame != null)
    {
      anOldPlayableGame.setBallOccurance(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Ball placeholderBall = ball;
    this.ball = null;
    if(placeholderBall != null)
    {
      placeholderBall.removeBallOccurance(this);
    }
    PlayableGame existingPlayableGame = playableGame;
    playableGame = null;
    if (existingPlayableGame != null)
    {
      existingPlayableGame.setBallOccurance(null);
    }
  }

  // line 55 "../../../../../I4.Updated.Domain.Model.ump"

  public void updateBallPosition(){
    currentBallOXPosition=currentBallOXPosition+this.getBall().getMinBallSpeedX();
	currentBallOYPosition=currentBallOYPosition+this.getBall().getMinBallSpeedY();
  }


  public String toString()
  {
    return super.toString() + "["+
            "currentBallOXPosition" + ":" + getCurrentBallOXPosition()+ "," +
            "currentBallOYPosition" + ":" + getCurrentBallOYPosition()+ "," +
            "currentBallOXDirection" + ":" + getCurrentBallOXDirection()+ "," +
            "currentBallOYDirection" + ":" + getCurrentBallOYDirection()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "ball = "+(getBall()!=null?Integer.toHexString(System.identityHashCode(getBall())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "playableGame = "+(getPlayableGame()!=null?Integer.toHexString(System.identityHashCode(getPlayableGame())):"null");
  }
}