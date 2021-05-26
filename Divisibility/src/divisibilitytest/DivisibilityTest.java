package divisibilitytest;
import java.util.Scanner;
public class DivisibilityTest {
	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an interger: ");
		int number=input.nextInt();
		if(number%5==0 && number%6==0) {
			System.out.println( number  + "is divisible by 5  and 6:");
		// TODO Auto-generated method stub

	}
		else {
			System.out.println(number + " isnt divisible by 5 and 6: ");
		}
		if(number%5==0 || number%6==0) {
			System.out.println(number +" is divisible by 5 or 6:");
		}
		else {
			System.out.println(number + " isnt divisible by 5 or 6:");
			
			if(number%5==0 ^number %6==0) {
				System.out.println( number + "is divisible by 5 or 6,but not both");
			
			}
			else {
				System.out.println(number + " is neither divisible by 5 or 6: ");
			}
		}

	}
}
