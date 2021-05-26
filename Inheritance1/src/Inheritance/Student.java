package Inheritance;

public class Student extends User {
	public String Degree;
	//override the sayhello method in user class
	@Override
	public void SayHello() {
		System.out.println("Hello i have a "+" "+Degree+" "+"in IT,and my name is:"+" "+FullName);
	}

}
