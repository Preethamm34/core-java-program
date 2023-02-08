package attributes;

class Action
{
	String name;
	String hero;
	float rating;
	double duration;
	
	public void display()
	{
	System.out.println("The movie name is : " + name);
	System.out.println(hero + " Was the hero of the movie");
	System.out.println("IMDB Rating is : " + rating + "/10");
	System.out.println("The mobie duration is : " + duration + "hours");
	
	}
	public void display1()
	{
	System.out.println("Action Movie");
	}
	public void gap()
	{
	System.out.println(" ");
	}
}
public class Movies
{
	public static void main (String[] args)
	{
	Action m1 = new Action();
	m1.display1();
	m1.name = "TOP GUN";
	m1.hero = "Tom Cruise";
	m1.rating = 8.6f;
	m1.duration = 2.30;
	m1.display();
	m1.gap();
	
	
	Action m2 = new Action();
	m2.display1();
	m2.name = "UNCHARTED";
	m2.hero = "Tom Holland";
	m2.rating = 6.4f;
	m2.duration = 1.56;
	m2.display();
	m2.gap();
	}
}
	