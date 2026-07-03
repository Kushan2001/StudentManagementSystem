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

        //button    
        JButton loginbtn = new JButton("Login");
        add(loginbtn);

        loginbtn.addActionListener((ActionEvent e) ->{
            
            String user = usernamField.getText();
            String pass = new String(passwordField.getPassword());

            // Simple validation

            if (user.equals("admin") && pass.equals("1234")) {
                    JOptionPane.showMessageDialog(this, "Login Successful..!");

                    new Dashboard().setVisible(true);
                    this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Invalid....!");
            }
        });

        setVisible(true);

    }
    public static void main(String[] args) {
        new LoginForm();
    }
}
