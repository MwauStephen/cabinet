package Guessnumber;
import java.util.Scanner;
public class GuessNumber {
	public static void main(String[] args) {
		int number= (int)(Math.random()*101);
		Scanner input=new Scanner(System.in);
		System.out.println("Guess a number between 0 to 100:");
		int guess=-1;
		while(guess!=number) {
			//prompt the user to enter their guess
			System.out.println("Enter your guess:");
			int guess1=input.nextInt();
			
			if(guess1==number) {
				System.out.println("You guessed right,the number is"+ number);
				
			}
			else if(guess1>number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}

		
		
	}

}
