/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;
import java.util.*;

// line 24 "../../../../../Block223Persistence.ump"
// line 34 "../../../../../I4.Updated.Domain.Model.ump"
// line 159 "../../../../../Block223 v2.ump"
public class Ball implements Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final int BALL_DIAMETER = 10;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ball Attributes
  private int currentBallXPosition;
  private int currentBallYPosition;
  private int minBallSpeedX;
  private int minBallSpeedY;
  private double ballSpeedIncreaseFactor;

  //Ball Associations
  private Game game;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ball(int aCurrentBallXPosition, int aCurrentBallYPosition, int aMinBallSpeedX, int aMinBallSpeedY, double aBallSpeedIncreaseFactor, Game aGame)
  {
    // line 167 "../../../../../Block223 v2.ump"
    if (aMinBallSpeedX <= 0){
       			throw new RuntimeException("The minimum speed of the ball must be greater than zero.");
       		}
       		if (aMinBallSpeedY <= 0){
       			throw new RuntimeException("The minimum speed of the ball must be greater than zero.");
    		}
       		if (aBallSpeedIncreaseFactor <= 0){
       			throw new RuntimeException("The speed increase factor of the ball must be greater than zero.");  
    		}
    // END OF UMPLE BEFORE INJECTION
    currentBallXPosition = aCurrentBallXPosition;
    currentBallYPosition = aCurrentBallYPosition;
    minBallSpeedX = aMinBallSpeedX;
    minBallSpeedY = aMinBallSpeedY;
    ballSpeedIncreaseFactor = aBallSpeedIncreaseFactor;
    if (aGame == null || aGame.getBall() != null)
    {
      throw new RuntimeException("Unable to create Ball due to aGame");
    }
    game = aGame;
  }

  public Ball(int aCurrentBallXPosition, int aCurrentBallYPosition, int aMinBallSpeedX, int aMinBallSpeedY, double aBallSpeedIncreaseFactor, boolean aIsPublishedForGame, String aNameForGame, int aNrBlocksPerLevelForGame, Admin aAdminForGame, Paddle aPaddleForGame, HallOfFame aHallOfFameForGame, Block223 aBlock223ForGame)
  {
    // line 167 "../../../../../Block223 v2.ump"
    if (aMinBallSpeedX <= 0){
       			throw new RuntimeException("The minimum speed of the ball must be greater than zero.");
       		}
       		if (aMinBallSpeedY <= 0){
       			throw new RuntimeException("The minimum speed of the ball must be greater than zero.");
    		}
       		if (aBallSpeedIncreaseFactor <= 0){
       			throw new RuntimeException("The speed increase factor of the ball must be greater than zero.");  
    		}
    // END OF UMPLE BEFORE INJECTION
    currentBallXPosition = aCurrentBallXPosition;
    currentBallYPosition = aCurrentBallYPosition;
    minBallSpeedX = aMinBallSpeedX;
    minBallSpeedY = aMinBallSpeedY;
    ballSpeedIncreaseFactor = aBallSpeedIncreaseFactor;
    game = new Game(aIsPublishedForGame, aNameForGame, aNrBlocksPerLevelForGame, aAdminForGame, this, aPaddleForGame, aHallOfFameForGame, aBlock223ForGame);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCurrentBallXPosition(int aCurrentBallXPosition)
  {
    boolean wasSet = false;
    currentBallXPosition = aCurrentBallXPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentBallYPosition(int aCurrentBallYPosition)
  {
    boolean wasSet = false;
    currentBallYPosition = aCurrentBallYPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setMinBallSpeedX(int aMinBallSpeedX)
  {
    boolean wasSet = false;
    minBallSpeedX = aMinBallSpeedX;
    wasSet = true;
    return wasSet;
  }

  public boolean setMinBallSpeedY(int aMinBallSpeedY)
  {
    boolean wasSet = false;
    minBallSpeedY = aMinBallSpeedY;
    wasSet = true;
    return wasSet;
  }

  public boolean setBallSpeedIncreaseFactor(double aBallSpeedIncreaseFactor)
  {
    boolean wasSet = false;
    ballSpeedIncreaseFactor = aBallSpeedIncreaseFactor;
    wasSet = true;
    return wasSet;
  }

  public int getCurrentBallXPosition()
  {
    return currentBallXPosition;
  }

  public int getCurrentBallYPosition()
  {
    return currentBallYPosition;
  }

  public int getMinBallSpeedX()
  {
    return minBallSpeedX;
  }

  public int getMinBallSpeedY()
  {
    return minBallSpeedY;
  }

  public double getBallSpeedIncreaseFactor()
  {
    return ballSpeedIncreaseFactor;
  }
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
  }

  public void delete()
  {
    Game existingGame = game;
    game = null;
    if (existingGame != null)
    {
      existingGame.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "currentBallXPosition" + ":" + getCurrentBallXPosition()+ "," +
            "currentBallYPosition" + ":" + getCurrentBallYPosition()+ "," +
            "minBallSpeedX" + ":" + getMinBallSpeedX()+ "," +
            "minBallSpeedY" + ":" + getMinBallSpeedY()+ "," +
            "ballSpeedIncreaseFactor" + ":" + getBallSpeedIncreaseFactor()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 27 "../../../../../Block223Persistence.ump"
  private static final long serialVersionUID = 33577357567L ;

  
}