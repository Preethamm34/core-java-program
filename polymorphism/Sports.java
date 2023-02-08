package polymorphism;

class Players
{
	public void person()
	{
	System.out.println("Number of players are");
}
}
class Cricket extends Players
{ 
	public void person()
{
	System.out.println("Number of players in cricker is - 11 ");
}
}
class FootBall extends Players
{
	
	public void person()
	{
		System.out.println("Number of players in Football is - 11" );
	}
}
public class Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Players myPpl = new Players();
		Players myCricket = new Cricket();
		Players myFootBall = new FootBall();
		
		myPpl.person();
		myCricket.person();
		myFootBall.person();
		
	}

}
