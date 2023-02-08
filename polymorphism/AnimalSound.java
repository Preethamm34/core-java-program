package polymorphism;

class Animal 
{
	public void animalSound() 
	{
	System.out.println("How aminals sound like");	
	}
}

class Pig extends Animal
{
	public void animalSound()
	{
		System.out.println("The pig says - Wee Wee " );
	}
}
public class AnimalSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal myAnimal = new Animal();
		myAnimal.animalSound();
		Animal myPig = new Pig();
		myPig.animalSound();
		
	}

}
