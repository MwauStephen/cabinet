package swap;

public class SwapNumbers {

	public static void main(String[] args) {
		int number1=20;
		int number2=30;
		System.out.println("Before invoking the swap  method , number1 is " + number1 + "and number2 is " + number2);
		
		swap(number1,number2);
		System.out.println("After invoking the swap method,number1 is " + number1 + " and number2 is " + number2 );
	}
		public static void swap(int number1, int number2) {
			int temp=number1;
		    number1=number2;
		    number2=temp;
		    System.out.println("t\tAfter swapping number1 is "+number1+"and number2 is "+number2);
		
}
}