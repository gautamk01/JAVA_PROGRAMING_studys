package Lab_9;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q_1 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private int c;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        Q_1 frame = new Q_1();
        frame.setVisible(true);
    }

    /**
     * Create the frame.
     */
    public Q_1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 326, 107);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lebel1 = new JLabel("Counter");
        lebel1.setBounds(8, 20, 54, 19);
        contentPane.add(lebel1);

        textField = new JTextField();
        textField.setText("0");
        textField.setBounds(90, 20, 108, 16);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btn1 = new JButton("Count");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c++;
                textField.setText(String.valueOf(c));
            }
        });

        btn1.setBounds(221, 18, 83, 21);
        contentPane.add(btn1);
    }
}
