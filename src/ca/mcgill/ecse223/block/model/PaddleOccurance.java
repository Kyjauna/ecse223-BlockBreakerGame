/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;

// line 41 "../../../../../I4.Updated.Domain.Model.ump"
public class PaddleOccurance
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PaddleOccurance Attributes
  private int currentPaddleXPosition;
  private int currentPaddleYPosition;
  private int currentPaddleLength;

  //PaddleOccurance Associations
  private Paddle paddle;
  private PlayableGame playableGame;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PaddleOccurance(int aCurrentPaddleXPosition, int aCurrentPaddleYPosition, int aCurrentPaddleLength, Paddle aPaddle, PlayableGame aPlayableGame)
  {
    currentPaddleXPosition = aCurrentPaddleXPosition;
    currentPaddleYPosition = aCurrentPaddleYPosition;
    currentPaddleLength = aCurrentPaddleLength;
    boolean didAddPaddle = setPaddle(aPaddle);
    if (!didAddPaddle)
    {
      throw new RuntimeException("Unable to create paddleOccurance due to paddle");
    }
    if (aPlayableGame == null || aPlayableGame.getPaddleOccurance() != null)
    {
      throw new RuntimeException("Unable to create PaddleOccurance due to aPlayableGame");
    }
    playableGame = aPlayableGame;
  }

  public PaddleOccurance(int aCurrentPaddleXPosition, int aCurrentPaddleYPosition, int aCurrentPaddleLength, Paddle aPaddle, boolean aIsInTestModeForPlayableGame, int aCurrentScoreForPlayableGame, Game aGameForPlayableGame, Player aPlayerForPlayableGame, Block223 aBlock223ForPlayableGame, BallOccurance aBallOccuranceForPlayableGame)
  {
    currentPaddleXPosition = aCurrentPaddleXPosition;
    currentPaddleYPosition = aCurrentPaddleYPosition;
    currentPaddleLength = aCurrentPaddleLength;
    boolean didAddPaddle = setPaddle(aPaddle);
    if (!didAddPaddle)
    {
      throw new RuntimeException("Unable to create paddleOccurance due to paddle");
    }
    playableGame = new PlayableGame(aIsInTestModeForPlayableGame, aCurrentScoreForPlayableGame, aGameForPlayableGame, aPlayerForPlayableGame, aBlock223ForPlayableGame, this, aBallOccuranceForPlayableGame);
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
  /* Code from template association_GetOne */
  public Paddle getPaddle()
  {
    return paddle;
  }
  /* Code from template association_GetOne */
  public PlayableGame getPlayableGame()
  {
    return playableGame;
  }
  /* Code from template association_SetOneToMany */
  public boolean setPaddle(Paddle aPaddle)
  {
    boolean wasSet = false;
    if (aPaddle == null)
    {
      return wasSet;
    }

    Paddle existingPaddle = paddle;
    paddle = aPaddle;
    if (existingPaddle != null && !existingPaddle.equals(aPaddle))
    {
      existingPaddle.removePaddleOccurance(this);
    }
    paddle.addPaddleOccurance(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Paddle placeholderPaddle = paddle;
    this.paddle = null;
    if(placeholderPaddle != null)
    {
      placeholderPaddle.removePaddleOccurance(this);
    }
    PlayableGame existingPlayableGame = playableGame;
    playableGame = null;
    if (existingPlayableGame != null)
    {
      existingPlayableGame.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "currentPaddleXPosition" + ":" + getCurrentPaddleXPosition()+ "," +
            "currentPaddleYPosition" + ":" + getCurrentPaddleYPosition()+ "," +
            "currentPaddleLength" + ":" + getCurrentPaddleLength()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "paddle = "+(getPaddle()!=null?Integer.toHexString(System.identityHashCode(getPaddle())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "playableGame = "+(getPlayableGame()!=null?Integer.toHexString(System.identityHashCode(getPlayableGame())):"null");
  }
}