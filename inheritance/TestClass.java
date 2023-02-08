package inheritance;

class ShapeSquare
{
	 String colour;
	 int sides;
	 int length;
	 int height;

	 // constructors //
	 public ShapeSquare() {
			this.colour = colour;
			this.sides = sides;
			this.length = length;
			this.height = height;
		}

	 public void displaySquare2()
	 {
		 System.out.println("Square colour : " + colour );
			System.out.println("Square has " + sides + " Sides");
			System.out.println("Length : " + length + "m");
			System.out.println("Height : " + height+ "m");
	 }
	 


	public static void main (String[] args) {
		// TODO Auto-generated method stub

		ShapeSquare s1 = new ShapeSquare();
		s1.colour = "Red";
		s1.sides = 4;
		s1.length = 5;
		s1.height = 10;
		s1.displaySquare2();
	
		
	}

}


