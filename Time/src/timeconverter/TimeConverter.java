package timeconverter;
import java.util.Scanner;
public class TimeConverter {
	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the amount of days: ");
		int days=input.nextInt();
		int result=days*24*60*60;
		System.out.println(days + " days are "+  result  +   "seconds");
		// TODO Auto-generated method stub

	}

}
