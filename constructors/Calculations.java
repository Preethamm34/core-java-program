package constructors;

class Area
{
	int length;
	int breadth;
	int height;
	public Area(int length, int breadth, int height) {
		
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
public int calculateArea()
{
	return length*breadth;
}
public int calculateVolume()
{ 
	return length*breadth*height;
}
}
public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area a1 = new Area(5,5,5);
		System.out.println("Area = " + a1.calculateArea() + " sqm");
		System.out.println("Volume = " + a1.calculateVolume() + " cum");
	}

}
