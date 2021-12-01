package Lab_9;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Q_5 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField1;

    public Q_5() {

        super("Temperature Converter");
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
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double celsius = Double.parseDouble(textField.getText());
                double fahrenheit = (9.0 / 5.0) * celsius + 32;
                textField1.setText(String.valueOf(fahrenheit));
            }
        });

        textField1 = new JTextField();
        textField1.setBounds(171, 44, 216, 19);
        contentPane.add(textField1);
        textField1.setColumns(10);
        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(textField1.getText());
                double celsius = (5.0 / 9.0) * (fahrenheit - 32);
                textField.setText(String.valueOf(celsius));
            }
        });

        System.out.println(textField.getText());

        JLabel label1 = new JLabel("Celsius : ");
        label1.setBounds(8, 24, 77, 16);
        contentPane.add(label1);

        JLabel label2 = new JLabel("Fahrenheit : ");
        label2.setBounds(8, 47, 77, 16);
        contentPane.add(label2);
    }

    public static void main(String[] args) {
        Q_5 frame = new Q_5();
        frame.setVisible(true);
    }

}
