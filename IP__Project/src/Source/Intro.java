/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Source;

/** @author Chinmay Dalal */
public class Intro extends javax.swing.JFrame {

  /** Creates new form Intro */
  public Intro() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btnOK = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
    jLabel1.setForeground(java.awt.Color.darkGray);
    jLabel1.setText(
        "<html>\n"
            + "<h1>Intro</h1>\n"
            + "<br>  This Java application was created by <b>Chinmay Dalal</b> and <b>Shivansh"
            + " Rajpurohit.</b>\n"
            + "<br><br>\n"
            + "<h3>How to use this program for the first time:</h3>\n"
            + "<ul type=\"disk\">\n"
            + "    <li>In the next window, enter the path to extract the database to (using"
            + " backslash for subdirectory)(will extract to working directory if path is not"
            + " entered), then click on <b>Extract database</b> button.\n"
            + "    <li>Go to your MySQL installation directory. By default, it is:<br>&emsp;<font"
            + " face = \"Consolas\" color=\"006a4e\">C:/Program Files/MySQL/MySQL Server [MySQL"
            + " version]</font>\n"
            + "    <li>Open <font face = \"Consolas\" color=\"blue\"><b>bin</b></font>.\n"
            + "    <li>Copy the database here, open a command window and type:\n"
            + "        <font face = \"Consolas\" color=\"006a4e\">\n"
            + "            <br>&emsp;mysql -u [username here] -p[password here]\n"
            + "            <br>&emsp;create database Restauarant_DB;\n"
            + "            <br>&emsp;use Restaurant_DB;\n"
            + "            <br>&emsp;source Restaurant_DB.sql;\n"
            + "            <br>\n"
            + "        </font>\n"
            + "    <li>Click <b>Next></b>.\n"
            + "</ul>");
    getContentPane()
        .add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 690, 350));

    btnOK.setFont(new java.awt.Font("Google Sans Medium", 1, 14)); // NOI18N
    btnOK.setText("OK");
    btnOK.setBorder(null);
    btnOK.setBorderPainted(false);
    btnOK.setContentAreaFilled(false);
    btnOK.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnOKActionPerformed(evt);
          }
        });
    getContentPane()
        .add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

    jLabel3.setFont(new java.awt.Font("Google Sans Medium", 1, 24)); // NOI18N
    jLabel3.setForeground(java.awt.Color.red);
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("RESTAURANT MANAGEMENT SOFTWARE");
    getContentPane()
        .add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 590, 50));

    jLabel2.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/Resources/white.jpg"))); // NOI18N
    getContentPane()
        .add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 750, 530));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void btnOKActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnOKActionPerformed
    // TODO add your handling code here:
    new Extract_database_and_get_MySQL_credentials().setVisible(true);
    this.dispose();
  } // GEN-LAST:event_btnOKActionPerformed

  /** @param args the command line arguments */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info :
          javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Intro.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Intro.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Intro.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Intro.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new Intro().setVisible(true);
          }
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnOK;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  // End of variables declaration//GEN-END:variables

}
