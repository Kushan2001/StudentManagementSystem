package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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
        
        //buttons
        JButton addbtn = new JButton("Add Students");
        JButton viewbtn = new JButton("View Student");
        JButton searchbtn = new JButton("Search Student");
        JButton logoutbtn = new JButton("Logout");

        add(addbtn);
        add(viewbtn);
        add(searchbtn);
        add(logoutbtn);

        //Actions---------------------
        //Add students
        addbtn.addActionListener((ActionEvent e)->{
            new AddStudentForm().setVisible(true);
        });

        //view students
        viewbtn.addActionListener((ActionEvent e)->{
            new ViewStudentForm().setVisible(true);
        });

        //Search Student

        searchbtn.addActionListener((ActionEvent e)->{
            new SearchStudentForm().setVisible(true);
        });

        // Logout
         logoutbtn.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(this, "Logged out successfully!");
            new LoginForm().setVisible(true);
            this.dispose();
        });
    }
}
