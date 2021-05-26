package Lesson1;

public class MyClass {

	public static void main(String[] args) {
		//create an object named student
		Student mark=new Student();//mark-> object/instance
		mark.id=1;
		mark.name="Mark oporanya";
		mark.age=25;
	
		//create another object
		Student tom=new Student();
		tom.id=2;
		tom.name="Tom oporanya";
		tom.age=35;
		System.out.println(mark.name+ " is "+ mark.age + " years old");
		System.out.println(tom.name + " is " + tom.age + " years old ");
	}
}
		
	
	

