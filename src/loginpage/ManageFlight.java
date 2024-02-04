package loginpage;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ManageFlight extends JFrame {

	
	
	private JPanel contentPane;
	
	Connection con;
	Statement st;
     JButton jb;
     private JTextField f;
     private JTextField s;
     private JTextField d;
     private JTextField t;
     private JTextField n;
     private JTable table;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
			} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManageFlight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(237, 12, 10, 10);
		contentPane.add(panel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Manage Flight");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(213, 0, 224, 33);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Flight code");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 37, 101, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(111, 37, 82, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Take of");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(324, 34, 101, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Destination");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(208, 37, 91, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("No.of seat");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(453, 34, 91, 33);
		contentPane.add(lblNewLabel_5);
		
		f = new JTextField();
		f.setBounds(20, 61, 86, 20);
		contentPane.add(f);
		f.setColumns(10);
		
		s = new JTextField();
		s.setBounds(121, 61, 86, 20);
		contentPane.add(s);
		s.setColumns(10);
		
		d = new JTextField();
		d.setBounds(218, 61, 86, 20);
		contentPane.add(d);
		d.setColumns(10);
		
		t = new JTextField();
		t.setBounds(334, 61, 86, 20);
		contentPane.add(t);
		t.setColumns(10);
		
		n = new JTextField();
		n.setBounds(453, 61, 86, 20);
		contentPane.add(n);
		n.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "pdeatils");
					PreparedStatement ps=con.prepareStatement(getName());
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
					
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(63, 105, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				
			}
	});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(183, 105, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(302, 105, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
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
				catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(550, 106, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("Showdata");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					Statement st= con.createStatement();
					String query="SELECT * FROM `flightdetails` ";
					ResultSet rs=st.executeQuery(query);
					java.sql.ResultSetMetaData rsmd=rs.getMetaData();
				DefaultTableModel model =(DefaultTableModel)table.getModel();
					
					int cols =rsmd.getColumnCount();
					String[] colName=new String[cols];
					for(int i=0;i<cols;i++)
						colName[i]=rsmd.getColumnName(i+1);
				model.setColumnIdentifiers(colName);
					
					
					 
					String Flightname,id,source,destination,price,date;
					
					while(rs.next()) {
						Flightname=rs.getString(1);
						id=rs.getString(2);
						source=rs.getString(3);
						destination=rs.getString(4);
						price=rs.getString(5);
						date=rs.getString(6);
						String[] row= {Flightname,id,source,destination,price,date};
						model.addRow(row);
						
					}
					st.close();
					con.close();
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setBounds(562, 12, 106, 27);
		contentPane.add(btnNewButton_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(93, 188, 530, 252);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
