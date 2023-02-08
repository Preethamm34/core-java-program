package pattern;

import java.util.Scanner;

public class Triangle_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pattern = new Scanner (System.in);
		int n;
		
		System.out.println(" Enter n");
		n = pattern.nextInt();
		
		for ( int row=0; row<=n; row++)
		{
			for (int col=0; col<=row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
