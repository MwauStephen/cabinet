package simpleinterest;
import java.util.Scanner;
public class SimpleInterrest {
	public static void main(String[] args) {
		//create a scanner 
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the pricipal: ");
		int principal=input.nextInt();
		System.out.print("Enter the rate:");
		double rate=input.nextDouble();
		System.out.print("Enter the time: ");
		int time=input.nextInt();
		
		double SimpleInterest = principal*rate*time;
		System.out.println("The simple interest for " + principal + " is " + SimpleInterest);
		// TODO Auto-generated method stub

	}

}
