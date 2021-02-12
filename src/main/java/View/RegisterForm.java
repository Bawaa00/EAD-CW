/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bawantha
 */
public class RegisterForm extends javax.swing.JDialog {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();
        txtError = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 59, 191));
        jLabel3.setText("EMAIL");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 59, 191));
        jLabel4.setText("USERNAME");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 59, 191));
        jLabel5.setText("PASSWORD");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 59, 191));
        jLabel6.setText("CONFIRM PASSWORD");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        btnRegister.setIcon(new javax.swing.ImageIcon("E:\\Downloads\\output-onlinepngtools.png")); // NOI18N
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, 70));

        txtError.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtError.setForeground(new java.awt.Color(255, 0, 0));
        txtError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtError.setToolTipText("");
        jPanel1.add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 260, 30));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(99, 99, 101));
        txtEmail.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 320, 30));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(99, 99, 101));
        txtUsername.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 320, 30));

        txtPwd.setForeground(new java.awt.Color(99, 99, 101));
        txtPwd.setText("jPasswordField1");
        txtPwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPwdFocusGained(evt);
            }
        });
        jPanel1.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 320, 30));

        txtConfirm.setForeground(new java.awt.Color(99, 99, 101));
        txtConfirm.setText("jPasswordField2");
        txtConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmFocusGained(evt);
            }
        });
        jPanel1.add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 320, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 59, 191));
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Downloads\\pure-white-background-85a2a7fd.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 370, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Downloads\\photo-1541377913493-addf80b95ded.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 650));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(625, 692));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        if(txtUsername.getText().equals(""))
            txtError.setText("Enter a username");
        else if (txtEmail.getText().equals(""))
            txtError.setText("Enter a username");
        else if (txtPwd.getText().equals(""))
            txtError.setText("Enter a password");
        else if(txtPwd.getText().equals(txtConfirm.getText())){
            try{
                Connection con = DB.createConnection();
                String sql = "insert into login (email,username,password) values('"+txtEmail.getText()+"','"+txtUsername.getText()+"','"+txtPwd.getText()+"')";
                PreparedStatement statement = con.prepareStatement(sql);
                int i = statement.executeUpdate();
                if(i==1){ 
                    JOptionPane.showMessageDialog(null,"Account Registered Succesfully");
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Could not Register ");
                    }
            }
            catch(Exception e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        else{
        txtError.setText("Passwords do not match");
       
        }
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void txtPwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusGained
        txtPwd.setText("");
    }//GEN-LAST:event_txtPwdFocusGained

    private void txtConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusGained
        txtConfirm.setText("");
    }//GEN-LAST:event_txtConfirmFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterForm dialog = new RegisterForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtError;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}