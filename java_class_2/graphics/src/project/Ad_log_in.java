package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ad_log_in {

	public JFrame Admin_frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ad_log_in window = new Ad_log_in();
					window.Admin_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ad_log_in() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Admin_frame = new JFrame();
		Admin_frame.setBounds(100, 100, 798, 524);
		Admin_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Admin_frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 401, 487);
		Admin_frame.getContentPane().add(panel_1);

		Button btn1_1 = new Button("Back");
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainp1 m1 = new mainp1();
				m1.mainframe.setVisible(true);
				Admin_frame.dispose();
			}
		});
		btn1_1.setForeground(new Color(240, 255, 255));
		btn1_1.setFont(new Font("HP Simplified Jpan", Font.PLAIN, 27));
		btn1_1.setBackground(new Color(106, 90, 205));
		btn1_1.setBounds(10, 409, 172, 32);
		panel_1.add(btn1_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Ad_log_in.class.getResource("/img/pi2.jpg")));
		lblNewLabel_1.setBounds(0, 0, 420, 362);
		panel_1.add(lblNewLabel_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBackground(Color.DARK_GRAY);
		panel_1_1.setBounds(392, 0, 402, 487);
		Admin_frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);

		JLabel login_label1 = new JLabel("LOGIN");
		login_label1.setHorizontalAlignment(SwingConstants.CENTER);
		login_label1.setForeground(Color.WHITE);
		login_label1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 27));
		login_label1.setBounds(101, 34, 210, 59);
		panel_1_1.add(login_label1);

		JLabel User_label = new JLabel("User Name");
		User_label.setHorizontalAlignment(SwingConstants.CENTER);
		User_label.setForeground(Color.WHITE);
		User_label.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 19));
		User_label.setBounds(39, 103, 132, 31);
		panel_1_1.add(User_label);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(58, 144, 293, 31);
		panel_1_1.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(62, 232, 293, 31);
		panel_1_1.add(textField_1);

		JLabel User_label_1 = new JLabel("Password");
		User_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		User_label_1.setForeground(Color.WHITE);
		User_label_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 19));
		User_label_1.setBounds(39, 191, 132, 31);
		panel_1_1.add(User_label_1);

		Button button = new Button("Submit");
		button.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 18));
		button.setBackground(new Color(0, 206, 209));
		button.setBounds(89, 368, 262, 59);
		panel_1_1.add(button);
	}

}
