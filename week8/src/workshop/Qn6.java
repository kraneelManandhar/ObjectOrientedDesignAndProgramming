package workshop;

import javax.swing.*;
import java.sql.*;

public class Qn6 {
	public static void main(String[] args) {
		String user = JOptionPane.showInputDialog("Username:");
		String pass = JOptionPane.showInputDialog("Password:");

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop_db", "root", "password")) {
			String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, user);
			pst.setString(2, pass);
			
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(null, "Login Successful!");
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Credentials");
			}
		} catch (Exception e) { e.printStackTrace(); }
	}
}