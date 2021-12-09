package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class trail extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JDBC_table_printer table1 = new JDBC_table_printer();

	public void function2(String name) {
		Connection con = null;
		Statement stmt = null;
		Statement stmt1 = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/help", "postgres",
					"admin");
			stmt = con.createStatement();
			stmt1 = con.createStatement();

			String sql = "insert into Store values(" + name + ",'Sakthi Meidcals','Malappuram','krishna',1234);";
			// String sql1 = "select * from Store;";
			ResultSet res = stmt1.executeQuery(sql);
			// ResultSet res1 = stmt.executeQuery(sql1);
			table.setModel(DbUtils.resultSetToTableModel(res));
			if (res.next()) {
				System.out.println("Yeah");

			} else {
				System.out.println("oobi");

			}

			stmt.close();
			if (con != null) {
				System.out.println("Connected");

			}

		} catch (Exception es) {
			System.out.println(es.getMessage());

		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trail frame = new trail();
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
	public trail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 103, 846, 278);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				table1.print_table("Store", table);
			}
		});
		btnNewButton.setBounds(355, 41, 363, 41);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Enter the index:");
				table1.delete_tuple("Store_id = " + name, "Store", table);
				table1.print_table("Store", table);
			}
		});
		btnNewButton_1.setBounds(109, 51, 83, 21);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("insert");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Enter the index:");
				function2(name);
			}
		});
		btnNewButton_1_1.setBounds(244, 51, 83, 21);
		contentPane.add(btnNewButton_1_1);

	}
}
