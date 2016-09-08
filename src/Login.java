//Author: Michael Harvey, L00102447
//Desc: Login application for the admin.
//Date: August 2016

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String [] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame and username and password cannot be null. Must contain correct characters.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(69, 44, 66, 24);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(69, 129, 66, 20);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(200, 46, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 129, 140, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(200, 194, 89, 23);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					
				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deltaassignment","root","password");
					PreparedStatement ps = con.prepareStatement("SELECT * FROM Admin WHERE username = ? AND password = ?");
					ps.setString(1, textField.getText());
					ps.setString(2, textField_1.getText());
					ResultSet result = ps.executeQuery();
					
					if(result.next())
					{
						JOptionPane.showMessageDialog(null, "Username and password correct");
						Admin admn = new Admin();
						admn.main(null);
						
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Invalid login details");
						
					}
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, ("Incorrect login details!!"),
							"An error has occurred!!", JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(306, 194, 89, 23);
		contentPane.add(btnBack);
		
		btnBack.addActionListener(new ActionListener()
		{
			/**
			 * Application must return to the main form when back button is clicked.
			 */
			public void actionPerformed(ActionEvent e)
			{
				TestHealthForm thf = new TestHealthForm();
				thf.main(null);
			}
		});
	}
}

