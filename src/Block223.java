/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/


import java.io.Serializable;

// line 3 "Block223Persistence.ump"
public class Block223 implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Block223()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 9 "Block223Persistence.ump"
   public void reinitialize(){
    User.reinitializeUniqueUsername(this.getUsers());
    Game.reinitializeUniqueName(this.getGames());
    PlayedGame.reinitializeAutouniquePgameID(this.getPlayedGames());
    
    
    List<Game> games=this.getGames();
    for (Game game : games) {
    game.reinitialize();
    }
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 6 "Block223Persistence.ump"
  private static final long serialVersionUID = 15645756832L ;

  
}