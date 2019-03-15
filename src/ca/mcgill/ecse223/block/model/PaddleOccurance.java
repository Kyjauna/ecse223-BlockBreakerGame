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
  private int currentPaddleLength;

  //PaddleOccurance Associations
  private Paddle paddle;
  private PlayableGame playableGame;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PaddleOccurance(int aCurrentPaddleXPosition, int aCurrentPaddleLength, Paddle aPaddle, PlayableGame aPlayableGame)
  {
    currentPaddleXPosition = aCurrentPaddleXPosition;
    currentPaddleLength = aCurrentPaddleLength;
    boolean didAddPaddle = setPaddle(aPaddle);
    if (!didAddPaddle)
    {
      throw new RuntimeException("Unable to create paddleOccurance due to paddle");
    }
    boolean didAddPlayableGame = setPlayableGame(aPlayableGame);
    if (!didAddPlayableGame)
    {
      throw new RuntimeException("Unable to create paddleOccurance due to playableGame");
    }
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
  /* Code from template association_SetOneToOptionalOne */
  public boolean setPlayableGame(PlayableGame aNewPlayableGame)
  {
    boolean wasSet = false;
    if (aNewPlayableGame == null)
    {
      //Unable to setPlayableGame to null, as paddleOccurance must always be associated to a playableGame
      return wasSet;
    }
    
    PaddleOccurance existingPaddleOccurance = aNewPlayableGame.getPaddleOccurance();
    if (existingPaddleOccurance != null && !equals(existingPaddleOccurance))
    {
      //Unable to setPlayableGame, the current playableGame already has a paddleOccurance, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    PlayableGame anOldPlayableGame = playableGame;
    playableGame = aNewPlayableGame;
    playableGame.setPaddleOccurance(this);

    if (anOldPlayableGame != null)
    {
      anOldPlayableGame.setPaddleOccurance(null);
    }
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
      existingPlayableGame.setPaddleOccurance(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "currentPaddleXPosition" + ":" + getCurrentPaddleXPosition()+ "," +
            "currentPaddleLength" + ":" + getCurrentPaddleLength()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "paddle = "+(getPaddle()!=null?Integer.toHexString(System.identityHashCode(getPaddle())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "playableGame = "+(getPlayableGame()!=null?Integer.toHexString(System.identityHashCode(getPlayableGame())):"null");
  }
}