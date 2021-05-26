package Reversestring;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		String reverse="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=input.nextLine();
		
		char[]w=s.toCharArray();//converts the string to characters
		for(int i=w.length-1;i>=0;i--) {
			reverse+=w[i];
		}
			System.out.println("Reverse of the string is:"+ reverse);
		}
		
	}
