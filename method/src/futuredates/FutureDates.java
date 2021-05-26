package futuredates;

import java.util.Scanner;

public class FutureDates {
	static String day;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("enter a  number of the day");
		int one= input.nextInt();
		System.out.println("enter number of future day");
		int two= input.nextInt();
		switch (one) {
		case 1:
			day ="sunday";
			
			break;
		case 2:
			day ="monday";
		break;
		case 3 :
			day ="tuesday";
		break;
		case 4:
			day ="wednesday";
		break;
		case 5:
			day ="thursday";
		break;
		case 6:
			day ="friday";
		break;
		case 7:
			day ="saturday";
		break;

		default:
			break;
		}
		
//		
//		String[]days= {"sunday","monday","tuesday","wednesday","thurday","friday","saturday"};
//		
//		String day1=days[one];
//		int three=one+two;
//		String day2= days[three];
//		System.out.println("the day is "+day1+" after "+two+" days it will be "+day2);
		
		
		System.out.println("day is "+day);

	}

}
