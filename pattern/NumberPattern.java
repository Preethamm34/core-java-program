package pattern;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 5 ; i >= 0; i --)
		{
			for (int j = i; j > 0; j -- )
			{
				System.out.print(i + " ");
			}
			System.out.println( );
		}

	}
}
