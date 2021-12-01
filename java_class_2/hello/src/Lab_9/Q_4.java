package Lab_9;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Q_4 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private int c_value = 0;

    public Q_4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 648, 106);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btn1 = new JButton("Count Up");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c_value++;
                textField.setText(String.valueOf(c_value));
            }
        });
        btn1.setBounds(269, 10, 91, 21);
        contentPane.add(btn1);

        JButton btn2 = new JButton("Count down");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c_value--;
                textField.setText(String.valueOf(c_value));
            }
        });
        btn2.setBounds(368, 10, 107, 21);
        contentPane.add(btn2);

        JButton btn3 = new JButton("Reset");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c_value = 0;
                textField.setText(String.valueOf(c_value));
            }
        });
        btn3.setBounds(483, 10, 107, 21);
        contentPane.add(btn3);

        textField = new JTextField();
        textField.setBounds(66, 11, 195, 19);
        textField.setText("0");
        textField.setColumns(10);
        contentPane.add(textField);

        JLabel lblCounter = new JLabel("Counter");
        lblCounter.setBounds(8, 14, 63, 13);
        contentPane.add(lblCounter);
    }

    public static void main(String[] args) {
        Q_4 frame = new Q_4();
        frame.setVisible(true);
    }

}
