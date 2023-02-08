package methodOverloading;

class Addition
{
	public int add( int a, int b, int c)
	{
		return a+b+c;
	}
	public float add(float x, float y, float z)
	{
		return x+y+z;
	}
}
public class Exampe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a1 = new Addition();
		System.out.println(a1.add(10, 20, 30));
		System.out.println(a1.add(2.99f, 20.56f, 39.78f));
	}

}
