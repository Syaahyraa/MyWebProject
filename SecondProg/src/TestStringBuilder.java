/**
 * 
 */

/**
 * @author User
 *
 */
public class TestStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(args[0]);
		String constant = "Studying";
		System.out.println("Given String:" + sb + "with length:" + sb.length());
		System.out.println("First three:" + sb.substring(0,3));
		System.out.println("Last three:" + sb.substring((sb.length() - 3)));
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startConstant + constant.length();
		System.out.println("Print Studying:" + sb.substring(startOfConstant + endOfConstant));
		
		//Insert < space your name> after "am"
		sb.insert((sb.indexOf("am")+2), "ajith");
		System.out.println("After insert:" +sb);
		sb.delete(sb.indexoF("am"),sb.indexOf("am"));
		System.out.println("After Delete:" +sb);
		System.out.println("Reverse:" +sb.reverse());
		
		StringBuilder sb2 = new StringBuilder(args[0]);
		
	}

}
