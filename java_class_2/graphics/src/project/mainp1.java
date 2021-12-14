package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainp1 extends storage {

	public JFrame mainframe;

	/**
	 * Create the application.
	 */
	public mainp1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainframe = new JFrame();
		mainframe.setBounds(100, 100, 798, 524);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 385, 487);
		mainframe.getContentPane().add(panel);

		Button btn1 = new Button("Client");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_log_in c1 = new C_log_in();
				c1.Client_frame.setVisible(true);
				mainframe.dispose();
			}
		});

		btn1.setForeground(Color.DARK_GRAY);
		btn1.setFont(new Font("HP Simplified Jpan", Font.PLAIN, 27));
		btn1.setBackground(new Color(255, 160, 122));
		btn1.setBounds(97, 407, 172, 32);
		panel.add(btn1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(mainp1.class.getResource("/img/pi1.jpg")));
		lblNewLabel.setBounds(0, -107, 481, 569);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(383, 0, 401, 487);
		mainframe.getContentPane().add(panel_1);

		Button btn1_1 = new Button("Admin");
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ad_log_in a1 = new Ad_log_in();
				a1.Admin_frame.setVisible(true);
				mainframe.dispose();
			}
		});
		btn1_1.setForeground(new Color(240, 255, 255));
		btn1_1.setFont(new Font("HP Simplified Jpan", Font.PLAIN, 27));
		btn1_1.setBackground(new Color(106, 90, 205));
		btn1_1.setBounds(129, 410, 172, 32);
		panel_1.add(btn1_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(mainp1.class.getResource("/img/pi2.jpg")));
		lblNewLabel_1.setBounds(0, 0, 420, 362);
		panel_1.add(lblNewLabel_1);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainp1 window = new mainp1();
					window.mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
