package methodOverloading;

class Add
{
	int age;
	String a;
	
	public Add (String a, int age)
	{
	this.a = a;
	this.age = age;
	}
	

public void display()
{
	System.out.println("Person name : " + a);
	System.out.println("Person age : " + age);
}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add a1= new Add("Preetham",25);
		a1.display();
		
	}

}
