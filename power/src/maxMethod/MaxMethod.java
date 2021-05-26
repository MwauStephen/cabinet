//write a program that prompts the user to enter two numbers and finds the maximum of the two numbers
package maxMethod;
import java.util.Scanner;
public class MaxMethod {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int number1=scanner.nextInt();
		
		System.out.println("Enter the second number:");
		int number2=scanner.nextInt();
		
		int number3=max(number1,number2);
		System.out.println("The maximum of "+" "+number1+" "
				+ ""
				+ ""+"and"+" "+number2+" "+"is"+" "+ number3);
	}
		
		//create a method

	public static int max(int number1, int number2) {
		int result;
		if(number1<number2)
			result=number2;
		else
			result=number1;
		return result;
	}

}

