package project;

import java.awt.*;
import javax.swing.*;

public class LoginRequired {

    LoginRequired() {
        JFrame f = new JFrame("Login Required");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        f.setResizable(false);
        f.setSize(400, 300); // not recommended, but used here for convenience
        f.setLocationByPlatform(true);
        f.setVisible(true);

        showLogin(f);
    }

    public void showLogin(JFrame frame) {
        JPanel p = new JPanel(new BorderLayout(5, 5));

        JPanel labels = new JPanel(new GridLayout(0, 1, 2, 2));
        labels.add(new JLabel("User Name", SwingConstants.TRAILING));
        labels.add(new JLabel("Password", SwingConstants.TRAILING));
        p.add(labels, BorderLayout.LINE_START);

        JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
        JTextField username = new JTextField("Joe Blogs");
        controls.add(username);
        JPasswordField password = new JPasswordField();
        controls.add(password);
        p.add(controls, BorderLayout.CENTER);

        JOptionPane.showMessageDialog(
                frame, p, "Log In", JOptionPane.QUESTION_MESSAGE);
        System.out.println("User Name: " + username.getText());
        System.out.println("Password: " + new String(password.getPassword()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginRequired();
        });
    }
}
