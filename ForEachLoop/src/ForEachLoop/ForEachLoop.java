package ForEachLoop;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		String[] fruits= {"Mango","Apple","Orange"};
		
		//use a for each loop
		
	  for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
//reverse order using for loop
		for(int i=fruits.length; i>0; i--) {
			System.out.println(fruits[i]);
		}
		System.out.println(fruits.length);
	}

}
//for loops have a limitation 
//->Its always forward you can't iterate an array or a condition from the end to beginning
//we don't have access to the individual indexes