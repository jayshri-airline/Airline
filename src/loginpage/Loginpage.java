package loginpage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Loginpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JPasswordField passwordField;
	Connection con;
	Statement st;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage frame = new Loginpage();
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
	public Loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(226, 41, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(169, 41, 87, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("My Airlinespace");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(141, 11, 150, 69);
		contentPane.add(lblNewLabel_3);
		
		final JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String u=txt1.getText();
			String p=txt2.getText();
//			System.out.println(u);
//			System.out.println(p);
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					System.out.println("success");
					
					st=con.createStatement();
					
					String nm=txt1.getText();
					String pass=txt2.getText();
					String sq="select * from loginform where uname='"+nm+"' and upass='"+pass+"'";
					ResultSet rs=st.executeQuery(sq);
					//System.out.println(rs);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(login, "LOgin Succesfull");
						Dashboard sp=new Dashboard();
						sp.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(login, "LOgin Failed");
						txt1.setText("");
						txt2.setText("");
					}
					
					
				}
				catch(Exception ex){
					System.out.println(ex);
				}
			
				
			
			
			}});
		login.setBackground(new Color(128, 128, 255));
		login.setFont(new Font("Tahoma", Font.PLAIN, 15));
		login.setBounds(167, 173, 89, 23);
		contentPane.add(login);
		
		txt1 = new JTextField();
		txt1.setBounds(198, 79, 106, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(198, 125, 106, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(198, 127, 7, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
				txt2.setText("");
				
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(266, 173, 87, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel nm = new JLabel("Username");
		nm.setHorizontalAlignment(SwingConstants.CENTER);
		nm.setFont(new Font("Tahoma", Font.BOLD, 12));
		nm.setBounds(34, 66, 122, 30);
		contentPane.add(nm);
		
		JLabel pass = new JLabel("New label");
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setFont(new Font("Tahoma", Font.BOLD, 12));
		pass.setBounds(34, 125, 133, 23);
		contentPane.add(pass);
		
		JButton btnNewButton = new JButton("Regisetraion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					st=con.createStatement();
					Regisatraion r=new Regisatraion();
					r.setVisible(true);
					dispose();
				}
					
					catch(Exception ex){
						System.out.println(ex);
					}
					
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(68, 173, 89, 23);
		contentPane.add(btnNewButton);
	}
}
