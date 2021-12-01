

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

// create a class ScrollPanel
// extending JFrame
public class ScrollPanel {
    JFrame jf = new JFrame();
    // Declaration of objects of the
    // JScrollPane class
    JScrollPane scrollpane;

    // Constructor of ScrollPanel class
    public ScrollPanel() {

        // used to call super class

        // Function to set size of JFrame.
        jf.setSize(300, 200);

        // Function to set Default
        // close operation of JFrame.
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();

        // Function to set
        // visible of JFrame.
        jf.setVisible(true);
    }

    // class init
    public void init() {

    	JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 140);
		jf.getContentPane().add(panel);
		
		
		JPanel Header = new JPanel();
		Header.setBounds(0, 0, 784, 68);
		panel.add(Header);
		Header.setLayout(null);
		Header.setBackground(Color.BLACK);
		
		JLabel lblNewLabel_1 = new JLabel("My Farma");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(290, 10, 163, 48);
		Header.add(lblNewLabel_1);
		
		JPanel Nav = new JPanel();
		Nav.setBounds(0, 66, 784, 74);
		panel.add(Nav);
		Nav.setLayout(null);
		Nav.setForeground(Color.WHITE);
		Nav.setBackground(Color.PINK);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(8, 25, 165, 39);
		Nav.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(198, 25, 165, 39);
		Nav.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(388, 25, 165, 39);
		Nav.add(btnNewButton_3);
		
		Button button = new Button("New button");
		button.setBackground(new Color(0, 206, 209));
		button.setBounds(574, 25, 165, 39);
		Nav.add(button);
        // Declaration of objects
        // of scrollpane class.
        scrollpane = new JScrollPane();

        // to get content pane
        jf.getContentPane().add(scrollpane, BorderLayout.CENTER);
    }

    // Main Method
    public static void main(String args[]) {
        new ScrollPanel();
    }
}