package src;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("EnterID: ");
                    int id = input.nextInt();

                     input.nextLine();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Course: ");
                    String course = input.nextLine();

                    System.out.print("Enter Age: ");
                    int age = input.nextInt();

                    input.nextLine();

                    System.out.print("Enter Email: ");
                    String email = input.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phoneNo = input.nextLine();

                    Student student = new Student(id, name, course,age,email,phoneNo);

                    manager.addStudentToDB(student);
                    break;
                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = input.nextInt();

                    manager.searchStudent(searchId);
                    break;
                
                case 4:
                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = input.nextInt();

                    manager.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.print("Enter Student ID to Update: ");
                    int updateId = input.nextInt();

                    

                    System.out.print("Enter New Name: ");
                    String newName = input.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = input.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = input.nextInt();

                    input.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = input.nextLine();

                    System.out.print("Enter New Phone Number: ");
                    int newPhoneNo = input.nextInt();
            
                    manager.updateStudent(updateId, newName, newCourse, newAge, newEmail, newPhoneNo);
                    break;
                
                case 6:
                    System.out.println("Exsiting System......");
                default:

                    System.out.println("Invalid Choice..!");
                    break;
            }
        } while (choice!=6);
        input.close();
       

       
    
    }
}
