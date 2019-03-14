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
  }

  public HallOfFame(boolean aIsPublishedForGame, String aNameForGame, int aNrBlocksPerLevelForGame, Admin aAdminForGame, Ball aBallForGame, Paddle aPaddleForGame, Block223 aBlock223ForGame)
  {
    game = new Game(aIsPublishedForGame, aNameForGame, aNrBlocksPerLevelForGame, aAdminForGame, aBallForGame, aPaddleForGame, this, aBlock223ForGame);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
  }

  public void delete()
  {
    Game existingGame = game;
    game = null;
    if (existingGame != null)
    {
      existingGame.delete();
    }
  }

}