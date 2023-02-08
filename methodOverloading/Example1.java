package methodOverloading;

class overloading
{
	public void display(String a)
	{
		System.out.println(a);
	}
public void display( String a, int numb)
{
	System.out.println(a +" "+ numb);
}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading o1 = new overloading();
		o1.display("preetham");
				o1.display("bob", 420);
	}

}
