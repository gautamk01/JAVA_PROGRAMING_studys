package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class login_error {

	public JFrame error_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_error window = new login_error();
					window.error_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_error() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		error_frame = new JFrame();
		error_frame.setBounds(100, 100, 452, 186);
		error_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		error_frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Password or Username is Incorrect \uD83D\uDC80\uD83D\uDC80\uD83D\uDC80");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 45, 312, 51);
		error_frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Try again");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_log_in c1 = new C_log_in();
				error_frame.dispose();

			}
		});
		btnNewButton.setBounds(161, 106, 138, 21);
		error_frame.getContentPane().add(btnNewButton);
	}
}
