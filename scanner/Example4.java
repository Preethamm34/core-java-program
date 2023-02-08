package scanner;

import java.util.*;

public class Example4 
{
	public static void main (String[] args)
	{

		String bikeName;
		String owner;
		int modle;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bike Name : ");
		bikeName = in.nextLine();
		
		System.out.println("Owner Name : ");
		owner = in.nextLine();
		
		System.out.println("Model : ");
		modle = in.nextInt();
		
		
		
		System.out.println("Bike Name : " + bikeName +"\noOwner Name : " + owner + "\nModel : " + modle);
		}
}