package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class profile_editor {

	public JFrame editprofile;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profile_editor window = new profile_editor();
					window.editprofile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public profile_editor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		editprofile = new JFrame();
		editprofile.setBounds(100, 100, 798, 524);
		editprofile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		editprofile.getContentPane().setLayout(null);

		JPanel Header = new JPanel();
		Header.setBackground(Color.BLACK);
		Header.setBounds(0, 0, 784, 68);
		editprofile.getContentPane().add(Header);
		Header.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("MyPharma");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(0, 0, 784, 68);
		Header.add(lblNewLabel_1_1);

		JPanel Nav = new JPanel();
		Nav.setLayout(null);
		Nav.setForeground(Color.WHITE);
		Nav.setBackground(Color.PINK);
		Nav.setBounds(0, 66, 784, 74);
		editprofile.getContentPane().add(Nav);

		JButton btnNewButton = new JButton("Order Details");
		btnNewButton.setBounds(8, 25, 165, 39);
		Nav.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Place Order");
		btnNewButton_2.setBounds(198, 25, 165, 39);
		Nav.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Billing");
		btnNewButton_3.setBounds(388, 25, 165, 39);
		Nav.add(btnNewButton_3);

		Button button = new Button("Profile");
		button.setBackground(new Color(0, 206, 209));
		button.setBounds(574, 25, 165, 39);
		Nav.add(button);

		JLabel lblNewLabel = new JLabel("Edit Profile");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setBounds(10, 150, 190, 60);
		editprofile.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBounds(202, 167, 473, 293);
		editprofile.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(22, 23, 62, 18);
		panel.add(lblNewLabel_1);

		JLabel lblStorename = new JLabel("StoreName  :");
		lblStorename.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblStorename.setBounds(22, 54, 100, 16);
		panel.add(lblStorename);

		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddress.setBounds(22, 80, 83, 31);
		panel.add(lblAddress);

		JLabel lblPhone = new JLabel("Phone  :");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPhone.setBounds(22, 172, 69, 13);
		panel.add(lblPhone);

		JLabel lblEmail = new JLabel("Email  :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(22, 120, 100, 23);
		panel.add(lblEmail);

		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setBounds(275, 217, 167, 29);
		panel.add(btnNewButton_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 54, 172, 21);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 85, 172, 23);
		panel.add(textField_2);

		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				front_page f1 = new front_page();
				f1.F_pg.setVisible(true);
				editprofile.dispose();

			}
		});
		btnNewButton_1_1.setBounds(19, 217, 161, 29);
		panel.add(btnNewButton_1_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(148, 23, 172, 21);
		panel.add(textField);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 120, 172, 23);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(148, 162, 172, 23);
		panel.add(textField_4);
	}
}
