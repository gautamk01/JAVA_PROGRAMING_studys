package project;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class medicine_info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		medicine_info frame = new medicine_info();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public medicine_info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel Header = new JPanel();
		Header.setLayout(null);
		Header.setBackground(Color.BLACK);
		Header.setBounds(0, 0, 784, 68);
		contentPane.add(Header);

		JLabel heading = new JLabel("MyPharma");
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 29));
		heading.setBackground(Color.WHITE);
		heading.setBounds(164, 0, 436, 58);
		Header.add(heading);

		JPanel Nav = new JPanel();
		Nav.setLayout(null);
		Nav.setForeground(Color.WHITE);
		Nav.setBackground(Color.PINK);
		Nav.setBounds(0, 66, 784, 74);
		contentPane.add(Nav);

		JButton Nav_btn2 = new JButton("Client Info");
		Nav_btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Client_info c1 = new Client_info();
				
				c1.setVisible(true);
				dispose();
				
			}
		});
		Nav_btn2.setBounds(65, 25, 165, 39);
		Nav.add(Nav_btn2);

		JButton Nav_btn3 = new JButton("Profile");
		Nav_btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_front_page admin = new admin_front_page();
				admin.admin_frame.setVisible(true);
				dispose();
			}
		});
		Nav_btn3.setBounds(519, 25, 165, 39);
		Nav.add(Nav_btn3);

		Button Nav_btn4 = new Button("Medicine info ");
		Nav_btn4.setBackground(new Color(0, 206, 209));
		Nav_btn4.setBounds(292, 25, 165, 39);
		Nav.add(Nav_btn4);

		JPanel panel = new JPanel();
		panel.setBounds(90, 428, 530, 49);
		contentPane.add(panel);

		JButton btnNewButton_2 = new JButton("Delete");
		panel.add(btnNewButton_2);

		Component horizontalStrut = Box.createHorizontalStrut(40);
		panel.add(horizontalStrut);

		JButton btnNewButton_1 = new JButton("Update");
		panel.add(btnNewButton_1);

		Component horizontalStrut_1 = Box.createHorizontalStrut(40);
		panel.add(horizontalStrut_1);

		JButton btnInsert = new JButton("Insert");
		panel.add(btnInsert);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 197, 602, 182);
		contentPane.add(scrollPane);
	}
}
