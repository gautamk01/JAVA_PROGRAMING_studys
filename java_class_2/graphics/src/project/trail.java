package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class trail extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String[] name = new String[4];
	private int i;

	public void function() {
		Connection con = null;
		Statement stmt = null;
		Statement stmt1 = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/help", "postgres",
					"Gautam3377");
			stmt = con.createStatement();
			stmt1 = con.createStatement();
			// String sql1 = "delete from Store where store_username = 'Ram';";
			String sql = "select * from Store;";
			// ResultSet res1 = stmt.executeQuery(sql1);
			ResultSet res = stmt1.executeQuery(sql);
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
					frame.function();
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
		btnNewButton.setBounds(355, 41, 363, 41);
		contentPane.add(btnNewButton);
		JLabel label = new JLabel("asgas");
		label.setBounds(213, 55, 143, 13);
		contentPane.add(label);
		JButton btnNewButton_1 = new JButton("delete");
		// btnNewButton_1.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// Connection c = null;
		// Statement stmt = null;

		// // try {
		// // Class.forName("org.postgresql.Driver");
		// // c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/help",
		// "postgres", "Gautam3377");
		// // stmt = c.createStatement();
		// // ResultSet rs = stmt.executeQuery("select* from Store;");
		// // while (rs.next()) {
		// // name[i] = rs.getString("Store_username");
		// // i++;
		// // }
		// // label.setText(name[0]);
		// // rs.close();
		// // stmt.close();
		// // c.close();

		// // System.out.println("Opened database successfully");
		// // } catch (Exception e1) {
		// // e1.printStackTrace();
		// // System.err.println(e1.getClass().getName() + ": " + e1.getMessage());
		// // System.exit(0);
		// // }

		// }
		// });
		btnNewButton_1.setBounds(109, 51, 83, 21);
		contentPane.add(btnNewButton_1);

	}
}
