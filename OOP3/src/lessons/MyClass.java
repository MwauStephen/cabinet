package lessons;

public class MyClass {
	public static void main(String[] args) {
		/*Student mark=new Student();
		mark.setId(1);
		mark.setName("Kylestevens");
		mark.setAge(21);
		
		Student kyle=new Student();
		kyle.setAge(30);
		kyle.setId(2);
		kyle.setName("Mark Anderson");*/
		
		//create object cube
		Cube c=new Cube();
		System.out.println(c.getCubevolume());
		
		//create cube 2
		Cube c1=new Cube(10,20,30);
		System.out.println(c1.getCubevolume());
		/*System.out.println(mark.getName()+"  "+"is" +" "+mark.getAge()+" "+"years old ");
		System.out.println(kyle.getName()+"  "+"is" +" "+kyle.getAge()+" "+"years old ");*/
	}

}


//the first method to  be invoked when instantiating an object is its constructor
//a constructor has no return type
//a constructor must have the same name as the defined class
//constructors are member methods in a class which have the same name as the class.
//we can have multiple constructors in a class with different parameters