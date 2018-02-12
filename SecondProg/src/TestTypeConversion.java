/**
 * 
 */

/**
 * @author User
 *
 */
public class TestTypeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Accept a double from command line
		Double salaryDb1 = new Double(args[0]);
		if (salaryDb1.isNan()) {
			Syste.out.println("Salary is not valid: "+ salaryDb1);
		}
		double salary = Double.parseDouble(args[0]);
		
		String salaryStr = String.valueOf(salary);
		
		System.out.println(salaryStr);

	}

}
