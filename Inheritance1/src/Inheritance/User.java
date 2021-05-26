package Inheritance;

public  abstract class  User {
	public String FirstName;
	public String SecondName;
	public String FullName=FirstName+SecondName;
	
	//a method
 public void SayHello() {
	 System.out.println("Hello my name is"+" "+FullName);
 }

}
