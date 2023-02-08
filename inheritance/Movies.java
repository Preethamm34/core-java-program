package inheritance;

class Movies
{
	String name;
	String hero;
	float rating;
	double duration;
	
	
public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHero() {
		return hero;
	}


	public void setHero(String hero) {
		this.hero = hero;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public double getDuration() {
		return duration;
	}


	public void setDuration(double duration) {
		this.duration = duration;
	}


	public void display()
	{
	System.out.println("The movie name is : " + getName());
	System.out.println(getHero() + " Was the hero of the movie");
	System.out.println("IMDB Rating is : " + getRating() + "/10");
	System.out.println("The mobie duration is : " + getDuration() + "hours");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movies m1 = new Movies();
		m1.setName("TOP GUN");
		m1.setHero("Tom Cruise");
		m1.setRating(8.6f);
		m1.setDuration(2.30);
		m1.display();
		
		
		
		Movies m2 = new Movies();
		m2.setName("UNCHARTED");
		m2.setHero("Tom Holland");
		m2.setRating(6.4f);
		m2.setDuration(1.56);
		m2.display();
	}

}

