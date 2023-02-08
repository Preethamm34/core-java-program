package inheritance;

class MathsTeacher
{
	String name = "sara";
	String collage = "vidyavardhaka";
	
}

class Teacher extends MathsTeacher
{
	int age = 25;
	
	public void display()
	{
		System.out.println("Teacher name " + name + " age is " + age + " working in " + collage + " collage");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1 = new Teacher();
		t1.display();		
	}

}
