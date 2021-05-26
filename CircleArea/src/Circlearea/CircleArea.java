package Circlearea;

public class CircleArea {

	public static void main(String[] args) {
		//create a circle with radius 1
		SimpleCircle circle1=new SimpleCircle();
		System.out.println("The area of the circle of radius"+circle1.radius+"is"+ 
		circle1.getArea());
		//create a circle with radius 25
		SimpleCircle circle2=new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle2.radius + " is " +
		circle2.getArea());
		//create a circle with radius 125
		SimpleCircle circle3=new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle3.radius + " is " +
		circle3.getArea());
		
		//modify circle radius
		circle2.radius=100;//circle.setRadius(100) 
		System.out.println("The  area of the circle of radius " + circle2.radius +" is " +
		circle2.getArea());
		// TODO Auto-generated method stub

	}

}
