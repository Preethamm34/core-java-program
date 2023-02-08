package inheritance;

class Shape1Square
{
	 String colour;
	 int sides;
	 int length;
	
	public Shape1Square(String colour, int sides, int length) {
		super();
		this.colour = colour;
		this.sides = sides;
		this.length = length;
			}
	 
	public void displaySquare()
	 {
		 System.out.println("Square colour : " + colour );
			System.out.println("Square has " + sides + " Sides");
			System.out.println("Length : " + length + "m");	
	 } 
	
}


class Shape1Rectangle extends Shape1Square
{
	int height;

	public Shape1Rectangle(String colour, int sides, int length, int height) {
		super(colour, sides, length);
		this.height = height;
	}



	public void displayRectangle()
	{
		super.displaySquare();
		System.out.println("height : " + height + "m");
	}
}
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape1Square s1 = new Shape1Square("Red",4,5);
		s1.displaySquare();
	
		Shape1Rectangle r1 = new Shape1Rectangle("Black", 4, 5, 5);
		r1.displayRectangle();
	}
}
