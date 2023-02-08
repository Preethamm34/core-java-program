package inheritance;

class Circle2
{
private double radius;
private String colour;



public Circle2(double radius, String colour) {
	super();
	this.radius = radius;
	this.colour = colour;
}

public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}

public double calArea() {
	return 3.14f * radius * radius ;
}

public void Dis() { 

	
	System.out.println("radius :" +getRadius());
	System.out.println("colour :" +getColour());
}
}


class Cylinder1 extends Circle2{
	
	public Cylinder1(double radius, String colour) {
		super(radius, colour);
		// TODO Auto-generated constructor stub
	}

	private double height;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double CalVolume() {
		return 3.14f * getRadius() * getRadius() * height;
	}
	
	public void Dis()
	{
		super.Dis();
		System.out.println("height :" + height);
	}
}


public class TestObjects2 {

public static void main(String[] args) {
// TODO Auto-generated method stub
	
	Circle2 c1 = new Circle2(5, "blue");
	c1.setColour("red");
	c1.setRadius(10);
	c1.calArea();
	c1.Dis();
	System.out.println(c1.calArea());
	

	Cylinder1 x1 = new Cylinder1(3, "orange");
	x1.setColour("black");
	x1.setHeight(5);
	x1.setRadius(10);
	x1.Dis();
	x1.CalVolume();
	System.out.println(x1.CalVolume());
}
}


