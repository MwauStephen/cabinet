// write a program that prompts the user to enter three integers
//and displays the integers in non decreasing order
package Nondecreasing;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class NonDecreasingOrder {
	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first interger:");
		int number1=input.nextInt();
		System.out.println("Enter the second integer:");
		int number2=input.nextInt();
		System.out.println("Enter the third interger:");
		int number3=input.nextInt();
		
		Integer[]arr=new Integer[3];
		arr[0]=number1;
		arr[1]=number2;
		arr[2]=number3;
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("The number in decreasing order is:"+arr[0] + "" + arr[1] + "" + arr[2]);
		// TODO Auto-generated method stub

	}

}
