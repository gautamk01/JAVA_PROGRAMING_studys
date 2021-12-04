package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin_front_page {

	public JFrame admin_frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_front_page window = new admin_front_page();
					window.admin_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public admin_front_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		admin_frame = new JFrame();
		admin_frame.setBounds(100, 100, 798, 524);
		admin_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		admin_frame.getContentPane().setLayout(null);
		
		JPanel Header = new JPanel();
		Header.setLayout(null);
		Header.setBackground(Color.BLACK);
		Header.setBounds(0, 0, 784, 68);
		admin_frame.getContentPane().add(Header);
		
		JLabel heading = new JLabel("MyPharma");
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 29));
		heading.setBackground(Color.WHITE);
		heading.setBounds(164, 0, 436, 58);
		Header.add(heading);
		
		Button button = new Button("Log out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainp1 m1 = new mainp1();
				m1.mainframe.setVisible(true);
				admin_frame.dispose();
			}
		});
		button.setForeground(new Color(240, 255, 255));
		button.setBackground(new Color(255, 69, 0));
		button.setBounds(657, 20, 117, 27);
		Header.add(button);
		
		JPanel Nav = new JPanel();
		Nav.setLayout(null);
		Nav.setForeground(Color.WHITE);
		Nav.setBackground(Color.PINK);
		Nav.setBounds(0, 66, 784, 74);
		admin_frame.getContentPane().add(Nav);
		
		JButton Nav_btn2 = new JButton("Client Info");
		Nav_btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Client_info c1 = new Client_info();
				c1.setVisible(true);
				admin_frame.dispose();
			}
		});
		Nav_btn2.setBounds(65, 25, 165, 39);
		Nav.add(Nav_btn2);
		
		JButton Nav_btn3 = new JButton("Medicine info");
		Nav_btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medicine_info m1 = new medicine_info();
				m1.setVisible(true);
				admin_frame.dispose();
			}
		});
		Nav_btn3.setBounds(292, 25, 165, 39);
		Nav.add(Nav_btn3);
		
		Button Nav_btn4 = new Button("Profile");
		Nav_btn4.setBackground(new Color(0, 206, 209));
		Nav_btn4.setBounds(534, 25, 165, 39);
		Nav.add(Nav_btn4);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(357, 180, 360, 250);
		admin_frame.getContentPane().add(panel);
		
		JLabel Name_label = new JLabel("Name :");
		Name_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Name_label.setBounds(8, 23, 62, 18);
		panel.add(Name_label);
		
		JLabel Name_display = new JLabel("Gautam Krishna M");
		Name_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Name_display.setBounds(134, 26, 190, 13);
		panel.add(Name_display);
		
		JLabel Store_display = new JLabel("Gautam Krishna M");
		Store_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Store_display.setBounds(134, 56, 178, 13);
		panel.add(Store_display);
		
		JLabel Store_label = new JLabel("AdminName  :");
		Store_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Store_label.setBounds(8, 54, 118, 16);
		panel.add(Store_label);
		
		JLabel Address_display = new JLabel("Gautam Krishna M");
		Address_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Address_display.setBounds(134, 79, 218, 24);
		panel.add(Address_display);
		
		JLabel Address_label = new JLabel("Address :");
		Address_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Address_label.setBounds(8, 82, 100, 29);
		panel.add(Address_label);
		
		JLabel Phone_display = new JLabel("Gautam Krishna M");
		Phone_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Phone_display.setBounds(134, 153, 178, 13);
		panel.add(Phone_display);
		
		JLabel Phone_label = new JLabel("Phone  :");
		Phone_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Phone_label.setBounds(8, 153, 69, 13);
		panel.add(Phone_label);
		
		JLabel Email_label = new JLabel("Email  :");
		Email_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Email_label.setBounds(8, 120, 100, 23);
		panel.add(Email_label);
		
		JLabel Email_display = new JLabel("Gautam Krishna M");
		Email_display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Email_display.setBounds(134, 117, 190, 13);
		panel.add(Email_display);
		
		JButton edit_btn = new JButton("Edit profile");
		edit_btn.setBounds(103, 206, 172, 29);
		panel.add(edit_btn);
	}
}
