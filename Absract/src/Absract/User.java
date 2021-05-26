package Absract;

public  abstract class User {
	public String FirstName;
	public String SecondName;
	public String FullName=FirstName+SecondName;

	//create a method
	public  abstract void SayHello();
}
