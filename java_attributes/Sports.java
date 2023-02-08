package java_attributes;

class IndoorGames
{
	String name1;
	int players1;
	
public void display1()
	{
	System.out.println( name1 + " : Is an Indoor Game ");
	System.out.println(" There are " + players1 + " players in this game");
	}
}
class OutdoorGames
{
	String name2;
	int players2;

public void display2()
	{
	System.out.println(name2 + " : Is an Outdoor Game ");
	System.out.println(" There are " + players2 + " players in this game");
	}
}

public class Sports
{
	public static void main (String[] args)
	{
	
	IndoorGames game1 = new IndoorGames();
	game1.name1 = "Table Tennis";
	game1.players1 = 2;
	game1.display1();
	System.out.println(" ");
	
	OutdoorGames game2 = new OutdoorGames(); 
	game2.name2 = "Foot ball";
	game2.players2 = 11;
	game2.display2();
	}
}