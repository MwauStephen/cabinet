package OOP1;

public class User {
 public String firstname;
 public String lastname;

 //methods
 public void identity(int times) {
	 for(int i=0;i<times;i++) {
	 System.out.println(firstname+" "+lastname);
 }
	 
}
}
//methods have a basic syntax: access modifier,return-type,method name