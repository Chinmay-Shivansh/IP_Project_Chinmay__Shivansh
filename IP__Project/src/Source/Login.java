package Source;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author L35
 */
public class Login extends javax.swing.JFrame 
{
    String u,p;
        public void setCredentials(String MySQL_Username, String MySQL_Password) 
        {
            u = MySQL_Username;
            p = MySQL_Password;
        }
    /** Creates new form Login */
    public Login() {
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

        txtuname = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        pwd_field = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 110, -1));

        btnLogin.setFont(new java.awt.Font("Google Sans", 1, 16)); // NOI18N
        btnLogin.setForeground(java.awt.Color.darkGray);
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setOpaque(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 90, -1));
        getContentPane().add(pwd_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 110, -1));

        jLabel3.setFont(new java.awt.Font("Google Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.darkGray);
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, 20));

        jLabel1.setFont(new java.awt.Font("Google Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.darkGray);
        jLabel1.setText("Username (Employee ID)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Login_icon.gif"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(512, 512));
        jLabel4.setMinimumSize(new java.awt.Dimension(512, 512));
        jLabel4.setPreferredSize(new java.awt.Dimension(512, 512));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 170, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Login_background.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/white.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
      String Username = txtuname.getText();
      String Password = new String(pwd_field.getPassword());
      boolean exist = false;
      try
      {
          Class.forName("java.sql.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant_DB",u , p);
          Statement stmt = con.createStatement();
          String check_query = "SELECT Username, Password FROM login_credentials";
          try (ResultSet results = stmt.executeQuery(check_query))
          {
              while (results.next()) 
              {
                  String un = results.getString("Username");
                  String pwd =  results.getString("Password");
                  
                  if ((Username.equals(un)) && (Password.equals(pwd)))
                  {
                      exist = true;
                  }
                  
              } 
              
          }
          
          if(!exist)
          {
           JOptionPane.showMessageDialog(null, "Please Check Username and Password ");
          }
          
          if(exist)
          {
              Select_Operations so = new Select_Operations();
              so.setCredentials(u, p);
              so.setVisible(true);
              this.dispose();
          }
      }
      
      catch(HeadlessException | ClassNotFoundException | SQLException e)
      {
          JOptionPane.showMessageDialog(null, e);
      }
    }//GEN-LAST:event_btnLoginActionPerformed

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
                if ("Windows".equals(info.getName())) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pwd_field;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables

}
