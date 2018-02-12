/**
 * 
 */

/**
 * @author User
 *
 */
public class StringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String myVar = "I am Studying Java"; 
	StringBuilder sb = new StringBuilder(10);
	sb.append("I am Studying Java");
	System.out.println("sb:" + sb);
	    //initialization block
	      for (int i = 1 ; i <= 10; ++i) { 
	         System.out.println("sb at Line " + i + " with Value :" + sb);
	         sb.append("-" + i);
	}

}
	
}
