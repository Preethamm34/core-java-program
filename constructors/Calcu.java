package constructors;

class Area1
{
	int l;
	int b;
	int h;
	
	public Area1( int l, int b, int h)
	{
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public int calculateArea()
	{ 
		return l*b; 
	}
	public int calculateVolum()
	{
		return calculateArea()*h;
	}
}

public class Calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Area1 a1 = new Area1(6,7,5);
		System.out.println("area = " + a1.calculateArea()+ "sqm") ;
		System.out.println("volume = " + a1.calculateVolum() + "cum");
	}

}
