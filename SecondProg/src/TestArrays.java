import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 */

/**
 * This class test Java Arrays
 *
 *
 */
public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salaries [] = {2222,100,150,160,170,180};
		Arrays.sort(salaries);
		System.out.println(Arrays.binarySearch(salaries,80));
		/*
		for(int i=0;i < salaries.length; i++) {
			System.out.println("Salary of "+i + " is "+ salaries[i]);
		}
		*/
		//int i=0;
		for (int sal:salaries) {
			System.out.println(sal +",");
			//i++;
		}
		
	}

}
