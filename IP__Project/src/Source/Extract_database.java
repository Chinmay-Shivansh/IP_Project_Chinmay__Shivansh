/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Source;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Chinmay Dalal
 */
public class Extract_database extends javax.swing.JFrame {

    /** Creates new form Extract_database */
    public Extract_database() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext = new javax.swing.JButton();
        btnExtract = new javax.swing.JButton();
        lblProgress = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMySQL_uname = new javax.swing.JTextField();
        MySQL_pwdfield = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNext.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next >");
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        btnExtract.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        btnExtract.setForeground(new java.awt.Color(255, 255, 255));
        btnExtract.setText("Extract database");
        btnExtract.setBorderPainted(false);
        btnExtract.setContentAreaFilled(false);
        btnExtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtractActionPerformed(evt);
            }
        });
        getContentPane().add(btnExtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        lblProgress.setFont(new java.awt.Font("Google Sans Medium", 0, 12)); // NOI18N
        lblProgress.setForeground(new java.awt.Color(255, 255, 255));
        lblProgress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 240, 19));

        jLabel2.setText("MySQL username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 110, 20));

        jLabel3.setText("MySQL password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 100, -1));
        getContentPane().add(txtMySQL_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 110, -1));
        getContentPane().add(MySQL_pwdfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Database background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void Extract(InputStream source , String destination, JLabel lbl) 
    {
        lbl.setText("Copying");
        try 
        {
            Files.copy(source, Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
            lbl.setText("Database extracted successfully");            
        } 
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            lbl.setText("Failed to extract database");
        }
    }
    
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        String m_uname = txtMySQL_uname.getText();
        String m_password = new String(MySQL_pwdfield.getPassword()); 
        if(m_uname.isEmpty()||m_password.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter your MySQL username and password");
        }
        else
        {
            new Login().setVisible(true);
            this.dispose();
        }        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnExtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtractActionPerformed
        // TODO add your handling code here:  
    InputStream s = getClass().getResourceAsStream("/Database/Database.sql");
    String d = null;        
        try //try-catch was auto-generated
        {
            d = (new File(IP__Project.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath()).replace("Restaurant Management.jar", "Database.sql");
        } 
        catch (URISyntaxException ex)
        {
            Logger.getLogger(Extract_database.class.getName()).log(Level.SEVERE, null, ex);
        }
    Extract(s, d, lblProgress);
    }//GEN-LAST:event_btnExtractActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Extract_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Extract_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Extract_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Extract_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater
        (new Runnable()
            {
                public void run() 
                {
                new Extract_database().setVisible(true);
                }
            }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField MySQL_pwdfield;
    private javax.swing.JButton btnExtract;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JTextField txtMySQL_uname;
    // End of variables declaration//GEN-END:variables

}
