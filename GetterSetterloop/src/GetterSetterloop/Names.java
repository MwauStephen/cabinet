package GetterSetterloop;

public class Names {
	public String FirstName;
	public String SecondName;
	
	//create a getter method for firstname
	public String getFirstName() {
		return FirstName;
	}
	//create a setter method for firstname
	public void setFirstName(String Fn) {
		FirstName=Fn;
		
	}
	
	//create a getter method for secondname
	public String getSecondName(){
		return SecondName;
	}
	
	//create a setter method for secondanme
	public void setSecondName(String Sn) {
		SecondName=Sn;
	}

	// create a getter method for fullnames
	public String getFullName() {
		return FirstName+" "+SecondName;
	}
}
