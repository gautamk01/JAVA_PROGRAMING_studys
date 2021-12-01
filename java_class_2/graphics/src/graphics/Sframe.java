package graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sframe {

	public JFrame secframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sframe window = new Sframe();
					window.secframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		secframe = new JFrame();
		secframe.setBounds(100, 100, 450, 300);
		secframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		secframe.getContentPane().setLayout(null);
		
		JButton btnBackHome = new JButton("Back Home");
		btnBackHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mframe m1 = new Mframe();
				m1.mainframe.setVisible(true);
				secframe.dispose();
			}
		});
		btnBackHome.setBounds(140, 149, 130, 46);
		secframe.getContentPane().add(btnBackHome);
		
		JLabel lblSecondPage = new JLabel("Second Page");
		lblSecondPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondPage.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 40));
		lblSecondPage.setBounds(78, 40, 227, 63);
		secframe.getContentPane().add(lblSecondPage);
	}

}
