/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse.btms.model;
import java.util.*;

// line 68 "../../../../../blockGame.ump"
public class PlayArea
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PlayArea Attributes
  private int gameHeight;
  private int gameWidth;

  //PlayArea Associations
  private Block223 block223;
  private Game game;
  private List<SpecificBlock> specificBlocks;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PlayArea(int aGameHeight, int aGameWidth, Block223 aBlock223, Game aGame)
  {
    // line 71 "../../../../../blockGame.ump"
    if (aGameHeight < 200 || aGameHeight > 500) {
    			throw new RuntimeException("Height has to be between 200 and 500.");
    		}
    // END OF UMPLE BEFORE INJECTION
    // line 77 "../../../../../blockGame.ump"
    if (aGameWidth < 200 || aGameWidth > 500) {
    			throw new RuntimeException("Width has to be between 200 and 500.");
    		}
    // END OF UMPLE BEFORE INJECTION
    gameHeight = aGameHeight;
    gameWidth = aGameWidth;
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create playArea due to block223");
    }
    if (aGame == null || aGame.getPlayArea() != null)
    {
      throw new RuntimeException("Unable to create PlayArea due to aGame");
    }
    game = aGame;
    specificBlocks = new ArrayList<SpecificBlock>();
  }

  public PlayArea(int aGameHeight, int aGameWidth, Block223 aBlock223, String aGameNameForGame, int aNumberOfBlocksForGame, int aSpeedFactorForGame, Block223 aBlock223ForGame, Admin aAdminForGame, Ball aBallForGame, Paddle aPaddleForGame)
  {
    // line 71 "../../../../../blockGame.ump"
    if (aGameHeight < 200 || aGameHeight > 500) {
    			throw new RuntimeException("Height has to be between 200 and 500.");
    		}
    // END OF UMPLE BEFORE INJECTION
    // line 77 "../../../../../blockGame.ump"
    if (aGameWidth < 200 || aGameWidth > 500) {
    			throw new RuntimeException("Width has to be between 200 and 500.");
    		}
    // END OF UMPLE BEFORE INJECTION
    gameHeight = aGameHeight;
    gameWidth = aGameWidth;
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create playArea due to block223");
    }
    game = new Game(aGameNameForGame, aNumberOfBlocksForGame, aSpeedFactorForGame, aBlock223ForGame, aAdminForGame, this, aBallForGame, aPaddleForGame);
    specificBlocks = new ArrayList<SpecificBlock>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGameHeight(int aGameHeight)
  {
    boolean wasSet = false;
    // line 71 "../../../../../blockGame.ump"
    if (aGameHeight < 200 || aGameHeight > 500) {
    			throw new RuntimeException("Height has to be between 200 and 500.");
    		}
    // END OF UMPLE BEFORE INJECTION
    gameHeight = aGameHeight;
    wasSet = true;
    return wasSet;
  }

  public boolean setGameWidth(int aGameWidth)
  {
    boolean wasSet = false;
    // line 77 "../../../../../blockGame.ump"
    if (aGameWidth < 200 || aGameWidth > 500) {
    			throw new RuntimeException("Width has to be between 200 and 500.");
    		}
    // END OF UMPLE BEFORE INJECTION
    gameWidth = aGameWidth;
    wasSet = true;
    return wasSet;
  }

  public int getGameHeight()
  {
    return gameHeight;
  }

  public int getGameWidth()
  {
    return gameWidth;
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
      existingBlock223.removePlayArea(this);
    }
    block223.addPlayArea(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSpecificBlocks()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public SpecificBlock addSpecificBlock(int aXGridPosition, int aYGridPosition, Block223 aBlock223, GameLevel aGameLevel, Block aBlock)
  {
    return new SpecificBlock(aXGridPosition, aYGridPosition, aBlock223, aGameLevel, aBlock, this);
  }

  public boolean addSpecificBlock(SpecificBlock aSpecificBlock)
  {
    boolean wasAdded = false;
    if (specificBlocks.contains(aSpecificBlock)) { return false; }
    PlayArea existingPlayArea = aSpecificBlock.getPlayArea();
    boolean isNewPlayArea = existingPlayArea != null && !this.equals(existingPlayArea);
    if (isNewPlayArea)
    {
      aSpecificBlock.setPlayArea(this);
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
    //Unable to remove aSpecificBlock, as it must always have a playArea
    if (!this.equals(aSpecificBlock.getPlayArea()))
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
      placeholderBlock223.removePlayArea(this);
    }
    Game existingGame = game;
    game = null;
    if (existingGame != null)
    {
      existingGame.delete();
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
            "gameHeight" + ":" + getGameHeight()+ "," +
            "gameWidth" + ":" + getGameWidth()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "block223 = "+(getBlock223()!=null?Integer.toHexString(System.identityHashCode(getBlock223())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null");
  }
}