package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {
    JTextField usernamField;
    JPasswordField passwordField;


    public LoginForm(){
        setTitle("Student Management System");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //layout Design
        setLayout(new GridLayout(3,2));

        //username
        add(new JLabel("Username:"));
        usernamField = new JTextField();
        add(usernamField);

        //password
        add(new JLabel("Password: "));
        passwordField = new JPasswordField();
        add(passwordField);

        
    }
}
