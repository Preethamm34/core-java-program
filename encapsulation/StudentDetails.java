package encapsulation;

class Details
{
	private String name;
	private int rollNumber;
	  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public void  details()
	{
		System.out.println("Student Name : " + getName());
		System.out.println("Register Number : " + getRollNumber());		
	}
}

public class StudentDetails  {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Details sd = new Details();
		sd.setName("Preetham M");
		sd.setRollNumber(421);
		sd.details();
	}

}
