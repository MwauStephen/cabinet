package Inheritance;

public class UserName {

	public static void main(String[] args) {
	//create an object from the child class Student
		Student s=new Student();
		s.FirstName="kyle";
		s.SecondName="Stevens";
		s.FullName=s.FirstName+s.SecondName;
		s.Degree="PHD";
		
		//System.out.println(s.FirstName+s.SecondName+" "+"holds a "+" "+s.Degree+" "+"in IT");
		s.SayHello();
	

	}

}
//aim -> creating a method in the user class and overriding the method in the student class.