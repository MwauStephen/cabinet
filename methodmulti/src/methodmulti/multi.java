package methodmulti;
import java.util.Scanner;
public class multi {
	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int number1=input.nextInt();
		System.out.print("Enter the second number: ");
		int number2=input.nextInt();
		System.out.println(Math.pow(number1,number2));
	}
}
