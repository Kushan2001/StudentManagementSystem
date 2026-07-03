package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;

public class Dashboard  extends JFrame{
    public Dashboard(){
        setTitle("Student Management System(Dashboard)");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        setLayout(new GridLayout(5,1,10,10));

        //title label
        JLabel title = new JLabel("STUDENT DASHBOARD",SwingConstants.CENTER);
        title.setFont(new Font("Arial",Font.BOLD,20));
        add(title);
        
        
    }
}
