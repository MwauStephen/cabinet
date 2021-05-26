package Operator;

public class Boperators {

	public static void main(String[] args) {
	int temperature=12;
	boolean isWarm=temperature<20 &&temperature<30;
	
	//or operator
	boolean hasHighIncome=true;
	boolean hasGoodCredit=true;
	boolean hasCriminalCase=false;
	boolean isElligible=hasHighIncome||hasGoodCredit;
	boolean isElligible2=(hasHighIncome||hasGoodCredit)&&!hasCriminalCase;
	System.out.println(isWarm);
	System.out.println(isElligible+" "+":The customer is elligible for a loan");
	System.out.println(isElligible2+" "+":The customer is  also elligible for a loan if he has no criminal records");

	}

}
