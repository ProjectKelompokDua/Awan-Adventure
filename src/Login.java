/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.cj.jdbc.Driver;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
import koneksi.Connect;
/**
 *
 * @author perlengkapan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() {
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

        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lupaPassword = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        checkPass = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Awan Adventure");
        setUndecorated(true);
        getContentPane().setLayout(null);

        txt_username.setFont(new java.awt.Font("Outfit", 0, 20)); // NOI18N
        txt_username.setBorder(null);
        getContentPane().add(txt_username);
        txt_username.setBounds(680, 320, 310, 20);

        txt_password.setFont(new java.awt.Font("Outfit", 0, 20)); // NOI18N
        txt_password.setBorder(null);
        getContentPane().add(txt_password);
        txt_password.setBounds(680, 410, 310, 20);

        btn_login.setBackground(new java.awt.Color(252, 191, 73));
        btn_login.setFont(new java.awt.Font("Outfit", 0, 21)); // NOI18N
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(660, 530, 350, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lupaPassword.setBackground(new java.awt.Color(255, 255, 255));
        lupaPassword.setFont(new java.awt.Font("Outfit", 0, 21)); // NOI18N
        lupaPassword.setForeground(new java.awt.Color(0, 133, 255));
        lupaPassword.setText("Lupa Password?");
        lupaPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupaPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupaPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(lupaPassword);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(850, 490, 160, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(660, 520, 350, 70);

        checkPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPassActionPerformed(evt);
            }
        });
        getContentPane().add(checkPass);
        checkPass.setBounds(670, 450, 20, 19);

        jLabel3.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        jLabel3.setText("Show Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(690, 450, 110, 19);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Outfit Black", 0, 24)); // NOI18N
        exit.setText("X");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1160, 0, 30, 30);

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Outfit Black", 0, 24)); // NOI18N
        minimize.setText("-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(minimize)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(1130, 0, 30, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginPage.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1200, 675);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        try{
            if(txt_username.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
                txt_username.requestFocus();
            }else if(txt_password.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Password tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
                txt_password.requestFocus();
            }else{
                java.sql.Connection conn = (Connection)Connect.GetConnection();
                String sql = "SELECT * FROM pengguna WHERE username = '"+ txt_username.getText() +"' AND password = '"+ txt_password.getText() +"'";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery(sql);

                if(rs.next()){
                    if(txt_username.getText().equals(rs.getString("username"))){
                        JOptionPane.showMessageDialog(null, "berhasil login");
                        this.setVisible(false);
                        FormKasir fk = new FormKasir();
                        fk.setStatus(rs.getString("hak_akses"));
                        fk.setVisible(true);
                        Pengguna p = new Pengguna();
                        p.setStatus(rs.getString("hak_akses"));
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Username atau Password salah");
                    txt_username.requestFocus();
                }
            }
        }catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void checkPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPassActionPerformed
        // TODO add your handling code here:
        if(checkPass.isSelected()){
            txt_password.setEchoChar((char)0);
        }else{
            txt_password.setEchoChar('*');
        }
    }//GEN-LAST:event_checkPassActionPerformed

    private void lupaPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaPasswordMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ForgetPassword().setVisible(true);
    }//GEN-LAST:event_lupaPasswordMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        int confirmExit = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin keluar ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(confirmExit == JOptionPane.YES_OPTION){
            System.exit(0);
        }        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jPanel4MouseClicked

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_login;
    private javax.swing.JCheckBox checkPass;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lupaPassword;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
