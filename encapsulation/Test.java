package encapsulation;

class TestTriangle
{
	String objectName;
	String colour;
	int length;
	int breadth;
	
public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public float calculateArea()
	{ 
		return  0.5f * length * breadth;
	}
	
	public void displayArea()
	{
		System.out.println("Calculating on : " + getObjectName());
		System.out.println("colour : " + getColour());
		System.out.println("Length : " + getLength() + "m");
	}
}

class triangle extends TestTriangle
{
	int height;

	
public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public float calculateVolume()
	{
		return 0.5f * getLength() * getBreadth() * height ;
	}
	
	public void display()
	{
	System.out.println("Height : " + getHeight() + "m");
	}
}
	
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestTriangle t1 = new TestTriangle ();
		t1.setObjectName("Triangle");
		t1.setColour("Red");
		t1.setLength(5);
		t1.setBreadth(10);
		t1.displayArea();
		System.out.println("Area of triangle : " +t1.calculateArea() + "sqm");
		
		triangle t2 = new triangle();
		t2.setHeight(5);
		t2.setLength(5);
		t2.setBreadth(10);
		t2.display();
		System.out.println("Volume of triangle : " + t2.calculateVolume() + " cum");
	}

}
