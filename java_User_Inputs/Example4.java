package java_User_Inputs;

import java.util.Scanner;
import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter realName, nickName, company, designation");
		
		String realName = myObj.next();
		String nickName = myObj.next();
		String company = myObj.next();
		String designation = myObj.next();
			
		System.out.println("His name is " + realName);
		System.out.println("We call him " + nickName);
		System.out.println("He is working in " + company);
		System.out.println("As " + designation);
	}

}
