package example1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateReadValidateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "10.02.2003";
		if(s.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}")) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			Date dob = null;
			try {
				dob=sdf.parse(s);
				System.out.println("dob validated with dob = "+dob);
			}catch(ParseException e) {
				System.out.println("invalid date");
			
			}
		}
		
	}

}
