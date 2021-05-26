package methods;

public class Method {
	public static int sum(int x1,int x2) {
		int result=0;
		for(int x =x1; x<=x2; x++);
		result+=x1;
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println("sum from 1 to 10 is "+sum(1,10));
		System.out.println("sum from 20 to 37 is "+sum(20,37));
		System.out.println("sum from 35 to 49 is "+sum(35,49));
		char[] result = null;
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
