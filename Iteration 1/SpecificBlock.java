/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse.btms.model;

// line 94 "../../../../../blockGame.ump"
public class SpecificBlock
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SpecificBlock Attributes
  private int xGridPosition;
  private int yGridPosition;

  //SpecificBlock Associations
  private Block223 block223;
  private GameLevel gameLevel;
  private Block block;
  private PlayArea playArea;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SpecificBlock(int aXGridPosition, int aYGridPosition, Block223 aBlock223, GameLevel aGameLevel, Block aBlock, PlayArea aPlayArea)
  {
    // line 97 "../../../../../blockGame.ump"
    if (aXGridPosition < 1 || aXGridPosition > playArea.getGameWidth()/Block.SideLength) {
    			throw new RuntimeException("Invalid x-grid position.");
    		}
    // END OF UMPLE BEFORE INJECTION
    // line 103 "../../../../../blockGame.ump"
    if (aYGridPosition < 1 || aYGridPosition > playArea.getGameHeight()/Block.SideLength) {
    			throw new RuntimeException("Invalid y-grid position.");
    		}
    // END OF UMPLE BEFORE INJECTION
    xGridPosition = aXGridPosition;
    yGridPosition = aYGridPosition;
    boolean didAddBlock223 = setBlock223(aBlock223);
    if (!didAddBlock223)
    {
      throw new RuntimeException("Unable to create specificBlock due to block223");
    }
    boolean didAddGameLevel = setGameLevel(aGameLevel);
    if (!didAddGameLevel)
    {
      throw new RuntimeException("Unable to create specificBlock due to gameLevel");
    }
    boolean didAddBlock = setBlock(aBlock);
    if (!didAddBlock)
    {
      throw new RuntimeException("Unable to create specificBlock due to block");
    }
    boolean didAddPlayArea = setPlayArea(aPlayArea);
    if (!didAddPlayArea)
    {
      throw new RuntimeException("Unable to create specificBlock due to playArea");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setXGridPosition(int aXGridPosition)
  {
    boolean wasSet = false;
    // line 97 "../../../../../blockGame.ump"
    if (aXGridPosition < 1 || aXGridPosition > playArea.getGameWidth()/Block.SideLength) {
    			throw new RuntimeException("Invalid x-grid position.");
    		}
    // END OF UMPLE BEFORE INJECTION
    xGridPosition = aXGridPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setYGridPosition(int aYGridPosition)
  {
    boolean wasSet = false;
    // line 103 "../../../../../blockGame.ump"
    if (aYGridPosition < 1 || aYGridPosition > playArea.getGameHeight()/Block.SideLength) {
    			throw new RuntimeException("Invalid y-grid position.");
    		}
    // END OF UMPLE BEFORE INJECTION
    yGridPosition = aYGridPosition;
    wasSet = true;
    return wasSet;
  }

  public int getXGridPosition()
  {
    return xGridPosition;
  }

  public int getYGridPosition()
  {
    return yGridPosition;
  }
  /* Code from template association_GetOne */
  public Block223 getBlock223()
  {
    return block223;
  }
  /* Code from template association_GetOne */
  public GameLevel getGameLevel()
  {
    return gameLevel;
  }
  /* Code from template association_GetOne */
  public Block getBlock()
  {
    return block;
  }
  /* Code from template association_GetOne */
  public PlayArea getPlayArea()
  {
    return playArea;
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
      existingBlock223.removeSpecificBlock(this);
    }
    block223.addSpecificBlock(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setGameLevel(GameLevel aGameLevel)
  {
    boolean wasSet = false;
    if (aGameLevel == null)
    {
      return wasSet;
    }

    GameLevel existingGameLevel = gameLevel;
    gameLevel = aGameLevel;
    if (existingGameLevel != null && !existingGameLevel.equals(aGameLevel))
    {
      existingGameLevel.removeSpecificBlock(this);
    }
    gameLevel.addSpecificBlock(this);
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
      existingBlock.removeSpecificBlock(this);
    }
    block.addSpecificBlock(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setPlayArea(PlayArea aPlayArea)
  {
    boolean wasSet = false;
    if (aPlayArea == null)
    {
      return wasSet;
    }

    PlayArea existingPlayArea = playArea;
    playArea = aPlayArea;
    if (existingPlayArea != null && !existingPlayArea.equals(aPlayArea))
    {
      existingPlayArea.removeSpecificBlock(this);
    }
    playArea.addSpecificBlock(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Block223 placeholderBlock223 = block223;
    this.block223 = null;
    if(placeholderBlock223 != null)
    {
      placeholderBlock223.removeSpecificBlock(this);
    }
    GameLevel placeholderGameLevel = gameLevel;
    this.gameLevel = null;
    if(placeholderGameLevel != null)
    {
      placeholderGameLevel.removeSpecificBlock(this);
    }
    Block placeholderBlock = block;
    this.block = null;
    if(placeholderBlock != null)
    {
      placeholderBlock.removeSpecificBlock(this);
    }
    PlayArea placeholderPlayArea = playArea;
    this.playArea = null;
    if(placeholderPlayArea != null)
    {
      placeholderPlayArea.removeSpecificBlock(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "xGridPosition" + ":" + getXGridPosition()+ "," +
            "yGridPosition" + ":" + getYGridPosition()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "block223 = "+(getBlock223()!=null?Integer.toHexString(System.identityHashCode(getBlock223())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "gameLevel = "+(getGameLevel()!=null?Integer.toHexString(System.identityHashCode(getGameLevel())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "block = "+(getBlock()!=null?Integer.toHexString(System.identityHashCode(getBlock())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "playArea = "+(getPlayArea()!=null?Integer.toHexString(System.identityHashCode(getPlayArea())):"null");
  }
}