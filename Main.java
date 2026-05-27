public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "Kushan", "ICT",19,"malidukushan2001@gmail.com",1225466997);
        Student s2 = new Student(2, "Nimal", "SE",20,"kamal2002@gmail.com",045564446644);

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.viewStudents();
    }
}
