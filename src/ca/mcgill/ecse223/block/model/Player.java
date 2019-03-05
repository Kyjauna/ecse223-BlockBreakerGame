/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;

// line 81 "../../../../../Block223Persistence.ump"
// line 52 "../../../../../Block223 v2.ump"
public class Player extends UserRole implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Player(String aPassword, Block223 aBlock223)
  {
    super(aPassword, aBlock223);
    // line 54 "../../../../../Block223 v2.ump"
    if (aPassword.equals(null)||aPassword.equals("")){
       			throw new RuntimeException("The password must be specified.");
       		}
    // END OF UMPLE BEFORE INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 84 "../../../../../Block223Persistence.ump"
  private static final long serialVersionUID = 98907652346L ;

  
}