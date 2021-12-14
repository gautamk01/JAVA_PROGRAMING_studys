package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

    public JFrame frame;
    private JTextField strname;
    private JTextField usrnam;
    private JTextField streetnam;
    private JTextField citynam;
    private JTextField districtnam;
    private JTextField email;
    private JTextField pinnam;
    private JTextField phoneno;
    private JTextField liscense;
    private JPasswordField pass;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    registration window = new registration();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public registration() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(65, 105, 225));
        frame.setBounds(100, 100, 798, 524);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel heading = new JPanel();
        heading.setBounds(0, 0, 784, 54);
        heading.setBackground(new Color(102, 153, 255));
        frame.getContentPane().add(heading);
        heading.setLayout(null);

        JLabel lblNewLabel = new JLabel("SIGN UP");
        lblNewLabel.setBounds(234, 0, 263, 54);
        lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 24));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(75, 0, 130));
        lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        heading.add(lblNewLabel);

        Button button = new Button("go back");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                C_log_in cin = new C_log_in();
                cin.Client_frame.setVisible(true);
                frame.dispose();

            }
        });
        button.setBounds(20, 10, 100, 38);
        heading.add(button);
        button.setFont(UIManager.getFont("TextArea.font"));
        button.setForeground(new Color(255, 255, 204));
        button.setBackground(new Color(255, 0, 51));

        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 51, 102), new Color(0, 255, 204)));
        panel.setBounds(189, 64, 340, 381);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        strname = new JTextField();
        strname.setBounds(169, 19, 136, 19);
        strname.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(strname);
        strname.setColumns(10);

        usrnam = new JTextField();
        usrnam.setBounds(169, 48, 136, 19);
        panel.add(usrnam);
        usrnam.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Username   :");
        lblNewLabel_2.setBounds(28, 48, 74, 16);
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_1_1 = new JLabel("Store name :");
        lblNewLabel_1_1.setBounds(28, 21, 96, 13);
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_1_1);

        streetnam = new JTextField();
        streetnam.setBounds(169, 77, 136, 19);
        streetnam.setColumns(10);
        panel.add(streetnam);

        JLabel lblNewLabel_2_1 = new JLabel("Street Name:");
        lblNewLabel_2_1.setBounds(28, 77, 96, 16);
        lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_2_1);

        citynam = new JTextField();
        citynam.setBounds(169, 106, 136, 19);
        citynam.setColumns(10);
        panel.add(citynam);

        districtnam = new JTextField();
        districtnam.setBounds(169, 135, 136, 19);
        districtnam.setColumns(10);
        panel.add(districtnam);

        JLabel lblNewLabel_2_2 = new JLabel("City            :");
        lblNewLabel_2_2.setBounds(28, 106, 96, 16);
        lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_2_2);

        JLabel lblNewLabel_2_3 = new JLabel("District       :");
        lblNewLabel_2_3.setBounds(28, 135, 74, 16);
        lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_2_3);

        email = new JTextField();
        email.setBounds(169, 164, 136, 19);
        email.setColumns(10);
        panel.add(email);

        JLabel lblNewLabel_2_3_1 = new JLabel("Email");
        lblNewLabel_2_3_1.setBounds(28, 167, 74, 16);
        lblNewLabel_2_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_2_3_1);

        pinnam = new JTextField();
        pinnam.setBounds(169, 193, 136, 19);
        pinnam.setColumns(10);
        panel.add(pinnam);

        JLabel lblNewLabel_2_4 = new JLabel("phone no   :");
        lblNewLabel_2_4.setBounds(28, 225, 74, 16);
        lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_2_4);

        phoneno = new JTextField();
        phoneno.setBounds(169, 225, 136, 19);
        phoneno.setColumns(10);
        panel.add(phoneno);

        JLabel lblNewLabel_2_5 = new JLabel("license number :");
        lblNewLabel_2_5.setBounds(28, 254, 96, 16);
        lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_2_5);

        liscense = new JTextField();
        liscense.setBounds(169, 254, 136, 19);
        liscense.setColumns(10);
        panel.add(liscense);

        JLabel lblNewLabel_2_3_1_1 = new JLabel("PIN");
        lblNewLabel_2_3_1_1.setBounds(28, 196, 74, 16);
        lblNewLabel_2_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_2_3_1_1);

        pass = new JPasswordField();
        pass.setBounds(169, 283, 136, 19);
        panel.add(pass);

        JLabel lblNewLabel_2_6 = new JLabel("Password    :");
        lblNewLabel_2_6.setBounds(28, 283, 85, 16);
        lblNewLabel_2_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(lblNewLabel_2_6);

        Button submit1 = new Button("Submit");
        submit1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (strname.getText().isEmpty() || usrnam.getText().isEmpty()
                        || streetnam.getText().isEmpty()
                        || citynam.getText().isEmpty() || districtnam.getText().isEmpty()
                        || email.getText().isEmpty() || pinnam.getText().isEmpty()
                        || phoneno.getText().isEmpty() || liscense.getText().isEmpty()
                        || pass.getText().isEmpty()) {
                    Object[] options = { "Try again", "Exite!" };
                    JOptionPane.showOptionDialog(frame, "Error Box", "Fill Every Box",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0]);
                } else {
                    String storname = strname.getText();
                    String usrname = usrnam.getText();
                    String strnam = streetnam.getText();
                    String city = citynam.getText();
                    String dist = districtnam.getText();
                    String email1 = email.getText();
                    String pin = pinnam.getText();
                    String phn = phoneno.getText();
                    String passw = pass.getText();
                    String client_address = strnam + city + dist + pin;
                    Client_login_connector cin = new Client_login_connector();
                    cin.regsql(1, usrname, passw, client_address, storname, email1, phn);
                    C_log_in cin1 = new C_log_in();
                    cin1.Client_frame.setVisible(true);
                    frame.dispose();
                }

            }
        });
        submit1.setBackground(new Color(0, 206, 209));
        submit1.setBounds(113, 326, 108, 45);
        panel.add(submit1);
    }
}
