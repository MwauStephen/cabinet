//write a program generates a plate number.Assume a plate 
//number consists of three uppercase letters followed by four digits
package numberplates;
public class NumberPlates {
	public static void main(String[] args) {
		//generate three random uppercase letters using the ASCII code (90-65)
		int letter1=65+(int)(Math.random()*(90-65));//the initial 65 is added to the random number
		//being produced ( between 1-25 for alphabets)and its added to give out the respective letter in the ASCII CODE
		int letter2=65+(int)(Math.random()*(90-65));
		int letter3=65+(int)(Math.random()*(90-65));
		
		//generate four random digits
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		int number3=(int)(Math.random()*10);
		int number4=(int)(Math.random()*10);
		
		// TODO Auto-generated method stub
		//display the number plates
		System.out.println(""+(char)(letter1)+(char)(letter2)+(char)(letter3)+ ""+number1 + number2 + number3 + number4);

	}

}
