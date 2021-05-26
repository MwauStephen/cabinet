package scorevalue;
import java.util.Scanner;
public class ScoreValue {
// write a program that prompts the user to enter a score and grades their scores accordingly(A-F)
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your score:");
		double score=input.nextInt();
		
		if(score>=90.0) 
			System.out.println("You scored an A");
		else if(score>=80.0)
			System.out.println("You scored a B");
		else if(score>=70.0)
			System.out.println("You scored a C");
		
		else if(score>=60.0)
			System.out.println("You scored a D");
		else
			System.out.println("You scored an FFF,retake the whole course dammy ):");
		
		
		

	}

}
