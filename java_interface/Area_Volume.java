package java_interface;

interface Shape
{
	public int calculateArea();
	public int calculateVolume();
	public int calculatePerimeter();
	public void display();
}

class Square implements Shape
{
	int length;
	int height;
	
	public Square (int length, int height)
	{
		this.length = length;
		this.height = height;
	}
	public int calculateArea()
	{
		return length * length;
	}
	public int calculateVolume()
	{
		return calculateArea() * height;
	}
	public int calculatePerimeter()
	{
		return length + length + length + length;
	}
	public void display()
	{ 
		System.out.println("DETAILS OF SQUARE");
		System.out.println("Length : " + length + "m");
		System.out.println("Height : " + height + "m");
		System.out.println("Area of Square : " + calculateArea() + "sqm");
		System.out.println("Volume of Square : " + calculateVolume() + "cum");
		System.out.println("Perimenter of Square is : " + calculatePerimeter() + "m");
		
	}
}
 class Rectangle1 implements Shape
{
	int breadth;
	int height;
	int length;
	

	
	public Rectangle1(int breadth, int height, int length) {
		super();
		this.breadth = breadth;
		this.height = height;
		this.length = length;
	}
	public int calculateArea()
	{
		return length * breadth;
	}
	public int calculateVolume()
	{
		return length *breadth * height;
	}
	public int calculatePerimeter()
	{
		return (2*length)+(2*breadth);
	}
	
	public void display()
	{ 
		System.out.println("DETAILS OF RECTANGLE");
		System.out.println("Length : " + length + "m");
		System.out.println("Height : " + height + "m");
		System.out.println("Breadth : " + breadth + "m");
		System.out.println("Area of Rectangle : " + calculateArea() + "sqm");
		System.out.println("Volume of Rectangle : " + calculateVolume() + "cum");
		System.out.println("Perimenter of Rectangle is : " + calculatePerimeter() + "m");
		
	}
	
}

public class Area_Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Square(10,20);
		s1.display();
		
		Shape r1 = new Rectangle1(10,20,30);
		r1.display();
		
	}

}
