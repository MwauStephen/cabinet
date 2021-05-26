package Multiplicationtable;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("     Multiplication Table");
		
		//displays the title number
		System.out.print("   ");
		for(int j=1; j<9;j++)
			System.out.print("   " +j);
		System.out.println("\n-----------------------------------------");
		
		//displays the table body
		for(int i=1; i<9;i++) {
			System.out.print(i + " | ");
			for(int j=1;j<9;j++) {
			System.out.print(" "+i*j); 
		}
			System.out.println("  ");
		}

	}

}
