package methodmax;

public class MethodMax {

	public static void main(String[] args) {
		int res= max(7,42);
		System.out.println(res);
		// TODO Auto-generated method stub

	}
	public static int max(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

}
