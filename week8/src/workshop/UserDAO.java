package workshop;
import java.sql.*;

public class UserDAO {
    
    // Method to save user during sign up
    public boolean signUp(String username, String password) {
        String sql = "INSERT INTO users(username, password) VALUES(?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            int rows = pstmt.executeUpdate();
            return rows > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Method to fetch user by name
    public String getPasswordByUsername(String username) {
        String sql = "SELECT password FROM users WHERE username = ?";
        String password = null;
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                password = rs.getString("password");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return password;
    }
    
    // Method to validate login credentials
    public boolean validateLogin(String username, String password) {
        String dbPassword = getPasswordByUsername(username);
        return dbPassword != null && dbPassword.equals(password);
    }
}