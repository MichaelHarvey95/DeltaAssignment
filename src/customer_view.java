import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.border.EmptyBorder;
 import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
 import javax.swing.JTextField;
 //import com.jgoodies.forms.factories.DefaultComponentFactory;
 import java.awt.Color;
 import java.awt.Font;
 import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 
 public class customer_view extends JFrame {
 
	 private JPanel contentPane;
	 	private JLabel lblNumberOfDependants;
	 	private JLabel lblTown;
	 	private JLabel lblCounty;
	 	private JLabel lblGender;
	 	private JButton jbtnSubmit;
	 	private JTextField textField;
	 	private JTextField textField_1;
	 	private JTextField textField_2;
	 	private JTextField textField_3;
	 	private JTextField textField_4;
	 	private JTextField textField_5;
	 	private JTextField textField_6;
	 	private JTextField textField_7;
	 	private JTextField textField_8;
	 	private JTextField textField_9;
	 	private JTextField textField_10;
	 	private JTextField textField_11;
		/**
	 	 * Launch the application.
	 	 */
	 	public static void main(String[] args) {
	 		EventQueue.invokeLater(new Runnable() {
	 			public void run() {
	 				try {
	 					customer_view frame = new customer_view();
	 					frame.setVisible(true);
	 				} catch (Exception e) {
	 					e.printStackTrace();
	 			}
	 			}
	 		});
		}
	 	
		public void view()
		{
			try{
			String un = textField.getText();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deltaassignment","root","password");
			PreparedStatement stmt = con.prepareStatement("SELECT First_Name FROM person");
			stmt.setString(1, un);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				textField.setText(rs.getString("First_Name"));
			}
			/*String fn = rs.getString("First_Name");
			textField.setText(fn);
			String ln = rs.getString("Last_Name");
			textField_1.setText(ln);*/
			/*String add = rs.getString("Address");
			textField_2.setText(add);
			String twn = rs.getString("Town");
			textField_3.setText(twn);
			String County = rs.getString("County");
			textField_4.setText(County);
			String gndr = rs.getString("Gender");
			textField_5.setText(gndr);
			String eml = rs.getString("Email");
			textField_6.setText(eml);
			String phNo = rs.getString("Phone_No");
			textField_7.setText(phNo);
			String dob = rs.getString("DOB");
			textField_8.setText(dob);
			String depen = rs.getString("Dependants");
			textField_9.setText(depen);
			String noDepen = rs.getString("Number_of_dependants");
			textField_10.setText(noDepen);
			String hlth = rs.getString("Health");
			textField_11.setText(hlth);
			*/
	        
	        stmt.close();
			
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
		}

		}
	 	/**
		 * Create the frame.
	  */
	 	public customer_view() {
	 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		setBounds(100, 100, 868, 614);
	 		contentPane = new JPanel();
	 		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
	 		contentPane.setForeground(SystemColor.desktop);
	 		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	 		setContentPane(contentPane);
	 		contentPane.setLayout(null);
	 		
	 		JLabel lblHereIsYou = new JLabel(" Your Details Summary");
	 		lblHereIsYou.setFont(new Font("Tahoma", Font.BOLD, 24));
	 		lblHereIsYou.setForeground(Color.BLUE);
	 		lblHereIsYou.setBounds(263, 13, 282, 53);
	 		contentPane.add(lblHereIsYou);
	 		
	 		JLabel lblNewLabel = new JLabel("Contact Phone:");
	 		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		lblNewLabel.setBounds(24, 364, 101, 16);
	 		contentPane.add(lblNewLabel);
	 		
	 		JLabel lblNewLabel_1 = new JLabel("Date of Birth:");
	 		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		lblNewLabel_1.setBounds(24, 407, 90, 16);
	 		contentPane.add(lblNewLabel_1);
	 		
	 		JLabel lblNewLabel_2 = new JLabel("Health Issues:");
	 		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		lblNewLabel_2.setBounds(24, 529, 113, 16);
	 		contentPane.add(lblNewLabel_2);
	 		
	 		JLabel lblNewLabel_6 = new JLabel("Email Address:");
	 		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		lblNewLabel_6.setBounds(24, 97, 101, 16);
	 		contentPane.add(lblNewLabel_6);
	 		
	 		JLabel lblNewLabel_7 = new JLabel("Address:");
	 		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		lblNewLabel_7.setBounds(24, 209, 84, 16);
	 		contentPane.add(lblNewLabel_7);
	 		
	 		JLabel lblNewLabel_8 = new JLabel("Surname:");
	 		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		lblNewLabel_8.setBounds(24, 182, 84, 16);
	 		contentPane.add(lblNewLabel_8);
	 		
	 		JLabel lblNewLabel_9 = new JLabel("First Name:");
	 		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		lblNewLabel_9.setBounds(24, 142, 84, 16);
	 		contentPane.add(lblNewLabel_9);
	 		
	 		JLabel lblDependants = new JLabel("Dependants: ");
	 		lblDependants.setBounds(24, 444, 101, 14);
	 		lblDependants.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		contentPane.add(lblDependants);
	 		
	 		lblNumberOfDependants = new JLabel("Number of dependants ");
	 		lblNumberOfDependants.setBounds(24, 485, 157, 14);
	 		lblNumberOfDependants.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		contentPane.add(lblNumberOfDependants);
	 		
	 		lblTown = new JLabel("Town: ");
	 		lblTown.setBounds(24, 247, 46, 14);
	 		lblTown.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		contentPane.add(lblTown);
	 		
	 		lblCounty = new JLabel("County: ");
	 		lblCounty.setBounds(24, 285, 101, 14);
	 		lblCounty.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		contentPane.add(lblCounty);
	 		
	 		lblGender = new JLabel("Gender: ");
	 		lblGender.setBounds(24, 328, 113, 14);
	 		lblGender.setFont(new Font("Tahoma", Font.BOLD, 13));
	 		contentPane.add(lblGender);
	 			 		
	 		JButton btnView = new JButton("View");
	 		btnView.setBounds(556, 527, 89, 23);
	 		contentPane.add(btnView);
	 		btnView.addActionListener(new ActionListener()
	 		{
	 			public void actionPerformed(ActionEvent e)
	 			{
	 				try{
	 					String un = textField.getText();
	 					Class.forName("com.mysql.jdbc.Driver");
	 					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deltaassignment","root","password");
	 					PreparedStatement stmt = con.prepareStatement("SELECT First_Name,Last_Name,Address,Town,County,Gender,Phone_No,DOB,Dependants,Number_of_dependants,Health FROM person where Email = ?");
	 					stmt.setString(1, un);
	 					ResultSet rs = stmt.executeQuery();
	 					while(rs.next())
	 					{
	 						//textField.setText(rs.getString("Email"));
	 						textField_1.setText(rs.getString("First_Name"));
	 						textField_2.setText(rs.getString("Last_Name"));
	 						textField_3.setText(rs.getString("Address"));
	 						textField_4.setText(rs.getString("Town"));
	 						textField_5.setText(rs.getString("County"));
	 						textField_6.setText(rs.getString("Gender"));
	 						textField_7.setText(rs.getString("Phone_No"));
	 						textField_8.setText(rs.getString("DOB"));
	 						textField_9.setText(rs.getString("Dependants"));
	 						textField_10.setText(rs.getString("Number_of_dependants"));
	 						textField_11.setText(rs.getString("Health"));
	 					}
	 				}
	 				catch(Exception e1){
	 					e1.printStackTrace();
	 				}
	 			}
	 		});
	 		
	 		textField = new JTextField();
	 		textField.setBounds(239, 96, 174, 20);
	 		contentPane.add(textField);
	 		textField.setColumns(10);
	 		
	 		textField_1 = new JTextField();
	 		textField_1.setBounds(239, 141, 174, 20);
	 		contentPane.add(textField_1);
	 		textField_1.setColumns(10);
	 		
	 		textField_2 = new JTextField();
	 		textField_2.setBounds(239, 181, 174, 20);
	 		contentPane.add(textField_2);
	 		textField_2.setColumns(10);
	 		
	 		textField_3 = new JTextField();
	 		textField_3.setBounds(239, 209, 174, 20);
	 		contentPane.add(textField_3);
	 		textField_3.setColumns(10);
	 		
	 		textField_4 = new JTextField();
	 		textField_4.setBounds(239, 245, 174, 20);
	 		contentPane.add(textField_4);
	 		textField_4.setColumns(10);
	 		
	 		textField_5 = new JTextField();
	 		textField_5.setBounds(239, 285, 174, 20);
	 		contentPane.add(textField_5);
	 		textField_5.setColumns(10);
	 		
	 		textField_6 = new JTextField();
	 		textField_6.setBounds(239, 326, 174, 20);
	 		contentPane.add(textField_6);
	 		textField_6.setColumns(10);
	 		
	 		textField_7 = new JTextField();
	 		textField_7.setBounds(239, 363, 174, 20);
	 		contentPane.add(textField_7);
	 		textField_7.setColumns(10);
	 		
	 		textField_8 = new JTextField();
	 		textField_8.setBounds(239, 406, 174, 20);
	 		contentPane.add(textField_8);
	 		textField_8.setColumns(10);
	 		
	 		textField_9 = new JTextField();
	 		textField_9.setBounds(239, 442, 174, 20);
	 		contentPane.add(textField_9);
	 		textField_9.setColumns(10);
	 		
	 		textField_10 = new JTextField();
	 		textField_10.setBounds(239, 483, 174, 20);
	 		contentPane.add(textField_10);
	 		textField_10.setColumns(10);
	 		
	 		textField_11 = new JTextField();
	 		textField_11.setBounds(239, 528, 174, 20);
	 		contentPane.add(textField_11);
	 		textField_11.setColumns(10);
	 		
	 		JButton btnBackToMain = new JButton("Back to Main Form");
	 		btnBackToMain.setBounds(655, 527, 157, 23);
	 		contentPane.add(btnBackToMain);
	 		btnBackToMain.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
 					TestHealthForm thf = new TestHealthForm();
 					thf.main(null);	
				}
	 		});
	 		
	 	}
	 }