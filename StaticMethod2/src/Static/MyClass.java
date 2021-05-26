package Static;
//working with static methods
public class MyClass {
public static void main(String[] args) {
	Pupil p=new Pupil();

	System.out.println(p.getNoOfStudents());
	Pupil l=new Pupil();
	System.out.println(l.getNoOfStudents());
	
	//call the static method using the class name

	System.out.println("The total number of students the class are:"+" "+Pupil.getNoOfStudents());
}
}
//The above program proofs that a static method can be shared by instances of a class(objects)
//though it will still run its not advisable to access a static method via an instance
//if you protect variables using the keyword protect in a class,those attributes are accessed in the subclasses