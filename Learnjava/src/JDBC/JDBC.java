package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        // JDBC URL for MySQL
        String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc";

        // Database credentials
        String username = "root";
        String password = "12345678";

        // Establishing the connection
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
    }
}

