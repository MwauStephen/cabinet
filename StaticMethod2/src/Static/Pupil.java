package Static;

public class Pupil {
	int age;
	String name;
	
	//create a static method
	
	 static int NoOfStudents;
	
	//define a constructor
	Pupil(){
		NoOfStudents++;
	}
	
	//create a function to get the value of the NoOfStudents(getter method)
	public static int getNoOfStudents() {
		return NoOfStudents;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
