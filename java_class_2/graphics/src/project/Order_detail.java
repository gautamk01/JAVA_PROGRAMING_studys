package project;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Order_detail {

	public JFrame Order_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order_detail window = new Order_detail();
					window.Order_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Order_detail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Order_frame = new JFrame();
		Order_frame.setBounds(100, 100, 798, 524);
		Order_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Order_frame.setResizable(false);
		Order_frame.getContentPane().setLayout(null);
		
		JPanel Header = new JPanel();
		Header.setBackground(Color.BLACK);
		Header.setBounds(0, 0, 784, 68);
		Order_frame.getContentPane().add(Header);
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
		Order_frame.getContentPane().add(Nav);
		JButton Nav_btn1 = new JButton("Billing");
		Nav_btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bill_page po = new Bill_page();
				po.Bill_frame.setVisible(true);
				Order_frame.dispose();
			}
		});
		Nav_btn1.setBounds(383, 25, 165, 39);
		Nav.add(Nav_btn1);
		
		Button Nav_btn2 = new Button("Order Detail");
		Nav_btn2.setBackground(new Color(0, 206, 209));
		Nav_btn2.setBounds(8, 25, 165, 39);
		Nav.add(Nav_btn2);
		
		JButton Nav_btn4 = new JButton("Profile");
		Nav_btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				front_page f1 = new front_page();
				f1.F_pg.setVisible(true);
				Order_frame.dispose();
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
				Order_frame.dispose();
			}
		});
	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 140, 784, 347);
		Order_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Order ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(182, 42, 112, 31);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(148, 0, 211));
		panel_2.setBounds(0, 0, 161, 347);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order Details");
		lblNewLabel.setBounds(21, 31, 106, 20);
		lblNewLabel.setForeground(Color.WHITE);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 16));
		
		JLabel lblNewLabel_1_2 = new JLabel("Delivery Address");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(182, 166, 112, 31);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Contents");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(182, 83, 112, 31);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Delivery Status");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(182, 248, 112, 31);
		panel.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Possible delivery date");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1.setBounds(182, 303, 143, 31);
		panel.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Order ID");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(342, 42, 112, 31);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Order ID");
		lblNewLabel_1_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(342, 91, 161, 81);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Order ID");
		lblNewLabel_1_3_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_2.setBounds(342, 174, 161, 77);
		panel.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Order ID");
		lblNewLabel_1_3_3.setBackground(new Color(248, 248, 255));
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_3.setBounds(342, 248, 143, 31);
		panel.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Order ID");
		lblNewLabel_1_3_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_4.setBounds(342, 303, 112, 31);
		panel.add(lblNewLabel_1_3_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\javaEclipse\\graphics\\src\\img\\java_img2.jpg"));

		lblNewLabel_2.setBounds(513, 42, 226, 209);
		panel.add(lblNewLabel_2);
	}
	
	
	
	}

