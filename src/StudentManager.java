package src;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentManager {
    
    ArrayList<Student> students = new ArrayList<>();

    public void addStudentToDB(Student student){
        Connection con = DBConnection.getConnection();
        try {
            
            String sql = 
                "INSERT INTO students (id, name, course, age ,email, phoneNo) VALUES (?,?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, student.id);
            pst.setString(2, student.name);
            pst.setString(3, student.course);
            pst.setInt(4, student.age);
            pst.setString(5, student.email);
            pst.setString(6, student.phoneNo);

            pst.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents(){
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for(Student s : students){
            s.display();
        }
    }

   // Search Student
    public void searchStudent(int id) {

        boolean found = false;

        for (Student s : students) {

            if (s.id == id) {
                s.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }


    // Delete Student
    public void deleteStudent(int id) {

        boolean removed = students.removeIf(s -> s.id == id);

        if (removed) {
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }
    }

    // Update Student
    public void updateStudent(int id, String newName, String newCourse,int newAge,String newEmail,int newPhoneNo) {

        boolean found = false;

        for (Student s : students) {

            if (s.id == id) {

                s.name = newName;
                s.course = newCourse;
                s.age = newAge;
                s.email =newEmail;
                s.phoneNo = newPhoneNo;

                System.out.println("Student Updated Successfully!");

                found = true;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }
}
