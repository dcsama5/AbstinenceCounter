package logic;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.joda.time.*;

public class Counter {
	
    private final DateTime lastSmoke = new DateTime(2012, 5, 4, 16, 45, 13);
	public static void main(String[] args)
	{
		Calendar rightNow = Calendar.getInstance();
		Calendar dayofAbstinence = Calendar.getInstance();
		
		
		DateTime currentTime = new DateTime(2012, 9, 27, 14, 12, 23);
                CountDown r;
        r = new CountDown();
                Thread t = new Thread(r);
                /*
                 * 
                 * 
                 * The values below need a thread that calculates everything at every
                 * second and updates the gui.
                 */
              
                
        }
        
        private class CountDown implements Runnable
        {

        @Override
        public void run() {
            
            while(true)
            {
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
                int difference_in_seconds = lastSmoke.getSecondOfMinute() - currentTime.getSecondOfMinute();
                
                
                
                if(difference_in_seconds < 0)
                    difference_in_seconds = Math.abs(difference_in_seconds);
                else
                    difference_in_seconds = 60  -   (difference_in_seconds);

             
                if(difference_in_minutes < 0)
                    difference_in_minutes = Math.abs(difference_in_minutes);
                else
                    difference_in_minutes = 60  -   (difference_in_minutes);
               
                
		System.out.println(days+" days, " +  difference_in_hours + "hours, " + difference_in_minutes + "minutes, " + difference_in_seconds + " seconds");   
                try {
                    Thread.currentThread().sleep(500L);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
            
            
            
        }
	
}
