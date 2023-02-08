package java_interface;

interface Car
{
	public void Speed();
}

interface Lorry
{
	public void sound();
}

class Vehicle implements Car,Lorry
{
	public void sound()
	{
		System.out.println("car sound peem peem");
	}
	public void speed()
	{
		System.out.println("car goes in a speed 100 kmph");
	}
	@Override
	public void Speed() {
		// TODO Auto-generated method stub
		
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle cl = new Vehicle();
		cl.sound();
		cl.speed();
		
		
	}

}
