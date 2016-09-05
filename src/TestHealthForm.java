// Author: Martin Redmond
// Desc.: Main Page GUI Delta Healthcare
// Date: Aug. 2016


import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class TestHealthForm extends JFrame{ 

	customer_view custview = new customer_view();
	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtSurname;
	private JTextField txtAddressLine;
	private JTextField txtTown;
	private JButton btnConfirm;
	private JTextField txtYourEmailAddress;
	private JTextField txtYourContactNumber;
	JComboBox<String> comboBox = new JComboBox<String>();
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
	JRadioButton rdbtnFemale = new JRadioButton("Female");
	String Gender, answer;
	JTextField txtAge = new JTextField();
	JComboBox<String> comboBox_6 = new JComboBox<String>();
	JComboBox<String> comboBox_4 = new JComboBox<String>();
	
	//String Text = txtAge.getText().trim();
	//int a = Integer.parseInt(txtAge.getText()); 
	
	/*JComboBox<String> comboBox_1 = new JComboBox<String>();
	JComboBox<String> comboBox_2 = new JComboBox<String>();
	JComboBox<String> comboBox_3 = new JComboBox<String>();
	String day=(String)comboBox_1.getSelectedItem();
    String month=(String)comboBox_2.getSelectedItem();
    String year=(String)comboBox_3.getSelectedItem();
    String dob = year+"-"+month+"-"+day;
    */
    
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestHealthForm frame = new TestHealthForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void insert()
	{
		try{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deltaassignment","root","password");
		
		
		String query = ("INSERT INTO person(First_Name,Last_Name,Address,Town,County,Gender,Email,Phone_No,DOB,Dependants,Number_of_dependants,Health)"
		+ "VALUES('"+txtFirstName.getText()+"','"+txtSurname.getText()+"','"+txtAddressLine.getText()+"','"+txtTown.getText()+"','"+comboBox.getSelectedItem().toString()+"','"+Gender+"','"+txtYourEmailAddress.getText()+"','"+txtYourContactNumber.getText()+"','"+txtAge.getText()+"','"+answer+"','"+comboBox_6.getSelectedItem().toString()+"','"+comboBox_4.getSelectedItem().toString()+"')");
		PreparedStatement statement = con.prepareStatement(query);
		statement.execute();
		statement.close();
		
		}
		catch(Exception e){
			e.printStackTrace();
	}

	}
	/**
	 * Create the frame.
	 */
	public TestHealthForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setSelectedTextColor(new Color(0, 0, 0));
		txtFirstName.setForeground(new Color(112, 128, 144));
		txtFirstName.setDisabledTextColor(new Color(169, 169, 169));
		txtFirstName.setCaretColor(Color.LIGHT_GRAY);
		txtFirstName.setToolTipText("Type here");
		txtFirstName.setText("First name");
		txtFirstName.setBounds(42, 150, 122, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setForeground(new Color(112, 128, 144));
		txtSurname.setText("Surname");
		txtSurname.setBounds(42, 181, 122, 20);
		contentPane.add(txtSurname);
		txtSurname.setColumns(10);
		
		txtAddressLine = new JTextField();
		txtAddressLine.setForeground(new Color(112, 128, 144));
		txtAddressLine.setText("Address line 1");
		txtAddressLine.setBounds(42, 212, 122, 20);
		contentPane.add(txtAddressLine);
		txtAddressLine.setColumns(10);
		
		txtTown = new JTextField();
		txtTown.setForeground(new Color(112, 128, 144));
		txtTown.setText("Town");
		txtTown.setBounds(42, 274, 122, 20);
		contentPane.add(txtTown);
		txtTown.setColumns(10);
		
		
		comboBox.setForeground(new Color(169, 169, 169));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"County", "Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", "Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow"}));
		comboBox.setToolTipText("Select County");
		comboBox.setBounds(42, 305, 122, 20);
		contentPane.add(comboBox);
		
		btnConfirm = new JButton("Submit");
		btnConfirm.setForeground(Color.BLUE);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					insert();
					custview.main(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnConfirm.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 12));
		btnConfirm.setBounds(868, 435, 89, 23);
		contentPane.add(btnConfirm);
		
		JTextArea txtrWelcomeToDelta = new JTextArea();
		txtrWelcomeToDelta.setBackground(new Color(224, 255, 255));
		txtrWelcomeToDelta.setForeground(new Color(0, 0, 153));
		txtrWelcomeToDelta.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 18));
		txtrWelcomeToDelta.setWrapStyleWord(true);
		txtrWelcomeToDelta.setText("Complete the short form below to obtain an instant quote for your Healthcare policy.");
		txtrWelcomeToDelta.setBounds(29, 50, 928, 20);
		contentPane.add(txtrWelcomeToDelta);
		
		JTextArea title = new JTextArea();//DefaultComponentFactory.getInstance().createTitle("Welcome to Delta Healthcare");
		title.setBackground(new Color(224, 255, 255));
		title.setForeground(new Color(0, 0, 153));
		title.setText("Welcome to Delta Healthcare");
 		title.setFont(new Font("Tahoma", Font.BOLD, 16));
 		title.setBounds(369, 11, 243, 30);
 		contentPane.add(title);
	
			
		JLabel lblHaveYou = new JLabel("Do you suffer from any of the following? ");
		lblHaveYou.setBounds(607, 122, 338, 14);
		contentPane.add(lblHaveYou);
		
		
		comboBox_4.setModel(new DefaultComboBoxModel<String>(new String[] {"Aging Eye (including cataracts, glaucoma and macular degeneration)", "Allergy", "Alzheimer\u2019s and Other Dementias", "Anemia", "Anxiety Disorders (including Panic Attacks and Phobias)", "Arthritis, (including Osteoarthritis and Rheumatoid Arthritis)", "Asthma", "Blood Pressure (Hypertension)", "Breast Health and Disease (including Breast Cancer)", "Bursitis and Tendonitis", "Cholesterol", "Colds and Flu", "Colon Health and Disease (including Colon Cancer)", "Depression", "Diabetes", "Digestive Disorders", "Fatigue and Low Energy", "Foot Problems and Foot Care", "Grief and Loss", "Headache", "Hearing Loss", "Kidney Disease", "Lung Diseases (including COPD)", "Memory Loss", "Menopause", "Osteoporosis", "Pain, Back", "Pain, Generalized", "Pain, Hand", "Pain, Hip", "Pain, Knee", "Pain, Neck", "Parkinson\u2019s Disease", "Pregnancy", "Prostate Health and Disease (including Prostate Cancer)", "Skin Hair and Nails", "Sleep Disorders Adults", "Stress", "Stroke", "Thyroid Disorders", "Urine and Bladder Problems"}));
		comboBox_4.setBounds(607, 147, 338, 20);
		contentPane.add(comboBox_4);
		
		txtYourEmailAddress = new JTextField();
		txtYourEmailAddress.setForeground(new Color(169, 169, 169));
		txtYourEmailAddress.setDisabledTextColor(new Color(169, 169, 169));
		txtYourEmailAddress.setText("Your email address");
		txtYourEmailAddress.setBounds(244, 150, 260, 20);
		contentPane.add(txtYourEmailAddress);
		txtYourEmailAddress.setColumns(10);
		
		txtYourContactNumber = new JTextField();
		txtYourContactNumber.setForeground(new Color(169, 169, 169));
		txtYourContactNumber.setText("Your contact number");
		txtYourContactNumber.setBounds(244, 181, 260, 20);
		contentPane.add(txtYourContactNumber);
		txtYourContactNumber.setColumns(10);
		
		txtAge.setForeground(new Color(169, 169, 169));
		txtAge.setBounds(244, 229, 125, 17);
		txtAge.setText("Age");
		contentPane.add(txtAge);
				
		JLabel lblGender_1 = new JLabel("Gender:");
		lblGender_1.setBounds(204, 122, 46, 14);
		contentPane.add(lblGender_1);
		
		rdbtnNewRadioButton.setBounds(280, 118, 89, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener()
		{						
			public void actionPerformed(ActionEvent e) {
				Gender = "Male";
		}
		});
		
		
		
		rdbtnFemale.setBounds(382, 118, 122, 23);
		contentPane.add(rdbtnFemale);
		ButtonGroup selGender = new ButtonGroup();
		selGender.add(rdbtnNewRadioButton);
		selGender.add(rdbtnFemale);
		rdbtnFemale.addActionListener(new ActionListener()
		{						
			public void actionPerformed(ActionEvent e) {
			Gender = "Female";
		}
		});
		
		JLabel lblWouldYouLike = new JLabel("Include some dependants?");
		lblWouldYouLike.setBounds(204, 275, 165, 14);
		contentPane.add(lblWouldYouLike);
		
		JRadioButton rdbtnYes = new JRadioButton("yes");
		rdbtnYes.setBounds(382, 273, 46, 23);
		contentPane.add(rdbtnYes);
		rdbtnYes.addActionListener(new ActionListener()
		{						
			public void actionPerformed(ActionEvent e) {
				answer = "yes";
		}
		});
		
		JRadioButton rdbtnNo = new JRadioButton("no");
		rdbtnNo.setBounds(458, 273, 46, 22);
		contentPane.add(rdbtnNo);
		rdbtnNo.addActionListener(new ActionListener()
		{						
			public void actionPerformed(ActionEvent e) {
				answer = "no";
		}
		});
		ButtonGroup selDep = new ButtonGroup();
		selDep.add(rdbtnNo);
		selDep.add(rdbtnYes);
		
		JLabel lblPleaseSelectNo = new JLabel("Please select no. of dependants:");
		lblPleaseSelectNo.setBounds(204, 311, 215, 14);
		contentPane.add(lblPleaseSelectNo);
		
		
		comboBox_6.setModel(new DefaultComboBoxModel<String>(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_6.setBounds(460, 305, 46, 20);
		contentPane.add(comboBox_6);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBackground(Color.PINK);
		btnAdminLogin.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 12));
		btnAdminLogin.setBounds(42, 435, 122, 23);
		contentPane.add(btnAdminLogin);
		btnAdminLogin.addActionListener(new ActionListener()
		{						
			public void actionPerformed(ActionEvent e) {
				Login lgin = new Login();
				lgin.main(null);
		}
		});
		
	}
	
	
}



	


