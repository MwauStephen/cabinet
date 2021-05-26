//write a program that accepts a string input from the user and determine if
//the entered string is a palindrome or not(a palindrome string is a string that 
//reads the same from right to left and left to right)
package Ispalindrome;
import java.util.Scanner;
public class IsPalindrome {
	public static void main(String[] args) {
		String word, reverse="";
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=input.nextLine();
		
		int length=s.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println("Entered string is a palindrome:");
		}
		else {
			System.out.println("Entered string isnt a palindrome:");
		}
		// TODO Auto-generated method stub

	}

}
