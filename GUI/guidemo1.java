import javax.swing.*;

public class guidemo1 {
    public guidemo1() {
        JFrame js1 = new JFrame(); // create a jframe
        JButton bt1 = new JButton("Click ME!"); // create a new button
        bt1.setBounds(200, 250, 100, 50);// x-axise y-axise width height
        js1.add(bt1);// adding the sbutton on jfram
        js1.setSize(500, 500);
        js1.setLayout(null);
        js1.setVisible(true);
    }

    public static void main(String[] args) {
        new guidemo1();
    }

}
