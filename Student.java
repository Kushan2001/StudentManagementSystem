public class Student {
    int id;
    String name;
    String course;


    public Student(int id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
