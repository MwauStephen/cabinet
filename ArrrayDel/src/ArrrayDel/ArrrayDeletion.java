//creating  an array class and printing its values to the console
package ArrrayDel;

public class ArrrayDeletion {

	public static void main(String[] args) {
	//create an array object with parameters
	
		Array numbers=new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		//numbers.removeAt(2);
		System.out.println(numbers.indexOf(30));
		numbers.print();

	}

}
