package tutorial;

import java.sql.*;

public class DBconnection {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/java_db";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password);
				Statement stm = conn.createStatement();) {

//			String query = "CREATE TABLE students (\r\n"
//					+ "    id INT AUTO_INCREMENT PRIMARY KEY,\r\n"
//					+ "    full_name VARCHAR(100) NOT NULL,\r\n"
//					+ "    course VARCHAR(100) NOT NULL,\r\n"
//					+ "    email VARCHAR(150) NOT NULL UNIQUE\r\n"
//					+ ");\r\n"
//					+ "";
			
			String query = "INSERT INTO students (full_name, course, email) VALUES\r\n"
					+ "('Ram Sharma', 'BSc Computer Science', 'ram.sharma@example.com'),\r\n"
					+ "('Sita Adhikari', 'BCA', 'sita.adhikari@example.com'),\r\n"
					+ "('Amit Thapa', 'BIT', 'amit.thapa@example.com'),\r\n"
					+ "('Nisha Karki', 'BIM', 'nisha.karki@example.com'),\r\n"
					+ "('Rohit Gurung', 'BSc IT', 'rohit.gurung@example.com');\r\n"
					+ "";
			
			stm.execute(query);
			System.out.println("Connection Successful.");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}