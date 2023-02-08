package abstraction;



abstract class Shapes1
{
	abstract int calculateArea();
	abstract int calculateVolume();
	abstract int calculatePerimeter();
	abstract void display();
}

class Square extends Shapes1
{
	int length;
	int height;
	
	public  Square( int length, int height)
	{
	this.length = length;
	this.height = height;
	}
	
	public int calculateArea()
	{
		return length*length;
	}
	public int calculateVolume()
	{
		return calculateArea() * height;
	}
	public int calculatePerimeter()
	{
		return length+length+length+length;
	}
	public void display()
	{
		System.out.println("Length of Square : " + length+"m" + "\nHeight of Square : " + height+"m");
		System.out.println("Area of Square : " + calculateArea() + "sqm");
		System.out.println("volume of Square : " + calculateVolume() + "cum");
		System.out.println("Perimeter of Square : " + calculatePerimeter() + "m");
		System.out.println(" ");
		
	}
}
class Rectangle3 extends Square
{
	int bredth;

	public Rectangle3(int length, int height, int bredth) {
		super(length, height);
		this.bredth = bredth;
	}
	
	public int calculateArea()
	{
		return length*bredth;
	}
	public int calculateVolume()
	{
		return calculateArea() * height;
	}
	public int calculatePerimeter()
	{
		return (length*2)+(bredth*2);
	}
	public void display()
	{
		//super.display();
		System.out.println("Length of Rectangle : " + length +"m"+ "\nBredth of Rectangle : "+ bredth+"m" + "\nHeight of Rectangle : " + height+"m");
		System.out.println("Area of Rectangle : " + calculateArea()+ "sqm");
		System.out.println("Volume of Rectangle : "+calculateVolume()+"cum");
		System.out.println("Perimeter of Rectangle : " + calculatePerimeter()+"m");
		System.out.println(" ");
	}
}

class Trapezoid extends Rectangle3
{
	
	public Trapezoid(int length, int height, int bredth) {
		super(length, height, bredth);
		// TODO Auto-generated constructor stub
	}
	public int calculateArea()
	{
		return  (bredth+bredth/2)*height;
	}
	public void display()
	{
		System.out.println("Area of Trapezoid : " + calculateArea() + "sqm");
	}
}
public class RectangleAndSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes1 s1 = new Square(5,10);
		s1.display();
		
		Shapes1 r1 = new Rectangle3(5,10,5);
		r1.display();
		
		Shapes1 t1 = new Trapezoid(5,5,5);
		t1.display();
	}

}
