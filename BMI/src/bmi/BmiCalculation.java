package bmi;
import java.util.Scanner;
public class BmiCalculation {
//write a program that  prompts the user to enter  weight in pounds and height in inches and displays the BMI
	//1 POUND= 0.45359237
	// 1 INCH=0.0254
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter weights in pounds:");
		double weight=input.nextDouble();
		
		System.out.println("Enter height in inches:");
		double height=input.nextDouble();
		
		final double WIP=0.45359237;
		final double HIM=0.0254;
		
		//COMPUTE BMI
		double weightInkg=weight*WIP;
		double heightInMeters=height*HIM;
		double BMI=weightInkg/ (heightInMeters* heightInMeters);
		
		//Display the result
	System.out.println("BMI is"+" "+BMI);
	
	if(BMI<18.5)
	System.out.println("underweight");
	else if(BMI<25)
		System.out.println("Normal");
	else if(BMI<30)
		System.out.println("Overweight");
	else 
		System.out.println("Obese");
	
	}

}
