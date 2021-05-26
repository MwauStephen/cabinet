package arraytwodimension;

import java.util.Arrays;

public class ArrayTwoDimension {

	public static void main(String[] args) {
		int [] [] numbers= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
				};
		System.out.println("The number  is:"+numbers[0][1]);
		System.out.println(Arrays.deepToString(numbers));
		System.out.println("The size of the array is:"+" "+numbers.length);
		
		//outputs the length of rows
		System.out.println("The length of the second row:"+" "+numbers[1].length);
		
		//loop iteration for 2D i(rows),k(columns)
		for(int row=0;row<numbers.length;row++) {
			for(int k=0;k<numbers[row].length;k++) {
				System.out.print(numbers[row][k]+" ");
			}
			System.out.println();
		}
	}

}
