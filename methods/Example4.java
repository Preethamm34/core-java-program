package methods;

public class Example4 {

	public static void checkAge( int age)
	{
		if (age < 18)
		{
			System.out.println("Under age");
		}
		else if ( age > 25)
		{
			System.out.println("over aged");
		}
		else
		{
			System.out.println("Correct age");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkAge(19);
		
	}

}
