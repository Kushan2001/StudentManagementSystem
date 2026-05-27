import java.util.ArrayList;

public class StudentManager {
    
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents(){
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

}
