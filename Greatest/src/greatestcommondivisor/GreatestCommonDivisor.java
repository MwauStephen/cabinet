package greatestcommondivisor;
import java.util.Scanner;
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		//prompt the user to enter the two integers
		System.out.print("Enter the first integer: ");
		int n1=input.nextInt();
		System.out.print("Enter the second interger:");
		int n2=input.nextInt();
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1,n2));
		}
	//Return the gcd of two integers
	public static int gcd(int n1,int n2) {
		int gcd=1;//initial gcd is 1
			int k=2;//possible gcd
		
		while(k <= n1 && k <= n2) { 
			if(n1 % k == 0 && n2 % k == 0)
				gcd=k;//update gcd
			k++;
		}
		return gcd;//return gcd
		// TODO Auto-generated method stub

	}

}
