package attributes;

class Sports
{
		String game;
		int players;

		public void display()
		{
			System.out.println("The sports name is " + game + " it has " + players + " numbers of players");
		}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sports g1 = new Sports();
		g1.game = "Foot ball";
		g1.players = 11;
		g1.display();
	}

}
