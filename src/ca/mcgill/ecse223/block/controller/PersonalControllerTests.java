package ca.mcgill.ecse223.block.controller;

public class PersonalControllerTests {

	
	public static void main(String[] args){
		try {
			Block223Controller.register("hello2", "passw", "");
			
		} 
		catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("success!");
	}
	
	
}
