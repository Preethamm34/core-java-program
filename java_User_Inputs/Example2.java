package java_User_Inputs;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int age ;
		
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter Student Name :");
		name = myObj.nextLine();
		System.out.println("Enter Student Age :");
		age = myObj.nextInt();
		
		System.out.println("Student Name : " + name);
		System.out.println("Student Age :" + age);
	}
}
