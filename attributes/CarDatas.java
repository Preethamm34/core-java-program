package attributes;

class Vehicles	
{
	String name;
	int model;
	String date;
	
	public void display()
	{
			System.out.println("vehicle name : " + name);
			System.out.println("Model : " + model );
			System.out.println("Delivary date : " + date);
	}
}
public class CarDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicles car1 = new Vehicles();
		car1.name = "Jeep";
		car1.model = 1982;
		car1.date = "22nd June 2022";
		car1.display(); 
	}

}
