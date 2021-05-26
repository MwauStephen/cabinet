package Circlearea;

public class SimpleCircle {
	double radius;
	
	//construct a circle with radius 1
	SimpleCircle(){
		radius=1;
	}
	
	//construct a circle with a specified radius
	SimpleCircle(double newRadius){
		radius=newRadius;
	}
	
	//returns the area of the circle
	double getArea() {
		return radius*radius*Math.PI;
	}
	//returns the perimeter of the circle
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	// set a new radius for this circle
	void setRadius(double newRadius) {
		radius=newRadius;
	}

}
