/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;
import java.util.*;

// line 24 "../../../../../Block223Persistence.ump"
// line 161 "../../../../../Block223 v2.ump"
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
  private int minBallSpeedX;
  private int minBallSpeedY;
  private double ballSpeedIncreaseFactor;

  //Ball Associations
  private List<BallOccurance> ballOccurances;
  private Game game;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ball(int aMinBallSpeedX, int aMinBallSpeedY, double aBallSpeedIncreaseFactor, Game aGame)
  {
    // line 169 "../../../../../Block223 v2.ump"
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
    minBallSpeedX = aMinBallSpeedX;
    minBallSpeedY = aMinBallSpeedY;
    ballSpeedIncreaseFactor = aBallSpeedIncreaseFactor;
    ballOccurances = new ArrayList<BallOccurance>();
    if (aGame == null || aGame.getBall() != null)
    {
      throw new RuntimeException("Unable to create Ball due to aGame");
    }
    game = aGame;
  }

  public Ball(int aMinBallSpeedX, int aMinBallSpeedY, double aBallSpeedIncreaseFactor, boolean aIsPublishedForGame, String aNameForGame, int aNrBlocksPerLevelForGame, Admin aAdminForGame, Paddle aPaddleForGame, Block223 aBlock223ForGame)
  {
    // line 169 "../../../../../Block223 v2.ump"
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
    minBallSpeedX = aMinBallSpeedX;
    minBallSpeedY = aMinBallSpeedY;
    ballSpeedIncreaseFactor = aBallSpeedIncreaseFactor;
    ballOccurances = new ArrayList<BallOccurance>();
    game = new Game(aIsPublishedForGame, aNameForGame, aNrBlocksPerLevelForGame, aAdminForGame, this, aPaddleForGame, aBlock223ForGame);
  }

  //------------------------
  // INTERFACE
  //------------------------

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
  /* Code from template association_GetMany */
  public BallOccurance getBallOccurance(int index)
  {
    BallOccurance aBallOccurance = ballOccurances.get(index);
    return aBallOccurance;
  }

  public List<BallOccurance> getBallOccurances()
  {
    List<BallOccurance> newBallOccurances = Collections.unmodifiableList(ballOccurances);
    return newBallOccurances;
  }

  public int numberOfBallOccurances()
  {
    int number = ballOccurances.size();
    return number;
  }

  public boolean hasBallOccurances()
  {
    boolean has = ballOccurances.size() > 0;
    return has;
  }

  public int indexOfBallOccurance(BallOccurance aBallOccurance)
  {
    int index = ballOccurances.indexOf(aBallOccurance);
    return index;
  }
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBallOccurances()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public BallOccurance addBallOccurance(int aCurrentBallOXPosition, int aCurrentBallOYPosition, PlayableGame aPlayableGame)
  {
    return new BallOccurance(aCurrentBallOXPosition, aCurrentBallOYPosition, this, aPlayableGame);
  }

  public boolean addBallOccurance(BallOccurance aBallOccurance)
  {
    boolean wasAdded = false;
    if (ballOccurances.contains(aBallOccurance)) { return false; }
    Ball existingBall = aBallOccurance.getBall();
    boolean isNewBall = existingBall != null && !this.equals(existingBall);
    if (isNewBall)
    {
      aBallOccurance.setBall(this);
    }
    else
    {
      ballOccurances.add(aBallOccurance);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBallOccurance(BallOccurance aBallOccurance)
  {
    boolean wasRemoved = false;
    //Unable to remove aBallOccurance, as it must always have a ball
    if (!this.equals(aBallOccurance.getBall()))
    {
      ballOccurances.remove(aBallOccurance);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBallOccuranceAt(BallOccurance aBallOccurance, int index)
  {  
    boolean wasAdded = false;
    if(addBallOccurance(aBallOccurance))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBallOccurances()) { index = numberOfBallOccurances() - 1; }
      ballOccurances.remove(aBallOccurance);
      ballOccurances.add(index, aBallOccurance);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBallOccuranceAt(BallOccurance aBallOccurance, int index)
  {
    boolean wasAdded = false;
    if(ballOccurances.contains(aBallOccurance))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBallOccurances()) { index = numberOfBallOccurances() - 1; }
      ballOccurances.remove(aBallOccurance);
      ballOccurances.add(index, aBallOccurance);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBallOccuranceAt(aBallOccurance, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=ballOccurances.size(); i > 0; i--)
    {
      BallOccurance aBallOccurance = ballOccurances.get(i - 1);
      aBallOccurance.delete();
    }
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