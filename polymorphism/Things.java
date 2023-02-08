package polymorphism;

class Vehicle
{
	public void vehicle()
	{
		System.out.println("Vehicle owned by the fillowing persons are");
	}
}

class Preetham extends Vehicle
{
	public void vehicle()
	{
		System.out.println("Preetham owne Jawa 42 Bike");
	}
}

class Roshan extends Vehicle
{
	public void vehicle()
	{
		System.out.println("Roshan owne Pulser 220 Bike");
	}
}

class Karthik extends Vehicle
{
	public void vehicle()
	{
		System.out.println("Karthike owne Classic 350 Bike");
	}
}

class Vishal extends Vehicle
{
	public void vehicle()
	{
		System.out.println("Vishal owne Yamaha FZ Bike");
	}
}
public class Things {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle myvehicle = new Vehicle();
		Vehicle myPreetham = new Preetham();
		Vehicle myRoshan = new Roshan();
		Vehicle myKarthik = new Karthik();
		Vehicle myVishal = new Vishal();
		
		myvehicle.vehicle();
		myPreetham.vehicle();
		myRoshan.vehicle();
		myKarthik.vehicle();
		myVishal.vehicle();
		
		
	}

}
