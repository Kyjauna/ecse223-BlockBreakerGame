/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse.btms.model;
import java.util.*;

// line 61 "../../../../../blockGame.ump"
public class Paddle
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final int PaddleWidth = 5;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Paddle Attributes
  private int paddleLength;
  private int minimumLength;
  private int maximumLength;

  //Paddle Associations
  private Block223 block223;
  private Game game;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Paddle(int aPaddleLength, int aMinimumLength, int aMaximumLength, Block223 aBlock223, Game aGame)
  {
    paddleLength = aPaddleLength;
    minimumLength = aMinimumLength;
    maximumLength = aMaximumLength;
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create paddle due to block223");
    }
    if (aGame == null || aGame.getPaddle() != null)
    {
      throw new RuntimeException("Unable to create Paddle due to aGame");
    }
    game = aGame;
  }

  public Paddle(int aPaddleLength, int aMinimumLength, int aMaximumLength, Block223 aBlock223, String aGameNameForGame, int aNumberOfBlocksForGame, int aSpeedFactorForGame, Block223 aBlock223ForGame, Admin aAdminForGame, PlayArea aPlayAreaForGame, Ball aBallForGame)
  {
    paddleLength = aPaddleLength;
    minimumLength = aMinimumLength;
    maximumLength = aMaximumLength;
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create paddle due to block223");
    }
    game = new Game(aGameNameForGame, aNumberOfBlocksForGame, aSpeedFactorForGame, aBlock223ForGame, aAdminForGame, aPlayAreaForGame, aBallForGame, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPaddleLength(int aPaddleLength)
  {
    boolean wasSet = false;
    paddleLength = aPaddleLength;
    wasSet = true;
    return wasSet;
  }

  public boolean setMinimumLength(int aMinimumLength)
  {
    boolean wasSet = false;
    minimumLength = aMinimumLength;
    wasSet = true;
    return wasSet;
  }

  public boolean setMaximumLength(int aMaximumLength)
  {
    boolean wasSet = false;
    maximumLength = aMaximumLength;
    wasSet = true;
    return wasSet;
  }

  public int getPaddleLength()
  {
    return paddleLength;
  }

  public int getMinimumLength()
  {
    return minimumLength;
  }

  public int getMaximumLength()
  {
    return maximumLength;
  }
  /* Code from template association_GetOne */
  public Block223 getBlock223()
  {
    return block223;
  }
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
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
      existingBlock223.removePaddle(this);
    }
    block223.addPaddle(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Block223 placeholderBlock223 = block223;
    this.block223 = null;
    if(placeholderBlock223 != null)
    {
      placeholderBlock223.removePaddle(this);
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
            "paddleLength" + ":" + getPaddleLength()+ "," +
            "minimumLength" + ":" + getMinimumLength()+ "," +
            "maximumLength" + ":" + getMaximumLength()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "block223 = "+(getBlock223()!=null?Integer.toHexString(System.identityHashCode(getBlock223())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null");
  }
}