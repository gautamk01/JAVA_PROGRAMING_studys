package Lab_9;

import java.awt.event.*;
import javax.swing.*;

public class Q_3 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private int res;
    private JTextField textField_1;

    public Q_3() {
        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 509, 138);
        contentPane = new JPanel();

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lebel1 = new JLabel("n");
        lebel1.setBounds(8, 47, 54, 19);
        contentPane.add(lebel1);

        textField = new JTextField();
        textField.setBounds(37, 48, 108, 16);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btn1 = new JButton("Next");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int val;
                int key = Integer.valueOf((textField.getText()));
                val = Factorial(key);
                textField_1.setText(String.valueOf(val));
            }
        });
        btn1.setBounds(362, 42, 108, 28);
        contentPane.add(btn1);

        JLabel lebel1_1 = new JLabel("Factorial(n)");
        lebel1_1.setBounds(153, 47, 85, 19);
        contentPane.add(lebel1_1);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(229, 48, 108, 16);
        contentPane.add(textField_1);
    }

    public int Factorial(int n) {
        res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        Q_3 frame = new Q_3();
        frame.setVisible(true);
    }

}
