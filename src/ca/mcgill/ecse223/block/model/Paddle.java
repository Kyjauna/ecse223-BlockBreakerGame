/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;
import java.util.*;

// line 76 "../../../../../Block223Persistence.ump"
// line 181 "../../../../../Block223 v2.ump"
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
  private int maxPaddleLength;
  private int minPaddleLength;

  //Paddle Associations
  private List<PaddleOccurance> paddleOccurances;
  private Game game;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Paddle(int aMaxPaddleLength, int aMinPaddleLength, Game aGame)
  {
    // line 189 "../../../../../Block223 v2.ump"
    if (aMaxPaddleLength <= 0 || aMaxPaddleLength > 400){
       			throw new RuntimeException("The maximum length of the paddle must be greater than zero and less than or equal to 400.");
          	}
          	if (aMinPaddleLength <= 0){
       			throw new RuntimeException("The minimum length of the paddle must be greater than zero.");
          	}
    // END OF UMPLE BEFORE INJECTION
    maxPaddleLength = aMaxPaddleLength;
    minPaddleLength = aMinPaddleLength;
    paddleOccurances = new ArrayList<PaddleOccurance>();
    if (aGame == null || aGame.getPaddle() != null)
    {
      throw new RuntimeException("Unable to create Paddle due to aGame");
    }
    game = aGame;
  }

  public Paddle(int aMaxPaddleLength, int aMinPaddleLength, boolean aIsPublishedForGame, String aNameForGame, int aNrBlocksPerLevelForGame, Admin aAdminForGame, Ball aBallForGame, Block223 aBlock223ForGame)
  {
    // line 189 "../../../../../Block223 v2.ump"
    if (aMaxPaddleLength <= 0 || aMaxPaddleLength > 400){
       			throw new RuntimeException("The maximum length of the paddle must be greater than zero and less than or equal to 400.");
          	}
          	if (aMinPaddleLength <= 0){
       			throw new RuntimeException("The minimum length of the paddle must be greater than zero.");
          	}
    // END OF UMPLE BEFORE INJECTION
    maxPaddleLength = aMaxPaddleLength;
    minPaddleLength = aMinPaddleLength;
    paddleOccurances = new ArrayList<PaddleOccurance>();
    game = new Game(aIsPublishedForGame, aNameForGame, aNrBlocksPerLevelForGame, aAdminForGame, aBallForGame, this, aBlock223ForGame);
  }

  //------------------------
  // INTERFACE
  //------------------------

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

  public int getMaxPaddleLength()
  {
    return maxPaddleLength;
  }

  public int getMinPaddleLength()
  {
    return minPaddleLength;
  }
  /* Code from template association_GetMany */
  public PaddleOccurance getPaddleOccurance(int index)
  {
    PaddleOccurance aPaddleOccurance = paddleOccurances.get(index);
    return aPaddleOccurance;
  }

  public List<PaddleOccurance> getPaddleOccurances()
  {
    List<PaddleOccurance> newPaddleOccurances = Collections.unmodifiableList(paddleOccurances);
    return newPaddleOccurances;
  }

  public int numberOfPaddleOccurances()
  {
    int number = paddleOccurances.size();
    return number;
  }

  public boolean hasPaddleOccurances()
  {
    boolean has = paddleOccurances.size() > 0;
    return has;
  }

  public int indexOfPaddleOccurance(PaddleOccurance aPaddleOccurance)
  {
    int index = paddleOccurances.indexOf(aPaddleOccurance);
    return index;
  }
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPaddleOccurances()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PaddleOccurance addPaddleOccurance(int aCurrentPaddleXPosition, int aCurrentPaddleYPosition, int aCurrentPaddleLength, PlayableGame aPlayableGame)
  {
    return new PaddleOccurance(aCurrentPaddleXPosition, aCurrentPaddleYPosition, aCurrentPaddleLength, this, aPlayableGame);
  }

  public boolean addPaddleOccurance(PaddleOccurance aPaddleOccurance)
  {
    boolean wasAdded = false;
    if (paddleOccurances.contains(aPaddleOccurance)) { return false; }
    Paddle existingPaddle = aPaddleOccurance.getPaddle();
    boolean isNewPaddle = existingPaddle != null && !this.equals(existingPaddle);
    if (isNewPaddle)
    {
      aPaddleOccurance.setPaddle(this);
    }
    else
    {
      paddleOccurances.add(aPaddleOccurance);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePaddleOccurance(PaddleOccurance aPaddleOccurance)
  {
    boolean wasRemoved = false;
    //Unable to remove aPaddleOccurance, as it must always have a paddle
    if (!this.equals(aPaddleOccurance.getPaddle()))
    {
      paddleOccurances.remove(aPaddleOccurance);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPaddleOccuranceAt(PaddleOccurance aPaddleOccurance, int index)
  {  
    boolean wasAdded = false;
    if(addPaddleOccurance(aPaddleOccurance))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPaddleOccurances()) { index = numberOfPaddleOccurances() - 1; }
      paddleOccurances.remove(aPaddleOccurance);
      paddleOccurances.add(index, aPaddleOccurance);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePaddleOccuranceAt(PaddleOccurance aPaddleOccurance, int index)
  {
    boolean wasAdded = false;
    if(paddleOccurances.contains(aPaddleOccurance))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPaddleOccurances()) { index = numberOfPaddleOccurances() - 1; }
      paddleOccurances.remove(aPaddleOccurance);
      paddleOccurances.add(index, aPaddleOccurance);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPaddleOccuranceAt(aPaddleOccurance, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=paddleOccurances.size(); i > 0; i--)
    {
      PaddleOccurance aPaddleOccurance = paddleOccurances.get(i - 1);
      aPaddleOccurance.delete();
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