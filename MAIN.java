import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class MAIN{

    public void ALARM(final int a , final int b){
        Thread thread = new Thread(){
            @Override
            public void run(){
                int k=0;
                while (k==0){
                    Calendar calendar = new GregorianCalendar();
                    int hours = calendar.get(Calendar.HOUR_OF_DAY);
                    int minutes = calendar.get(Calendar.MINUTE);

                    if (a==hours && b==minutes){
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

    public static void main(String[] args) {
        MAIN alarm = new MAIN();
        alarm.ALARM(16,25);
    }
}
