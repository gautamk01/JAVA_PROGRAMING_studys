package GUI;

import javax.swing.*;
import java.awt.*;

public class frame_2 {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("HI  👍");
        label.setForeground(Color.black);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("", Font.PLAIN, 26));

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.orange);
        panel_1.setBounds(0, 0, 250, 250);
        panel_1.setLayout(new BorderLayout());

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.GREEN);
        panel_2.setBounds(249, 0, 250, 250);
        panel_2.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.MAGENTA);
        panel_3.setBounds(0, 249, 500, 250);
        panel_3.setLayout(new BorderLayout());
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setTitle("Pannels in JAVA");
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(panel_1);
        frame.add(panel_2);
        frame.add(panel_3);
        panel_3.add(label);
        panel_2.add(label);
    }
}
