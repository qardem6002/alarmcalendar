
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class MAIN{

    public void ALARM(final int a , int b){
        Thread thread = new Thread(){

            public void run(){
                int k=0;
                while (k==0){
                    Calendar calendar = new GregorianCalendar();
                    int hours = calendar.get(Calendar.HOUR);
                    int minutes = calendar.get(Calendar.MINUTE);

                    if (a==hours && b==minutes){
                        JOptionPane.showMessageDialog(null, "WORKS");
                        break;
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
        alarm.ALARM(4,16);
    }
}

