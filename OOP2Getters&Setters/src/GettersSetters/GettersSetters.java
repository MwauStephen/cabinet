package GettersSetters;

public class GettersSetters {

	public static void main(String[] args) {
		UserName name= new UserName();//an object
		name.setFirstname("Kyle");
		name.setSecondname("Stevens");
		 
		System.out.println(name.getFirstname());
		System.out.println(name.getSecondname());
		System.out.println(name.getFullname());
	}

}
