package MethodOverload;

import java.util.ArrayList;
import java.util.List;

public class MethodOverload {

	public static void main(String[] args) {
		//first object
   Character name=new Character();//an object
   name.setFirstName("kyle");
   name.setSecondName("Stevens");
  
   //second object
   Character vue=new Character();
   vue.setFirstName("Felicity");
   vue.setSecondName("Smoak");
   
   //create a list
   List<Character> id=new ArrayList<Character>();
   id.add(name);
   id.add(vue);
   
   //call the method list
  // Character.printNames(id); 
 /*System.out.println(vue.Output());
   System.out.println(name.Output(true));
   System.out.println(name.Output(false));
	System.out.println(Character.searchList(id,"Felicity","Smoak"));*/
   System.out.println(vue);
	}

}
