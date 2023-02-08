package inheritance;

class Sample1
{
	String movieName;
	float duration;
	
	public Sample1(String movieNmae, float duration)
	{	
		this.movieName = movieNmae;
		this.duration = duration;
	}
	
	public void displaySample1()
	{
		System.out.println("Mobie name : " +movieName);
		System.out.println("Duration : " + duration);
	}
	
}
class Sample2 extends Sample1
{
	String rating;

	public Sample2(String movieNmae, float duration, String rating) {
		super(movieNmae, duration);
		this.rating = rating;
	}
	
	public void displaySample2()
	{ 
		super.displaySample1();
		System.out.println("Rating : " + rating);
	}
	 	
}
public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1 s1 = new Sample1("xyz", 2.45f);
		s1.displaySample1();
		
		Sample2 sa2 = new Sample2("abc", 2.34f,"Best");
		sa2.displaySample2();
	}
}