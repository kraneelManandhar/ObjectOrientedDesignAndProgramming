package tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbInstertion {
	public static void insert(int id , String name, String course , String email) {
		String url = "jdbc:mysql://localhost/java_db";
		String username = "root";
		String password = "";
		String query = "Insert into students (id,full_name,course,email) VALUES (?,?,?,?)";
		try (Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement pstm = conn.prepareStatement(query);) {
			
					pstm.setInt(1,id);
					pstm.setString(2, name);
					pstm.setString(3, course);
					pstm.setString(4, email);
					
					pstm.executeUpdate();
			System.out.println("Insertion Successful.");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}