package java_modifiers;

public class Protected {

	private String title = "Access modifiers 4 Protected";
	private String fname = "John";
	  private String lname = "Doe";
	  private String email = "john@doe.com";
	  private int age = 24;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Protected myObj = new Protected();
		 System.out.println(myObj.title);
		    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		    System.out.println("Email: " + myObj.email);
		    System.out.println("Age: " + myObj.age);
		
	}

}