/**
 * 
 */

/**
 * @author User
 *
 */
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String first = "1";
		int second =2;
		int third =3;
		String fourth= "C";//String pool
		String fifth= "C"; //String pool
		String sixth= new String("C"); //not String pool
	/*
		if(fourth == fifth)
			System.out.println("fourth and fifth is same: " + fourth);
		else
			System.out.println("fourth and fifth are not the same:");
		
		if(fourth == sixth)
			System.out.println("fourth and sixth is same: " + fourth);
		else
			System.out.println("fourth and sixth are not the same:");
		*/
		
		String sms ="Selamat Datang ke Malaysia!!";
		System.out.println("SMS Size is : " + sms.length());
		System.out.println("Text at 10th position / 9th index : " + sms.charAt(9));
		System.out.println("Index of the text ! : " +  sms.indexOf("!"));
		System.out.println("Substring of 0 - 10 : " + sms.substring(0,10));
		System.out.println("lower : " + sms.toLowerCase());
		System.out.println("UPPER : " + sms.toUpperCase());
		
		String country = "Malaysia";
		String userCountry = args[0].toLowerCase();
		//if(country.equals(args[0])) {
		if(country.equalsIgnoreCase(userCountry)) {
			System.out.println("Country is Malaysia");
		}else {
			System.out.println("Country is Not Malaysia but " + args[0]);
		}
			
		String userCountry = args[0];
		if(userCountry.startsWith("m")) {
			System.out.println("Country is Starting with m");
		}
		if(userCountry.endsWith("A")) {
			System.out.println("Country is ending with m");
		
		}
		}
		
		
	}


