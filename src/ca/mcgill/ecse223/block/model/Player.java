/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;
import java.util.*;

// line 81 "../../../../../Block223Persistence.ump"
// line 58 "../../../../../Block223 v2.ump"
public class Player extends UserRole implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Player Associations
  private List<PlayableGame> playableGames;
  private List<Score> scores;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Player(String aPassword, Block223 aBlock223)
  {
    super(aPassword, aBlock223);
    playableGames = new ArrayList<PlayableGame>();
    scores = new ArrayList<Score>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public PlayableGame getPlayableGame(int index)
  {
    PlayableGame aPlayableGame = playableGames.get(index);
    return aPlayableGame;
  }

  public List<PlayableGame> getPlayableGames()
  {
    List<PlayableGame> newPlayableGames = Collections.unmodifiableList(playableGames);
    return newPlayableGames;
  }

  public int numberOfPlayableGames()
  {
    int number = playableGames.size();
    return number;
  }

  public boolean hasPlayableGames()
  {
    boolean has = playableGames.size() > 0;
    return has;
  }

  public int indexOfPlayableGame(PlayableGame aPlayableGame)
  {
    int index = playableGames.indexOf(aPlayableGame);
    return index;
  }
  /* Code from template association_GetMany */
  public Score getScore(int index)
  {
    Score aScore = scores.get(index);
    return aScore;
  }

  public List<Score> getScores()
  {
    List<Score> newScores = Collections.unmodifiableList(scores);
    return newScores;
  }

  public int numberOfScores()
  {
    int number = scores.size();
    return number;
  }

  public boolean hasScores()
  {
    boolean has = scores.size() > 0;
    return has;
  }

  public int indexOfScore(Score aScore)
  {
    int index = scores.indexOf(aScore);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPlayableGames()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PlayableGame addPlayableGame(int aNumberOfLives, Game aGame, Block223 aBlock223)
  {
    return new PlayableGame(aNumberOfLives, aGame, this, aBlock223);
  }

  public boolean addPlayableGame(PlayableGame aPlayableGame)
  {
    boolean wasAdded = false;
    if (playableGames.contains(aPlayableGame)) { return false; }
    Player existingPlayer = aPlayableGame.getPlayer();
    boolean isNewPlayer = existingPlayer != null && !this.equals(existingPlayer);
    if (isNewPlayer)
    {
      aPlayableGame.setPlayer(this);
    }
    else
    {
      playableGames.add(aPlayableGame);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePlayableGame(PlayableGame aPlayableGame)
  {
    boolean wasRemoved = false;
    //Unable to remove aPlayableGame, as it must always have a player
    if (!this.equals(aPlayableGame.getPlayer()))
    {
      playableGames.remove(aPlayableGame);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPlayableGameAt(PlayableGame aPlayableGame, int index)
  {  
    boolean wasAdded = false;
    if(addPlayableGame(aPlayableGame))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayableGames()) { index = numberOfPlayableGames() - 1; }
      playableGames.remove(aPlayableGame);
      playableGames.add(index, aPlayableGame);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePlayableGameAt(PlayableGame aPlayableGame, int index)
  {
    boolean wasAdded = false;
    if(playableGames.contains(aPlayableGame))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayableGames()) { index = numberOfPlayableGames() - 1; }
      playableGames.remove(aPlayableGame);
      playableGames.add(index, aPlayableGame);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPlayableGameAt(aPlayableGame, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfScores()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Score addScore(int aEarnedPoints, Game aGame)
  {
    return new Score(aEarnedPoints, this, aGame);
  }

  public boolean addScore(Score aScore)
  {
    boolean wasAdded = false;
    if (scores.contains(aScore)) { return false; }
    Player existingPlayer = aScore.getPlayer();
    boolean isNewPlayer = existingPlayer != null && !this.equals(existingPlayer);
    if (isNewPlayer)
    {
      aScore.setPlayer(this);
    }
    else
    {
      scores.add(aScore);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeScore(Score aScore)
  {
    boolean wasRemoved = false;
    //Unable to remove aScore, as it must always have a player
    if (!this.equals(aScore.getPlayer()))
    {
      scores.remove(aScore);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addScoreAt(Score aScore, int index)
  {  
    boolean wasAdded = false;
    if(addScore(aScore))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfScores()) { index = numberOfScores() - 1; }
      scores.remove(aScore);
      scores.add(index, aScore);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveScoreAt(Score aScore, int index)
  {
    boolean wasAdded = false;
    if(scores.contains(aScore))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfScores()) { index = numberOfScores() - 1; }
      scores.remove(aScore);
      scores.add(index, aScore);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addScoreAt(aScore, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=playableGames.size(); i > 0; i--)
    {
      PlayableGame aPlayableGame = playableGames.get(i - 1);
      aPlayableGame.delete();
    }
    for(int i=scores.size(); i > 0; i--)
    {
      Score aScore = scores.get(i - 1);
      aScore.delete();
    }
    super.delete();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 84 "../../../../../Block223Persistence.ump"
  private static final long serialVersionUID = 98907652346L ;

  
}