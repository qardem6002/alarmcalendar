
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class alarmgui{
    public alarmgui() {
        JFrame frame = new JFrame("Alarmapp");
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7,2));
        frame.setLocation(1050, 200);
        frame.getContentPane().setBackground(new Color(47, 73, 115));
        




        
        frame.setVisible(true);
        

    }



    





}