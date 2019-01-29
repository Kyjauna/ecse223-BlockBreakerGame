/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse.btms.model;
import java.util.*;

// line 49 "../../../../../blockGame.ump"
public class GameLevel
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GameLevel Attributes
  private int levelNumber;
  private boolean randomLevel;

  //GameLevel Associations
  private Block223 block223;
  private Game game;
  private List<SpecificBlock> specificBlocks;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GameLevel(int aLevelNumber, boolean aRandomLevel, Block223 aBlock223, Game aGame)
  {
    levelNumber = aLevelNumber;
    randomLevel = aRandomLevel;
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create level due to block223");
    }
    boolean didAddGame = setGame(aGame);
    if (!didAddGame)
    {
      throw new RuntimeException("Unable to create gameLevel due to game");
    }
    specificBlocks = new ArrayList<SpecificBlock>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLevelNumber(int aLevelNumber)
  {
    boolean wasSet = false;
    levelNumber = aLevelNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setRandomLevel(boolean aRandomLevel)
  {
    boolean wasSet = false;
    randomLevel = aRandomLevel;
    wasSet = true;
    return wasSet;
  }

  public int getLevelNumber()
  {
    return levelNumber;
  }

  public boolean getRandomLevel()
  {
    return randomLevel;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isRandomLevel()
  {
    return randomLevel;
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
  /* Code from template association_GetMany */
  public SpecificBlock getSpecificBlock(int index)
  {
    SpecificBlock aSpecificBlock = specificBlocks.get(index);
    return aSpecificBlock;
  }

  public List<SpecificBlock> getSpecificBlocks()
  {
    List<SpecificBlock> newSpecificBlocks = Collections.unmodifiableList(specificBlocks);
    return newSpecificBlocks;
  }

  public int numberOfSpecificBlocks()
  {
    int number = specificBlocks.size();
    return number;
  }

  public boolean hasSpecificBlocks()
  {
    boolean has = specificBlocks.size() > 0;
    return has;
  }

  public int indexOfSpecificBlock(SpecificBlock aSpecificBlock)
  {
    int index = specificBlocks.indexOf(aSpecificBlock);
    return index;
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
      existingBlock223.removeLevel(this);
    }
    block223.addLevel(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setGame(Game aGame)
  {
    boolean wasSet = false;
    //Must provide game to gameLevel
    if (aGame == null)
    {
      return wasSet;
    }

    //game already at maximum (99)
    if (aGame.numberOfGameLevels() >= Game.maximumNumberOfGameLevels())
    {
      return wasSet;
    }
    
    Game existingGame = game;
    game = aGame;
    if (existingGame != null && !existingGame.equals(aGame))
    {
      boolean didRemove = existingGame.removeGameLevel(this);
      if (!didRemove)
      {
        game = existingGame;
        return wasSet;
      }
    }
    game.addGameLevel(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSpecificBlocks()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public SpecificBlock addSpecificBlock(int aXGridPosition, int aYGridPosition, Block223 aBlock223, Block aBlock, PlayArea aPlayArea)
  {
    return new SpecificBlock(aXGridPosition, aYGridPosition, aBlock223, this, aBlock, aPlayArea);
  }

  public boolean addSpecificBlock(SpecificBlock aSpecificBlock)
  {
    boolean wasAdded = false;
    if (specificBlocks.contains(aSpecificBlock)) { return false; }
    GameLevel existingGameLevel = aSpecificBlock.getGameLevel();
    boolean isNewGameLevel = existingGameLevel != null && !this.equals(existingGameLevel);
    if (isNewGameLevel)
    {
      aSpecificBlock.setGameLevel(this);
    }
    else
    {
      specificBlocks.add(aSpecificBlock);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeSpecificBlock(SpecificBlock aSpecificBlock)
  {
    boolean wasRemoved = false;
    //Unable to remove aSpecificBlock, as it must always have a gameLevel
    if (!this.equals(aSpecificBlock.getGameLevel()))
    {
      specificBlocks.remove(aSpecificBlock);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSpecificBlockAt(SpecificBlock aSpecificBlock, int index)
  {  
    boolean wasAdded = false;
    if(addSpecificBlock(aSpecificBlock))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpecificBlocks()) { index = numberOfSpecificBlocks() - 1; }
      specificBlocks.remove(aSpecificBlock);
      specificBlocks.add(index, aSpecificBlock);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSpecificBlockAt(SpecificBlock aSpecificBlock, int index)
  {
    boolean wasAdded = false;
    if(specificBlocks.contains(aSpecificBlock))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpecificBlocks()) { index = numberOfSpecificBlocks() - 1; }
      specificBlocks.remove(aSpecificBlock);
      specificBlocks.add(index, aSpecificBlock);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSpecificBlockAt(aSpecificBlock, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    Block223 placeholderBlock223 = block223;
    this.block223 = null;
    if(placeholderBlock223 != null)
    {
      placeholderBlock223.removeLevel(this);
    }
    Game placeholderGame = game;
    this.game = null;
    if(placeholderGame != null)
    {
      placeholderGame.removeGameLevel(this);
    }
    for(int i=specificBlocks.size(); i > 0; i--)
    {
      SpecificBlock aSpecificBlock = specificBlocks.get(i - 1);
      aSpecificBlock.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "levelNumber" + ":" + getLevelNumber()+ "," +
            "randomLevel" + ":" + getRandomLevel()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "block223 = "+(getBlock223()!=null?Integer.toHexString(System.identityHashCode(getBlock223())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null");
  }
}