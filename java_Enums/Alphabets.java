package java_Enums;

enum Letters
{
	P,R,E,T,H,A,M
}

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (Letters myLet : Letters.values())
		{
			System.out.println(myLet);
		}
	}

}
