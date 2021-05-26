package obj;

public class Obj {
	public static void main(String[] args) {
		Username user =new Username();//AN OBJECT OF CLASS USERNAME
		user.firstname="Kyle";//properties of a class
		user.secondname="stevens";
		System.out.println(user.getFullName());
	}
}
