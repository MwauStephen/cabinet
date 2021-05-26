package Stringcount;
import java.util.Scanner;
public class StringCount {
	public static void main(String[] args) {
		//create a scanner
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=input.nextLine();
		String total="";
		
		for(int i=0; i <s.length();i++) {
			char thisChar=s.charAt(i);
			}
		System.out.println("Total amont of characters:" + s.length());

	}
}
