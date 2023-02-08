package polymorphism;

class Mobile
{
	public void display()
	{
		System.out.println("Mobile Phone kept in a shop are :");
	}
}
class Nokia extends Mobile
{
	public void display()
	{
		System.out.println("Nokia");
	}
}
class Samsung extends Mobile
{
	public void display()
	{
		System.out.println("Samsung");
	}
}
class OnePlus extends Mobile
{
	public void display()
	{
		System.out.println("One Plus");
	}
}
public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m = new Mobile();
		Mobile n = new Nokia();
		Mobile s = new Samsung();
		Mobile op = new OnePlus();
		
		
		m.display();
		n.display();
		s.display();
		op.display();
		
		
		
		
	}

}
