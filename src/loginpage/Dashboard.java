package loginpage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.sql.*;



public class Dashboard extends JFrame {
	Connection con;
	Statement st;


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setBackground(new Color(178, 34, 34));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(212, 10, 10, 10);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(153, 42, 10, 10);
		contentPane.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(174, 71, 2, 2);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("My Airlinespace");
		lblNewLabel.setBackground(new Color(75, 0, 130));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(84, 10, 472, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Professionlisme and Quality of service");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(84, 61, 488, 36);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(137, 181, 0, 22);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ticket Booking");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					st=con.createStatement();
					TicketBooking tb =new TicketBooking ();
					tb.setVisible(true);
					dispose();
				}
				catch(Exception ex){
					System.out.println(ex);
				}

				
			}
		});
			
		
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(124, 154, 149, 36);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cancelticket");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					st=con.createStatement();
					Cancelbooking c=new Cancelbooking();
					c.setVisible(true);
					dispose();
				}
				catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBounds(306, 155, 135, 35);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("Safe jounrey with my airlines");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(212, 228, 229, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Manage Flight");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					st=con.createStatement();
					ManageFlight tp=new ManageFlight();
					tp.setVisible(true);
					dispose();
				}
				catch(Exception ex){
					System.out.println(ex);
				}

				
			}
		});
		btnNewButton.setBounds(84, 108, 138, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					st=con.createStatement();
					Loginpage fp=new Loginpage();
					fp.setVisible(true);
					dispose();
				}
				catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(459, 204, 135, 22);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("Pssenger details");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					st=con.createStatement();
					Passengerdetails pd =new Passengerdetails ();
					pd.setVisible(true);
					dispose();
				}
				catch(Exception ex){
					System.out.println(ex);
				}
				
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setBounds(289, 108, 120, 36);
		contentPane.add(btnNewButton_5);
			}
		}








