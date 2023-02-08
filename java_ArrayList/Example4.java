package java_ArrayList;

import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> cars = new ArrayList<String>();
		cars.add("VOLVO");
		cars.add("BENZ");
		cars.add("BMW");
		cars.add("AUDI");
		cars.set(0, "AUDI");
		
		System.out.println(cars);
	}

}

// CHANGE AN ITEM //