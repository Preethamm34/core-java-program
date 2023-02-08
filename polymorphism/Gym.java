package polymorphism;

class Exercise 
{
	public void workout()
	{
		System.out.println("Exercise for the healthy life are as follows ");
	}
}
class pullups extends Exercise
{
	public void workout()
	{
		System.out.println("Pullupd 3 sets of 10 repitaions");
	}
}
class pushup extends Exercise
{
	public void workout()
	{
		System.out.println("Pushups 3 sets of 10 repitations");
	}
}
class squats extends Exercise
{
	public void workout()
	{
		System.out.println("Squats 4 sets of 10 repitations");
	}
}
public class Gym {

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		Exercise ex1 = new Exercise();
		Exercise myPushup = new pullups();
		Exercise myPullups = new pushup();
		Exercise mySquats = new squats();
		
		ex1.workout();
		myPushup.workout();
		myPullups.workout();
		mySquats.workout();
	}

}

