package inheritance;

class AreasAndVolume {
	
		  double length;
		  double breadth;
		  double height;
		  int sides;
		   
		  public AreasAndVolume(double length, double breadth, double height, int sides) 
		  {
			this.length = length;
			this.breadth = breadth;
			this.height = height;
			this.sides = sides;
		}

		  public double calculateArea()
		  {
			  return length * breadth;
		  }
		  
		public double calculateVolume()
		{
			return length * breadth * height;
		}
		
		public void display()
		{
			System.out.println("length : " + length);
			System.out.println("Bredth : " + breadth);
			System.out.println("Height : " + height);
			System.out.println("square has " + sides + " sides");
			
		}
	public static void main (String[] args) {
		// TODO Auto-generated method stub

		AreasAndVolume av1 = new AreasAndVolume(5,10, 15, 4);
		av1.display();
		System.out.println("Area : " + av1.calculateArea() + " sqm");
		System.out.println("Volume : " + av1.calculateVolume() + " cum");
		
}
}