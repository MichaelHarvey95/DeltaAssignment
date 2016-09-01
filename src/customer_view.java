 import java.awt.BorderLayout;
 import java.awt.EventQueue;
 
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.border.EmptyBorder;
 import javax.swing.JLabel;
 import javax.swing.JTextPane;
 import javax.swing.JTextField;
 //import com.jgoodies.forms.factories.DefaultComponentFactory;
 import java.awt.Color;
 import java.awt.Font;
 import java.awt.SystemColor;
 
 public class customer_view extends JFrame {
 
 	private JPanel contentPane;
 	private JTextField textField;
 	private JTextField textField_1;
 	private JTextField textField_2;
 	private JTextField textField_3;
 	private JTextField textField_4;
 	private JTextField textField_5;
 	private JTextField textField_6;
 	private JTextField textField_7;
 	private JTextField textField_8;
 
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
 		lblNewLabel.setBounds(24, 300, 101, 16);
 		contentPane.add(lblNewLabel);
 		
 		JLabel lblNewLabel_1 = new JLabel("Date of Birth:");
 		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
 		lblNewLabel_1.setBounds(24, 344, 90, 16);
 		contentPane.add(lblNewLabel_1);
 		
 		JLabel lblNewLabel_2 = new JLabel("Health Issues:");
 		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
 		lblNewLabel_2.setBounds(24, 389, 113, 16);
 		contentPane.add(lblNewLabel_2);
 		
 		JLabel lblNewLabel_3 = new JLabel("Do you smoke:");
 		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
 		lblNewLabel_3.setBounds(24, 432, 101, 16);
 		contentPane.add(lblNewLabel_3);
 		
 		JLabel lblNewLabel_4 = new JLabel("Do you drink:");
 		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
 		lblNewLabel_4.setBounds(24, 478, 90, 16);
 		contentPane.add(lblNewLabel_4);
 		
 		JLabel lblNewLabel_6 = new JLabel("Email Address:");
 		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
 		lblNewLabel_6.setBounds(24, 250, 101, 16);
 		contentPane.add(lblNewLabel_6);
 		
 		JLabel lblNewLabel_7 = new JLabel("Address:");
 		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
 		lblNewLabel_7.setBounds(24, 202, 84, 16);
 		contentPane.add(lblNewLabel_7);
 		
 		JLabel lblNewLabel_8 = new JLabel("Surname:");
 		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
 		lblNewLabel_8.setBounds(24, 158, 84, 16);
 		contentPane.add(lblNewLabel_8);
 		
 		JLabel lblNewLabel_9 = new JLabel("First Name:");
 		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
 		lblNewLabel_9.setBounds(24, 114, 84, 16);
 		contentPane.add(lblNewLabel_9);
 		
 		textField = new JTextField();
 		textField.setBounds(345, 111, 116, 22);
 		contentPane.add(textField);
 		textField.setColumns(10);
 		
 		textField_1 = new JTextField();
 		textField_1.setBounds(345, 155, 116, 22);
 		contentPane.add(textField_1);
 		textField_1.setColumns(10);
 		
 		textField_2 = new JTextField();
 		textField_2.setBounds(345, 199, 116, 22);
 		contentPane.add(textField_2);
 		textField_2.setColumns(10);
 		
 		textField_3 = new JTextField();
 		textField_3.setBounds(345, 247, 116, 22);
 		contentPane.add(textField_3);
 		textField_3.setColumns(10);
 		
 		textField_4 = new JTextField();
 		textField_4.setBounds(345, 297, 116, 22);
 		contentPane.add(textField_4);
 		textField_4.setColumns(10);
 		
 		textField_5 = new JTextField();
 		textField_5.setBounds(345, 341, 116, 22);
 		contentPane.add(textField_5);
 		textField_5.setColumns(10);
 		
 		textField_6 = new JTextField();
 		textField_6.setBounds(345, 386, 116, 22);
 		contentPane.add(textField_6);
 		textField_6.setColumns(10);
 		
 		textField_7 = new JTextField();
 		textField_7.setBounds(345, 429, 116, 22);
 		contentPane.add(textField_7);
 		textField_7.setColumns(10);
 		
 		textField_8 = new JTextField();
 		textField_8.setBounds(345, 475, 116, 22);
 		contentPane.add(textField_8);
 		textField_8.setColumns(10);
 		
 	}
 }
