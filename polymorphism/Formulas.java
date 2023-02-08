package polymorphism;

class Object
{
	public void equations()
	{
		System.out.println("Tha farmulas for area of");
	}
}

class Square extends Object
{
	public void equations()
	{
		System.out.println("Square is Length x Breadth");
	}
}

class Rectangle extends Object
{
	public void equations()
	{
		System.out.println("Rectangle is Length x Breadth");
	}
}

class Triangle extends Object
{
	public void equations()
	{
		System.out.println("Triangle is 1/2 x Breadth x Height");
	}
}

class Circle extends Object
{
	public void equations()
	{
		System.out.println("Circle is 3.14 x Radius^2");
	}
}
public class Formulas 
{
	public static void main (String[] args)
	{
		Object myObject = new Object();
		Object myTriangle = new Triangle();
		Object myCircle = new Circle();
		Object mySquare = new Square();
		Object myRectangle = new Rectangle();
		
		myObject.equations();
		myTriangle.equations();
		myCircle.equations();
		mySquare.equations();
		myRectangle.equations();	
	}
}
