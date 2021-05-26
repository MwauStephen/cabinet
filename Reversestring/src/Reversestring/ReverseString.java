package Reversestring;
import java.util.Scanner;
public class ReverseString {
 private static final String s = null;
@SuppressWarnings("resource")
public static String reverseString() {
//create a scanner
	 
	 
	 
	//converting the string into the character array
	 char[] w=s.toCharArray();
	 @SuppressWarnings("unused")
	String reverse="";
	 // a for loop to reverse a string
	 for(int i=w.length-1;i>=0;i--) {
		 reverse+=w[i];
	 }
	 return reverseString();
 }
 @SuppressWarnings("resource")
public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter the string:");
	 String s=input.nextLine();
	 System.out.println(reverseString());
 
 }
}
 





