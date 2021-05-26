package lessons;

public class Cube {
	int length;
	int height;
	int width;
	
	//first method 
	public int getCubevolume() {
		return (length*height*width);
	}
	
	//second method
	
	//default constructor
	Cube(){
		 int length=10;
		 int height=20;
		 int width=20;
	}
	//constructor overload or custom constructor
	Cube(int l,int h,int w){
		length=l;
		height=h;
		width=w;
	}
}
