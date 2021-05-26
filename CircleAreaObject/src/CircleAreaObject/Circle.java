package CircleAreaObject;

public class Circle {
	public double radius;
	public double area=radius*radius*3.14159;
	
	//create getter methods for radius
	public double getRadius() {
		return radius;
	}
	
	//create setter methods for radius
	public void setRadius(double radi) {
		radius=radi;
	}
	
	public double getArea() {
		return radius*radius*3.14159;
	}

	public void setArea(double a) {
		 area=a;
	}
}