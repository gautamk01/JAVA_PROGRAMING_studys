package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.ImageIcon;
import java.sql.*;

public class front_page extends storage {

	public JFrame F_pg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					front_page window = new front_page();
					window.F_pg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the application.
	 */
	public front_page() {

		initialize();

	}

	public void show_detail(String id, String tablename, String data_base, JLabel name, JLabel store_name,
			JLabel address, JLabel email, JLabel phone) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + data_base, "postgres",
					"admin");
			stmt = con.createStatement();
			String sql = "select * from " + tablename + " where  client_id = '" + id + "' ;";
			ResultSet res = stmt.executeQuery(sql);
			if (res.next()) {
				name.setText(res.getString(2));
				store_name.setText(res.getString(5));
				address.setText(res.getString(4));
				email.setText(res.getString(6));
				phone.setText(res.getString(7));
			} else {
				System.out.println("oobi");

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
	private void initialize() {

		F_pg = new JFrame();
		F_pg.setBounds(100, 100, 798, 524);
		F_pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F_pg.setResizable(false);
		F_pg.getContentPane().setLayout(null);

		JPanel Header = new JPanel();
		Header.setBackground(Color.BLACK);
		Header.setBounds(0, 0, 784, 68);
		F_pg.getContentPane().add(Header);
		Header.setLayout(null);

		JLabel heading = new JLabel("MyPharma");
		heading.setBounds(164, 0, 436, 58);
		Header.add(heading);
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 29));
		heading.setBackground(Color.WHITE);

		Button button = new Button("Log out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainp1 m1 = new mainp1();
				m1.mainframe.setVisible(true);
				F_pg.dispose();
			}
		});

		button.setBounds(657, 20, 117, 27);
		Header.add(button);
		button.setForeground(new Color(240, 255, 255));
		button.setBackground(new Color(255, 69, 0));

		JPanel Nav = new JPanel();
		Nav.setLayout(null);
		Nav.setForeground(Color.WHITE);
		Nav.setBackground(Color.PINK);
		Nav.setBounds(0, 66, 784, 74);
		F_pg.getContentPane().add(Nav);

		JButton Nav_btn1 = new JButton("Order Details");
		Nav_btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order_detail po = new Order_detail();
				po.Order_frame.setVisible(true);
				F_pg.dispose();
			}
		});
		Nav_btn1.setBounds(8, 25, 165, 39);
		Nav.add(Nav_btn1);

		JButton Nav_btn2 = new JButton("Place Order");
		Nav_btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Place_order_page po = new Place_order_page();
				po.P_O_frame.setVisible(true);
				F_pg.dispose();
			}
		});
		Nav_btn2.setBounds(198, 25, 165, 39);
		Nav.add(Nav_btn2);

		JButton Nav_btn3 = new JButton("Billing");
		Nav_btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bill_page po = new Bill_page();
				po.Bill_frame.setVisible(true);
				F_pg.dispose();
			}
		});
		Nav_btn3.setBounds(388, 25, 165, 39);
		Nav.add(Nav_btn3);

		Button Nav_btn4 = new Button("Profile");
		Nav_btn4.setBackground(new Color(0, 206, 209));
		Nav_btn4.setBounds(574, 25, 165, 39);
		Nav.add(Nav_btn4);

		JPanel panel = new JPanel();
		panel.setBounds(285, 150, 491, 327);
		F_pg.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel Name_label = new JLabel("Name :");
		Name_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Name_label.setBounds(15, 37, 62, 18);
		panel.add(Name_label);

		JLabel Name_display = new JLabel("Gautam Krishna M");
		Name_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Name_display.setBounds(137, 30, 205, 32);
		panel.add(Name_display);

		JLabel Store_display = new JLabel("Gautam Krishna M");
		Store_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Store_display.setBounds(137, 77, 249, 33);
		panel.add(Store_display);

		JLabel Store_label = new JLabel("StoreName  :");
		Store_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Store_label.setBounds(15, 85, 100, 16);
		panel.add(Store_label);

		JLabel Address_display = new JLabel("Gautam Krishna M");
		Address_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Address_display.setBounds(137, 127, 328, 32);
		panel.add(Address_display);

		JLabel Address_label = new JLabel("Address :");
		Address_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Address_label.setBounds(15, 129, 100, 29);
		panel.add(Address_label);

		JLabel Phone_display = new JLabel("Gautam Krishna M");
		Phone_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Phone_display.setBounds(137, 224, 186, 30);
		panel.add(Phone_display);

		JLabel Phone_label = new JLabel("Phone  :");
		Phone_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Phone_label.setBounds(21, 233, 69, 13);
		panel.add(Phone_label);

		JLabel Email_label = new JLabel("Email  :");
		Email_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Email_label.setBounds(15, 176, 100, 23);
		panel.add(Email_label);

		JLabel Email_display = new JLabel("Gautam Krishna M");
		Email_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Email_display.setBounds(137, 169, 295, 40);
		panel.add(Email_display);

		show_detail(main_id, "client", "mypharma", Name_display, Store_display, Address_display, Email_display,
				Phone_display);
		JButton edit_btn = new JButton("Edit profile");
		edit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profile_editor ped = new profile_editor();
				ped.editprofile.setVisible(true);
				F_pg.dispose();
			}
		});
		edit_btn.setBounds(190, 273, 172, 29);
		panel.add(edit_btn);

		JLabel Profile_photo = new JLabel("");
		Profile_photo.setIcon(new ImageIcon("C:\\javaEclipse\\graphics\\src\\img\\PngItem_1468479 (1).png"));

		Profile_photo.setBounds(48, 180, 229, 224);
		F_pg.getContentPane().add(Profile_photo);

	}
}
