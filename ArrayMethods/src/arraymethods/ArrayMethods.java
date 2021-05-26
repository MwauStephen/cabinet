package arraymethods;

import java.util.Arrays;
import java.util.ArrayList;
public class ArrayMethods {

	public static void main(String[] args) {
		int[] grades1= {1,2,3,4,5};
		
		int [] grades2= grades1;
		String [] names =new String[5];
		
		System.out.println(grades1+" "+grades2);
		
		if(Arrays.equals(grades1,grades2)) {
			System.out.println("They are equal");
			System.out.println(Arrays.toString(grades1));
		}
		
		//fill replaces the elements in an array
		Arrays.fill(grades1, 100);
		System.out.println(Arrays.toString(grades1));
		System.out.println(Arrays.toString(names));
	}

}
