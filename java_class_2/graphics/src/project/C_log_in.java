package project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class C_log_in {

	public JFrame Client_frame;
	private JTextField userfield;
	private JTextField passfield;
	public JOptionPane errorbox;

	public C_log_in() {

		initialize();

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
				Client_login_connector log_connect = new Client_login_connector();

				String user_name = userfield.getText();
				int pass = Integer.valueOf(passfield.getText());
				log_connect.linker(user_name, pass);

				if (log_connect.checker) {
					f1.F_pg.setVisible(true);
					Client_frame.dispose();
				} else {

					JOptionPane.showMessageDialog(Client_frame, "Sorry Your Username or password is wrong ");
					userfield.setText("");
					passfield.setText("");
				}

			}
		});

		button.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 18));
		button.setBackground(new Color(0, 206, 209));
		button.setBounds(78, 370, 262, 59);
		panel_1.add(button);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		C_log_in window = new C_log_in();
		window.Client_frame.setVisible(true);

	}
}
