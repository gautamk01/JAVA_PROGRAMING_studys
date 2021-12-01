package Lab_9;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.*;

public class Q_2 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private int c = 88;

    public Q_2() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 426, 107);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lebel1 = new JLabel("Counter");
        lebel1.setBounds(8, 20, 54, 19);
        contentPane.add(lebel1);

        textField = new JTextField();
        textField.setText(String.valueOf(c));
        textField.setBounds(90, 20, 108, 16);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btn1 = new JButton("Countdown");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c--;
                textField.setText(String.valueOf(c));
            }
        });

        btn1.setBounds(221, 18, 113, 21);
        contentPane.add(btn1);
    }

    public static void main(String[] args) {
        Q_2 frame = new Q_2();

        frame.setVisible(true);
    }

}
