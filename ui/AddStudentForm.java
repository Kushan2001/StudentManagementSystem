package ui;
import javax.swing.*;

import src.Student;
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

        JButton savebtn = new JButton("Save Student");
        add(savebtn);
        JButton closebtn = new JButton("Close");
        add(closebtn);

        //save button actions

        savebtn.addActionListener((ActionEvent e)->{
            try {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String course = courseField.getText();
                int age = Integer.parseInt(ageField.getText());
                String email = emailField.getText();
                String phone = phoneField.getText();

                //validation
                if (name.isEmpty() || course.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Field cannot be empty!");
                    return;
                }

                if (!email.contains("@")) {
                    JOptionPane.showMessageDialog(this, "Invalid Email!");
                    return;
                }

                if (phone.length() != 10) {
                    JOptionPane.showMessageDialog(this, "Phone number must be 10 digits!");
                    return;
                }

                Student student = new Student(
                        id,
                        name,
                        course,
                        age,
                        email,
                        phone
                );

                manager.addStudentToDB(student);

                
            } catch (Exception e) {
                // TODO: handle exception
            }

        });



    }


}
