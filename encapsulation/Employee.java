package encapsulation;

class Info
{
	private String name;
	private String designation;
	private int salary;
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

public void display()
{
	System.out.println("Employee name :" + name +  "\nDesignation : " +designation +  "\nSalary per month : " +salary);
}
}

public class Employee {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		Info v1 = new Info();
		v1.setName("Jnonny");
		v1.setDesignation("Manager");
		v1.setSalary(45000);
		v1.display();
	}

}
