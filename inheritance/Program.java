package inheritance;

class Session1
{
	String trainer;
	String collage;
	int students;
	
	public Session1(String trainer, String collage, int students) {
		super();
		this.trainer = trainer;
		this.collage = collage;
		this.students = students;
	}
	
	public void display()
	{
		System.out.println("Trainer : " + trainer);
		System.out.println("Training held at " + collage + " collage");
		System.out.println("Number of student attanded the session is " + students + " students");
	}
}

class Session2 extends Session1
{
	String trainer2;

	public Session2(String trainer, String collage, int students, String trainer2) {
		super(trainer, collage, students);
		this.trainer2 = trainer2;
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("Trainer : " + trainer2);
	}
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session1 s1 = new Session1("AAAAAA", "XYZ", 20);
		s1.display();
		
		Session2 s2 = new Session2("BBBBBB", "ABC", 20,"30");
		s2.display();
	}

}
