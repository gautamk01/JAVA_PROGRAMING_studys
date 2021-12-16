package project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;

public class medicine_info extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JDBC_table_printer medical_info_table = new JDBC_table_printer();

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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 766, 246);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		medical_info_table.print_table("medicine_inventory", "mypharma", table);

		JPanel panel = new JPanel();
		panel.setBounds(120, 417, 530, 49);
		contentPane.add(panel);

		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medical_info_table.delete_box("medicine_inventory", table, "mypharma", "medicine_id");
				medical_info_table.print_table("medicine_inventory", "mypharma", table);
			}
		});
		panel.add(btnNewButton_2);

		Component horizontalStrut = Box.createHorizontalStrut(40);
		panel.add(horizontalStrut);

		// JButton btnNewButton_1 = new JButton("Update");
		// btnNewButton_1.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// JTextField id = new JTextField();
		// JTextField price = new JTextField();
		// Object[] message = {
		// "Id :", id,
		// "Update price :", price
		// };

		// int option = JOptionPane.showConfirmDialog(null, message, "Login",
		// JOptionPane.OK_CANCEL_OPTION);
		// if (option == JOptionPane.OK_OPTION) {

		// } else {
		// System.out.println("Login canceled");
		// }
		// }
		// });
		// panel.add(btnNewButton_1);

		Component horizontalStrut_1 = Box.createHorizontalStrut(40);
		panel.add(horizontalStrut_1);

		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JTextField med_id = new JTextField();
				JTextField med_name = new JTextField();
				JTextField med_manu = new JTextField();
				JTextField med_exp = new JTextField();
				JTextField med_price = new JTextField();
				JTextField supplier = new JTextField();
				Object[] message = {
						"Med_Id :", med_id,
						"Med_name :", med_name,
						"Manufacture Date:", med_manu,
						"Expire Date : ", med_exp,
						"Supplier_Name : ", supplier,
						"price : ", med_price
				};

				int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
				if (option == JOptionPane.OK_OPTION) {
					medical_info_table.insert_tuple(med_id.getText() + ",'" + med_name.getText() + "','"
							+ med_manu.getText() + "','" + med_exp.getText() + "'" + ",'" + supplier.getText() + "',"
							+ med_price.getText(), "medicine_inventory", table,
							"mypharma");
					medical_info_table.print_table("medicine_inventory", "mypharma", table);
				} else {
					System.out.println("Login canceled");
				}
			}
		});
		panel.add(btnInsert);

	}
}
