package MethodOverload;

import java.util.List;



public class Character {
	public String FirstName;
	public String SecondName;
	
	//create a getters method for firstname
	public String getFirstName() {
		return FirstName;
	}
	
	//create the setters method for firstname
	public void setFirstName(String Fc) {
		FirstName=Fc;
	}
	
	
	//create getters for secondname
	public String getSecondName() {
		return SecondName;
	}

	//create a setter for secondname
	public void setSecondName(String Sc) {
		SecondName=Sc;
	}
	
	//create a getter for fullname 
	public String getFullName() {
		return FirstName+""+SecondName;
	}
	public String Output() {
		return "Hi, my name is"+" "+getFullName()+".";
	} 
	//overload the above method
	 public String Output(boolean word) {
		 if(word) {
		 return getFullName()+","+" "+"You dont need a new day to start over,you only need a new mindset";
	 }
		 return "Dont give up the  beginning is always hard";
	 }
	
	//static method
	 public static void printNames(List<Character> ch) {
	    	for(Character c:ch) {
	    	System.out.println(c.getFullName());
}
	 }
	 //searching through a list
	 public static int  searchList(List<Character> ch,String Fc,String Sc) {
      return searchList(ch,Fc+" "+Sc);
	 }
	 //an overload of the method above
	 public static int searchList(List<Character> ch, String FullName) {
		 for(int i=0;i<ch.size();i++) {
	    	  if(ch.get(i).getFullName().equals(FullName)){
	    		  return i;
	    	  }
	      }
	      return -1;
	 }
	 //overide a method

	@Override
	public String toString() {
		return "Character [FirstName=" + FirstName + ", SecondName=" + SecondName + ", getFullName()=" + getFullName()
				+ "]";
	}
}
 
