/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Seconds;

/**
 *
 * @author ameer
 */
public class Countdown implements Runnable{
    
    private DateTime AbstinenceStart;
    private static int DAYS_IN_SECONDS = 60*60*24;
    private static int HOURS = 60*60;
    private static int MINUTES = 60;
    private boolean cutoff_bool = false;
    public Countdown(DateTime AbstinenceStart)
    {
     this.AbstinenceStart = AbstinenceStart;
     
     
    }
        public void run() {
            
            while(true)
            {
                DateTime currentTime = new DateTime();
                DateTime cutoffTime = new DateTime(2012, 9,28, 19, 30, 0);
                /*
                 * 
                 * 
                 * The values below need a thread that calculates everything at every
                 * second and updates the gui.
                 */
             
                
                
                long seconds = Seconds.secondsBetween(AbstinenceStart, currentTime).getSeconds();
		int days = (int) seconds/DAYS_IN_SECONDS;
                seconds  = seconds-(days*DAYS_IN_SECONDS);
                int hours = (int) seconds/HOURS;
                seconds = seconds - (hours*HOURS);
                int minutes = (int) seconds / MINUTES;
                seconds = seconds - (minutes*MINUTES);
                
                System.out.println("days:"+days+ ", hours:"+hours+", minutes:"+minutes+", seconds:"+seconds);
                try {
                    Thread.currentThread().sleep(1000L);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Countdown.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //After the currentTime goes beyond the cut off date, it should ideally stop checking it.
                if(currentTime.isAfter(cutoffTime))
                    cutoff_bool = true;
            }
               
        
        }
    
}
