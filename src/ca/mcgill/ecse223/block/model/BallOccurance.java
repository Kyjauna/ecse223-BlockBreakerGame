/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;

// line 49 "../../../../../I4.Updated.Domain.Model.ump"
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
    if (aPlayableGame == null || aPlayableGame.getBallOccurance() != null)
    {
      throw new RuntimeException("Unable to create BallOccurance due to aPlayableGame");
    }
    playableGame = aPlayableGame;
  }

  public BallOccurance(int aCurrentBallOXPosition, int aCurrentBallOYPosition, Ball aBall, boolean aIsInTestModeForPlayableGame, int aCurrentScoreForPlayableGame, Game aGameForPlayableGame, Player aPlayerForPlayableGame, Block223 aBlock223ForPlayableGame, PaddleOccurance aPaddleOccuranceForPlayableGame)
  {
    currentBallOXPosition = aCurrentBallOXPosition;
    currentBallOYPosition = aCurrentBallOYPosition;
    boolean didAddBall = setBall(aBall);
    if (!didAddBall)
    {
      throw new RuntimeException("Unable to create ballOccurance due to ball");
    }
    playableGame = new PlayableGame(aIsInTestModeForPlayableGame, aCurrentScoreForPlayableGame, aGameForPlayableGame, aPlayerForPlayableGame, aBlock223ForPlayableGame, aPaddleOccuranceForPlayableGame, this);
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
      existingPlayableGame.delete();
    }
  }

  // line 56 "../../../../../I4.Updated.Domain.Model.ump"
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