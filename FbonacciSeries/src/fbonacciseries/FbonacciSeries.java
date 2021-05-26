//  in fibonnacci series,the next number is the sum of the previous two numbers
//write a program that prompts a user to enter a range of numbers and calculates its fibonacci series of numbers
package fbonacciseries;
import java.util.Scanner;
public class FbonacciSeries {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the range of numbers(count):");
		int count=input.nextInt();
		
		//initial values in a fibonacci  series are 0 and 1
		int number1=0;
		int number2=1;
		int number3;
		int i;
		
		//print the other values apart from 0 and 1 in the count variable
		
		for(i=2;i<count;++i) {
		
		number3=number1+number2;
		System.out.print(" "+number3);
		number1=number2;
		number2=number3;
		}
		
	
		
		
}
}
