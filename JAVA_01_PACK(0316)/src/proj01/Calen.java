package proj01;

import java.util.Calendar;

public class Calen {

	
	Calendar today;
	
	String now() {
		
		today = Calendar.getInstance();
		
		String date = today.get(Calendar.YEAR) + "-" + today.get(Calendar.MONTH) + "-" + today.get(Calendar.DAY_OF_MONTH) + "-" + today.get(Calendar.HOUR_OF_DAY);
		
		return date;
	}

}
