package workshop;

import java.sql.*;

public class DbInstertion {
    public static void insert(int id, String name, String password) {
        String url = "jdbc:mysql://localhost/java_db";
        String user = "root";
        String pass = "";

        // Updated to match your schema: id, full_name, password
        String query = "INSERT INTO users (id, full_name, password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pst = conn.prepareStatement(query)) {
            
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, password);
            pst.executeUpdate();
            System.out.println("Registration Successful");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}