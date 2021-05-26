package Listsoperation;

import java.util.ArrayList;
import java.util.List;

public class ListsOperation {

	public static void main(String[] args) {
		// ArrayList can dynamically change/resize
		//ArrayList is an example of an implementation
		  List <Integer> grades  =new ArrayList<Integer>(); 
		  grades.add(25);
		  grades.add(40);
		  grades.add(1,100);
		  System.out.println(grades.get(1));
		  System.out.println(grades.get(0));
		  System.out.println(grades.get(1));
		  System.out.println(grades.indexOf(40));
		  System.out.println(grades.indexOf(25));
		  System.out.println(grades.indexOf(100));
		  System.out.println(grades.contains(25));
		  System.out.println(+grades.remove(0));
		  grades.clear();

	}
}
//syntax for declaring an arrayList of a class
//List<ClassName>name of list=new ArrayList<ClassName>();