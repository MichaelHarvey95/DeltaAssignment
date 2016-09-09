// Author: Martin Redmond
// Desc.: Main Page GUI Delta Healthcare
// Date: Aug. 2016


import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
				Integer.parseInt(String.valueOf(txtYourContactNumber.getText()));
			}
			catch(NumberFormatException nexc)
			{
				JOptionPane.showMessageDialog(null, ("Text entered in contact number field!! Please change this."),
						"An error has occurred!!", JOptionPane.INFORMATION_MESSAGE);
					return;
			}
						
			try{
				
				Integer.parseInt(String.valueOf(txtAge.getText()));
			}
			catch(NumberFormatException exc ){
				JOptionPane.showMessageDialog(null, ("Text entered in age field!! Please change this."),
					"An error has occurred!!", JOptionPane.INFORMATION_MESSAGE);
				return;
	}
	
		
	try{
		
		double price = 0.0;
		
		if(comboBox_6.getSelectedItem().toString() == "1")
		{
			price += 500.0;
		}
		else if(comboBox_6.getSelectedItem().toString() == "2")
		{
			price += 400.0;
		}
		else if(comboBox_6.getSelectedItem().toString() == "3")
		{
			price += 300.0;
		}
		else if(comboBox_6.getSelectedItem().toString() == "4")
		{
			price += 200.0;
		}
		else if(comboBox_6.getSelectedItem().toString() == "5")
		{
			price += 100.0;
		}
		
		if(comboBox_4.getSelectedItem().toString() == "Aging Eye (including cataracts, glaucoma and macular degeneration)")
		{
			price += 45.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Allergy")
		{
			price += 35.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Alzheimer\u2019s and Other Dementias")
		{
			price += 35.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Anemia")
		{
			price += 35.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Anxiety Disorders (including Panic Attacks and Phobias)")
		{
			price += 55.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Arthritis, (including Osteoarthritis and Rheumatoid Arthritis)")
		{
			price += 65.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Asthma" )
		{
			price += 55.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Blood Pressure (Hypertension)")
		{
			price += 45.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Breast Health and Disease (including Breast Cancer)")
		{
			price += 55.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Bursitis and Tendonitis")
		{
			price += 45.0;
		}
		else if(comboBox_4.getSelectedItem().toString() == "Cholesterol")
		{
			price += 55.0;
		}
				
		JOptionPane.showMessageDialog(null, ("Your quote is " + price + " euro"),
		"Your quote", JOptionPane.INFORMATION_MESSAGE);
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/deltaassignment","root","Buster*1");
		String query = ("INSERT INTO person(First_Name,Last_Name,Address,Town,County,Gender,Email,Phone_No,DOB,Dependants,Number_of_dependants,Health,Quote_Price)"
		+ "VALUES('"+txtFirstName.getText()+"','"+txtSurname.getText()+"','"+txtAddressLine.getText()+"','"+txtTown.getText()+"','"+comboBox.getSelectedItem().toString()+"','"+Gender+"','"+txtYourEmailAddress.getText()+"','"+txtYourContactNumber.getText()+"','"+txtAge.getText()+"','"+answer+"','"+comboBox_6.getSelectedItem().toString()+"','"+comboBox_4.getSelectedItem().toString()+"','"+price+"')");
		PreparedStatement statement = con.prepareStatement(query);
		statement.execute();
		statement.close();
		
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, ("An error has occurred!!"),
					"An error has occurred!!", JOptionPane.INFORMATION_MESSAGE);
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
		txtFirstName.addFocusListener(new FocusListener() {

		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtFirstName.setText(null); // Empty the text field when it receives focus
		    }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub// not used in this case
				
			}
		});
		txtFirstName.setBounds(42, 150, 122, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setForeground(new Color(112, 128, 144));
		txtSurname.setText("Surname");
		txtSurname.addFocusListener(new FocusListener() {

		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtSurname.setText(null); // Empty the text field when it receives focus
		    }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		txtSurname.setBounds(42, 181, 122, 20);
		contentPane.add(txtSurname);
		txtSurname.setColumns(10);
		
		txtAddressLine = new JTextField();
		txtAddressLine.setForeground(new Color(112, 128, 144));
		txtAddressLine.setText("Address line 1");
		txtAddressLine.addFocusListener(new FocusListener() {

		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtAddressLine.setText(null); // Empty the text field when it receives focus
		    }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		txtAddressLine.setBounds(42, 212, 122, 20);
		contentPane.add(txtAddressLine);
		txtAddressLine.setColumns(10);
		
		txtTown = new JTextField();
		txtTown.setForeground(new Color(112, 128, 144));
		txtTown.setText("Town");
		txtTown.addFocusListener(new FocusListener() {

		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtTown.setText(null); // Empty the text field when it receives focus
		    }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
		txtTown.setBounds(42, 274, 122, 20);
		contentPane.add(txtTown);
		txtTown.setColumns(10);
		
		
		//comboBox.setForeground(new Color(169, 169, 169));
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
					//custview.main(null);
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
		
		
		comboBox_4.setModel(new DefaultComboBoxModel<String>(new String[] {"Aging Eye (including cataracts, glaucoma and macular degeneration)", "Allergy", "Alzheimer\u2019s and Other Dementias", "Anemia", "Anxiety Disorders (including Panic Attacks and Phobias)", "Arthritis, (including Osteoarthritis and Rheumatoid Arthritis)", "Asthma", "Blood Pressure (Hypertension)", "Breast Health and Disease (including Breast Cancer)", "Bursitis and Tendonitis", "Cholesterol"}));
		comboBox_4.setBounds(607, 147, 338, 20);
		contentPane.add(comboBox_4);
		
		txtYourEmailAddress = new JTextField();
		txtYourEmailAddress.setForeground(new Color(169, 169, 169));
		txtYourEmailAddress.setDisabledTextColor(new Color(169, 169, 169));
		txtYourEmailAddress.addFocusListener(new FocusListener() {

		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtYourEmailAddress.setText(null); // Empty the text field when it receives focus
		    }

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}



		});
		
		
		
		
		txtYourEmailAddress.setText("Your email address");
		txtYourEmailAddress.setBounds(244, 150, 260, 20);
		contentPane.add(txtYourEmailAddress);
		txtYourEmailAddress.setColumns(10);
		
		txtYourContactNumber = new JTextField();
		txtYourContactNumber.setForeground(new Color(169, 169, 169));
		txtYourContactNumber.setText("Your contact number");
		txtYourContactNumber.setBounds(244, 181, 260, 20);
		
		txtYourContactNumber.addFocusListener(new FocusListener() {

		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtYourContactNumber.setText(null); // Empty the text field when it receives focus
		    }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		contentPane.add(txtYourContactNumber);
		txtYourContactNumber.setColumns(10);
		
		txtAge.setForeground(new Color(169, 169, 169));
		txtAge.setBounds(244, 229, 125, 17);
		txtAge.setText("Age");
		txtAge.addFocusListener(new FocusListener() {

		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtAge.setText(null); // Empty the text field when it receives focus
		    }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
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
		
		
		comboBox_6.setModel(new DefaultComboBoxModel<String>(new String[] {"0","1", "2", "3", "4", "5"}));
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
				dispose();
				Login lgin = new Login();
				lgin.main(null);
		}
		});
		
		JButton btnUserView = new JButton("User view");
		btnUserView.setForeground(Color.BLUE);
		btnUserView.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 12));
		btnUserView.setBounds(718, 434, 116, 23);
		contentPane.add(btnUserView);
		btnUserView.addActionListener(new ActionListener()
		{						
			public void actionPerformed(ActionEvent e) {
				dispose();
				customer_view cview = new customer_view();
				cview.main(null);
		}
		});
		
	}
	
	
}



	


