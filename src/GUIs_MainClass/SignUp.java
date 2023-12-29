/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs_MainClass;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cris
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp3
     */
    public SignUp() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);

    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(136, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/200x180.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Polytechic University of the Philippines");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Unified Information System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 560));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(136, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sign Up");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 450, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(85, 85, 85));
        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, 40));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setSelectionColor(new java.awt.Color(136, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 240, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(85, 85, 85));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 95, 43));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 240, 41));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(85, 85, 85));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(85, 85, 85));
        jLabel8.setText("Back-up Code");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 41));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(130, 0, 0));
        jCheckBox1.setText("Show Password");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setFocusPainted(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(136, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREATE ACCOUNT");
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 373, 351, 44));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(130, 0, 0));
        jButton2.setText("Sign In");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1.setSelectionColor(new java.awt.Color(136, 0, 0));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, 41));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(130, 0, 0));
        jLabel9.setText("Already have an account?");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 166, -1));

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField2.setSelectionColor(new java.awt.Color(136, 0, 0));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 240, 41));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(130, 0, 0));
        jCheckBox2.setText("Show Code");
        jCheckBox2.setContentAreaFilled(false);
        jCheckBox2.setFocusPainted(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(130, 0, 0));
        jLabel12.setText("(for Account Retrieval)");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 336, 210, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 450, 480));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(136, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("X");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 1037, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/image-1080x900.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setBackground(new Color(136, 0, 0));
        jLabel10.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabel10.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setBackground(new Color(255, 255, 255));
        jLabel10.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabel10.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(102, 0, 0));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(136,0,0));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String strName = jTextField1.getText();
        String strUserName = jTextField2.getText();
        String strPassword = jPasswordField1.getText();
        String strCode = jPasswordField2.getText();
        
        if (strName.isEmpty() || strUserName.isEmpty() || strPassword.isEmpty() || strCode.isEmpty()) {
            // Display an error message or take appropriate action when any field is empty
            JOptionPane.showMessageDialog(this, "All fields must be filled out. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            
        }else {
            if (JOptionPane.showConfirmDialog(this, "The Previous Account will be deleted. Continue?", "NOTICE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
 
                try {
                    // TODO add your handling code here:
                    FileWriter fileName = new FileWriter("Account_Name.txt", false);
                    FileWriter fileUserName = new FileWriter("Account_UserName.txt", false);
                    FileWriter filePassword = new FileWriter("Account_Password.txt", false);
                    FileWriter fileCode = new FileWriter("Account_Code.txt", false);

                    fileName.write(strName);
                    fileUserName.write(strUserName);
                    filePassword.write(strPassword);
                    fileCode.write(strCode);

                    fileName.close();
                    fileUserName.close();
                    filePassword.close();
                    fileCode.close();
                    JOptionPane.showMessageDialog(this, "Account Successfully Created! Redirecting you to the Sign In Page", "Notice", JOptionPane.INFORMATION_MESSAGE);
                    
                    LogIn logFrame = new LogIn();
                    logFrame.pack();

                    logFrame.setVisible(true);

                    dispose(); // Close login frame
                }   catch (IOException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
       
        LogIn logFrame = new LogIn();
        logFrame.pack();
        
        logFrame.setVisible(true);
        
        dispose(); // Close login frame
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
         if (jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        }else{
            jPasswordField1.setEchoChar('•');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        
        if (jCheckBox2.isSelected()){
            jPasswordField2.setEchoChar((char)0);
        }else{
            jPasswordField2.setEchoChar('•');
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        // Creation of Account when Button is Clicked
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}