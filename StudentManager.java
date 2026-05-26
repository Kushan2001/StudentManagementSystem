import java.util.ArrayList;

public class StudentManager {
    
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void viewStudents(){
        for(Student s : students){
            s.display();
        }
    }

}
