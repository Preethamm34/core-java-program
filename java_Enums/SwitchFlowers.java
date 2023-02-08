package java_Enums;

import java_Enums.Example2.Flower;

enum Flowers1
{
	ROSE,
	LILY,
	LOTUS
}

public class SwitchFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flower f1 = Flower.LILY;
		
		switch(f1)
		{
		case ROSE :
			System.out.println("Rose is red in colour");
			break;
			
		case LILY :
			System.out.println("Lily White in colour");
			break;
		
		case LOTUS :
			System.out.println("Lotus is Pink in colour");
			break;
		}
	}

}
