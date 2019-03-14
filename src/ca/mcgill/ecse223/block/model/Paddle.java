/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;
import java.util.*;

// line 76 "../../../../../Block223Persistence.ump"
// line 27 "../../../../../I4.Updated.Domain.Model.ump"
// line 180 "../../../../../Block223 v2.ump"
public class Paddle implements Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final int PADDLE_WIDTH = 5;
  public static final int VERTICAL_DISTANCE = 30;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Paddle Attributes
  private int currentPaddleXPosition;
  private int currentPaddleYPosition;
  private int currentPaddleLength;
  private int maxPaddleLength;
  private int minPaddleLength;

  //Paddle Associations
  private Game game;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Paddle(int aCurrentPaddleXPosition, int aCurrentPaddleYPosition, int aCurrentPaddleLength, int aMaxPaddleLength, int aMinPaddleLength, Game aGame)
  {
    // line 188 "../../../../../Block223 v2.ump"
    if (aMaxPaddleLength <= 0 || aMaxPaddleLength > 400){
       			throw new RuntimeException("The maximum length of the paddle must be greater than zero and less than or equal to 400.");
          	}
          	if (aMinPaddleLength <= 0){
       			throw new RuntimeException("The minimum length of the paddle must be greater than zero.");
          	}
    // END OF UMPLE BEFORE INJECTION
    currentPaddleXPosition = aCurrentPaddleXPosition;
    currentPaddleYPosition = aCurrentPaddleYPosition;
    currentPaddleLength = aCurrentPaddleLength;
    maxPaddleLength = aMaxPaddleLength;
    minPaddleLength = aMinPaddleLength;
    if (aGame == null || aGame.getPaddle() != null)
    {
      throw new RuntimeException("Unable to create Paddle due to aGame");
    }
    game = aGame;
  }

  public Paddle(int aCurrentPaddleXPosition, int aCurrentPaddleYPosition, int aCurrentPaddleLength, int aMaxPaddleLength, int aMinPaddleLength, boolean aIsPublishedForGame, String aNameForGame, int aNrBlocksPerLevelForGame, Admin aAdminForGame, Ball aBallForGame, HallOfFame aHallOfFameForGame, Block223 aBlock223ForGame)
  {
    // line 188 "../../../../../Block223 v2.ump"
    if (aMaxPaddleLength <= 0 || aMaxPaddleLength > 400){
       			throw new RuntimeException("The maximum length of the paddle must be greater than zero and less than or equal to 400.");
          	}
          	if (aMinPaddleLength <= 0){
       			throw new RuntimeException("The minimum length of the paddle must be greater than zero.");
          	}
    // END OF UMPLE BEFORE INJECTION
    currentPaddleXPosition = aCurrentPaddleXPosition;
    currentPaddleYPosition = aCurrentPaddleYPosition;
    currentPaddleLength = aCurrentPaddleLength;
    maxPaddleLength = aMaxPaddleLength;
    minPaddleLength = aMinPaddleLength;
    game = new Game(aIsPublishedForGame, aNameForGame, aNrBlocksPerLevelForGame, aAdminForGame, aBallForGame, this, aHallOfFameForGame, aBlock223ForGame);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCurrentPaddleXPosition(int aCurrentPaddleXPosition)
  {
    boolean wasSet = false;
    currentPaddleXPosition = aCurrentPaddleXPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentPaddleYPosition(int aCurrentPaddleYPosition)
  {
    boolean wasSet = false;
    currentPaddleYPosition = aCurrentPaddleYPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentPaddleLength(int aCurrentPaddleLength)
  {
    boolean wasSet = false;
    currentPaddleLength = aCurrentPaddleLength;
    wasSet = true;
    return wasSet;
  }

  public boolean setMaxPaddleLength(int aMaxPaddleLength)
  {
    boolean wasSet = false;
    maxPaddleLength = aMaxPaddleLength;
    wasSet = true;
    return wasSet;
  }

  public boolean setMinPaddleLength(int aMinPaddleLength)
  {
    boolean wasSet = false;
    minPaddleLength = aMinPaddleLength;
    wasSet = true;
    return wasSet;
  }

  public int getCurrentPaddleXPosition()
  {
    return currentPaddleXPosition;
  }

  public int getCurrentPaddleYPosition()
  {
    return currentPaddleYPosition;
  }

  public int getCurrentPaddleLength()
  {
    return currentPaddleLength;
  }

  public int getMaxPaddleLength()
  {
    return maxPaddleLength;
  }

  public int getMinPaddleLength()
  {
    return minPaddleLength;
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
            "currentPaddleXPosition" + ":" + getCurrentPaddleXPosition()+ "," +
            "currentPaddleYPosition" + ":" + getCurrentPaddleYPosition()+ "," +
            "currentPaddleLength" + ":" + getCurrentPaddleLength()+ "," +
            "maxPaddleLength" + ":" + getMaxPaddleLength()+ "," +
            "minPaddleLength" + ":" + getMinPaddleLength()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 79 "../../../../../Block223Persistence.ump"
  private static final long serialVersionUID = 81234509876L ;

  
}