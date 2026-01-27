package workshop;

import java.sql.*;
import javax.swing.*;

public class Qn4 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Username for Signup:");
		String pass = JOptionPane.showInputDialog("Enter Password:");

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop_db", "root", "")) {
			String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, pass);
			pst.executeUpdate();
			System.out.println("User stored in database.");
		} catch (Exception e) { e.printStackTrace(); }
	}
}