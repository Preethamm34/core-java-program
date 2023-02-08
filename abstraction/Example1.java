package abstraction;

abstract class Shape
{
	public abstract  void draw();
}

class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Deawing Circle");
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape myObj = new Rectangle();
		Shape c1 = new Circle();
		c1.draw();
		myObj.draw();
		
	}

}
