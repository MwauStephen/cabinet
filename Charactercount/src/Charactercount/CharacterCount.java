//write a program that counts the number of characters in a string
package Charactercount;
public class CharacterCount {
	public static void main(String[] args) {
		String word="Alex is a good boy";
		int count=0;
		 
		//counts each character except spaces
		for(int i=0;i<word.length();i++) {
		if(word.charAt(i)!='' ) {
			count++;
			// TODO Auto-generated method stub

	}
		System.out.println("The total number of characters in a string is:"+ count);

}
}
}