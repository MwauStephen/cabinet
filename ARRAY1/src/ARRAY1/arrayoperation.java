package ARRAY1;

import java.util.Arrays;


public class arrayoperation {

	public static void main(String[] args) {
		int [] numbers=new int[5];
		
		int[] number= {1,5,3,4,1,2};
		
		int [][]points=new int[2][3];
		int[][] points1= {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.deepToString(points));
		System.out.println(Arrays.deepToString(points1));
		
	}

}

//to print a single dimension array use the Arrays.toString()
//to print a two or more dimensional arrays use the Arrays.Todeep()