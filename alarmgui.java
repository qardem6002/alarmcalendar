
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class alarmgui{
    public alarmgui() {
        JFrame frame = new JFrame("Alarmapp");
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(1050, 200);
        frame.getContentPane().setBackground(new Color(47, 73, 115));
        frame.setResizable(true);
        
        JPanel panel = new JPanel(new GridLayout(5,7,20,20));
        panel.setBackground(new Color(47, 73, 115));
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));

        for (int i = 1; i < 31; i++){
            JButton button = new JButton(Integer.toString(i));
            button.setForeground(Color.WHITE);
            button.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
            panel.add(button);
        }
        frame.add(panel);


        
        frame.setVisible(true);
        

    }



    





}