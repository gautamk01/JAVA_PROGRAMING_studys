package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Q_4 extends javax.swing.JFrame {
	public static javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField pass;
	
	public static void main(String[] args) {
		Q_4 frame = new Q_4();
		frame.setVisible(true);
	}


	public Q_4() {
		
	     jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jPanel3 = new javax.swing.JPanel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        id = new javax.swing.JTextField();
	        pass = new javax.swing.JPasswordField();
	        jSeparator1 = new javax.swing.JSeparator();
	        jPanel4 = new javax.swing.JPanel();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jPanel5 = new javax.swing.JPanel();
	        jLabel5 = new javax.swing.JLabel();
	        

	        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

	        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

	        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
	        jLabel1.setText("Login Form");

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel2Layout.createSequentialGroup()
	                                .addGap(247, 247, 247)
	                                .addComponent(jLabel1)
	                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	        jPanel2Layout.setVerticalGroup(
	                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel2Layout.createSequentialGroup()
	                                .addGap(19, 19, 19)
	                                .addComponent(jLabel1)
	                                .addContainerGap(20, Short.MAX_VALUE)));

	        

	        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Information",
	                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
	                new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

	        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel3.setText("User_ID : ");

	        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel4.setText("User_Password : ");

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel3Layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addComponent(jLabel3)
	                                        .addComponent(jLabel4))
	                                .addGap(19, 19, 19)
	                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
	                                        .addComponent(id))
	                                .addContainerGap()));
	        jPanel3Layout.setVerticalGroup(
	                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel3Layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                        .addComponent(jLabel3)
	                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE,
	                                                javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(25, 25, 25)
	                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                        .addComponent(jLabel4)
	                                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE,
	                                                javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

	        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

	        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jButton1.setText("Login");

	        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jButton2.setText("Exit");

	        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
	        jPanel4.setLayout(jPanel4Layout);
	        jPanel4Layout.setHorizontalGroup(
	                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
	                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
	                                        javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
	                                        javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addContainerGap()));
	        jPanel4Layout.setVerticalGroup(
	                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel4Layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                        .addComponent(jButton1)
	                                        .addComponent(jButton2))
	                                .addContainerGap(21, Short.MAX_VALUE)));

	        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

	        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
	        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel5.setText("Note : Password should be at least 6 Characters ");

	        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
	        jPanel5.setLayout(jPanel5Layout);
	        jPanel5Layout.setHorizontalGroup(
	                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel5Layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addComponent(jLabel5)
	                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	        jPanel5Layout.setVerticalGroup(
	                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel5Layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addComponent(jLabel5)
	                                .addContainerGap()));

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
	                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290,
	                                        javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jSeparator1)
	                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                .addContainerGap()));
	        jPanel1Layout.setVerticalGroup(
	                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
	                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addGroup(jPanel1Layout.createSequentialGroup()
	                                                .addGap(22, 22, 22)
	                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
	                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
	                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
	                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                .addGap(8, 8, 8)
	                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
	                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                .addContainerGap(22, Short.MAX_VALUE))
	                                        .addGroup(jPanel1Layout.createSequentialGroup()
	                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
	                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
	                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	        layout.setVerticalGroup(
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
	                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

	        setSize(new java.awt.Dimension(693, 380));
	        setLocationRelativeTo(null);
		
	}

}
