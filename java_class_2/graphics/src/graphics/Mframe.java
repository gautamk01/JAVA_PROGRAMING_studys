package graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mframe {

	public JFrame mainframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mframe window = new Mframe();
					window.mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainframe = new JFrame();
		mainframe.setBounds(100, 100, 450, 300);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sframe s1 = new Sframe();
				s1.secframe.setVisible(true);
				mainframe.dispose();
				
				
			}
		});
		btnNewButton.setBounds(159, 146, 130, 46);
		mainframe.getContentPane().add(btnNewButton);
		
		JLabel lblFirstPage = new JLabel("First Page");
		lblFirstPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstPage.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 40));
		lblFirstPage.setBounds(144, 38, 145, 57);
		mainframe.getContentPane().add(lblFirstPage);
	}

}
