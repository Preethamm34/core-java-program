package constructors;

class Default_Constructors
{
	int id;
	String name;
	
	public void display()
	{
		System.out.println("Student id : " + id);
		System.out.println("Student Name : " + name );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Default_Constructors s1 = new Default_Constructors();
		s1.display();
	}

}
