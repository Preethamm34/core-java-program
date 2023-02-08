package scanner;

import java.util.*;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int myClass;
		float percentage;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student Name");
		name = in.nextLine();
		
		System.out.println("Enter Class");
		myClass = in.nextInt();
		
		System.out.println("Enter Percentage");
		percentage = in.nextFloat();
		
		in.close();
		
		System.out.println("Name: " + name + ", Class: "+ myClass + ", Percentage: "+ percentage);
	}

}
