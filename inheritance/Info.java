package inheritance;

class Studen
{
	String name;
	int rollNumb;
	
	public Studen(String name, int rollNumb) 
	{	
		this.name = name;
		this.rollNumb = rollNumb;
	}
	public void displayStudent()
	{
		System.out.println("Student name : " + name);
		System.out.println("Roll Number : " + rollNumb);
	}
}
class Student1 extends Studen
{
	String email;
	String address;
	
	public Student1(String name, int rollNumb, String email, String address)
	{
		super(name, rollNumb);
		this.email = email;
		this.address = address;
	}

	public void displaySample2()
	{
		System.out.println("Email id : " + email);
		System.out.println("Address : " + address);
	}
}

public class Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studen s1 = new Studen("Preetham",488421);
		s1.displayStudent();
		
		Student1 s2 = new Student1("preetham",488421, "preetham.setty34@gmail.com", "Mysore");
		s2.displaySample2();
	}
		
		
		
	}

