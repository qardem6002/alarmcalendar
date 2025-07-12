
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class alarmlogic{

    public void ALARM(final int hour , final int mins, final int day, final int year, final int month){
        Thread thread = new Thread(){
            @Override
            public void run(){
                while (true){
                    Calendar calendar = new GregorianCalendar();
                    int hours = calendar.get(Calendar.HOUR_OF_DAY);
                    int minutes = calendar.get(Calendar.MINUTE);
                    int day_of_month = calendar.get(Calendar.DAY_OF_MONTH);
                    int years = calendar.get(Calendar.YEAR);
                    int months = calendar.get(Calendar.MONTH)+1 ;//MONTH TAKES JANUARY AS 0 SO WE ADD 1 FOR MY SAKE
                    

                    if (hour==hours && mins==minutes && day==day_of_month && year==years && month==months){
                        JOptionPane.showMessageDialog(null, "WORKS");
                        break;
                    }
                    try {
                        Thread.sleep(1000); // stops for 1 second so it doesnt check every millisecond, java also says this is inside a loop so it might slow the loop
                    } catch (InterruptedException e){
                        e.printStackTrace(); // java wants me to use better debugging methods i think?
                    }
                }
            }
        };
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        
        //JOptionPane.showMessageDialog(null, "works");
        
    }
}

