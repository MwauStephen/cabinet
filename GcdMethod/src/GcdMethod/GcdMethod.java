//write a program that prompts the user to enter two numbers and
//determines the greatest common divisor of the two
package GcdMethod;
import java.util.Scanner;
public class GcdMethod {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first integer:");
		int number1=input.nextInt();
		
		System.out.println("Enter second integer:");
		int number2=input.nextInt();
		
		System.out.println("The gcd for"+" "+number1+" "+"and"+" "+number2+" "+"is"+" "+gcd(number1,number2));
	

	}
	
	//create the method for gcd
	public static int gcd(int num1,int num2) {
		int gcd=1;
		int k=2;
		
		while(k<=num1&&k<=num2) {
			if(num1 % k == 0 && num2 % k ==0)
				 return gcd=k;
			k++;
		}
		return gcd;
	}
}


