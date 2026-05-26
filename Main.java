public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "Kushan", "ICT");
        Student s2 = new Student(2, "Nimal", "SE");

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.viewStudents();
    }
}
