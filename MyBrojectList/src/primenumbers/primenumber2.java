package primenumbers;
import java.util.Scanner;
public class primenumber2 {
	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=input.nextInt();//users input
		int i;
		int m=0;
		int prime = 0;
		m=n/2;
		
		if(n==0||n==1) {
			System.out.println(n+" "+"is not a prime number");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" "+"is not a prime number");
					prime=1;
					break;
				}
			}
			if(prime==0) {
				System.out.println(n+" " +"is a prime number");
				
			}
		}
		// TODO Auto-generated method stub

	}

}
