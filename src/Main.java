package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {
            System.out.println("\n-----------------------");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("----------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("0. Exit");
            System.out.println("------------------------------");

            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
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
                    String phone = input.nextLine();
                    break;

                    if (id <= 0) {
                        System.out.println("Invalid ID!");
                        break;
                    }

                    if (age <= 0) {
                        System.out.println("Invalid Age!");
                        break;
                    }

                    if (!email.contains("@")) {
                        System.out.println("Invalid Email!");
                        break;
                    }

                    if (phone.length() != 10) {
                        System.out.println("Phone must be 10 digits!");
                        break;
                    }

                    Student student = new Student(
                            id, name, course, age, email, phone);

                    manager.addStudentToDB(student);

                    break;
                // view
                case 2:
                    manager.viewStudentsDB();
                    break;
                // SEARCH BY ID
                case 3:
                    System.out.println("Enter student ID");
                    int searchId = input.nextInt();

                    manager.searchStudentById(searchId);
                    break;
                // SEARCH BY NAME
                case 4:
                    System.out.println("Enter student Name: ");
                    String searchName = input.nextLine();

                    manager.searchStudentByName(searchName);
                    break;
                // UPDATE
                case 5:
                    System.out.print("Enter ID to Update: ");
                    int updateId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = input.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = input.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = input.nextLine();

                    System.out.print("Enter New Phone: ");
                    String newPhone = input.nextLine();

                    if (newAge <= 0) {
                        System.out.println("Invalid Age!");
                        break;
                    }

                    if (!newEmail.contains("@")) {
                        System.out.println("Invalid Email!");
                        break;
                    }

                    if (newPhone.length() != 10) {
                        System.out.println("Invalid Phone Number!");
                        break;
                    }

                    manager.updateStudentInDB(updateId, newName, newCourse, newAge, newEmail, newPhone);
                    break;
                    // DELETE
                    System.out.print("Enter ID to Delete: ");
                    int deleteId = input.nextInt();

                    manager.deleteStudentFromDB(deleteId);
                    break;
                // EXIT
                case 0:
                    System.out.println("Exiting system... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }

        } while (condition);

        // INSERT
        manager.addStudentToDB(s1);

        // VIEW
        manager.viewStudentsDB();

        // UPDATE
        manager.updateStudentInDB(1, "Kushan Updated", "SE", 25, "malidukushan2001@gmail.com", "04455688");

        // DELETE
        // manager.deleteStudentFromDB(1);
    }

}
