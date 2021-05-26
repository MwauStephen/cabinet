package ArrayForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		 
		//creating a list of list
		List<List<Integer>>grades= new ArrayList<List<Integer>>();
		grades.add(Arrays.asList(1,2,3,4,5));
		grades.add(Arrays.asList(1,2,3,4,5,6,7));
		grades.add(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		for(List<Integer>grade:grades) {
			for(List<Integer> grade1:grades) {
				System.out.println(grade1+" ");
			}
			//System.out.println(grades.size());
			System.out.println();
		}
		
		
		//The for each loop
		for(int num:numbers) {
			System.out.println(num);
		}

	}

}
//syntax for the for each loop
//for(name of the variable:name of the list)