/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;
import java.util.*;

// line 46 "../../../../../Block223Persistence.ump"
// line 154 "../../../../../Block223 v2.ump"
public class BlockAssignment implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BlockAssignment Attributes
  private int gridHorizontalPosition;
  private int gridVerticalPosition;

  //BlockAssignment Associations
  private Level level;
  private Block block;
  private List<BlockAssingmentOccurance> blockAssingmentOccurances;
  private Game game;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BlockAssignment(int aGridHorizontalPosition, int aGridVerticalPosition, Level aLevel, Block aBlock, Game aGame)
  {
    gridHorizontalPosition = aGridHorizontalPosition;
    gridVerticalPosition = aGridVerticalPosition;
    boolean didAddLevel = setLevel(aLevel);
    if (!didAddLevel)
    {
      throw new RuntimeException("Unable to create blockAssignment due to level");
    }
    boolean didAddBlock = setBlock(aBlock);
    if (!didAddBlock)
    {
      throw new RuntimeException("Unable to create blockAssignment due to block");
    }
    blockAssingmentOccurances = new ArrayList<BlockAssingmentOccurance>();
    boolean didAddGame = setGame(aGame);
    if (!didAddGame)
    {
      throw new RuntimeException("Unable to create blockAssignment due to game");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGridHorizontalPosition(int aGridHorizontalPosition)
  {
    boolean wasSet = false;
    gridHorizontalPosition = aGridHorizontalPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setGridVerticalPosition(int aGridVerticalPosition)
  {
    boolean wasSet = false;
    gridVerticalPosition = aGridVerticalPosition;
    wasSet = true;
    return wasSet;
  }

  public int getGridHorizontalPosition()
  {
    return gridHorizontalPosition;
  }

  public int getGridVerticalPosition()
  {
    return gridVerticalPosition;
  }
  /* Code from template association_GetOne */
  public Level getLevel()
  {
    return level;
  }
  /* Code from template association_GetOne */
  public Block getBlock()
  {
    return block;
  }
  /* Code from template association_GetMany */
  public BlockAssingmentOccurance getBlockAssingmentOccurance(int index)
  {
    BlockAssingmentOccurance aBlockAssingmentOccurance = blockAssingmentOccurances.get(index);
    return aBlockAssingmentOccurance;
  }

  public List<BlockAssingmentOccurance> getBlockAssingmentOccurances()
  {
    List<BlockAssingmentOccurance> newBlockAssingmentOccurances = Collections.unmodifiableList(blockAssingmentOccurances);
    return newBlockAssingmentOccurances;
  }

  public int numberOfBlockAssingmentOccurances()
  {
    int number = blockAssingmentOccurances.size();
    return number;
  }

  public boolean hasBlockAssingmentOccurances()
  {
    boolean has = blockAssingmentOccurances.size() > 0;
    return has;
  }

  public int indexOfBlockAssingmentOccurance(BlockAssingmentOccurance aBlockAssingmentOccurance)
  {
    int index = blockAssingmentOccurances.indexOf(aBlockAssingmentOccurance);
    return index;
  }
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
  }
  /* Code from template association_SetOneToMany */
  public boolean setLevel(Level aLevel)
  {
    boolean wasSet = false;
    if (aLevel == null)
    {
      return wasSet;
    }

    Level existingLevel = level;
    level = aLevel;
    if (existingLevel != null && !existingLevel.equals(aLevel))
    {
      existingLevel.removeBlockAssignment(this);
    }
    level.addBlockAssignment(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setBlock(Block aBlock)
  {
    boolean wasSet = false;
    if (aBlock == null)
    {
      return wasSet;
    }

    Block existingBlock = block;
    block = aBlock;
    if (existingBlock != null && !existingBlock.equals(aBlock))
    {
      existingBlock.removeBlockAssignment(this);
    }
    block.addBlockAssignment(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBlockAssingmentOccurances()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public BlockAssingmentOccurance addBlockAssingmentOccurance(PlayableGame aPlayableGame)
  {
    return new BlockAssingmentOccurance(aPlayableGame, this);
  }

  public boolean addBlockAssingmentOccurance(BlockAssingmentOccurance aBlockAssingmentOccurance)
  {
    boolean wasAdded = false;
    if (blockAssingmentOccurances.contains(aBlockAssingmentOccurance)) { return false; }
    BlockAssignment existingBlockAssignment = aBlockAssingmentOccurance.getBlockAssignment();
    boolean isNewBlockAssignment = existingBlockAssignment != null && !this.equals(existingBlockAssignment);
    if (isNewBlockAssignment)
    {
      aBlockAssingmentOccurance.setBlockAssignment(this);
    }
    else
    {
      blockAssingmentOccurances.add(aBlockAssingmentOccurance);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBlockAssingmentOccurance(BlockAssingmentOccurance aBlockAssingmentOccurance)
  {
    boolean wasRemoved = false;
    //Unable to remove aBlockAssingmentOccurance, as it must always have a blockAssignment
    if (!this.equals(aBlockAssingmentOccurance.getBlockAssignment()))
    {
      blockAssingmentOccurances.remove(aBlockAssingmentOccurance);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBlockAssingmentOccuranceAt(BlockAssingmentOccurance aBlockAssingmentOccurance, int index)
  {  
    boolean wasAdded = false;
    if(addBlockAssingmentOccurance(aBlockAssingmentOccurance))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBlockAssingmentOccurances()) { index = numberOfBlockAssingmentOccurances() - 1; }
      blockAssingmentOccurances.remove(aBlockAssingmentOccurance);
      blockAssingmentOccurances.add(index, aBlockAssingmentOccurance);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBlockAssingmentOccuranceAt(BlockAssingmentOccurance aBlockAssingmentOccurance, int index)
  {
    boolean wasAdded = false;
    if(blockAssingmentOccurances.contains(aBlockAssingmentOccurance))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBlockAssingmentOccurances()) { index = numberOfBlockAssingmentOccurances() - 1; }
      blockAssingmentOccurances.remove(aBlockAssingmentOccurance);
      blockAssingmentOccurances.add(index, aBlockAssingmentOccurance);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBlockAssingmentOccuranceAt(aBlockAssingmentOccurance, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  public boolean setGame(Game aGame)
  {
    boolean wasSet = false;
    if (aGame == null)
    {
      return wasSet;
    }

    Game existingGame = game;
    game = aGame;
    if (existingGame != null && !existingGame.equals(aGame))
    {
      existingGame.removeBlockAssignment(this);
    }
    game.addBlockAssignment(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Level placeholderLevel = level;
    this.level = null;
    if(placeholderLevel != null)
    {
      placeholderLevel.removeBlockAssignment(this);
    }
    Block placeholderBlock = block;
    this.block = null;
    if(placeholderBlock != null)
    {
      placeholderBlock.removeBlockAssignment(this);
    }
    for(int i=blockAssingmentOccurances.size(); i > 0; i--)
    {
      BlockAssingmentOccurance aBlockAssingmentOccurance = blockAssingmentOccurances.get(i - 1);
      aBlockAssingmentOccurance.delete();
    }
    Game placeholderGame = game;
    this.game = null;
    if(placeholderGame != null)
    {
      placeholderGame.removeBlockAssignment(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "gridHorizontalPosition" + ":" + getGridHorizontalPosition()+ "," +
            "gridVerticalPosition" + ":" + getGridVerticalPosition()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "level = "+(getLevel()!=null?Integer.toHexString(System.identityHashCode(getLevel())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "block = "+(getBlock()!=null?Integer.toHexString(System.identityHashCode(getBlock())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 49 "../../../../../Block223Persistence.ump"
  private static final long serialVersionUID = 52345676549L ;

  
}