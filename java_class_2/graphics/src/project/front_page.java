package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.ImageIcon;

public class front_page {

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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		F_pg = new JFrame();
		F_pg.setBounds(100, 100, 798, 524);
		F_pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F_pg.getContentPane().setLayout(null);

		JPanel Header = new JPanel();
		Header.setBackground(Color.BLACK);
		Header.setBounds(0, 0, 784, 68);
		F_pg.getContentPane().add(Header);
		Header.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("MyPharma");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1.setBackground(Color.WHITE);
		Header.add(lblNewLabel_1);

		JPanel Nav = new JPanel();
		Nav.setLayout(null);
		Nav.setForeground(Color.WHITE);
		Nav.setBackground(Color.PINK);
		Nav.setBounds(0, 66, 784, 74);
		F_pg.getContentPane().add(Nav);

		JButton btnNewButton = new JButton("Order Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(8, 25, 165, 39);
		Nav.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Place Order");
		btnNewButton_2.setBounds(198, 25, 165, 39);
		Nav.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Billing");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_3.setBounds(388, 25, 165, 39);
		Nav.add(btnNewButton_3);

		Button button = new Button("Profile");
		button.setBackground(new Color(0, 206, 209));
		button.setBounds(574, 25, 165, 39);
		Nav.add(button);

		JPanel panel = new JPanel();
		panel.setBounds(303, 141, 473, 346);
		F_pg.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(8, 23, 62, 18);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Gautam Krishna M");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(134, 26, 190, 13);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Gautam Krishna M");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(134, 56, 178, 13);
		panel.add(lblNewLabel_2_1);

		JLabel lblStorename = new JLabel("StoreName  :");
		lblStorename.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblStorename.setBounds(8, 54, 100, 16);
		panel.add(lblStorename);

		JLabel lblNewLabel_2_2 = new JLabel("Gautam Krishna M");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(134, 84, 178, 13);
		panel.add(lblNewLabel_2_2);

		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddress.setBounds(8, 82, 100, 29);
		panel.add(lblAddress);

		JLabel lblNewLabel_2_2_1 = new JLabel("Gautam Krishna M");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2_1.setBounds(134, 153, 178, 13);
		panel.add(lblNewLabel_2_2_1);

		JLabel lblPhone = new JLabel("Phone  :");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPhone.setBounds(8, 153, 69, 13);
		panel.add(lblPhone);

		JLabel lblEmail = new JLabel("Email  :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(8, 120, 100, 23);
		panel.add(lblEmail);

		JLabel lblNewLabel_2_1_1 = new JLabel("Gautam Krishna M");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(134, 117, 190, 13);
		panel.add(lblNewLabel_2_1_1);

		JButton btnNewButton_1 = new JButton("Edit profile");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profile_editor 
				m1.mainframe.setVisible(true);
				F_pg.dispose();
			}
		});
		btnNewButton_1.setBounds(103, 206, 172, 29);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\javaEclipse\\graphics\\src\\img\\PngItem_1468479 (1).png"));

		lblNewLabel_3.setBounds(38, 156, 229, 224);
		F_pg.getContentPane().add(lblNewLabel_3);

	}
}
