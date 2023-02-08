package java_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> cars = new ArrayList<String>();
		cars.add("VOLVO");
		cars.add("BENZ");
		cars.add("BMW");
		cars.add("AUDI");
		cars.add("SUZUKI");
		cars.add("OPEL");
		cars.add("DORGE");
		cars.add("FERRARI");
		cars.add("FIET");
		cars.add("VOLKSWAGON");
		
		Collections.sort(cars);
		
		for (String i : cars)
		{
		System.out.println(i);
	}
	}

}
