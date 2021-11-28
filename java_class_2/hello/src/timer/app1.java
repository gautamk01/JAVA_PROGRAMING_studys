package timer;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class app1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JLabel label = new JLabel();
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setText("Hello world");
        label.setFont(new Font("Verdana", Font.PLAIN, 28));
        label.setForeground(Color.white);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

        jf.setTitle("Hello world");
        jf.getContentPane().setBackground(Color.BLACK);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(470, 470);
        jf.add(label);
        jf.setVisible(true);
    }

}
