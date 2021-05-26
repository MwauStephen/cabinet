//write a program using  a method to prompt the user to enter a 
// 3 number and sorts them in a decreasing order
package Sort2;
import java.util.Scanner;
public class Sort2 {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int num1=input.nextInt();
		
		System.out.println("Enter the second number:");
		int num2=input.nextInt();
		
		System.out.println("Enter the third number:");
		int num3=input.nextInt();
		
		int sortNumbers;
		System.out.println("The sorted numbers are "+ num1 + " " + num2 + " " + num3);


	}
	public static int sortNumber(int number1,int number2,int number3) {
		if(number1>number2) {
			int temp=number1;
			number1=number2;
			number2=temp;
		}
		if(number2>number3) {
			int temp=number2;
			number2=number3;
			number3=temp;
		}
		if(number1>number3) {
			int temp=number1;
			number1=number2;
			number2=temp;
		}
		return sortNumber(0,0,0);
		

	}

}
