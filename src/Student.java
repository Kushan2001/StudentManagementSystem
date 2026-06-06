package src;
public class Student {
    int id;
    String name;
    String course;
    int age;
    String email;
    int phoneNo;



    public Student(int id, String name, String course,int age,String email,int phoneNo){
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void display(){
        System.out.println("----------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNo);
    }
}
