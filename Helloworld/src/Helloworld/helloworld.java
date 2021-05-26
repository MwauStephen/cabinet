package Helloworld;
import java.util.Scanner;
public class helloworld {

public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a your name:");
	String x =input.nextLine();
	System.out.println("Enter age:");
	int y=input.nextInt();
	
	System.out.println(" Hello your name is" + " " + x +" "  +"and you are"+" "+ y + "years old");
	System.out.println(Integer.SIZE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Double.MAX_EXPONENT);
	System.out.println(Double.POSITIVE_INFINITY);
	System.out.println(Double.NaN);//prints a value if is not a number(NaN)
	System.out.println(Math.sqrt(-1));
	System.out.println(Double.isNaN(Math.sqrt(-1)));
	double k= 5/2.0;
	System.out.println(k);
	
	int a=80;
	int b=30;
	System.out.println(Integer.max(a, b));
	System.out.println(Integer.compare(a, b));
  String money="700";//string is an instance of a class mainly it is an object
 //converts strings to integers
 System.out.println( Integer.valueOf(money));//returns an object data type of Integer
  System.out.println(Integer.parseInt(money));//returns a primitive data type of integer
  System.out.println(money.charAt(0));
  String name="kyle";
  
 String life="     life is full of surprises";
 System.out.println(life.charAt(5));
 System.out.println(life.charAt(life.length()-1));
 System.out.println(life.contains("full"));
 System.out.println(life.toUpperCase());
 
 String password="1234";
 System.out.println("Guess the password:");
 Scanner input1 =new Scanner(System.in);
  String Guess= input1.nextLine();
  System.out.println(password.equals(Guess));//compares the two strings value
   System.out.println(password==Guess);//compares the memory location for the two strings(cannot be used to compare strings)
   int m=100;
   int n=100;
    System.out.println(m==n);
    
    
    String key="kylestevens";
    System.out.println("Enter the password:");
    Scanner input2= new Scanner(System.in);
    String answer=input2.nextLine();
    
    if(key.equals(answer)) {
    	System.out.println("You are correct!");
    	
    }
    else if("kyle".equals(answer)) {
    	System.out.println("you guessed the second password!");
    	
    }
    else {
    	System.out.println("Acess denied ):");
    }
  System.out.println("How old are you?");
  Scanner input4=new Scanner(System.in);
  int age=Integer.parseInt(input4.nextLine());
  System.out.println("cats or dogs?");
  String animal=input.nextLine();
  System.out.println(animal);//
  
  if(age>18) {
	  System.out.println("Access granted");
  }
}
}
