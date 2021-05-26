package WHI;

public class WhileTriangle {
	public static void main(String[] args) {
// initialize the variable
		int i=9;
		//the condition
		while(i>=0) {
			int k=i;
			while(k>=0) {
			System.out.print(k +" "+" ");
			k--;
			}
			System.out.println();
			i--;
		}
}
}
