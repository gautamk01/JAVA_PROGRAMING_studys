package project;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class C_log_in {

	public JFrame Client_frame;
	private JTextField userfield;
	private JTextField passfield;
	boolean checker;
	public String blank = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		C_log_in window = new C_log_in();
		window.Client_frame.setVisible(true);

	}

	/**
	 * Create the application.
	 */
	public C_log_in() {

		initialize();

	}

	public void linker(String name, int pass) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/help", "postgres", "Gautam3377");
			stmt = con.createStatement();
			String sql = "select * from login where username = '" + name + "' and password =" + pass + ";";
			ResultSet res = stmt.executeQuery(sql);
			if (res.next()) {
				System.out.println("Yeah");
				checker = true;

			} else {
				System.out.println("oobi");
				checker = false;

			}

			stmt.close();
			if (con != null) {
				System.out.println("Connected");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		Client_frame = new JFrame();
		Client_frame.setBounds(100, 100, 798, 524);
		Client_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Client_frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 385, 487);
		Client_frame.getContentPane().add(panel);

		Button btn1 = new Button("Back");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainp1 m1 = new mainp1();
				m1.mainframe.setVisible(true);
				Client_frame.dispose();
			}
		});
		btn1.setForeground(Color.DARK_GRAY);
		btn1.setFont(new Font("HP Simplified Jpan", Font.PLAIN, 27));
		btn1.setBackground(new Color(255, 160, 122));
		btn1.setBounds(10, 409, 141, 30);
		panel.add(btn1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(C_log_in.class.getResource("/img/pi1.jpg")));
		lblNewLabel.setBounds(0, -107, 481, 569);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(382, 0, 402, 487);
		Client_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel login_label1 = new JLabel("LOGIN");
		login_label1.setForeground(Color.WHITE);
		login_label1.setHorizontalAlignment(SwingConstants.CENTER);
		login_label1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 27));
		login_label1.setBounds(90, 36, 210, 59);
		panel_1.add(login_label1);

		JLabel User_label = new JLabel("User Name");
		User_label.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 19));
		User_label.setHorizontalAlignment(SwingConstants.CENTER);
		User_label.setForeground(Color.WHITE);
		User_label.setBounds(28, 105, 132, 31);
		panel_1.add(User_label);

		userfield = new JTextField();
		userfield.setBounds(47, 146, 293, 31);
		panel_1.add(userfield);
		userfield.setColumns(10);

		passfield = new JTextField();
		passfield.setColumns(10);
		passfield.setBounds(51, 234, 293, 31);
		panel_1.add(passfield);

		JLabel User_label_1 = new JLabel("Password");
		User_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		User_label_1.setForeground(Color.WHITE);
		User_label_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 19));
		User_label_1.setBounds(28, 193, 132, 31);
		panel_1.add(User_label_1);

		Button button = new Button("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				front_page f1 = new front_page();
				login_error error = new login_error();
				String user_name = userfield.getText();
				int pass = Integer.valueOf(passfield.getText());
				linker(user_name, pass);
				System.out.println(checker);
				if (checker) {
					f1.F_pg.setVisible(true);
					Client_frame.dispose();
				} else {
					error.error_frame.setVisible(true);
					userfield.setText(" ");
					passfield.setText(" ");
				}

			}
		});
		button.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 18));
		button.setBackground(new Color(0, 206, 209));
		button.setBounds(78, 370, 262, 59);
		panel_1.add(button);
	}
}
