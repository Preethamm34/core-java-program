package java_interface;

interface Shapes22
{
	public float calculateArea();
	public float calculatePerimeter();
	public void display();
}
class Circle33 implements Shapes22
{
	int r;
	
public Circle33(int r) {
		
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
	System.out.println("Area of Circle is : " + calculateArea() + "sqm");
	System.out.println("Perimeter of Circle is : " + calculatePerimeter() + "m");
}
}

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes22 c1 = new Circle33(5);
		c1.display();
		
	}

}
