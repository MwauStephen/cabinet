package ArrayListString;

import java.util.ArrayList;
import java.util.List;

public class ArrayListString {

	public static void main(String[] args) {
		String [] firstName= {"Alex","Kyle","Makau"};
		String [] secondName= {"Karanja","Stevens","Benson"};
		
		List<Names>name=new  ArrayList<Names>();
		for(int i=0;i<firstName.length;i++) {
			Names n=new Names();
			n.setfirstName(firstName[i]);
			n.setsecondName(secondName[i]);
			
			//add them to the list
			name.add(n);
		}
		for(Names n:name) {
			System.out.println(n.getFullName());
		}
		
	}

}
