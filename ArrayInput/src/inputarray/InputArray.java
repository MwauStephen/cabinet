package inputarray;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		int[] marks=new int[10];
	Scanner input=new Scanner(System.in);
	for(int i=0;i<10;i++) {
		System.out.println("Enter the array inputs:");
		int y=input.nextInt();
		marks[i]=y;
	}
System.out.println(Arrays.toString(marks));
	}

}
