package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class order_history {
	JDBC_table_printer jdbcobj = new JDBC_table_printer();
	public JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					order_history window = new order_history();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public order_history() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 798, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel Nav = new JPanel();
		Nav.setLayout(null);
		Nav.setForeground(Color.WHITE);
		Nav.setBackground(Color.PINK);
		Nav.setBounds(0, 66, 784, 74);
		frame.getContentPane().add(Nav);

		Button Nav_btn4 = new Button("Profile");
		Nav_btn4.setBackground(new Color(0, 206, 209));
		Nav_btn4.setBounds(298, 25, 165, 39);
		Nav.add(Nav_btn4);

		JPanel Header = new JPanel();
		Header.setLayout(null);
		Header.setBackground(Color.BLACK);
		Header.setBounds(0, 0, 784, 68);
		frame.getContentPane().add(Header);

		JLabel heading = new JLabel("MyPharma");
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 29));
		heading.setBackground(Color.WHITE);
		heading.setBounds(173, 0, 436, 58);
		Header.add(heading);
		jdbcobj.ord_id_collection();
		JComboBox comboBox = new JComboBox(jdbcobj.order_collect);
		comboBox.setBounds(73, 242, 112, 21);
		frame.getContentPane().add(comboBox);

		JLabel lblNewLabel = new JLabel("Order id ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(74, 208, 66, 24);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(370, 215, 330, 189);
		frame.getContentPane().add(scrollPane);

		table = new JTable();

		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jdbcobj.order_histo_disp(String.valueOf(comboBox.getItemAt(comboBox.getSelectedIndex())), table);
			}
		});
		btnNewButton.setBounds(73, 292, 83, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_front_page admin = new admin_front_page();
				admin.admin_frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(38, 412, 134, 21);
		frame.getContentPane().add(btnNewButton_1);
	}
}
