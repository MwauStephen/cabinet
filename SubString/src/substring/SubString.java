//write a program that prompts the user to enter two strings and
//reports whether the first string is a substring of the first string
package substring;
import java.util.Scanner;
public class SubString {
	public static void main(String[] args) {
		//create a scanner for user input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String s1=input.nextLine();
		System.out.println("Enter the second string:");
		String s2=input.nextLine();
		
		
		//use an if statement to determine if s2 is a substring of s1
		if(s1.indexOf(s2)!=-1) {//returns the position of the specified characters in a strings
			System.out.println("s2 is a substring of s1.");
		}
		else {
			System.out.println("s2 is not a substring of s1.");
		}
		// TODO Auto-generated method stub

	}

}
