//write a program using  a method to display an integer entered by the user in reverse order
package ReverseMethod2;
import java.util.Scanner;
public class ReverseMethod2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number to be reversed:");
		int number=scanner.nextInt();
		
		int	reverse=0;
		System.out.println("The number in reverse order  is:"+" "+reverse);
     	

	}
	
	//create the method reverse
	public static void reverse(int num) {
		if(num<10) {
			System.out.println(num);
			return;
	}
		else {
			System.out.println(num%10);
			reverse(num/10);
		}
		

}
}
	
