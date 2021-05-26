package Absract;

import java.util.ArrayList;
import java.util.List;

public class UserName {
	public static void main(String[] args) {
		Student s=new Student();
		s.FullName="KyleStevens";
		s.Degree="PhD";
		
		//create a teacher object
		Teacher t=new Teacher();
		t.FirstName="Felicity";
		t.SecondName="Smoak";
		t.FullName="Felicity Smoak";
		
		//create a staff object
		Staff f=new Staff("Alex","Karanja");
		System.out.println(f.FullName+" "+"i am a custom constructor");
		
		//create a list of Users
		
		List<User> grant=new ArrayList<User>();
		grant.add(s);
		grant.add(t);
		
		//iterate through the list
		for(User g:grant) {
			g.SayHello();
		}
	}

}
//the  new Student(); is a default constructor same as that of the teacher .They dont have parameters
//custom constructors on the other hand have parameters
//if you use a custom constructor,it overrides a default constructor