//write a program that prompts the user to enter 
//a year and displays it if its a leap year or not
package leapyear;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
	//create a scanner to accepts input from the user
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=input.nextInt();
		
		boolean isleapYear=(year%4==0&&year%100!=0)||(year% 400==0);
		System.out.println(year + " is a leap  year?" + isleapYear);
		}
		// TODO Auto-generated method stub

	}
