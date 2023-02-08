package hello_world;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 5;
		int  alpha = 65;
		
		for ( int i = 0 ; i < size ; i ++)
		{
			for (int j = 0 ; j < size ; j ++) 
			{
				if ( i ==j || i + j == size -1) 
				{
					System.out.println((char) (alpha + j));
				}
				else 
				{ 
					System.out.println(" ");
				}
			}
			System.out.println();
			}
	}

}
