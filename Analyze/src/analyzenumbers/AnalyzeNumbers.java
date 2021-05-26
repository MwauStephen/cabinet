//This is a program that displays/read 
//100 numbers and finds the number of the 
//items greater than the average.
package analyzenumbers;
public class AnalyzeNumbers {
	public static void main(String[] args) {

	java.util.Scanner input=new java.util.Scanner(System.in);
	System.out.print("Enter the number of items:");
	int n=input.nextInt();//line for the numbers
	double[]numbers=new double[n];//create an array for the 100 numbers
	double sum=0;
	
	System.out.print("Enter the numbers: ");
	for(int i=0; i<n; i++) {//stores the numbers
		numbers[i]=input.nextDouble();
		sum+=numbers[i];
	}
	double average=sum/n;//gets the average of the input numbers
	int count =0;//counts the number of items above average
	for(int i=0; i<n;i++)
		if(numbers[i]>average)//gets the numbers above average
			count++;
			
			System.out.println("Average is "+ average);
            System.out.println("Number of element above average is " + count);	

		// TODO Auto-generated method stub

	}

}
