package src;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentManager {
    
    ArrayList<Student> students = new ArrayList<>();

    public void addStudentToDB(Student student){
        students.add(student);
        System.out.println("Student Added Successfully!");
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
