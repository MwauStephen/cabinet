package ListsGettersSetters;

public class UserName {
	public String FirstName;
	public String SecondName;
	
	//create the getter for firstname
	public String getFirstName() {
		return FirstName;
	}
	
	//create the setter for firstname
	public void setFirstName(String Fn) {
		FirstName=Fn;
	}

	//create a getter method for secondname
	public String getSecondName() {
		return SecondName;
	}
	//create a setter method for secondname
	public void setSecondName(String Sn) {
		SecondName=Sn;
		
	}
	public String getFullName() {
		return FirstName+ SecondName;
	}
}
