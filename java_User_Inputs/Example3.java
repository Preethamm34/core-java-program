package java_User_Inputs;

//import java.util.Scanner;
import java.util.*;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		
		String name;
		int standard;
		String school;
		
		System.out.println("Enter student name, standard, school:");
		
		name = myObj.nextLine();
		standard = myObj.nextInt();
		school = myObj.next();
		
		System.out.println("Student Name : " + name);
		System.out.println("Studying in : " + standard + " Standard");
		System.out.println("School Name : " + school);
				
	}

}
