/**
 * 
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
//import java.time;
/**
 * @author User
 *
 */
public class UtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date dt = new Date();
		String currentDate = String.valueOf(dt.getDay());
		System.out.println("Current Date is :" + currentDate);
		System.out.println("Current Time is :" + dt.getTime());
		String currentCalDate = cal.get(Calendar.DATE) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR) + " " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getDisplayName();
		
		System.out.println("Current Date is :"  + currentCalDate);
		/*
		//cal.set(year, month,date, hourOfDay, minute, second);
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int date = Integer.parseInt(args[2]);
		int hoursOfDay = Integer.parseInt(args[3]); //for the 24 hour clock
		int minute = Integer.parseInt(args[4]);
		int second = Integer.parseInt(args[5]);
		
		cal.set(year, (month-1), date, hourOfDay, minute, second);
		
		String yourDate = cal.get(Calendar.DATE) + "/" + cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR) + " " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getDisplayName();
		
		System.out.println("Your Date is :" + yourDate);
		
		*/
		
		LocalDateTime localDate = LocalDateTime.now();
		System.out.println("Current Date Before :" + localDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm:ss a");//Month should be in uppercase so that it will not be confusing between the minute
		//DateTimeFormatter formatter2 = DateTimeFormatter.ISO_DATE_TIME;
		
		
		String text = localDate.format(formatter2);
		
		System.out.println("Current Date formatted :" + text);
		
		//Parse the command line given date
		//LocalDate parsedDate = LocalDate.parse(args[0], formatter2);
		
		//System.out.println("Your parsed Date is :" + parsedDate.format(formatter));
		
		
		
	}

}
