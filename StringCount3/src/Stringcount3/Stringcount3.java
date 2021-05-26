package Stringcount3;
import java.util.Scanner;
public class Stringcount3 {
	public static void main(String[] args) { 
		//create a scanner
		Scanner input=new  Scanner(System.in);
		System.out.println("Enter the string:");
		String w=input.nextLine();
		
		String count="";
		for(int i=0; i <w.length(); i++) {
		char thischars=w.charAt(i);
		}
		System.out.println("Total number of letters: "+ w.length());
}
}

