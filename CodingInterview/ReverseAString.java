package CodingInterview;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//		Scanner sc = new Scanner(System.in);
//		String input;
//		System.out.println("Enter a String input ");
//		input = sc.next();
		
		String input = "PREETHAM";
		
		char[] ch = input.toCharArray(); // convert to character array //
		
		for ( int i=ch.length-1; i>=0; i--) // interact from end to first //
		{
			
			System.out.println(ch[i]);
		}
		
	}

}
