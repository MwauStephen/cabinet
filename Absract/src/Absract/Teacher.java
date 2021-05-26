package Absract;

public class Teacher extends User {
	
	//create a constructor
	public Teacher() {
		System.out.println("I AM A TEACHER CONSTRUCTOR(default constructor)");
	}
	@Override
	public void SayHello() {
		System.out.println("Hello i am a teacher and my name is:"+FullName);
	}

}
