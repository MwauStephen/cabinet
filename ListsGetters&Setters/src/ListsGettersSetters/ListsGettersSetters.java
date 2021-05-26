package ListsGettersSetters;

import java.util.ArrayList;
import java.util.List;

public class ListsGettersSetters {

	public static void main(String[] args) {
		//object 1 in  the list  with an index of 0
		UserName identity= new UserName();//an object(instance of a class)
		identity.setFirstName("kYLE");
		identity.setSecondName("STEVENS");
		
		//object 2 in the list with an index of 1
		UserName me=new UserName();
		me.setFirstName("Alex");
		me.setSecondName("Karanja");
 
		//create a new arrayList of class UserName(the object)
		List<UserName> id=new ArrayList<UserName>();
		
		//add items to the list
		id.add(identity);
		id.add(me);
		
		//outputs the first and second name of identity object
		System.out.println(id.get(0).getFirstName());
		System.out.println(id.get(0).getSecondName());
		
		//outputs the fullname of me object
		System.out.println(me.getFullName());
		
		System.out.println();
		

	}

}
