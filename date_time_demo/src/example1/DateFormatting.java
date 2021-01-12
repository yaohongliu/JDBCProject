package example1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		/*
		 * dd -> date in 2 digits
		 * MM-> month in 2 digits
		 * yy -> year in 2 digits
		 * EEE - day in shortname, EEEE full day name
		 * mm -> minutes
		 * ss -> seconds
		 * HH -> 24 hours
		 * hh -> 12 hours
		 * z/Z -> time zone
		 * a -> am/pm
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy EEEE z hh:mm:ss a");
		System.out.println("formatted date: "+sdf.format(d));//format
	}

}
