package inheritance;

class Person
{
	int allowance = 5000;
}
class HRA extends Person
{
	int hra = 2000;
}
class DA extends HRA
{
	int da = 1900;
}
class Bonus extends DA
{
	int bonus = 4500;

 public void display()
{
System.out.println("Salary of a person is : " + (allowance + hra + da + bonus));	
}
}

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bonus obj = new Bonus();
		obj.display();
	}
}
 



