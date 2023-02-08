package java_LinkedList;

import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> cars = new LinkedList <String>();
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
		
		//cars.clear();
		//cars.remove(0);
		for (int i=0; i<=cars.size(); i++)
		{
			System.out.println(cars.get(i));
		}
		for (String i : cars)
		{
			System.out.println(i);
		}
		System.out.println(cars);
		System.out.println(cars.size());
	}
	}

