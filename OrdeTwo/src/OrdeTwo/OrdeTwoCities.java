package OrdeTwo;
import java.util.Scanner;
public class OrdeTwoCities {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first city:");
		String city1=input.nextLine();
		
		System.out.println("Enter the second city:");
		String city2=input.nextLine();
		
		if(city1.compareTo(city2)<0) {
			System.out.println("The cities in alphabetic order are"+" "+ city1 +"  "+city2);
		}
		else {
			System.out.println("The cities in alphabetic order are"+" "+city2+" "+city1);
		}
		

	}

}
//The compareTo method compares two strings which are lexicographically(in terms of unicode)
//if the string compared to displays a value greater than 0,then the string is greater than the other and vice versa
//if it reruns a zero both strings ae equal
