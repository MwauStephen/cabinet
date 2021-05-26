//write a java program  that copies and deletes the contents of the array
package arraydemo;
public class ArrayDemo {
	public static void main(String[] args) {
		//creating array of characters
		char[] source= {'K' ,'Y' ,'L' ,'E' ,'S' ,'T' ,'E' ,'V' ,'E' ,'N' ,'S',
				'M','W','A','U'};
		char[] destination=new char[10];
		
		//cpying elements from one array to another
		System.arraycopy(source, 1, destination,1,3);
		System.out.println(new String(destination));
		// TODO Auto-generated method stub

	}

}
