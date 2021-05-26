package SwitchString;

public class SwitchString {

	public static void main(String[] args) {
		String game="Cricket";
		String role="admin";
		
		switch(game) {
		case "Hockey":System.out.println("lets play hockey");break;
		case "Basketball":System.out.println("Lets play basketball");break;
		case "Cricket":System.out.println("Lets play cricket");break;
		
		}
	switch(role) {
	case "admin":System.out.println( "You are an admin welcome");break;
	case "modereator":System.out.println("You are a moderator");break;
	case "guest":System.out.println("You are a guest");break;
	}
	}
//if our values were an integer the case would be
	//->case1:....
	//->case2.....
}
