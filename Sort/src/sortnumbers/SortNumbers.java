package sortnumbers;

public class SortNumbers {

	public static void main(String[] args) {
		java.util.Scanner input=new java.util.Scanner(System.in);
		//enter three numbers
		System.out.print("Enter first interger:");
		int number1=input.nextInt();
		
		System.out.print("Enter second interger:");
		int number2=input.nextInt();
		
		System.out.print("Enter third interger:");
		int number3=input.nextInt();
		
		if(number1>number2) {
			int temp=number1;
			number1=number2;
			number2=temp;
		}
		if(number2>number3) {
			int temp=number2;
			number2=number3;
			number3=temp;
		}
		if(number1>number2) {
			int temp=number1;
			number1=number2;
			number2=temp;
		}
		System.out.println("The sorted numbers are "+ number1 + " " + number2 + " " + number3);

	}

}
