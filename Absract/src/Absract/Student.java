package Absract;

public class Student extends User {
	public String Degree;
	
	@Override
	public void SayHello() {
		System.out.println("Hello am "+" "+FullName+""+"with a "+" "+Degree+" "+"in IT");
	}

}
