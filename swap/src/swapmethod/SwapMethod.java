package swapmethod;

public class SwapMethod {

	public static void main(String[] args) {
		//Declare and initialize variables
		int num1=1;
		int num2=2;
		
		System.out.println("Befor invoking the swap method,num1 is "+ num1 + " and num 2 is "+ num2);
		//Invoke the swap method to attempt to swap two variables
		swap(num1,num2);
		
		System.out.println("After invoking the swap method, num1  is" +  num1  +  " and  num2  is  "+  num2);
	}
	
	//swap two variables
	public static void swap(int n1,int n2) {
		System.out.println("\tInside the swap method");
		System.out.println("\t\tBefore swapping, n1 is "+ n1 + " and n2 is "  +  n2);
		//swap n1 with n2
		int temp=n1;
		n1 = n2;
		n2 =temp;
		System.out.println("\t\tAfter swapping, n1  is " +  n1  + "and n2 is " + n2);
		// TODO Auto-generated method stub

	}

}
