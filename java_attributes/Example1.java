package java_attributes;

class Flowers
{
	String name;
	String colour;
	
	public void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Colour : " + colour);
	}
}
public class Example1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flowers f1 = new Flowers();
		f1.name = "Rose";
		f1.colour = "Red";
		f1.display();
		
		Flowers f2 = new Flowers();
		f1.name = "Jasmine";
		f1.colour = "White";
		f1.display();
	}

}
