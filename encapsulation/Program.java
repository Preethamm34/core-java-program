package encapsulation;

class Session1
{
	String trainer;
	String collage;
	int students;
	
public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public int getStudents() {
		return students;
	}
	public void setStudents(int students) {
		this.students = students;
	}
	
	public void display()
	{
		System.out.println("Trainer  : " + getTrainer());
		System.out.println("Training held at " + getCollage() + " collage");
		System.out.println("Number of student attanded the session is " + getStudents() + " students");
	}
}

class Session2 extends Session1
{
	
	String address;


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void display()
	{
		super.display();
		System.out.println("Address : " + getAddress());
	}
}	
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session1 s1 = new Session1();
		s1.setTrainer("ABC");
		s1.setCollage("SJCE");
		s1.setStudents(15);
		s1.display();
		
		Session2 s2 = new Session2();
		s2.setAddress("XYZ");
		s2.setCollage("SJCE");
		s2.setStudents(15);
		s2.setTrainer("VASAVI");
	
		s2.display();
	}

}
