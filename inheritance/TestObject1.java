package inheritance;

class Square
{
	private double length;
	private double height;
	
	public double getLength()
	{
		return length;
	}
	public void setLength( double length)
	{
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void display()
	{
		System.out.println("Length is : " + length);
		System.out.println("Height is : " + height);
	}
	
	public double CalculateArea()
	{
		return length * length;
	}
	public double CalculateVolume()
	{
		return length * length * height;
	}

}

class Rectangle extends Square
{
	public double bredth;
	
	public double getBredth()
	{
		return bredth;
	}
	public void setBredth(double bredth)
	{
		this.bredth = bredth;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Bredth is : " + bredth);
	}
	 
	public double rectangleArea()
	{
		return getLength() * bredth;
	}
	
	public double rectangleVolume()
	{
		return getLength() * getBredth() * getHeight();
	}
}

public class TestObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s1 = new Square();
		System.out.println("Square");
		s1.setLength(5);
		s1.setHeight(10);
		s1.display();
		System.out.println("Area of square is : "+s1.CalculateArea() + " sqm");
		System.out.println("Volume of square id : " + s1.CalculateVolume() + " cum");
		
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle");
		r1.setBredth(10);
		r1.setLength(15);
		r1.setHeight(20);
		r1.display();
		System.out.println("Area of rectangle is : "+r1.rectangleArea() + " sqm");
		System.out.println("Area of rectangle is : "+r1.rectangleVolume() + " cum");
		
		
	}

}
