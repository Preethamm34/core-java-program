package constructors;

class VehiclesMoto1 {

	String name;
	int model;
	String colour; 
	
	 public VehiclesMoto1 (String name, int model, String colour)
	{
		this.name = name;
		this.model = model;
		this.colour = colour;
	}
	
public void display()
{
	System.out.println(name +", "+ model + " model," + colour + " colour");
}

public void space()
{
System.out.println("  ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiclesMoto1 car1 = new VehiclesMoto1("Jeep",1982," Green");
		VehiclesMoto1 car2 = new VehiclesMoto1("BMW z1",2015," Blue");
		VehiclesMoto1 car3 = new VehiclesMoto1("Benz 3200c",2020," Black");
	
		car1.space();
		car1.display();
		car1.space();
		car2.display();
		car2.space();
		car3.display();
	}

}
