package logic;

import java.util.Calendar;

import org.joda.time.*;

public class Counter {
	
	public static void main(String[] args)
	{
		Calendar rightNow = Calendar.getInstance();
		Calendar dayofAbstinence = Calendar.getInstance();
		
		DateTime lastSmoke = new DateTime(2012, 5, 4, 16, 45, 13);
		DateTime currentTime = new DateTime(2012, 9, 27, 14, 12, 23);
	
                /*
                 * 
                 * 
                 * The values below need a thread that calculates everything at every
                 * second and updates the gui.
                 */
                
                
		int days = Days.daysBetween(lastSmoke, currentTime).getDays();
                int hours = Hours.hoursBetween(lastSmoke, currentTime).getHours();

                lastSmoke.getMinuteOfHour();
                
                
                //convert the number of days passed into hours and minus it from the hours inbetween
                
                int hourspassed = days*24;
                int difference_in_hours=hours - hourspassed;
                int difference_in_minutes = lastSmoke.getMinuteOfHour() - currentTime.getMinuteOfHour();
                if(difference_in_minutes < 0)
                    difference_in_minutes = Math.abs(difference_in_minutes);
                else
                    difference_in_minutes = 60  -   (difference_in_minutes);
                
                
                
                
                System.out.println(difference_in_minutes);
                
		System.out.println("days passed:"+days);
		System.out.println("hours passed:" +  difference_in_hours);
                
                
                
	}
	
}
