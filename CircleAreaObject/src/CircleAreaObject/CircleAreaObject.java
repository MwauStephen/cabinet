package CircleAreaObject;

public class CircleAreaObject {

	public static void main(String[] args) {
		
	//create the first circle
	Circle c1=new Circle();
	c1.setRadius(30);
	
	//create the second circle object
	Circle c2=new Circle();
	c2.setRadius(125);
	
	//create the third circle object
	Circle c3=new Circle();
	c3.setRadius(100);
	
	
	System.out.println("The area of the circle c1:"+""+c1.getArea());
	System.out.println("The area of the circle is c2:"+""+c2.getArea());
	System.out.println("The area of the circle is c3:"+" "+c3.getArea());

	}

}
