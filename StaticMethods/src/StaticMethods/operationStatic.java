package StaticMethods;

import java.util.ArrayList;
import java.util.List;

//creating a static method
public class operationStatic {

	public static void main(String[] args) {
		//object 1
	Colors c=new Colors();//an object
	c.setFirstcolor("Red");
	c.setSecondColor("Blue");
	
	//object 2
	Colors l=new Colors();//an object
	l.setFirstcolor("Green");
	l.setSecondColor("Purple");
	
	//create the arrayList
	List<Colors> color=new ArrayList<Colors>();
	
	//add the elements to the list
	color.add(c);
	color.add(l);

//call the method list  through its class since its a static method
	Colors.printNames(color);
	
	
	/*static method 
	Colors.printColors(c);*/
	
	}

}
// we don't have to create an object for static methods(we call them in a class using the class name directly) 
//static methods are declared outside the main method 
//static methods belong to a class instead of a specific instance of a class
//static methods are called by the name of the class directly without creating objects
//static methods can be shared//accessed by the other objects 
