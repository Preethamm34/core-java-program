package java_HashMap;

import java.util.HashMap;

public class Example1 {

	public void display()
	{
		System.out.println("  ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <String,String> capitalCities = new HashMap <String,String> ();
		
		capitalCities.put("India", "Delhi");
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.put("USA", "Washington DC");
	    
	   
	    for (String i : capitalCities.keySet())
	    {
	        System.out.println(i + "=" +  capitalCities.get(i));
	    }
	    Example1 d1 = new Example1();
	    d1.display();
	    System.out.println(capitalCities);
	    d1.display();
	    System.out.println(capitalCities.get("India"));
	    d1.display();
	    System.out.println(capitalCities.size());
}
}
