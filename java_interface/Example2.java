package java_interface;

interface Shapes
{
	public void draw(); 
	public void colour();
}
class Circle implements Shapes
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void colour()
	{
		System.out.println("Circle colour is Red");
	}
}
class Rectangle implements Shapes
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
	public void colour()
	{
		System.out.println("Rectangle colour is Blue");
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes s1 = new Circle();
		Shapes s2 = new Rectangle();
		s1.draw();
		s1.colour();
		s2.draw();
		s2.colour();
		
	}

}
