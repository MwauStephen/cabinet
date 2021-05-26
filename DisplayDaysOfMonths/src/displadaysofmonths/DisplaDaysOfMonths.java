//write a  java program that prompts 
//the user to enter the month and the year 
//and displays the number of days in that month
package displadaysofmonths;
import java.util.Scanner;
public class DisplaDaysOfMonths {
	public static void main(String[] args) {
		//create a scanner that enable or accepts users input
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the month number:");
		int month=input.nextInt();
		
		System.out.println("Enter the year:");
		int year=input.nextInt();
		
		
		//create the boolean variable for the leap year
		boolean leapYear=(year % 4 == 0 && year % 100 !== 0)||(year % 400==0);
	switch(month) {
	case 1:("January"+ year+"had 31days");break;
	case 2:("February"+ year + " had " + (leapYear)?"29 days":"28days");break
	case 3:("March" + year +" had 30days");break;
	case 4:("April"+ year + " had 31days");break;
	case 5:("May " + year + " had 30days");break;
	case 6:("June " + year + " had 31days ");break;
	case 7:("July" + year + " had 30days ");break;
	case 8:("August " + year +" had 31days ");break;
	case 9:("September "+year+"had 30days");break;
	case 10:("October " + year + " had 31days ");break;
	case 11:("November" + year + " had 30days ");break;
	case 12:("December" + year + " had 31days");
	// TODO Auto-generated method stub

	}

}
