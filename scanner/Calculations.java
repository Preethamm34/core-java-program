package scanner;

import java.util.*;

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

		Scanner area = new Scanner(System.in);
		
		System.out.println("Enter Length  ");
	int	length = area.nextInt();
		
		System.out.println("Enter Bredth  ");
	int	breadth = area.nextInt();
		
		System.out.println("Enter Height ");
	int	height = area.nextInt();
		
		Area a1 = new Area(length,breadth,height);
		System.out.println("Area = " + a1.calculateArea() + " sqm");
		System.out.println("Volume = " + a1.calculateVolume() + " cum");
	}

}
