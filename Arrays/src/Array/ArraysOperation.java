package Array;

import java.util.Arrays;

public class ArraysOperation {

	public static void main(String[] args) {
		int[] grades=new int[10];
		grades[0]=100;
		int [] marks= {1,2,3,4,5,6,7,8,9};
		//upgrade the contents of the array
		 marks[1]=100;
		 int[] [] marks2= {{1,2,3,4},{5,6,7,8}};
		System.out.println(marks[8]);
		System.out.println(grades[0]);
		//to out the entire array use the following method
		System.out.println(Arrays.toString(marks));
		
		//to output a deep array that is an array of arrays use this method
		System.out.println(Arrays.deepToString(marks2));
	}

}
