package LinkedList;

public class LinkedList {

private class Node{
private int value;
private Node next;

//create a custom constructor for the node class
public Node(int value) {
	this.value=value;
}
}

	private Node first;
	private Node last;

	
	//addLast
	public void addLast(int item) {
	Node node=new Node(item);	
	
	//check if the list is empty 
	if(first==null) {
		first=node;
		last=node;
	}
	//points to the next node
	else {
		last.next=node;
		last=node;
	}

	}

	//addFirst
	public void addFirst(int item) {
		Node node=new Node(item);
		
	//check if the list is empty 
		if(first==null) {
			first=node;
			last=node;
		}
		
		//points to the next node
		else {
			node.next=first;
			first=node;
		}
	}

	//indexOf
	public int indexOf(int item) {
		int index=0;
		Node current=first;
		while(current!=null) {
			if(current.value==item)
				return index; 
			current=current.next;
			index++;
			
		}
		return -1;
	}
	
	//contains
public boolean contains(int item) { 
	return indexOf(item)!=-1;
}
	
	//deleteFirst
public void removeFirst(int item){
	Node node=new Node(item);
	if(first==null) {
		first=node;
		last=node;
	}
	Node second=first.next;
	first=second; 
}

//deleteLast
public void removeLast() {
	Node current=first;
	while(current!=null) {
		if(current.next==last)break;
		current=current.next;
	}
}


}
