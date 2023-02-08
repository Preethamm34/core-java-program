package pattern;

import java.util.Scanner;

public class Square_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sqPattern = new Scanner (System.in);	
		int n;
		System.out.println("Enter n");
		 n = sqPattern.nextInt();
		
		for (int row=0; row<=n; row++)
		{
			for (int col=0; col<=n; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			
	}

}
