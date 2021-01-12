package eg_time_api_java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApiJava8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate Ld = LocalDate.now();
		System.out.println("Ld: "+Ld);
		System.out.println(Ld.isLeapYear());
		Ld = Ld.plusMonths(1);
		System.out.println("Ld: "+Ld);
		System.out.println(Ld.isLeapYear());
		
		String s = "10.02.2002";
		LocalDate dob = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println("dob= "+dob);
		LocalDate now = LocalDate.now();
		System.out.println("now: "+now);
		
		Period p = Period.between(dob, now);
		System.out.println("You are "+p.getYears()+" year/s, "+p.getMonths()+" month/s and "+p.getDays()+" day/s old");
		
		System.out.println(ChronoUnit.DAYS.between(dob, now));
		System.out.println(ChronoUnit.YEARS.between(dob, now));
		System.out.println(ChronoUnit.MONTHS.between(dob, now));
		
	}


}
