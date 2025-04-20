import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClassDemo {
	
	public static void main(String[] args) {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println(cal.get(Calendar.MINUTE));
	}


}
