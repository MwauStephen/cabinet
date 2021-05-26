package inputarraysize;

import java.util.Arrays;
import java.util.Scanner;

public class InputArraySize {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=input.nextInt();
		int[] grades=new int[size];
		
		//iterates through the array
		for(int i=0;i<size;i++) {
			System.out.println("Enter the array values:");
			int x=input.nextInt();
			grades[i]=x;
		}
System.out.println(Arrays.toString(grades));

	}

}
