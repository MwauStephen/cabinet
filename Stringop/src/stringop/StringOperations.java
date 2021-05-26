package stringop;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="      Welcome all";
		String message2="Welcome";
		String name="kylestevens";
		String pull="hello kylestevens,hope you are enjoying programming";
		int value=Integer.parseInt("123");
		 System.out.println("The length of"+"  "+ message+" "+"is"+" "+message.length());
System.out.println(message.charAt(3));
System.out.println(message.toUpperCase());
System.out.println(message.trim());
System.out.println(message.compareTo(name));
System.out.println(message.equals(name));
System.out.println(message.substring(0,17)+"  "+name);
System.out.println(String.format("%s",pull));
	}

}
