// Author: Martin Redmond
// Desc.: Main Page GUI Delta Healthcare
// Date: Aug. 2016

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class TestHealthForm extends JFrame{ 

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtSurname;
	private JTextField txtAddressLine;
	private JTextField txtAddressLine_1;
	private JTextField txtTown;
	private JTextField txtPostCode;
	private JButton btnConfirm;
	private JTextField txtYourEmailAddress;
	private JTextField txtYourContactNumber;

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
		
		txtAddressLine_1 = new JTextField();
		txtAddressLine_1.setForeground(new Color(112, 128, 144));
		txtAddressLine_1.setText("Address line 2");
		txtAddressLine_1.setBounds(42, 243, 122, 20);
		contentPane.add(txtAddressLine_1);
		txtAddressLine_1.setColumns(10);
		
		txtTown = new JTextField();
		txtTown.setForeground(new Color(112, 128, 144));
		txtTown.setText("Town");
		txtTown.setBounds(42, 274, 122, 20);
		contentPane.add(txtTown);
		txtTown.setColumns(10);
		
		txtPostCode = new JTextField();
		txtPostCode.setForeground(new Color(112, 128, 144));
		txtPostCode.setText("Post code");
		txtPostCode.setBounds(42, 336, 122, 20);
		contentPane.add(txtPostCode);
		txtPostCode.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setForeground(new Color(169, 169, 169));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"County", "Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", "Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow"}));
		comboBox.setToolTipText("Select County");
		comboBox.setBounds(42, 305, 122, 20);
		contentPane.add(comboBox);
		
		btnConfirm = new JButton("Submit");
		btnConfirm.setForeground(Color.BLUE);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
	
		
 		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setForeground(new Color(169, 169, 169));
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"YYYY", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900"}));
		comboBox_1.setBounds(429, 212, 75, 20);
		contentPane.add(comboBox_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setForeground(new Color(169, 169, 169));
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"MMM", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		comboBox_2.setBounds(356, 212, 63, 20);
		contentPane.add(comboBox_2);
		
		JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.setForeground(new Color(169, 169, 169));
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_3.setBounds(300, 212, 46, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblPleaseTickAs = new JLabel("Please tick as appropriate:");
		lblPleaseTickAs.setBounds(607, 346, 164, 14);
		contentPane.add(lblPleaseTickAs);
		
		JLabel lblDoYouSmoke = new JLabel("Do you smoke?");
		lblDoYouSmoke.setBounds(607, 370, 105, 14);
		contentPane.add(lblDoYouSmoke);
		
		JLabel lblDrinkAlcohol = new JLabel("Drink alcohol?");
		lblDrinkAlcohol.setBounds(607, 401, 105, 14);
		contentPane.add(lblDrinkAlcohol);
		
		JLabel lblHaveYou = new JLabel("Do you suffer from any of the following? ");
		lblHaveYou.setBounds(607, 122, 338, 14);
		contentPane.add(lblHaveYou);
		
		JComboBox<String> comboBox_4 = new JComboBox<String>();
		comboBox_4.setModel(new DefaultComboBoxModel<String>(new String[] {"Aging Eye (including cataracts, glaucoma and macular degeneration)", "Allergy", "Alzheimer\u2019s and Other Dementias", "Anemia", "Anxiety Disorders (including Panic Attacks and Phobias)", "Arthritis, (including Osteoarthritis and Rheumatoid Arthritis)", "Asthma", "Blood Pressure (Hypertension)", "Breast Health and Disease (including Breast Cancer)", "Bursitis and Tendonitis", "Cholesterol", "Colds and Flu", "Colon Health and Disease (including Colon Cancer)", "Depression", "Diabetes", "Digestive Disorders", "Fatigue and Low Energy", "Foot Problems and Foot Care", "Grief and Loss", "Headache", "Hearing Loss", "Kidney Disease", "Lung Diseases (including COPD)", "Memory Loss", "Menopause", "Osteoporosis", "Pain, Back", "Pain, Generalized", "Pain, Hand", "Pain, Hip", "Pain, Knee", "Pain, Neck", "Parkinson\u2019s Disease", "Pregnancy", "Prostate Health and Disease (including Prostate Cancer)", "Skin Hair and Nails", "Sleep Disorders Adults", "Stress", "Stroke", "Thyroid Disorders", "Urine and Bladder Problems"}));
		comboBox_4.setBounds(607, 147, 338, 20);
		contentPane.add(comboBox_4);
		
		JRadioButton Y = new JRadioButton("yes");
		Y.setBounds(607, 181, 46, 23);
		contentPane.add(Y);
		
		JRadioButton N = new JRadioButton("no");
		N.setBounds(671, 181, 46, 22);
		contentPane.add(N);
		ButtonGroup selCon = new ButtonGroup();
		selCon.add(N);
		selCon.add(Y);
		
		JLabel lblPleaseGiveDetails = new JLabel("Please give details in the space provided...");
		lblPleaseGiveDetails.setBounds(607, 215, 321, 14);
		contentPane.add(lblPleaseGiveDetails);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(609, 241, 319, 56);
		contentPane.add(textArea);
		
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
		
		JLabel lblDateOfBirth = new JLabel("Date of birth:");
		lblDateOfBirth.setBounds(204, 213, 366, 14);
		contentPane.add(lblDateOfBirth);
		
		JComboBox<String> comboBox_5 = new JComboBox<String>();
		comboBox_5.setBackground(new Color(255, 255, 255));
		comboBox_5.setForeground(new Color(169, 169, 169));
		comboBox_5.setModel((ComboBoxModel<String>) new DefaultComboBoxModel<String>(new String[] {"Title", "Dr", "Mr", "Mrs", "Miss", "Prof"}));
		comboBox_5.setBounds(42, 126, 57, 20);
		contentPane.add(comboBox_5);
		
		JLabel lblGender_1 = new JLabel("Gender:");
		lblGender_1.setBounds(204, 122, 46, 14);
		contentPane.add(lblGender_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(280, 118, 89, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(382, 118, 122, 23);
		contentPane.add(rdbtnFemale);
		ButtonGroup selGender = new ButtonGroup();
		selGender.add(rdbtnNewRadioButton);
		selGender.add(rdbtnFemale);
		
		JLabel lblWouldYouLike = new JLabel("Include some dependants?");
		lblWouldYouLike.setBounds(204, 275, 165, 14);
		contentPane.add(lblWouldYouLike);
		
		JRadioButton rdbtnYes = new JRadioButton("yes");
		rdbtnYes.setBounds(382, 273, 46, 23);
		contentPane.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("no");
		rdbtnNo.setBounds(458, 273, 46, 22);
		contentPane.add(rdbtnNo);
		ButtonGroup selDep = new ButtonGroup();
		selDep.add(rdbtnNo);
		selDep.add(rdbtnYes);
		
		JLabel lblPleaseSelectNo = new JLabel("Please select no. of dependants:");
		lblPleaseSelectNo.setBounds(204, 311, 215, 14);
		contentPane.add(lblPleaseSelectNo);
		
		JComboBox<String> comboBox_6 = new JComboBox<String>();
		comboBox_6.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_6.setBounds(460, 305, 46, 20);
		contentPane.add(comboBox_6);
		
		JRadioButton radioButton = new JRadioButton("yes");
		radioButton.setBounds(718, 361, 46, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("no");
		radioButton_1.setBounds(782, 361, 46, 22);
		contentPane.add(radioButton_1);
		ButtonGroup selS = new ButtonGroup();
		selS.add(radioButton);
		selS.add(radioButton_1);
      
		JRadioButton radioButton_2 = new JRadioButton("yes");
		radioButton_2.setBounds(721, 392, 46, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("no");
		radioButton_3.setBounds(785, 392, 46, 22);
		contentPane.add(radioButton_3);
		ButtonGroup selD = new ButtonGroup();
		selD.add(radioButton_2);
		selD.add(radioButton_3);
		
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



	


