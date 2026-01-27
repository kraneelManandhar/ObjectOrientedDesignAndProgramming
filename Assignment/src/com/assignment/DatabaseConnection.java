package com.assignment;

import java.sql.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/userdb";
    private static final String USER = "admin";
    private static final String PASS = "password";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.err.println("Connection Failed! Check if MySQL is running.");
            e.printStackTrace();
            return null;
        }
    }

    public static void initializeDatabase() {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS questions (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "question_text TEXT, " +
                    "option_a VARCHAR(255), option_b VARCHAR(255), " +
                    "option_c VARCHAR(255), option_d VARCHAR(255), " +
                    "correct_option CHAR(1), " +
                    "difficulty ENUM('Beginner', 'Intermediate', 'Advanced'))");
            
            stmt.execute("CREATE TABLE IF NOT EXISTS players (" +
                    "player_id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "username VARCHAR(50) UNIQUE, " +
                    "score INT, " +
                    "level_taken VARCHAR(20))");
            
            System.out.println("Database tables verified successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}