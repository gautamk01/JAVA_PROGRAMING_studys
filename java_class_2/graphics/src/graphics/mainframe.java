package graphics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int c;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainframe frame = new mainframe();
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
	public mainframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 138);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lebel1 = new JLabel("n");
		lebel1.setBounds(8, 47, 54, 19);
		contentPane.add(lebel1);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(37, 48, 108, 16);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("Next");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c++;
				textField.setText(String.valueOf(c));
			}
		});
		btn1.setBounds(362, 42, 108, 28);
		contentPane.add(btn1);
		
		JLabel lebel1_1 = new JLabel("Factorial(n)");
		lebel1_1.setBounds(153, 47, 85, 19);
		contentPane.add(lebel1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(229, 48, 108, 16);
		contentPane.add(textField_1);
	}
}
