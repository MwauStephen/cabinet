//write a program that lets the user to guess 
//whether to flip a coin results in heads or tails
//the program randomly generates an integer 0 or 1which represents a head or a tail
// the program prompts the user to enter a 
//guess and reports whether the guess is correct or incorrect
package flipcoin;
import java.util.Random;
import java.util.Scanner;
public class FlipCoin {
	public static void main (String[] args) {
		// CREATE THE RANDOM GUESS
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		int coin_flip=random.nextInt(2);//generates the number between 1 and 0
		
		System.out.print("coin flip.Enter 1 for heads and 0 for tails:");//determines the action
		//to be  performed by the if statement
		int guess=input.nextInt();
		
		if(guess==coin_flip) {
			System.out.println("You are correct.");
	    	}
		else {
			System.out.println("You are incorrect try again.");
		}
	    }
	}