/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;

// line 33 "../../../../../I4.Updated.Domain.Model.ump"
public class BallOccurance
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BallOccurance Attributes
  private int currentBallOXPosition;
  private int currentBallOYPosition;

  //BallOccurance Associations
  private Ball ball;
  private PlayableGame playableGame;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BallOccurance(int aCurrentBallOXPosition, int aCurrentBallOYPosition, Ball aBall, PlayableGame aPlayableGame)
  {
    currentBallOXPosition = aCurrentBallOXPosition;
    currentBallOYPosition = aCurrentBallOYPosition;
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

  public int getCurrentBallOXPosition()
  {
    return currentBallOXPosition;
  }

  public int getCurrentBallOYPosition()
  {
    return currentBallOYPosition;
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
  /* Code from template association_SetOneToMany */
  public boolean setPlayableGame(PlayableGame aPlayableGame)
  {
    boolean wasSet = false;
    if (aPlayableGame == null)
    {
      return wasSet;
    }

    PlayableGame existingPlayableGame = playableGame;
    playableGame = aPlayableGame;
    if (existingPlayableGame != null && !existingPlayableGame.equals(aPlayableGame))
    {
      existingPlayableGame.removeBallOccurance(this);
    }
    playableGame.addBallOccurance(this);
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
    PlayableGame placeholderPlayableGame = playableGame;
    this.playableGame = null;
    if(placeholderPlayableGame != null)
    {
      placeholderPlayableGame.removeBallOccurance(this);
    }
  }

  // line 40 "../../../../../I4.Updated.Domain.Model.ump"
  public void updateBallPosition(){
    currentBallOXPosition=currentBallOXPosition+this.getBall().getMinBallSpeedX();
	currentBallOYPosition=currentBallOYPosition+this.getBall().getMinBallSpeedY();
  }


  public String toString()
  {
    return super.toString() + "["+
            "currentBallOXPosition" + ":" + getCurrentBallOXPosition()+ "," +
            "currentBallOYPosition" + ":" + getCurrentBallOYPosition()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "ball = "+(getBall()!=null?Integer.toHexString(System.identityHashCode(getBall())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "playableGame = "+(getPlayableGame()!=null?Integer.toHexString(System.identityHashCode(getPlayableGame())):"null");
  }
}