//write a  program that prompts  
///the user to enter three cities
//and displays them in ascending order
package orderofcities;
import java.util.Scanner;
public class OrderOfCities {
	public static void main(String[] args) {
		//create a scanner for user input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first city:");
		String c1=input.nextLine();
		System.out.println("Enter the second city:");
		String c2=input.nextLine();
		System.out.println("Enter the third city:");
		String c3=input.nextLine();
		
		//use an if statement to compare the three cities but use the temp variable to swap the cities
		String temp;
		if(c2.compareTo(c1)<0 && (c2.compareTo(c3)<0)){
			temp=c1;
			c1=c2;
			c2=temp;
		}
		else if(c3.compareTo(c1)<0 && (c3.compareTo(c2)<0)){
			temp=c1;
			c1=c3;
			c3=temp;
		}
		if(c3.compareTo(c2)<0) {
			temp=c2;
			c2=c3;
			c3=temp;
		}
		System.out.println("The three cities in ascending order are"+"\n" + c1 +"\n" +c2 +"\n"+ c3);
		
		// TODO Auto-generated method stub

	}

}
 