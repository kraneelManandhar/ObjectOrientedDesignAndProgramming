package workshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class DbDisplay {
	public static void display(DefaultTableModel model) {
		String url = "jdbc:mysql://localhost/java_db";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password);
				Statement stm = conn.createStatement()) {
			
			model.setRowCount(0);

			String query = "Select * from students";
			ResultSet rs = stm.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String full_name = rs.getString("full_name");
				String course = rs.getString("course");
				String email = rs.getString("email");
				System.out.println(id + "   " + full_name + "   "  + course + "   " + email);
				
				model.addRow(new Object[] {id,full_name,course,email});
				}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
