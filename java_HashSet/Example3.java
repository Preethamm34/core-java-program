package java_HashSet;

import java.util.HashSet;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <Integer> numb = new HashSet <Integer>();
		
		numb.add(0);
		numb.add(9);
		numb.add(6);
		numb.add(3);
		numb.add(2);
		numb.add(5);
		
		
		for (int i=0; i<=10; i++)
			if (numb.contains(i)) 
			{
				System.out.println(i + " was found in the set");
			}
			else
			{
				System.out.println(i + " was not found in the set");
			}
	System.out.println(numb.contains(10));
	}

}
