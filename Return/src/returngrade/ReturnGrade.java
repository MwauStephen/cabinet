package returngrade;

import java.util.Scanner;

public class ReturnGrade {
	public static void main(String[] args) {
		System.out.print("The grade is " + getGrade(78.5));
		System.out.print("\nThe grade is " + getGrade(59.5));
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a your grade:");
		int grade=input.nextInt();
		System.out.println("The grade is:"+""+getGrade(grade));
		
	}
	 public static char getGrade(double score) {
		if(score>=90.0) {
			return 'A';
		}
		else if (score>=80.0) {
			return 'B';
		}
		else if (score>=70.0) {
			return 'C';
		
		}
		else if (score>=60.0) {
			return 'D';
		}
		else
			return 'F';
	}
	

}
//to use a  method you must declare it outside the main class but within the class
//access modifiers must be used when declaring methods!important(static keyword)
//  if a method that is not a void must return a value