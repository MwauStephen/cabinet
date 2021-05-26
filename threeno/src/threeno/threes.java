package threeno;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class threes {
	static int one;
	static int two;
	static int three;
	
	static int first;
	static int second;
	static int third;
	static int king;
	static int looser;
 public static void main(String args[]) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("enter first number");
	 one=input.nextInt();
	 System.out.println("enter Second number");
	 two=input.nextInt();
	 System.out.println("enter third number");
	 three=input.nextInt();
	
	 ArrayList<Integer>numbers = new ArrayList<Integer>();
	 numbers.add(one);
	 numbers.add(two);
	 numbers.add(three);
	 numbers.sort(null);
	 System.out.println(numbers);
//	 	 checkonetwo();
//	 checkthree();
//	 System.out.println("first is "+third+" second "+second+" third is "+first);
 }
 
 public  static void checkonetwo() {
	 if(one>two) {
		 first=one;
		 second=two;
		 king =one;
		 looser=two;
	 }else if(two>one) {
		 first=two;
		 second=one;
		 king =two;
		 looser=one;
		 
	 }
 }
 public static void checkthree(){
	 if(first<three) {
		 if(second < three) {
			 
			 first=three;
			 second =king;
			 third=looser;
			 
		 }else {
			 
		 }
		
		 
	 }
	 if(second<three) {
		 if(first>three) {
			 first =king;
			 second =three;
			 third=looser; 
		 }
		
	 }
	 else if(second>three){
		 
		 first=king;
		 second =looser;
		 third=three; 
	 }
	 
 }
 
}
