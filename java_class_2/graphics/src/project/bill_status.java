package project;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill_status {

    public JFrame frame;
    private JTable paid;
    private JTable non_paid;

    public void print_table_paid(String databasename, JTable paid) {
        Connection con = null;
        Statement stmt = null;
        Statement stmt1 = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databasename, "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();

            String sql = "select * from billing where pay_status='1';";

            ResultSet res = stmt1.executeQuery(sql);

            paid.setModel(DbUtils.resultSetToTableModel(res));

            stmt.close();
            if (con != null) {
                System.out.println("Connected");
            }

        } catch (Exception es) {
            System.out.println(es.getMessage());

        }

    }

    public void print_table_non_paid(String databasename, JTable non_paid) {
        Connection con = null;
        Statement stmt = null;
        Statement stmt1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databasename, "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            // String sql1 = "delete from Store where store_username = 'Ram';";
            String sql = "select * from billing where pay_status='0';";
            // select * from billing where pay_status='0';
            ResultSet res = stmt1.executeQuery(sql);

            non_paid.setModel(DbUtils.resultSetToTableModel(res));

            stmt.close();
            if (con != null) {
                System.out.println("Connected");
            }

        } catch (Exception es) {
            System.out.println(es.getMessage());

        }

    }

    void update_box() {
        JTextField id = new JTextField();
        Object[] message = {
                "Id :", id,
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Update", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            update_db(Integer.valueOf(id.getText()));
        } else {
            System.out.println("Login canceled");

        }

    }

    public void update_db(int user_id) {
        Connection con = null;
        Statement stmt = null;

        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mypharma", "postgres",
                    "admin");
            stmt = con.createStatement();
            String sql = "update billing set pay_status = '1' where order_id = " + user_id + ";";

            int a = stmt.executeUpdate(sql);

            if (a > 0) {
                JOptionPane.showMessageDialog(null, "Updation of payment status for cilent is successful");
            } else {
                JOptionPane.showMessageDialog(null, "Something Went Wrong..", "Error as Title",
                        JOptionPane.ERROR_MESSAGE);
            }

            stmt.close();
        } catch (SQLException sqe) {

        }
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bill_status window = new bill_status();
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
    public bill_status() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(153, 153, 255));
        frame.setBounds(100, 100, 798, 524);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

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

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(125, 181, 489, 94);
        frame.getContentPane().add(scrollPane);

        paid = new JTable();
        print_table_paid("mypharma", paid);

        scrollPane.setViewportView(paid);

        JLabel lblNewLabel = new JLabel("Paid customers");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(29, 150, 157, 36);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblPaymentPendingCustomers = new JLabel("Payment pending customers");
        lblPaymentPendingCustomers.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPaymentPendingCustomers.setBounds(29, 285, 230, 36);
        frame.getContentPane().add(lblPaymentPendingCustomers);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(125, 321, 489, 103);
        frame.getContentPane().add(scrollPane_1);

        non_paid = new JTable();
        print_table_non_paid("mypharma", non_paid);
        scrollPane_1.setViewportView(non_paid);

        JButton btnNewButton = new JButton("update payment detail");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                update_box();
                // update_db( );
                print_table_non_paid("mypharma", non_paid);
                print_table_paid("mypharma", paid);
            }
        });
        btnNewButton.setBounds(450, 446, 269, 31);
        frame.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Back");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		admin_front_page m1 = new admin_front_page();
				m1.admin_frame.setVisible(true);
				frame.dispose();
        	}
        });
        btnNewButton_1.setBounds(29, 451, 126, 21);
        frame.getContentPane().add(btnNewButton_1);
    }
}
