package ArrayDynamic;

import java.util.ArrayList;

public class ArrayDynamic {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("The item removed at index 0:"+" "+list.remove(0));
		System.out.println("The index of item 30 is:"+" "+list.indexOf(30));
		
		list.lastIndexOf(20);
		list.contains(30);
		list.size();
		list.toArray();
		System.out.println(list);

	}

}
