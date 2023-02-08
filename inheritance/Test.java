package inheritance;

class TestTriangle
{
	String objectName;
	String colour;
	int length;
	int breadth;
	
	public TestTriangle(String objectName, String colour, int length, int breadth) {
		super();
		this.objectName = objectName;
		this.colour = colour;
		this.length = length;
		this.breadth = breadth;
	}
	public float calculateArea()
	{ 
		return  0.5f * length * breadth;
	}
	public void displayArea()
	{
		System.out.println("Calculating on : " + objectName);
		System.out.println("colour : " + colour);
		System.out.println("Length : " + length + "m");
	}
}

class triangle extends TestTriangle
{
	int height;

	public triangle(String objectName, String colour, int length, int breadth, int height) {
		super(objectName, colour, length, breadth);
		this.height = height;
	}
	
	public float calculateVolume()
	{
		return 0.5f * length * breadth * height ;
	}
	
	public void display()
	{
		//super.displayArea();
	System.out.println("Height : " + height + "m");
	}
}

class Cone extends triangle  
{
	int radius;

	public Cone(String objectName, String colour, int length, int breadth, int height, int radius) {
		super(objectName, colour, length, breadth, height);
		this.radius = radius;
	}
	public float calculateConeArea()
	{
		return (3.14f*radius*radius) + (3.14f*radius*length);
	}

	public float calculateConeVolume()
	{
		return ((3.14f*radius*radius*height)/3);
	}
	
	public void displayCone()
	{
		super.display();
		System.out.println("Radius of Cone : " + radius + "m");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestTriangle t1 = new TestTriangle ("Triangle", "Red", 5, 5);
		t1.displayArea();
		
	
		triangle t2 = new triangle("Triangle", "Red", 5, 5, 5);
		t2.display();
		System.out.println("Area of triangle : " + t1.calculateArea() + " sqm");
		System.out.println("Volume of triangle : " + t2.calculateVolume() + " cum");
		System.out.println(" ");
		
		Cone c1 = new Cone("Cone", "Blue", 5, 5, 5,5);
		System.out.println("Calculation on : Cone"  );
		c1.displayCone();
		System.out.println("Area of Cone : " + c1.calculateConeArea() + "sqm");
		System.out.println("Volume of Cone : " + c1.calculateConeVolume() + "cum");
	}

}
