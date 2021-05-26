package arraylistpring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPrint {

	public static void main(String[] args) {
		List<Integer> grades=new ArrayList<Integer>();
		
		//initializes values /components to arraylist
		List<Integer> numbers =Arrays.asList(1,2,3,4 );
		
		for(int i=0;i<numbers.size();i++) {
			//prints the entire list
			System.out.println(numbers.get(i));
			
			//multiplies each number in the list by 20
			numbers.set(i, numbers.get(i)*20);
			
			//displays the list after multiplication
			System.out.println(numbers.get(i));
		}
		
		//print the arraylist(need to convert it to an array)
		System.out.println(Arrays.toString(numbers.toArray()));

	}

}
