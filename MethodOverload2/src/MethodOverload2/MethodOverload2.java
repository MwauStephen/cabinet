//write a program that prompts the user to enter two numbers and siplays the maximum of the two numbers
package MethodOverload2;
import java.util.Scanner;
public class MethodOverload2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
//		System.out.println("Enter the first number:");
//		int number1=scanner.nextInt();
//		double numb1=scanner.nextDouble();
//		
		
//		System.out.println("Enter the second number:");
//		int number2=scanner.nextInt();
//		double numb2=scanner.nextDouble();
//		
		
//		System.out.println("Enter the third number:");
//		int number3=scanner.nextInt();
//		double numb3=scanner.nextDouble();
//		

		//statement with int parameters
		System.out.println("The maximum of 3 and 4"+" "+"is"+max(3,4));
		
		
		//statement with double parameters
		System.out.println("The maximum of 3.0 and 4.0"+" "+"is"+max(3.0,4.0));
		
		//statement with three double parameters
		System.out.println("The maximum of 3.0, 4.0 and 5.6"+" "+"is"+max(3.0,4.0,5.6));
	}
	
//create the method for int parameters
	public static int max(int num1,int num2) {
		if(num1<num2) 
			return num2;
		else
			return num1;
	}
	
	//create a method for double parameters
	public static double max(double num1,double num2) {
		if(num1<num2)
			return num2;
		else
			return num1;
	}
	
	//create a method for double with three parameters
	public static double max(double num1,double num2,double num3) {
		return max(max(num1,num2),num3);
	}

}
