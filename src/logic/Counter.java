package logic;

import java.util.Calendar;

import org.joda.time.*;

public class Counter {
	
	public static void main(String[] args)
	{
		Calendar rightNow = Calendar.getInstance();
		Calendar dayofAbstinence = Calendar.getInstance();
		
		DateTime lastSmoke = new DateTime(2012, 5, 4, 19, 0);
		DateTime currentTime = new DateTime();
		
		int days = Days.daysBetween(lastSmoke, currentTime).getDays();
	
		
		System.out.println(days);
		
	}
	
}
