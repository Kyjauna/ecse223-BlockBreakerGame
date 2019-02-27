package ca.mcgill.ecse223.block.persistence;

public class Block223Persistence {
  
  public static void save(Block223 block223) {
    PersistenceObjectSTream.serialize(block223); 
  }
  
  
}
