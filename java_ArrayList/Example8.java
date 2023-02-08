package java_ArrayList;

import java.util.ArrayList;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> cars = new ArrayList<String>();
		cars.add("jeep");
		cars.add("breza");
		cars.add("omne");
		
		ArrayList <String> bikes = new ArrayList <String>();
		bikes.add("classic 350");
		bikes.add("jawa 42");
		bikes.add("pulser 220");
		
		cars.addAll(bikes);
		
		System.out.println(cars);
		
		
	}

}
