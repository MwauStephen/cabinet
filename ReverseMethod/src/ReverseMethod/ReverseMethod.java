//write a program that prompts the user to enter a number and displays the number in reverse order
package ReverseMethod;
import java.util.Scanner;
public class ReverseMethod {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter a number:");
	int number=input.nextInt();
	int reverse = 0;

	while(number!=0) {
		
		int remainder=0;
		 remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
	}
	System.out.println("The reverse of the entered number is:"+" "+reverse);
	
	
	}
}
