/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/


import java.io.Serializable;

// line 56 "Block223Persistence.ump"
public class Game implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Game()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 62 "Block223Persistence.ump"
   public void reinitialize(){
    Block.reinitializeAutouniqueID(this.getBlocks());
  }

  // line 66 "Block223Persistence.ump"
   public static  void reinitializeUniqueName(List<Game> games){
    gamesByName = new HashMap<String, Game>();
    	for (Game game : games) {
      		gamesByName.put(game.getName(), game);
   		}
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 59 "Block223Persistence.ump"
  private static final long serialVersionUID = 60987679845L ;

  
}