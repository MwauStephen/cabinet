package futuredate2;
import java.util.Scanner;
public class futuredate {
	static String day;
	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
	System.out.print("Enter todays day: ");
	int a=input.nextInt();
	System.out.print("Enter the number of days elapsed after today:");
	int b=input.nextInt();
	
	//create a string
	String[] days= {"Sunday", "Monday" ,"Tuesday", "Wenesday", "Thursday", "Friday", "Saturday"};
	String day1=days[a];
	int c= a + b;
	String day2=days[c];
	System.out.println("Today is " + day1 + " and the future day is " + day2 );
	}
	}
