/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;
import java.util.*;

// line 81 "../../../../../Block223Persistence.ump"
// line 60 "../../../../../Block223 v2.ump"
public class Player extends UserRole implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Player Associations
  private List<PlayableGame> playableGames;
  private List<Entry> entries;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Player(String aPassword, Block223 aBlock223)
  {
    super(aPassword, aBlock223);
    playableGames = new ArrayList<PlayableGame>();
    entries = new ArrayList<Entry>();
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
  public Entry getEntry(int index)
  {
    Entry aEntry = entries.get(index);
    return aEntry;
  }

  public List<Entry> getEntries()
  {
    List<Entry> newEntries = Collections.unmodifiableList(entries);
    return newEntries;
  }

  public int numberOfEntries()
  {
    int number = entries.size();
    return number;
  }

  public boolean hasEntries()
  {
    boolean has = entries.size() > 0;
    return has;
  }

  public int indexOfEntry(Entry aEntry)
  {
    int index = entries.indexOf(aEntry);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPlayableGames()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PlayableGame addPlayableGame(boolean aIsInTestMode, int aCurrentScore, Game aGame, Block223 aBlock223)
  {
    return new PlayableGame(aIsInTestMode, aCurrentScore, aGame, this, aBlock223);
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
  public static int minimumNumberOfEntries()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Entry addEntry(int aScore, Game aGame)
  {
    return new Entry(aScore, aGame, this);
  }

  public boolean addEntry(Entry aEntry)
  {
    boolean wasAdded = false;
    if (entries.contains(aEntry)) { return false; }
    Player existingPlayer = aEntry.getPlayer();
    boolean isNewPlayer = existingPlayer != null && !this.equals(existingPlayer);
    if (isNewPlayer)
    {
      aEntry.setPlayer(this);
    }
    else
    {
      entries.add(aEntry);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEntry(Entry aEntry)
  {
    boolean wasRemoved = false;
    //Unable to remove aEntry, as it must always have a player
    if (!this.equals(aEntry.getPlayer()))
    {
      entries.remove(aEntry);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEntryAt(Entry aEntry, int index)
  {  
    boolean wasAdded = false;
    if(addEntry(aEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEntries()) { index = numberOfEntries() - 1; }
      entries.remove(aEntry);
      entries.add(index, aEntry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEntryAt(Entry aEntry, int index)
  {
    boolean wasAdded = false;
    if(entries.contains(aEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEntries()) { index = numberOfEntries() - 1; }
      entries.remove(aEntry);
      entries.add(index, aEntry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEntryAt(aEntry, index);
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
    for(int i=entries.size(); i > 0; i--)
    {
      Entry aEntry = entries.get(i - 1);
      aEntry.delete();
    }
    super.delete();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 84 "../../../../../Block223Persistence.ump"
  private static final long serialVersionUID = 98907652346L ;

  
}