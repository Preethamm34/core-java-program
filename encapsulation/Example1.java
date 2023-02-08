package encapsulation;

class Student
{
	
private String name;
private	String department;
private int regNumb;
private	int phoneNumb;
private	String email;
	
	
	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDepartment() {
	return department;
}


public void setDepartment(String department) {
	this.department = department;
}


public int getRegNumb() {
	return regNumb;
}


public void setRegNumb(int regNumb) {
	this.regNumb = regNumb;
}


public int getPhoneNumb() {
	return phoneNumb;
}


public void setPhoneNumb(int phoneNumb) {
	this.phoneNumb = phoneNumb;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


	public void display()
	{
		System.out.println("Name : " + getName());
		System.out.println("Registration Number : " + getRegNumb());
		System.out.println("Department : " +  getDepartment());
		System.out.println("Email Id : " + getEmail());
		System.out.println("Contact Number : " + getPhoneNumb());
	}

	public void full()
	{
		System.out.println(getName()+" "+getDepartment()+" "+ getRegNumb()+" "+ getPhoneNumb()+" "+ getEmail());
	}
}


public class Example1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.setName("Preetham M");
		s1.setDepartment("Civil Engineering");
		s1.setPhoneNumb(9844);
		s1.setRegNumb(415421);
		s1.setEmail("preetham.setty34@gmail.com");
		s1.display();
		System.out.println(" ");
		s1.full();
		
		
		
	}

}
