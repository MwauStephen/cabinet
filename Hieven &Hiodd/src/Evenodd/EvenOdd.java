package Evenodd;
import java.awt.Point;
import java.util.Date;
import java.util.Scanner;
public class EvenOdd {
//write a java program that prompts the user to enter an integer and 
//	if the number is a multiple of 5 the program displays
//	HiFive if the number is a multiple of 2 Hi even
	public static void main(String[] args) {
	//create a scanner 
	Date now=new Date();
	Point point1=new Point(1 ,2);
	Point point2=point1;
	point1.x=2;
		Scanner input=new Scanner(System.in);
		
		//prompt the user to enter a number
		System.out.println("Enter a number:");
		int number=input.nextInt();
		
		
		//the if statement
		if(number % 2 == 0) {
			System.out.println("Hi Even");
		}
		if(number % 5 ==0) {
			System.out.println("Hi Odd");
		}
System.out.print(now);
System.out.println(point2);
	}

}
