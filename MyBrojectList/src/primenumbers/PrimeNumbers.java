//write a java program that prompts the user to enter 
//a number and determines whether its a prime number or not
package primenumbers;
import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();//prompts the user to enter the number
		 int temp;
		 boolean isPrime=true;//tests if the number is prime or not
		 for(int i=2;i<=number/2;i++) { //divides the number by 2 to determine if the number is prime because 2 is the only even prime number which
			 //means that any other number divisible by 2 is not a prime number
			 temp=number%i;
			 if(temp==0) {      //checks whether the number is divided by two which will render it a non prime number
				 isPrime=false;
				 break;
			 }
		 }
		 //if prime is true then the number is prime else its not
		 if(isPrime) {
			 System.out.println(number+" " +"is a prime number");
		 }
		 else {
			 System.out.println(number+" "+"is not a prime number");
		 }
	}
}
