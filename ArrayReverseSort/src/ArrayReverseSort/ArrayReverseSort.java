package ArrayReverseSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverseSort {

	public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(6,2,4,5,3,1);
	
	//sort the list
	Collections.sort(numbers);
    for(int num:numbers) {
    	System.out.print( " "+num);
    }
	//reverse the list
   Collections.reverse(numbers);
   for(int num:numbers) {
   	System.out.print(" "+num);
   }
	}

}
