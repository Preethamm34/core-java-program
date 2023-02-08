package java_Enums;

enum Level1
{
	LOW,
	MEDIUM,
	HIGH
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (Level1 myLevel : Level1.values())
		{
			System.out.println(myLevel);
		}
	}

}
