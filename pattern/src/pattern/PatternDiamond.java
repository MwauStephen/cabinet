package pattern;
import java.util.Scanner;
public class PatternDiamond {
	public static void main(String[] args) {
		int rowa =1;
		int i=1;
		int j=1;
		int space=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows you want:");
		int row=input.nextInt();
		space=row-1;
		for(j=1;j<=row;j++) {
		}
		for(i=1;i<=space;i++) {
	
		System.out.println("");
		}
		space--;
		for(i=1;i<=2*j-1;i++) {
			System.out.println("*");
		}
		System.out.println("");
	space=1;
	for(j=1;j<=row-1;j++) {
		
	for(i=1;i<=space;i++) {
		System.out.print(" ");
	}
	space++;
	for(i=1;i<=2*(row-j)-1;i++) {
		System.out.print("*");
	}
	System.out.println("");
	}
}
}
