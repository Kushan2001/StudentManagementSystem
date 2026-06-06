package src;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/student_management";

    private static final String USER = "root";

    private static final String PASSWORD = "admin";

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD);

            return con;

        } catch (Exception e) {

            System.out.println("Database Connection Failed!");
            e.printStackTrace();

            return null;
        }
    }
}
