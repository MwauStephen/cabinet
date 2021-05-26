//create a linked list from scratch
package LinkedList;

public class LinkedListCreation {

	public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.addLast(10);
	list.addLast(20);
	list.addLast(30);
 System.out.println(list.indexOf(10));
 System.out.println(list.indexOf(20));
 System.out.println(list.indexOf(50));
 System.out.println(list.contains(50));
 System.out.println(list.contains(20));
 




	}

}
//a linked list stores a list of objects(nodes) in sequence
//they can grow and shrink automatically
//each node holds two pieces of data i.e value and address(address of next node)
//first node->head
//second node->tail
//nodes of a linked list can be scattered all over the memory hence difficult to access an item with its index
//new operator used in creating objects is used to allocate memory 