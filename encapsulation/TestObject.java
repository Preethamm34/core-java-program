package encapsulation;

class cube
{
	private String objName;
	private int length;
	
	public String getObjName() {
		return objName;
	}
	public void setObjName(String objName) {
		this.objName = objName;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int calculateCubeVolume()
	{
		return length*length*length; 
	}
	
	public void displayCube()
	{
		System.out.println("Object Name - " + objName);
		System.out.println("Length - " + length);
	}
}

class RectanglePrism extends cube
{
	private String objName;
	private int width;
	private int height;
	
	public String getObjName() {
		return objName;
	}
	public void setObjName(String objName) {
		this.objName = objName;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calculateRectanglePrismVolume()
	{
		return getLength()*width*height;
	}
	
	public void displayRectanglePrism()
	{
		//super.calculateCubeVolume();
		System.out.println("Object Name - " + getObjName());
		System.out.println("Width - " + width);
		System.out.println("Height - " + height);
		
	}
}

class Cone extends RectanglePrism
{
	private String objName;
	private int radius;
	public String getObjName() {
		return objName;
	}
	public void setObjName(String objName) {
		this.objName = objName;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public float calculateConeVolume()
	{
		return 0.33f * 3.14f * radius * radius * getHeight();
	}
	
	public void displayCone()
	{
		//super.displayRectanglePrism();
		System.out.println("Object Name - " + getObjName());
		System.out.println("Radius - " + radius);
	}

}

class Sphere extends Cone
{
	private String objName;

	public String getObjName() {
		return objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}
	
	public float calcutaleSphereVolume()
	{
		return 1.33f * 3.14f * getRadius() * getRadius() * getRadius();
	}
	
	public void displaySphere()
	{
		//super.displayCone();
		System.out.println("Object Name - " + objName);
		System.out.println("Radius - " + getRadius());
	}
}
public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cube c1 = new cube();
		c1.setObjName("Cube");
		c1.setLength(5);
		c1.displayCube();
		System.out.println("Volume of cube - " + c1.calculateCubeVolume());
		System.out.println(" ");
		
		RectanglePrism rp1 = new RectanglePrism();
		rp1.setObjName("RectanglePrism");
		rp1.setLength(2);
		rp1.setWidth(5);
		rp1.setHeight(2);
		rp1.displayRectanglePrism();
		System.out.println("Volume of RectanglePrism - " + rp1.calculateRectanglePrismVolume());
		System.out.println(" ");
		
		Cone co1 = new Cone();
		co1.setObjName("Cone");
		co1.setRadius(5);
		co1.setHeight(6);
		co1.displayCone();
		System.out.println("Volume of Cone - " + co1.calculateConeVolume());
		System.out.println(" ");
		
		Sphere sp1 = new Sphere();
		sp1.setObjName("Sphere");
		sp1.setRadius(4);
		sp1.displaySphere();
		System.out.println("Volume of Sphere - " + sp1.calcutaleSphereVolume());
		
	}
}
