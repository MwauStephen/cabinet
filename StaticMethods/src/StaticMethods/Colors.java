package StaticMethods;

import java.util.List;

public class Colors {
	public String FirstColor;
	public String SecondColor;
	
	//create a getters method for First color
	public String getFirstColor() {
		return FirstColor;
	}
	//create a setter method for First color
	public void setFirstcolor(String Fc) {
		FirstColor=Fc;
	}
	
	//create getter methods for second color
    public String getSecondColor() {
    	return SecondColor;
    }
    //create a setter method for second color
    public void setSecondColor(String Sc) {
     SecondColor=Sc;
    }
    //create a getter method for color   fullname
    public String getFullName() {
    	return FirstColor+ " " + SecondColor;
    }
    public static void printColors(Colors c) {
    	System.out.println(c.getFullName());
    }
    //creates a list of color
    public static void printNames(List<Colors> color) {
    	for(Colors n:color) {
    	System.out.println(n.getFullName());
    }
    
} 
}