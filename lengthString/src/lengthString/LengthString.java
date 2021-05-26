//  Write a program that prompts the user to enter a string  
//and displays its length and its first character
package lengthString;
import java.util.Scanner;
public class LengthString {
	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=input.nextLine();
		System.out.println("The length of the string is " + s.length() + " and the first character is=" + s.charAt(0));
		// TODO Auto-generated method stub

	}

}
