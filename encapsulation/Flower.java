package encapsulation;

class Lotus
{
	private String name;
	private String colour;
	private int pettels;
	private int leaves;
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPettels() {
		return pettels;
	}
	public void setPettels(int pettels) {
		this.pettels = pettels;
	}
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
public void display()
{
	System.out.println("Flower name is " +getName() + "\n it is "+ getColour() + "\n it has " + getPettels()+ " \n and " + getLeaves() + " leaves");
} 
}
public class Flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lotus f1 = new Lotus();
		f1.setName("Lotus");
		f1.setColour("Pink");
		f1.setPettels(18);
		f1.setLeaves(5);
		f1.display();
	}

}

