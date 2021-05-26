//write s program that promts the user to enter a number,if the number is divisible by
//5 it displays Fuzz and if its divisible by 3 displays Buzz and 
//if its divisible by both displays FizzBuzz
package FizzBuzz;
import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
		
		//create a scanner for user input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();
		
		
		 if(number%5==0 &&number%3==0) {
			System.out.println("FIzzBuzz");
		}
		 else if(number%5==0) {
			System.out.println("FIzz");
		}
		else if(number%3==0) {
			System.out.println("Buzz");
		}
			
			else {
				System.out.println(number);
			}
		}

	}
//D-dont 
//R-repeat
//Y-yourself
