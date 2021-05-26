package GetterSetterloop;

import java.util.ArrayList;
import java.util.List;

public class GetterSetterLoop {

	public static void main(String[] args) {
		//create a array of names
		String[] FirstNames= {"Alex","Benson","Kyle"};
		String[] SecondNames= {"Karanja","Makau","Stevens"};
		
		//create a list of the class named Names
		List<Names> id=new ArrayList<Names>();
		
		//loop through the string object
		for(int i=0;i<FirstNames.length;i++) {
			Names N=new Names();//an object
			N.setFirstName(FirstNames[i]);
			N.setSecondName(SecondNames[i]);
			
			//add the names to the list named id
			id.add(N);
		}
		//display the FULLNAMES FOR THE list
		for(Names N:id){
		System.out.println(N.getFullName());
	}
		GetterSetterLoop g=new GetterSetterLoop();
		g.printNames(id.get(0));
		System.out.println();
	}
	


		//passing a custom type as an argument
 	public void printNames(Names N) {
			System.out.println("AM out of the main method:"+" "+N.getFullName());
			
		}

}
//main methods are only accessible inside the main class.
