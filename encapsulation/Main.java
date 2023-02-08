package encapsulation;


class TestTriangle1
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

class triangle1 extends TestTriangle1
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
	