package tax;
import java.util.Scanner;
public class TaxAmount {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter purchase amount:");
	double amount=input.nextDouble();
	
	double tax=amount*0.06;
	System.out.println("Sales tax is"+" "+"$"+" "+tax);

	}

}
