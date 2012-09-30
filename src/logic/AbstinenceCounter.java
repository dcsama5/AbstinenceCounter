package logic;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.joda.time.*;

public class AbstinenceCounter {
	
    private final DateTime lastSmoke = new DateTime(2012, 5, 4, 16, 45, 13);
    
	public static void main(String[] args)
	{
		
		
		
		DateTime currentTime = new DateTime();
                Countdown counter = new Countdown(currentTime);
                Thread thread = new Thread(counter);
                thread.start();
                
                
                /*
                 * 
                 * 
                 * The values below need a thread that calculates everything at every
                 * second and updates the gui.
                 */
              
                
        }
        
   
	
}
