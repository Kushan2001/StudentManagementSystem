package ui;
import javax.swing.*;

import src.StudentManager;

import java.awt.*;
import java.awt.event.ActionEvent;

public class AddStudentForm extends JFrame {
    
    JTextField idDField;
    JTextField nameField;
    JTextField courseField;
    JTextField ageField;
    JTextField emailField;
    JTextField PhoneField;
    
    StudentManager manager = new StudentManager();

    public AddStudentForm(){

        setTitle("Add Student");
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7,2,10,10) );

        //field
    }


}
