package java_interface;

interface Animals
{
	public void animalSound();
	public void sleep();
}

class Dog implements Animals
{
	public void animalSound()
	{
		System.out.println("The Dog says boww boww");
	}
	public void sleep()
	{
		System.out.println("ZzzzZzzzZzzz");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1 = new Dog();
		d1.animalSound();
		d1.sleep();
		
	}

}
