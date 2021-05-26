package Nondecreasing;
import java.util.Scanner;
public class NonDecreasingOrder2 {
	public static void main(String[] args) {
	int temp=0;//swaps the numbers/used to pass through the three integers
		//create a scanner
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int number1=input.nextInt();
		System.out.println("Enter the second integer:");
		int number2=input.nextInt();
		if(number1<number2) {
			temp=number1;
			number1=number2;
			number2=temp;
		}
		System.out.println("Enter the third integer:");
		int number3=input.nextInt();
		if(number3>number2) {
			if(number3>number1)
				temp=number3;
			number3=number2;
			number2=number1;
			number1=temp;
		}
		else {
			temp=number3;
			number3=number2;
			number2=temp;
		}
		
		System.out.println("decreasing order:"+ number1 + " " + number2 + " " + number3);
		// TODO Auto-generated method stub

	}

}
