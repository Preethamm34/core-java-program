package polymorphism;


public class Addition {

	 public int sum ( int a, int b , int c )
	{
		return a+b+c;
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a1 = new Addition();
		System.out.println( " Addition of a,b,c = " + a1.sum(5,5,5));	
	}
}
