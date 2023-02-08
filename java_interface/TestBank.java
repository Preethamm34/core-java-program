package java_interface;

interface Bank
{
	abstract int getRateOfIntrest();
}

class SBI implements Bank
{
	public int getRateOfIntrest()
	{
		return 7;
	}
}
class Axis implements Bank
{
	public int getRateOfIntrest()
	{
	return 8;
}
}

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1 = new SBI();
	System.out.println("Rate of intrest is : " + b1.getRateOfIntrest());
		
		Bank b2 = new Axis();
		System.out.println("Rate of intrest is : " + b2.getRateOfIntrest());
	}

}
