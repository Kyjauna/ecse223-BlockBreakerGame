/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;

// line 50 "../../../../../I4.Updated.Domain.Model.ump"
public class BlockAssingmentOccurance
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BlockAssingmentOccurance Associations
  private PlayableGame playableGame;
  private BlockAssignment blockAssignment;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BlockAssingmentOccurance(PlayableGame aPlayableGame, BlockAssignment aBlockAssignment)
  {
    boolean didAddPlayableGame = setPlayableGame(aPlayableGame);
    if (!didAddPlayableGame)
    {
      throw new RuntimeException("Unable to create blockAssingmentOccurance due to playableGame");
    }
    boolean didAddBlockAssignment = setBlockAssignment(aBlockAssignment);
    if (!didAddBlockAssignment)
    {
      throw new RuntimeException("Unable to create blockAssingmentOccurance due to blockAssignment");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public PlayableGame getPlayableGame()
  {
    return playableGame;
  }
  /* Code from template association_GetOne */
  public BlockAssignment getBlockAssignment()
  {
    return blockAssignment;
  }
  /* Code from template association_SetOneToMany */
  public boolean setPlayableGame(PlayableGame aPlayableGame)
  {
    boolean wasSet = false;
    if (aPlayableGame == null)
    {
      return wasSet;
    }

    PlayableGame existingPlayableGame = playableGame;
    playableGame = aPlayableGame;
    if (existingPlayableGame != null && !existingPlayableGame.equals(aPlayableGame))
    {
      existingPlayableGame.removeBlockAssingmentOccurance(this);
    }
    playableGame.addBlockAssingmentOccurance(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setBlockAssignment(BlockAssignment aBlockAssignment)
  {
    boolean wasSet = false;
    if (aBlockAssignment == null)
    {
      return wasSet;
    }

    BlockAssignment existingBlockAssignment = blockAssignment;
    blockAssignment = aBlockAssignment;
    if (existingBlockAssignment != null && !existingBlockAssignment.equals(aBlockAssignment))
    {
      existingBlockAssignment.removeBlockAssingmentOccurance(this);
    }
    blockAssignment.addBlockAssingmentOccurance(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    PlayableGame placeholderPlayableGame = playableGame;
    this.playableGame = null;
    if(placeholderPlayableGame != null)
    {
      placeholderPlayableGame.removeBlockAssingmentOccurance(this);
    }
    BlockAssignment placeholderBlockAssignment = blockAssignment;
    this.blockAssignment = null;
    if(placeholderBlockAssignment != null)
    {
      placeholderBlockAssignment.removeBlockAssingmentOccurance(this);
    }
  }

}