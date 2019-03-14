/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.util.*;

// line 14 "../../../../../I4.Updated.Domain.Model.ump"
public class HallOfFame
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //HallOfFame Associations
  private Game game;
  private List<Entry> entries;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public HallOfFame(Game aGame)
  {
    if (aGame == null || aGame.getHallOfFame() != null)
    {
      throw new RuntimeException("Unable to create HallOfFame due to aGame");
    }
    game = aGame;
    entries = new ArrayList<Entry>();
  }

  public HallOfFame(boolean aIsPublishedForGame, String aNameForGame, int aNrBlocksPerLevelForGame, Admin aAdminForGame, Ball aBallForGame, Paddle aPaddleForGame, Block223 aBlock223ForGame)
  {
    game = new Game(aIsPublishedForGame, aNameForGame, aNrBlocksPerLevelForGame, aAdminForGame, aBallForGame, aPaddleForGame, this, aBlock223ForGame);
    entries = new ArrayList<Entry>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
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
  public static int minimumNumberOfEntries()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Entry addEntry(int aScore, Player aPlayer)
  {
    return new Entry(aScore, aPlayer, this);
  }

  public boolean addEntry(Entry aEntry)
  {
    boolean wasAdded = false;
    if (entries.contains(aEntry)) { return false; }
    HallOfFame existingHallOfFame = aEntry.getHallOfFame();
    boolean isNewHallOfFame = existingHallOfFame != null && !this.equals(existingHallOfFame);
    if (isNewHallOfFame)
    {
      aEntry.setHallOfFame(this);
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
    //Unable to remove aEntry, as it must always have a hallOfFame
    if (!this.equals(aEntry.getHallOfFame()))
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
    Game existingGame = game;
    game = null;
    if (existingGame != null)
    {
      existingGame.delete();
    }
    for(int i=entries.size(); i > 0; i--)
    {
      Entry aEntry = entries.get(i - 1);
      aEntry.delete();
    }
  }

}