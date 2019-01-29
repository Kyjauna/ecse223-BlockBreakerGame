package ca.mcgill.ecse.btms.model;

public class test_iteration_1 {
	
	public static void main(String args[]) {
		
		Block223 app = new Block223();
		User potato=app.addUser("potato");
		Admin Sharon = app.addAdmin("sharon", potato);
		System.out.println(Sharon);
		app.addAdmin(Sharon);
	}

}
