package GettersSetters;

public class UserName { 
	public String Firstname;
	public String Secondname;
	
	//create a method getter for firstname
	public String getFirstname() {
		return Firstname;

}
	//create a setter method for firstname
	public void setFirstname(String SN) {
		Firstname=SN;
	}
//create getter for secondname
	public String getSecondname() {
		return Secondname;
	}
	
	//create a setter method for secondname
	public void setSecondname(String FN) {
		Secondname=FN;
	}
	public String getFullname() {
		return Firstname+Secondname;
		
	}
}
