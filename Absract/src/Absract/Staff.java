package Absract;

public class Staff extends User{
	
	//create a custom constructor
	public Staff(String fn, String sn) {
		FirstName=fn;
		SecondName=sn;
		FullName=fn+" "+sn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void SayHello() {
		System.out.println("Hello i am a stuff member and my name is:"+FullName);
	}
}
