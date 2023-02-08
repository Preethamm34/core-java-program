package java_User_Inputs;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner (System.in);
	
		String name;
		
		System.out.println("Enter Name");
		
		name = myObj.nextLine();
		
		System.out.println("Name is : " + name);
		
	}

}
