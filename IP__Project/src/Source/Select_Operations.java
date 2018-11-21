/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author Shivansh
 */
public class Select_Operations extends javax.swing.JFrame 
{
    String u,p;
        public void setCredentials(String MySQL_Username, String MySQL_Password) 
        {
            u = MySQL_Username;
            p = MySQL_Password;
        }

    /**
     * Creates new form Select_Operations
     */
    public Select_Operations() 
    {
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

        btnBilling = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();
        btnViewBills = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBilling.setFont(new java.awt.Font("Google Sans Medium", 1, 18)); // NOI18N
        btnBilling.setForeground(new java.awt.Color(255, 255, 255));
        btnBilling.setText("Billing");
        btnBilling.setBorder(null);
        btnBilling.setBorderPainted(false);
        btnBilling.setContentAreaFilled(false);
        btnBilling.setOpaque(false);
        btnBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillingActionPerformed(evt);
            }
        });
        getContentPane().add(btnBilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 113, 100, 30));

        btnMenu.setFont(new java.awt.Font("Google Sans Medium", 1, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menu");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setOpaque(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 113, 100, 30));

        btnFeedback.setFont(new java.awt.Font("Google Sans Medium", 1, 18)); // NOI18N
        btnFeedback.setForeground(new java.awt.Color(255, 255, 255));
        btnFeedback.setText("Feedback");
        btnFeedback.setBorder(null);
        btnFeedback.setBorderPainted(false);
        btnFeedback.setContentAreaFilled(false);
        btnFeedback.setOpaque(false);
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 130, 30));

        Back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Back_white.png"))); // NOI18N
        Back_button.setBorder(null);
        Back_button.setBorderPainted(false);
        Back_button.setContentAreaFilled(false);
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, 30));

        btnViewBills.setFont(new java.awt.Font("Google Sans Medium", 1, 18)); // NOI18N
        btnViewBills.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBills.setText("View Bills");
        btnViewBills.setBorder(null);
        btnViewBills.setBorderPainted(false);
        btnViewBills.setContentAreaFilled(false);
        btnViewBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillsActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 260, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/SelectOperations_background.jpg")));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setCredentials(u, p);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillingActionPerformed
        // TODO add your handling code here:
        Billing billing = new Billing();
        billing.setCredentials(u, p);
        billing.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBillingActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:
        Feedback feedback = new Feedback();
        feedback.setCredentials(u, p);
        feedback.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setCredentials(u, p);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void btnViewBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillsActionPerformed
        // TODO add your handling code here:
        View_Bills viewbills = new View_Bills();
        viewbills.setCredentials(u, p);
        viewbills.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewBillsActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Select_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater
        (new Runnable() 
        {
            public void run()
            {
                new Select_Operations().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton btnBilling;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnViewBills;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
