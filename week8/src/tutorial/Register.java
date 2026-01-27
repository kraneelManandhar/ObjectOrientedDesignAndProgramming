package tutorial;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idbox;
	private JTextField namebox;
	private JTextField coursebox;
	private JTextField emailbox;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setTitle("JPT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 1561, 807);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(390, 229, 110, 75);
		contentPane.add(lblNewLabel);
		
		JLabel lblFullName = new JLabel("Full name ");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFullName.setBounds(390, 325, 110, 75);
		contentPane.add(lblFullName);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCourse.setBounds(390, 412, 110, 75);
		contentPane.add(lblCourse);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(390, 506, 110, 75);
		contentPane.add(lblEmail);
		
		idbox = new JTextField();
		idbox.setBounds(619, 249, 284, 43);
		contentPane.add(idbox);
		idbox.setColumns(10);
		
		namebox = new JTextField();
		namebox.setColumns(10);
		namebox.setBounds(619, 345, 284, 43);
		contentPane.add(namebox);
		
		coursebox = new JTextField();
		coursebox.setColumns(10);
		coursebox.setBounds(619, 432, 284, 43);
		contentPane.add(coursebox);
		
		emailbox = new JTextField();
		emailbox.setColumns(10);
		emailbox.setBounds(619, 526, 284, 43);
		contentPane.add(emailbox);
		
		JLabel lblNewLabel_1 = new JLabel("Student Registration");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblNewLabel_1.setBounds(550, 45, 485, 103);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idbox.getText();
				String name = namebox.getText();
				String course = coursebox.getText();
				String email = emailbox.getText();
				
				int ids = Integer.parseInt(id);
				
				DbInstertion.insert(ids, name, course, email);
			
			}
		});
		btnNewButton.setBounds(682, 649, 172, 55);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1031, 147, 452, 502);
		contentPane.add(scrollPane);
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("id");
		model.addColumn("full_name");
		model.addColumn("course");
		model.addColumn("email");
		table = new JTable(model);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.desktop, null, null, null));
		scrollPane.setViewportView(table);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DbDisplay.display(model);
			}
		});
		btnShow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShow.setBackground(new Color(135, 206, 250));
		btnShow.setBounds(1199, 670, 172, 55);
		contentPane.add(btnShow);

	}
}
