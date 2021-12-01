	package graphics;
	
	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import java.awt.Component;
	import javax.swing.Box;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
	
	public class gui1 extends JFrame {
	
		private JPanel contentPane;
		private JTextField textField;
		private JTextField textField1;
		
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						gui1 frame = new gui1();
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
		public gui1() {
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 448, 138);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			textField = new JTextField();
		
			textField.setBounds(171, 21, 216, 19);
			contentPane.add(textField);
			textField.setColumns(10);
			
			textField1 = new JTextField();
			textField1.setBounds(171, 44, 216, 19);
			contentPane.add(textField1);
			textField1.setColumns(10);
			
			JLabel label1 = new JLabel("Celsius : ");
			label1.setBounds(8, 24, 77, 16);
			contentPane.add(label1);
			
			JLabel label2 = new JLabel("Fahrenheit : ");
			label2.setBounds(8, 47, 77, 16);
			contentPane.add(label2);
		}
	
	}
