package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Place_order_page {

	public JFrame P_O_frame;
	private JTextField quantity;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Place_order_page window = new Place_order_page();
					window.P_O_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Place_order_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		P_O_frame = new JFrame();
		P_O_frame.setBounds(100, 100, 798, 524);
		P_O_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		P_O_frame.setResizable(false);
		P_O_frame.getContentPane().setLayout(null);

		JPanel Header = new JPanel();
		Header.setBackground(Color.BLACK);
		Header.setBounds(0, 0, 784, 68);
		P_O_frame.getContentPane().add(Header);
		Header.setLayout(null);

		JLabel heading = new JLabel("MyPharma");
		heading.setBounds(164, 0, 436, 58);
		Header.add(heading);
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 29));
		heading.setBackground(Color.WHITE);

		Button button = new Button("Log out");
		button.setBounds(657, 20, 117, 27);
		Header.add(button);
		button.setForeground(new Color(240, 255, 255));
		button.setBackground(new Color(255, 69, 0));

		JPanel Nav = new JPanel();
		Nav.setLayout(null);
		Nav.setForeground(Color.WHITE);
		Nav.setBackground(Color.PINK);
		Nav.setBounds(0, 66, 784, 74);
		P_O_frame.getContentPane().add(Nav);

		JButton Nav_btn1 = new JButton("Order Details");
		Nav_btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order_detail po = new Order_detail();
				po.Order_frame.setVisible(true);
				P_O_frame.dispose();
			}
		});
		Nav_btn1.setBounds(8, 25, 165, 39);
		Nav.add(Nav_btn1);

		JButton Nav_btn3 = new JButton("Billing");
		Nav_btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bill_page po = new Bill_page();
				po.Bill_frame.setVisible(true);
				P_O_frame.dispose();
			}
		});
		Nav_btn3.setBounds(388, 25, 165, 39);
		Nav.add(Nav_btn3);

		Button Nav_btn2 = new Button("Place Order");
		Nav_btn2.setBackground(new Color(0, 206, 209));
		Nav_btn2.setBounds(195, 25, 165, 39);
		Nav.add(Nav_btn2);

		JButton Nav_btn4 = new JButton("Profile");
		Nav_btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				front_page f1 = new front_page();
				f1.F_pg.setVisible(true);
				P_O_frame.dispose();
			}
		});
		Nav_btn4.setBounds(582, 25, 165, 39);
		Nav.add(Nav_btn4);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 139, 784, 348);
		P_O_frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 0, 204));
		panel_2.setBounds(0, 0, 135, 348);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("Place Order");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(27, 38, 94, 20);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\javaEclipse\\graphics\\src\\img\\pic7.jpeg"));
		lblNewLabel_3.setBounds(8, 99, 113, 105);
		panel_2.add(lblNewLabel_3);

		JLabel lblNewLabel_1 = new JLabel("Place your order");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(179, 137, 173, 39);
		panel.add(lblNewLabel_1);

		quantity = new JTextField();
		quantity.setColumns(10);
		quantity.setBounds(451, 309, 107, 19);
		panel.add(quantity);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(219, 186, 541, 113);
		panel.add(scrollPane);
		//
		//
		//
		//
		//
		//

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"SI No:", "Medicine Name", "Quantity", "Price"
				}) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
					Integer.class, String.class, Integer.class, Integer.class
			};

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);

		JLabel lblNewLabel_2 = new JLabel("Medicine");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(143, 302, 76, 31);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Quantity");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(392, 302, 90, 31);
		panel.add(lblNewLabel_2_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "a", "as", "asd", "asdf" }));
		comboBox.setBounds(219, 308, 133, 21);
		panel.add(comboBox);

		JButton add_med_purchase = new JButton(" Add for purchase");
		add_med_purchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sino = 0;
				int price = 800;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(
						new Object[] { sino, comboBox.getSelectedItem(), Integer.parseInt(quantity.getText()), price });
				//
				// comboBox.getText()
				// kkkkkkkk
				/// kkkk

				//
			}
		});
		add_med_purchase.setBounds(608, 308, 152, 21);
		panel.add(add_med_purchase);

		JLabel lblNewLabel_1_2 = new JLabel("Check Avalibility");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(179, 10, 173, 39);
		panel.add(lblNewLabel_1_2);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(219, 59, 133, 21);
		panel.add(comboBox_1);

		JLabel lblNewLabel_2_2 = new JLabel("Medicine");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(143, 53, 76, 31);
		panel.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("Price");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_3.setBounds(143, 98, 76, 31);
		panel.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_3_1 = new JLabel("Stock Status");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_3_1.setBounds(392, 98, 85, 31);
		panel.add(lblNewLabel_2_3_1);

		JLabel medicine_price = new JLabel("Price per unit");
		medicine_price.setFont(new Font("Tahoma", Font.PLAIN, 12));
		medicine_price.setBounds(223, 95, 129, 40);
		panel.add(medicine_price);

		JLabel medicine_price_1 = new JLabel("Price per unit");
		medicine_price_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		medicine_price_1.setBounds(511, 96, 107, 37);
		panel.add(medicine_price_1);

		JButton btnNewButton_1 = new JButton("Check Availibility");
		btnNewButton_1.setBounds(401, 59, 179, 21);
		panel.add(btnNewButton_1);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(143, 137, 617, 2);
		panel.add(separator);

	}
}
