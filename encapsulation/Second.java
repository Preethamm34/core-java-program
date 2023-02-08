package encapsulation;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTriangle1 t1 = new TestTriangle1 ();
		t1.setObjectName("Triangle");
		t1.setColour("Red");
		t1.setLength(5);
		t1.setBreadth(10);
		t1.displayArea();
		System.out.println("Area of triangle : " +t1.calculateArea() + "sqm");
		
		triangle1 t2 = new triangle1();
		t2.setHeight(5);
		t2.setLength(5);
		t2.setBreadth(10);
		t2.display();
		System.out.println("Volume of triangle : " + t2.calculateVolume() + " cum");
	}

}
