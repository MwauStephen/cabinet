package arraysort;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
  int [] grades= {1,6,3,5,4,2};
  Arrays.sort(grades);
 // Arrays.parallelSort(grades);
  System.out.println(Arrays.toString(grades)); 
	}

}
