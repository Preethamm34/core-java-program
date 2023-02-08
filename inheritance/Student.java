package inheritance;

class Data
{
	protected String name = "jonny";
	protected int age = 25;
}
 class Student extends Data 
 {
	 private int year = 2022;
	 private int year2 = 2025;
	 public void display()
	 {
		 System.out.println("Student name " + name);
		 System.out.println("Student age " + age);
		 System.out.println("Student death date " + year);
		 System.out.println("Student reborn " + year2);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student data1 = new Student();
		data1.display();	
	}

}
