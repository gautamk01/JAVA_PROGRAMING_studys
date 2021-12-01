package graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class taker extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					taker frame = new taker();
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
	public taker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFirstPage = new JLabel("First Page");
		lblFirstPage.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 40));
		lblFirstPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstPage.setBounds(131, 29, 145, 57);
		contentPane.add(lblFirstPage);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tracker obTracker = new tracker();
				obTracker.setVisible(true);

			}
		});
		btnNewButton.setBounds(146, 137, 130, 46);
		contentPane.add(btnNewButton);
	}
}
