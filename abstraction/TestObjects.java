package abstraction;

abstract class Shapes
{
abstract float  calculateArea();
abstract float calculatePerimeter();
abstract void display();
}

class Circle1 extends Shapes
{
	int r;

	public Circle1(int r) {
		this.r = r;
	}
	public float calculateArea()
	{
		return 3.14f * r * r;
	}
	public float calculatePerimeter()
	{
		return 2 * 3.14f * r * r;
	}
	
	public void display()
	{
		System.out.println("Area of Circle is : " + calculateArea());
		System.out.println("Perimeter of Circle is : " + calculatePerimeter());
	}
}

class Rectangle1 extends Shapes
{
	int l;
	int b;
	
public Rectangle1( int l, int b) {
	
		this.l = l;
		this.b = b;
	}

public float calculateArea()
{
	return l*b;
}
public float calculatePerimeter()
{
	return l+l+l+l;
}
public void display()
{
	System.out.println("Area of Rectangle is : " + calculateArea());
	System.out.println("Perimeter of Rectangle is : " + calculatePerimeter());
}


}

public class TestObjects {

	public static void main(String[] args) 
	{
		Shapes myCircle = new Circle1(5);
		myCircle.display();
		
		Shapes myRec = new Rectangle1(8,5);
		myRec.display();
	}

}
