package constructors;


class Example1
{
	String games;
	int players;
	
	
	Example1 (String games, int players) {
		
		this.games = games;
		this.players = players;
	}

	public void display()
	{
		System.out.println(games + " and it has " + players +" numbers of players");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example1 game = new Example1("cricket",11);
		game.display();
	}
	

}
