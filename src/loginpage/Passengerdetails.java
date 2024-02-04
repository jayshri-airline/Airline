package loginpage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Passengerdetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPassengerName;
	private JTextField txtFlightCode;
	private JTextField txtGender;
	private JTextField txtPassportNumber;
	private JTextField txtNoofSeat;
	private JTextField txtClass;
	private JTextField txtEmailAddress;
	private JTextField txtTelephoneNumber;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton_3;
	Connection con;
	Statement st;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passengerdetails frame = new Passengerdetails();
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
	public Passengerdetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Airlinespace");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(205, 11, 262, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Passenger details");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(232, 44, 212, 35);
		contentPane.add(lblNewLabel_1);
		
		txtPassengerName = new JTextField();
		txtPassengerName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPassengerName.setText("Passenger Name");
		txtPassengerName.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassengerName.setBounds(31, 81, 147, 24);
		contentPane.add(txtPassengerName);
		txtPassengerName.setColumns(10);
		
		txtFlightCode = new JTextField();
		txtFlightCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtFlightCode.setText("Flight code");
		txtFlightCode.setHorizontalAlignment(SwingConstants.CENTER);
		txtFlightCode.setBounds(31, 146, 147, 24);
		contentPane.add(txtFlightCode);
		txtFlightCode.setColumns(10);
		
		txtGender = new JTextField();
		txtGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtGender.setText("Gender");
		txtGender.setHorizontalAlignment(SwingConstants.CENTER);
		txtGender.setBounds(31, 181, 147, 24);
		contentPane.add(txtGender);
		txtGender.setColumns(10);
		
		txtPassportNumber = new JTextField();
		txtPassportNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPassportNumber.setText("Passport number");
		txtPassportNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassportNumber.setBounds(29, 116, 149, 20);
		contentPane.add(txtPassportNumber);
		txtPassportNumber.setColumns(10);
		
		txtNoofSeat = new JTextField();
		txtNoofSeat.setHorizontalAlignment(SwingConstants.CENTER);
		txtNoofSeat.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtNoofSeat.setText("No.of seat");
		txtNoofSeat.setBounds(31, 216, 147, 24);
		contentPane.add(txtNoofSeat);
		txtNoofSeat.setColumns(10);
		
		txtClass = new JTextField();
		txtClass.setHorizontalAlignment(SwingConstants.CENTER);
		txtClass.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtClass.setText("Class");
		txtClass.setBounds(29, 251, 149, 24);
		contentPane.add(txtClass);
		txtClass.setColumns(10);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEmailAddress.setText("Email address");
		txtEmailAddress.setBounds(31, 286, 151, 24);
		contentPane.add(txtEmailAddress);
		txtEmailAddress.setColumns(10);
		
		txtTelephoneNumber = new JTextField();
		txtTelephoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtTelephoneNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtTelephoneNumber.setText("Telephone number");
		txtTelephoneNumber.setBounds(22, 321, 156, 24);
		contentPane.add(txtTelephoneNumber);
		txtTelephoneNumber.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(144, 356, 136, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(316, 351, 128, 40);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(225, 83, 202, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 117, 202, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 148, 202, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(220, 182, 68, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBounds(307, 181, 98, 24);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox.setBounds(215, 217, 92, 24);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Frist class", "Second class", "Third class", "Economy class"}));
		comboBox_1.setBounds(215, 252, 112, 24);
		contentPane.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(212, 288, 193, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(212, 321, 193, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Selected flight");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(500, 51, 112, 24);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					st=con.createStatement();
					Dashboard db =new Dashboard  ();
					db.setVisible(true);
					dispose();
				}
				catch(Exception ex) {
				System.out.println(ex);
			}
			}});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(476, 351, 92, 35);
		contentPane.add(btnNewButton_3);
	}
}
