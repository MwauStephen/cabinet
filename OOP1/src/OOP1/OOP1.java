package OOP1;

public class OOP1 {

	public static void main(String[] args) {
		//1st object
		User name=new User();//an object(instance of a class)
		
		name.firstname="Kyle";
		name.lastname="Stevens";
		
		System.out.println("My Name is:"+" "+name.firstname+name.lastname);
        
		//call to the method
		//name.identity();
		
		//outputs identity 4 times
		name.identity(4);
		
		
		//(2 object) calling the second object UserName
		UserName felicity=new UserName();
		felicity.FIRSTNAME="Felicity";
		felicity.SECONDNAME="SMOAK";
		
		String message=felicity.initials();
		
		System.out.println(message);
	
	}

}
