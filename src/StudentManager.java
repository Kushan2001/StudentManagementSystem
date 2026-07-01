package src;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentManager {

    public void addStudentToDB(Student student) {

         if (studentExists(student.id)) {
            System.out.println("Student ID already exists!");
            return;
        }
        
        Connection con = DBConnection.getConnection();
        try {

            String sql = "INSERT INTO students (id, name, course, age, email, phone_number) VALUES (?,?,?,?,?,?)";

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

    // Add Search by ID
    public void searchStudentById(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM students WHERE id = ?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                System.out.println("---------------------------");
                System.out.println("ID      : " + rs.getInt("id"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("Course  : " + rs.getString("course"));
                System.out.println("Age     : " + rs.getInt("age"));
                System.out.println("Email   : " + rs.getString("email"));
                System.out.println("Phone   : " + rs.getString("phone_number"));

            } else {
                System.out.println("Student not found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean studentExists(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT id FROM students WHERE id=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();

            return rs.next(); 

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // Search by Name Student
    public void searchStudentByName(String name) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM students WHERE name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            boolean found = false;

            while (rs.next()) {
                found = true;

                System.out.println("---------------------------");
                System.out.println("ID      : " + rs.getInt("id"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("Course  : " + rs.getString("course"));
                System.out.println("Age     : " + rs.getInt("age"));
                System.out.println("Email   : " + rs.getString("email"));
                System.out.println("Phone   : " + rs.getString("phone_number"));
            }
            if (!found) {
                System.out.println("Student not found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudentsDB() {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM students";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n-----------------------------");
            System.out.printf("%-5s %-15s %-10s %-5s %-25s %-15s\n",
                    "ID", "Name", "Course", "Age", "Email", "Phone");

            while (rs.next()) {

                System.out.printf("%-5d %-15s %-10s %-5d %-25s %-15s\n",
                rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("course"),
                    rs.getInt("age"),
                    rs.getString("email"),
                    rs.getString("phone_number"));
            }
            System.out.println("--------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Student
    public void deleteStudentFromDB(int id) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM students WHERE id=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, id);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Student  deleted successfully..!");
            } else {
                System.out.println("Student not found..!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Update Student
    public void updateStudentInDB(int id, String name, String course, int age, String email, String phoneNo) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE students SET name=?, course=?, age=?, email=?, phone_number=? WHERE id=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setString(2, course);
            pst.setInt(3, age);
            pst.setString(4, email);
            pst.setString(5, phoneNo);
            pst.setInt(6, id);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Student update successfully..!");
            } else {
                System.out.println("Student not found..!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
