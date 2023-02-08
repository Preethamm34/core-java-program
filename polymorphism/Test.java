package polymorphism;

class Bank
{
	public void gives()
	{
		System.out.println("Rate of intrest in the following banks are,");
	}
}

class SBI extends Bank
{
	public void gives()
	{ System.out.println("SBI bank Rate of Intrenst = 8.3 %");
}
}
class AXIS extends Bank
{
	public void gives()
	{ System.out.println("AXIS bank Rate of Intrenst = 7.3 %");
}
}

class ICICI extends Bank
{
	public void gives()
	{ System.out.println("ICICI bank Rate of Intrenst = 9.3 %");
}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();
		Bank s = new SBI();
		Bank a = new AXIS();
		Bank i = new ICICI();
		
		b.gives();
		s.gives();
		a.gives();
		i.gives();
		
	}

}
