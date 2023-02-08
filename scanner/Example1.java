package scanner;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bob = new Scanner(System.in);
		System.out.println("Type Name");
		String name = bob.nextLine(); 
		System.out.println("You have entered name as "+name);
	}

}
