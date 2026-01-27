package workshop;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Register extends JFrame {
    private JPanel contentPane;
    private JTextField idbox, namebox;
    private JPasswordField passbox; // Changed from course/email to password

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Register frame = new Register();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Register() {
        setTitle("User Registration & Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(50, 50, 100, 30);
        contentPane.add(lblId);

        idbox = new JTextField();
        idbox.setBounds(150, 50, 200, 30);
        contentPane.add(idbox);

        JLabel lblName = new JLabel("Full Name:");
        lblName.setBounds(50, 100, 100, 30);
        contentPane.add(lblName);

        namebox = new JTextField();
        namebox.setBounds(150, 100, 200, 30);
        contentPane.add(namebox);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(50, 150, 100, 30);
        contentPane.add(lblPass);

        passbox = new JPasswordField();
        passbox.setBounds(150, 150, 200, 30);
        contentPane.add(passbox);

        // --- BUTTON FOR SIGN UP (QN 4/5) ---
        JButton btnAdd = new JButton("Register");
        btnAdd.setBounds(50, 220, 120, 40);
        btnAdd.addActionListener(e -> {
            int id = Integer.parseInt(idbox.getText());
            String name = namebox.getText();
            String password = new String(passbox.getPassword());
            DbInstertion.insert(id, name, password);
            JOptionPane.showMessageDialog(null, "User Registered!");
        });
        contentPane.add(btnAdd);

        // --- BUTTON FOR LOGIN (QN 6) ---
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(230, 220, 120, 40);
        btnLogin.addActionListener(e -> {
            String name = namebox.getText();
            String password = new String(passbox.getPassword());
            
            // Logic for Requirement 6: Fetching and matching credentials
            if (validateLogin(name, password)) {
                JOptionPane.showMessageDialog(null, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Name or Password");
            }
        });
        contentPane.add(btnLogin);
    }

    // Requirement 6 Logic
    private boolean validateLogin(String name, String password) {
        String url = "jdbc:mysql://localhost/java_db";
        String query = "SELECT * FROM users WHERE full_name = ? AND password = ?";
        
        try (Connection conn = DriverManager.getConnection(url, "root", "");
             PreparedStatement pst = conn.prepareStatement(query)) {
            
            pst.setString(1, name);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            return rs.next(); // Returns true if credentials match
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}