package project;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class Bill_page extends storage {

	public JFrame Bill_frame;
	Random rand = new Random();
	JDBC_table_printer jdbcobj = new JDBC_table_printer();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		order_count();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill_page window = new Bill_page();
					window.Bill_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bill_page() {
		initialize();
	}

	// private void linker() {
	// System.out.println("hello");

	// }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int id = rand.nextInt(10000);

		Bill_frame = new JFrame();
		Bill_frame.setBounds(100, 100, 798, 524);
		Bill_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Bill_frame.setResizable(false);
		Bill_frame.getContentPane().setLayout(null);

		JPanel Header = new JPanel();
		Header.setBackground(Color.BLACK);
		Header.setBounds(0, 0, 784, 68);
		Bill_frame.getContentPane().add(Header);
		Header.setLayout(null);

		JLabel heading = new JLabel("MyPharma");
		heading.setBounds(164, 0, 436, 58);
		Header.add(heading);
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 29));
		heading.setBackground(Color.WHITE);
		JPanel Nav = new JPanel();
		Nav.setLayout(null);
		Nav.setForeground(Color.WHITE);
		Nav.setBackground(Color.PINK);
		Nav.setBounds(0, 66, 784, 74);
		Bill_frame.getContentPane().add(Nav);

		JButton Nav_btn1 = new JButton("Order Details");
		Nav_btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order_detail po = new Order_detail();
				po.Order_frame.setVisible(true);
				Bill_frame.dispose();
			}
		});
		Nav_btn1.setBounds(8, 25, 165, 39);
		Nav.add(Nav_btn1);

		Button Nav_btn2 = new Button("Billing");
		Nav_btn2.setBackground(new Color(0, 206, 209));
		Nav_btn2.setBounds(380, 25, 165, 39);
		Nav.add(Nav_btn2);

		JButton Nav_btn4 = new JButton("Profile");
		Nav_btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				front_page f1 = new front_page();
				f1.F_pg.setVisible(true);
				Bill_frame.dispose();
			}
		});
		Nav_btn4.setBounds(582, 25, 165, 39);
		Nav.add(Nav_btn4);

		JButton Nav_btn3 = new JButton("Place Order");
		Nav_btn3.setBounds(195, 25, 165, 39);
		Nav.add(Nav_btn3);
		Nav_btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Place_order_page po = new Place_order_page();
				po.P_O_frame.setVisible(true);
				Bill_frame.dispose();
			}
		});

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 140, 784, 347);
		Bill_frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 51, 204));
		panel_1.setBounds(0, 0, 152, 347);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("BILLING");
		lblNewLabel_2.setBounds(32, 74, 69, 20);
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(113, 15, 0, 0);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel = new JLabel("Date of Ordering");
		lblNewLabel.setBounds(172, 62, 105, 34);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1_2 = new JLabel("Total Cost");
		lblNewLabel_1_2.setBounds(172, 118, 105, 34);
		panel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Mode of Payment");
		lblNewLabel_1_3.setBounds(172, 162, 105, 34);
		panel.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("Order ID");
		lblNewLabel_1_4.setBounds(172, 10, 105, 34);
		panel.add(lblNewLabel_1_4);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\javaEclipse\\graphics\\src\\img\\pic6.jpeg"));

		lblNewLabel_4.setBounds(564, 43, 176, 160);
		panel.add(lblNewLabel_4);

		JTextArea order_id = new JTextArea();
		order_id.setBounds(305, 15, 105, 22);
		order_id.setText(String.valueOf(client_order_id));
		panel.add(order_id);

		Calendar c = Calendar.getInstance();

		JTextArea date_ordering = new JTextArea();
		date_ordering.setBounds(305, 67, 105, 22);
		date_ordering.setText(String.valueOf(c.getTime()));
		panel.add(date_ordering);

		jdbcobj.total("mypharma", String.valueOf(client_order_id));
		JTextArea Total_amount = new JTextArea();
		Total_amount.setBounds(305, 123, 105, 22);
		Total_amount.setText(jdbcobj.final_amount);
		panel.add(Total_amount);
		String[] payment = { "Cash ", "Credit card", "debit card" };
		JComboBox comboBox = new JComboBox(payment);
		comboBox.setBounds(305, 169, 105, 21);
		panel.add(comboBox);

		Button button_1 = new Button("Purchase ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill_id = rand.nextInt(10000);
				jdbcobj.Bill_table("billing", "mypharma", bill_id, String.valueOf(client_order_id),
						jdbcobj.final_amount);
				order_incre();
				JOptionPane.showMessageDialog(null, "Purchase Completed");
				Total_amount.setText(" ");
				System.out.println(id);
				Place_order_page po = new Place_order_page();
				po.P_O_frame.setVisible(true);
				Bill_frame.dispose();
			}
		});
		button_1.setFont(new Font("Dubai Light", Font.BOLD, 23));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(234, 250, 212, 61);
		panel.add(button_1);

	}
}
