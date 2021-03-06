package ArrrayDel;

public class Array {
	
	//create an array
	private int[] items;
	private int count;
	
	//create a constructor with a parameter to specify its length
	public Array(int length) {
		items=new int[length];
	}

	//insert items to the array
	public void insert(int item) {
		
		//if the array is full,resize it
		if(items.length==count) {
			
			//create a new array(twice the size)
			int[] newItems=new int[count*2];
			
			//copy all existing items
			for(int i=0; i<count; i++) {
				newItems[i]=items[i];
			}
			//set items to this new array
			items=newItems; 
		}
		
		//add new item at the end of the array
		items[count]=item;
		count++; 
	}

	//remove items from an array
	public void removeAt(int index) {
	
		//validate the index
		if(index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}
		//shift items to the left to fill the hole
		 for(int i=index; i<count;i++) {
			 items[i]=items[i+1];
			 count--; 
		 }
	}
	
	//create the search method
	public int indexOf(int item) {
		for(int i=0; i<count;i++) {
		
		if(items[i]==item) {
			return i;
		}
	}
		return -1; 
	}
	
		
	//create the print method
	public void print() {
		for(int i=0; i<count ;i++) {
			System.out.println(items[i]);
		}
			
	}
	
}
