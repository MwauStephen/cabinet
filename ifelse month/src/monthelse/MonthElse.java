package monthelse;
import java.util.Scanner;

public class MonthElse {
	public static void main(String[]args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		String[]months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.print("Enter a number (1 to 12 ):");
		int monthNuber=input.nextInt();
		int monthNumber = 0;
		
		System.out.println("The month is " + months[monthNumber-1]);
	}

}
