package encapsulation;

class Student1
{
	String name;
	int rollNumb;
	
	public String getName()
	{
		return name;	
	}
	public void setName( String name)
	{
		this.name = name;
	}
	public int getRollNumb()
	{
		return rollNumb;
	}
	public void setRollNumb(int rollNumb)
	{
		this.rollNumb = rollNumb;
	}
	
	public void displayStudent1()
	{
		System.out.println("Student name : " + getName());
		System.out.println("Roll Number : " + getRollNumb());
	}
}

class Student2 extends Student1
{
	String email;
	String address;
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail( String email)
	{
		this.email = email;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress (String address)
	{
		this.address = address;
	}
	
	public void displayStudent2()
	{
		System.out.println("Email id : " + getEmail());
		System.out.println("Address : " + getAddress());
}
}
public class Information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s1 = new Student1();
		s1.setName("preetham");
		s1.setRollNumb(2012055323);
		s1.displayStudent1();
		
		Student2 s2 = new Student2();
		s2.setEmail("preetham.setty34@gmail.com");
		s2.setAddress("Vijayanagara 2nd stage, Mysore");
		s2.displayStudent2();
	}
}
