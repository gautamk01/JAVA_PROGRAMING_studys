package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class fram1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
            ImageIcon img = new ImageIcon("C:\\Users\\Student\\Pictures\\Web_of_Spider-Man_Vol_1_129-1.png");
        ImageIcon img1 = new ImageIcon("C:\\Users\\Student\\Pictures\\free-youtube-logo-icon-2431-thumb.png");
        JLabel le = new JLabel();
        Border br =  BorderFactory.createLineBorder(Color.orange,3);
        //label
        le.setText("This is my photo");
        le.setIcon(img);
        le.setHorizontalTextPosition(JLabel.CENTER);
        le.setVerticalTextPosition(JLabel.TOP);
        le.setForeground(Color.white);
        le.setFont(new Font("MV Boli",Font.PLAIN,26));
        le.setIconTextGap(-53);//gape between text and image
        le.setBorder(br);
        le.setHorizontalAlignment(JLabel.CENTER);
        le.setVerticalAlignment(JLabel.CENTER);
//        le.setBounds(0,0,350,350); while using set layout
        //Jframe
        jf.add(le);
        jf.setTitle("Welcome to Spider man club");
        jf.setIconImage(img1.getImage());
//        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.BLACK);
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.pack();
    }
}
