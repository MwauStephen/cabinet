//write a program that prompts the user to enter the year and first day of the year 
//and displays the first day of each month in the year
package displaydaymonthyear;
import java.util.Scanner;
public class DisplayDayMonthYear {
public static void main(String[] args) {
	//create a scanner for user input
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the year:");
	int year=input.nextInt();
	System.out.println("Enter the first day of the year:");
	int firstDay=input.nextInt();
	
	int numberOfDaysInMonth=0;
	String firstDayString="";
	//display the calendar for each month
	for(int month=1; month<=12 ; month++) {
		//display calendar title
		
		switch(month) {
		case 1:System.out.println("January 1,"+year+" "+"is");
		numberOfDaysInMonth=31;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 2:System.out.println("February 1,"+year+" "+"is");
		if(year%400==0 || (year%4==0&&year%100!=0))
		numberOfDaysInMonth=29;
		else
			numberOfDaysInMonth=28;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 3:System.out.println("March 1"+year+" "+"is");
		numberOfDaysInMonth=31;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 4:System.out.println("April 1,"+year+" "+"is");
		numberOfDaysInMonth=30;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 5:System.out.println("May 1,"+year+" "+"is");
		numberOfDaysInMonth=31;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 6:System.out.println("June 1,"+year+" "+"is");
		numberOfDaysInMonth=30;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 7:System.out.println("July 1,"+year+" "+"is");
		numberOfDaysInMonth=31;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 8:System.out.println("August 1,"+ year + " "+"is");
		numberOfDaysInMonth=31;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 9:System.out.println("September 1," + year +" "+"is");
		numberOfDaysInMonth=30;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 10:System.out.println("October 1,"+ year + " "+"is");
		numberOfDaysInMonth=31;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 11:System.out.println("November 1,"+ year + " "+"is");
		numberOfDaysInMonth=30;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
		break;
		
		case 12:System.out.println("December 1," + year +" " + "is");
		numberOfDaysInMonth=31;
		firstDayString=firstDay(firstDay);
		System.out.println(firstDayString);
	     break;
		}
		
		//get the start day for the next month
		firstDay=(firstDay+numberOfDaysInMonth)%7;
	
}
}
public static String firstDay(int firstDay) {
	String firstDayString="";
	
	switch(firstDay) {
	case 0:firstDayString="Sunday";break;
	case 1:firstDayString="Monday";break;
	case 2:firstDayString="Tuesday";break;
	case 3:firstDayString="Wenesday";break;
	case 4:firstDayString="Thursday";break;
	case 5:firstDayString="Friday";break;
	case 6:firstDayString="Saturday";break;
	}
	return firstDayString;
}
}
