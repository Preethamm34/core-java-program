package java_attributes;

class Circle
{
String look;
String area;

public void display()
{
System.out.println("A circle looks like : " + look);
System.out.println("Formula to calculate area of circle is : " + area);
}
}

public class Shape
{
public static void main (String[] args)
{
Circle circle1 = new Circle();
circle1.look = "Round";
circle1.area = "3.14 * R^2/4";
circle1.display();
}
}