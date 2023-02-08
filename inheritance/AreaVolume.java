package inheritance;

class SquareArea
{
	private double length;
	private int side;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public double calculateArea()
	{
		return length * length ;
	}
	
	public void display()
	{
		System.out.println("Length is : " + length);
		System.out.println("Square has " + side + " sides");
	}
}
	
	class Volume extends SquareArea
	{
		private double breadth;
		private double height;
		
		public double getBreadth() {
			return breadth;
		}
		public void setBreadth(double breadth) {
			this.breadth = breadth;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		
		
		public double calculateVolume()
		{ 
			return getLength() * breadth * height;
		}
		public void display()
		{
			super.display();
			System.out.println("Breadth is : " + breadth);
			System.out.println("Height is : " + height);
		}
		}
	
public class AreaVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SquareArea sqa1 = new SquareArea();
		sqa1.setLength(5);
		sqa1.setSide(4);
		sqa1.display();
		System.out.println("Area of square is : " + sqa1.calculateArea() + " sqm");
		
		Volume sq1 = new Volume();
		sq1.setLength(10); 
		sq1.setBreadth(10);
		sq1.setHeight(15);
		sq1.setSide(4);
		sq1.display();
		System.out.println("Volume of square is : " + sq1.calculateVolume() + " cum");
		
	}

}
