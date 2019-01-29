/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse.btms.model;
import java.util.*;

// line 54 "../../../../../blockGame.ump"
public class Ball
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final int BallSize = 10;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ball Attributes
  private int ballSpeed;
  private int minimumSpeed;
  private int maximumSpeed;

  //Ball Associations
  private Block223 block223;
  private Game game;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ball(int aBallSpeed, int aMinimumSpeed, int aMaximumSpeed, Block223 aBlock223, Game aGame)
  {
    ballSpeed = aBallSpeed;
    minimumSpeed = aMinimumSpeed;
    maximumSpeed = aMaximumSpeed;
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create ball due to block223");
    }
    if (aGame == null || aGame.getBall() != null)
    {
      throw new RuntimeException("Unable to create Ball due to aGame");
    }
    game = aGame;
  }

  public Ball(int aBallSpeed, int aMinimumSpeed, int aMaximumSpeed, Block223 aBlock223, String aGameNameForGame, int aNumberOfBlocksForGame, int aSpeedFactorForGame, Block223 aBlock223ForGame, Admin aAdminForGame, PlayArea aPlayAreaForGame, Paddle aPaddleForGame)
  {
    ballSpeed = aBallSpeed;
    minimumSpeed = aMinimumSpeed;
    maximumSpeed = aMaximumSpeed;
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create ball due to block223");
    }
    game = new Game(aGameNameForGame, aNumberOfBlocksForGame, aSpeedFactorForGame, aBlock223ForGame, aAdminForGame, aPlayAreaForGame, this, aPaddleForGame);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBallSpeed(int aBallSpeed)
  {
    boolean wasSet = false;
    ballSpeed = aBallSpeed;
    wasSet = true;
    return wasSet;
  }

  public boolean setMinimumSpeed(int aMinimumSpeed)
  {
    boolean wasSet = false;
    minimumSpeed = aMinimumSpeed;
    wasSet = true;
    return wasSet;
  }

  public boolean setMaximumSpeed(int aMaximumSpeed)
  {
    boolean wasSet = false;
    maximumSpeed = aMaximumSpeed;
    wasSet = true;
    return wasSet;
  }

  public int getBallSpeed()
  {
    return ballSpeed;
  }

  public int getMinimumSpeed()
  {
    return minimumSpeed;
  }

  public int getMaximumSpeed()
  {
    return maximumSpeed;
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
      existingBlock223.removeBall(this);
    }
    block223.addBall(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Block223 placeholderBlock223 = block223;
    this.block223 = null;
    if(placeholderBlock223 != null)
    {
      placeholderBlock223.removeBall(this);
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
            "ballSpeed" + ":" + getBallSpeed()+ "," +
            "minimumSpeed" + ":" + getMinimumSpeed()+ "," +
            "maximumSpeed" + ":" + getMaximumSpeed()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "block223 = "+(getBlock223()!=null?Integer.toHexString(System.identityHashCode(getBlock223())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null");
  }
}