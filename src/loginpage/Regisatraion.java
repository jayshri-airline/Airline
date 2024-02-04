package loginpage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Regisatraion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	Connection con;
	Statement st;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Regisatraion frame = new Regisatraion();
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
	public Regisatraion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resgistraion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(133, 10, 128, 23);
		contentPane.add(lblNewLabel);
		
		JLabel n = new JLabel("Name");
		n.setHorizontalAlignment(SwingConstants.CENTER);
		n.setFont(new Font("Tahoma", Font.BOLD, 12));
		n.setBounds(40, 55, 101, 23);
		contentPane.add(n);
		
		JLabel lblNewLabel_2 = new JLabel("Passportnumber");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(40, 89, 101, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel m = new JLabel("Mobilenumber");
		m.setHorizontalAlignment(SwingConstants.CENTER);
		m.setFont(new Font("Tahoma", Font.BOLD, 11));
		m.setBounds(37, 123, 104, 23);
		contentPane.add(m);
		
		JLabel em = new JLabel("New label");
		em.setBounds(184, 249, 46, 0);
		contentPane.add(em);
		
		JLabel NEW = new JLabel("Email");
		NEW.setHorizontalAlignment(SwingConstants.CENTER);
		NEW.setFont(new Font("Tahoma", Font.BOLD, 11));
		NEW.setBounds(37, 157, 104, 23);
		contentPane.add(NEW);
		
		JLabel G = new JLabel("Gender");
		G.setHorizontalAlignment(SwingConstants.CENTER);
		G.setFont(new Font("Tahoma", Font.BOLD, 11));
		G.setBounds(40, 180, 101, 23);
		contentPane.add(G);
		
		JLabel C = new JLabel("City");
		C.setHorizontalAlignment(SwingConstants.CENTER);
		C.setFont(new Font("Tahoma", Font.BOLD, 11));
		C.setBounds(40, 214, 98, 23);
		contentPane.add(C);
		
		JLabel CO = new JLabel("Country");
		CO.setHorizontalAlignment(SwingConstants.CENTER);
		CO.setFont(new Font("Tahoma", Font.BOLD, 11));
		CO.setBounds(40, 242, 98, 23);
		contentPane.add(CO);
		
		final JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					System.out.println("success");
					
					st=con.createStatement();
					
					String N=txt1.getText();
					String P =txt2.getText();
					String M=txt3.getText();
					String E =txt3.getText();
					String c=txt3.getText();                                 
					String Co=txt3.getText();
//					String G=M.getText();
//					String G=F.getText();
//					String G=O.getText();
					
					String sq="SELECT * FROM `regeistraion` WHERE Name='"+getName()+"',passportnumber='"+P+,mobilenumber='"+mn+,Email='"+e+,Gender='"+g+";
					ResultSet rs=st.executeQuery(sq);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(btnNewButton, "Resistrtion  Succesfull");
						Dashboard sp=new Dashboard();
						sp.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Resistrtion Failed");
						
					}
					
					txt1.setText("");
					txt2.setText("");
					txt3.setText("");
					txt4.setText("");
					txt5.setText("");
					txt6.setText("");
					JOptionPane.showMessageDialog(rootPane, "Succesfull");
			      }
				
				catch(Exception ex){
					System.out.println(ex);
				}
			}});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(104, 289, 141, 33);
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
			

				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newairline", "root", "");
					st=con.createStatement();
					Loginpage lp =new Loginpage ();
					lp.setVisible(true);
					dispose();
				}
				catch(Exception ex){
					System.out.println(ex);
				}	
			
		}});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(262, 289, 101, 33);
		contentPane.add(btnNewButton_1);
		
		txt1 = new JTextField();
		txt1.setBounds(169, 57, 174, 23);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(169, 90, 180, 22);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(169, 124, 186, 22);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setBounds(169, 158, 186, 22);
		contentPane.add(txt4);
		txt4.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setBounds(169, 215, 180, 20);
		contentPane.add(txt5);
		txt5.setColumns(10);
		
		txt6 = new JTextField();
		txt6.setBounds(169, 245, 186, 20);
		contentPane.add(txt6);
		txt6.setColumns(10);
		
		JRadioButton M = new JRadioButton("Male");
		M.setFont(new Font("Tahoma", Font.BOLD, 10));
		M.setBounds(179, 185, 60, 23);
		contentPane.add(M);
		
		JRadioButton F = new JRadioButton("Female");
		F.setFont(new Font("Tahoma", Font.BOLD, 10));
		F.setBounds(241, 185, 71, 23);
		contentPane.add(F);
		
		JRadioButton O = new JRadioButton("Other");
		O.setFont(new Font("Tahoma", Font.BOLD, 10));
		O.setBounds(319, 185, 60, 23);
		contentPane.add(O);
	}
	}

