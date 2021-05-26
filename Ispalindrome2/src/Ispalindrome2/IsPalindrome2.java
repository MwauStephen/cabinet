// write a program that prompts the user to enter a three digit integer
//and determine if its a palindrome or not
package Ispalindrome2;
import java.util.Scanner;
public class IsPalindrome2 {
 public static void main (String[] args) {
	 
	 //Create a scanner to accept the input from the user
	 Scanner input=new Scanner(System.in);
	 
	 System.out.println("Enter the three digit interger:");
	 int number=input.nextInt();
	 int temp_remaining=0;
	 
	 int d1=number%10;
	 temp_remaining=number/10;
	 int d2=temp_remaining%10;
	 int d3=temp_remaining%10;
	 
	 String reverse=Integer.toString(d3)+Integer.toString(d2)+Integer.toString(d1);
	 String real=Integer.toString(number);
	 if(reverse.contentEquals(real)) {
		 System.out.println( real+ " is palindrome");
	 }
	 else {
		 System.out.println( real + " is not a palindrome");
	 }
 }
}
