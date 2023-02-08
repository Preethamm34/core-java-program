package methodOverriding;

class Bank
{ 

	public void intrest()
	{
		System.out.println("Rate of intrest of the following banks are as follows");
	}
}

class SBI extends Bank
{
	public void intrest()
	{
		System.out.println("SBI bank Rate of intrest is 8.3 ");
	}
}

class AXIS extends Bank
{
	public void intrest()
	{
		System.out.println("Axis bank Rate of intrest is 9.3");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();
		Bank sbi = new SBI();
		Bank axis = new AXIS();
		
		b.intrest();
		sbi.intrest();
		axis.intrest();
		
	}

}
