//write a program that prompts the user to enter a three digit integer and determines whether it is a palindrome number.
//A number is palindrome if it reads the same from right to left and from left to right
package ispalindrome3;
import java.util.Scanner;
public class IsPalindrome3 {
	public static void main(String[] args) {
		//create a scanner for user input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a three digit number:");
		int number1=input.nextInt();
		int temp_remaining=0;
		
		int d1=number1%10;
		temp_remaining=number1/10;
		int d2=temp_remaining%10;
		int d3=temp_remaining/10;
		
		String rev=Integer.toString(d3)+Integer.toString(d2)+Integer.toString(d1);
		String original=Integer.toString(number1);
		
		if(rev.equals (original)) {
			System.out.println(original+" "+"is a palindrome");
		}
		else {
			System.out.println(original+" "+"is not palindrome");
		}
		// TODO Auto-generated method stub

	}

}
