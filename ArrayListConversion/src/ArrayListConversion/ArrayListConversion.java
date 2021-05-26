package ArrayListConversion;

import java.util.Arrays;
import java.util.List;

public class ArrayListConversion {

	public static void main(String[] args) {
		//a list initialization and declaration
	List<Integer> allnumbers=Arrays.asList(3,5,6,7);
	
	//create an array and assign the list to the array
    int [] numbers=new int[allnumbers.size()];
    
    //iterate through the list assignung each element to the array
    
    for(int i=0; i<allnumbers.size();i++) {
    	numbers[i]=allnumbers.get(i);
    }
    System.out.println("The lenght of the array is:"+numbers.length);
    System.out.println("The array after conversion  from a list is:"+" "+Arrays.toString(numbers));
	}

}
