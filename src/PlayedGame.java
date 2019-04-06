/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/


import java.io.Serializable;

// line 110 "Block223Persistence.ump"
public class PlayedGame implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PlayedGame()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 116 "Block223Persistence.ump"
   public static  void reinitializeAutouniquePgameID(List<PlayedGame> pgames){
    nextId = 0; 
    	for (PlayedGame pgame : pgames) {
      		if (pgame.getId() > nextId) {
       		nextId = pgame.getId();
      		}
   		}
    	nextId++;
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 113 "Block223Persistence.ump"
  private static final long serialVersionUID = 11789647876L ;

  
}