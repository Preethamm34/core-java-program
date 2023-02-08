package inheritance;

class GeneralPeople
{
	 String name = "Shettys";
	 int family = 2 ;	
}

class Peoples extends GeneralPeople
{
	public int members = 5;
	
	public void display()
	{
		System.out.println("Cast name is " + name + ", there are " + family + " familys in it, and " + " each family has " + members + " members");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peoples f1 = new Peoples();
		f1.display();
	}
}
