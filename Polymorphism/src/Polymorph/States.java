package Polymorph;

public class States {

	public static void main(String[] args) {
	//create the objects for the various banks through up casting .ie 
		//when a parent class points to a subclass
		Banks abc=new ABC_Bank();
		Banks def=new DEF_Bank();
		Banks xyz=new XYZ_Bank();
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());

	}

}

//polymorphism is the ability to have many form