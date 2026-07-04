package ui;
import javax.swing.*;

import src.StudentManager;

import java.awt.*;
import java.awt.event.ActionEvent;

public class AddStudentForm extends JFrame {
    
    JTextField idField;
    JTextField nameField;
    JTextField courseField;
    JTextField ageField;
    JTextField emailField;
    JTextField phoneField;
    
    StudentManager manager = new StudentManager();

    public AddStudentForm(){

        setTitle("Add Student");
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7,2,10,10) );

        //field

        add(new JLabel("ID; "));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name: "));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Course: "));
        courseField = new JTextField();
        add(courseField);

        add(new JLabel("Age: "));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Email: "));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("ID"));
        phoneField = new JTextField();
        add(phoneField);



    }


}
