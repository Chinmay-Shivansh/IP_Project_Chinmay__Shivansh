/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Source;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.*;

/**
 *
 * @author Chinmay Dalal
 */
public class View_Bills extends javax.swing.JFrame 
{
    String u,p;
        public void setCredentials(String MySQL_Username, String MySQL_Password) 
        {
            u = MySQL_Username;
            p = MySQL_Password;
        }

    /** Creates new form View_Bills */
    public View_Bills() 
    {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btn_ViewBills = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();
        btn_DeleteBills = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl.setFont(new java.awt.Font("Google Sans", 0, 12)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill number", "Total", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 260));

        btn_ViewBills.setFont(new java.awt.Font("Google Sans Medium", 0, 16)); // NOI18N
        btn_ViewBills.setForeground(java.awt.Color.darkGray);
        btn_ViewBills.setText("View Bills");
        btn_ViewBills.setBorder(null);
        btn_ViewBills.setBorderPainted(false);
        btn_ViewBills.setContentAreaFilled(false);
        btn_ViewBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewBillsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ViewBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        Back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Back_black.png"))); // NOI18N
        Back_button.setBorder(null);
        Back_button.setBorderPainted(false);
        Back_button.setContentAreaFilled(false);
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btn_DeleteBills.setFont(new java.awt.Font("Google Sans Medium", 0, 16)); // NOI18N
        btn_DeleteBills.setForeground(java.awt.Color.darkGray);
        btn_DeleteBills.setText("Delete bills");
        btn_DeleteBills.setBorder(null);
        btn_DeleteBills.setBorderPainted(false);
        btn_DeleteBills.setContentAreaFilled(false);
        btn_DeleteBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteBillsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_DeleteBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Billing_background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 730, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/white.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 727, 399));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ViewBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewBillsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mytable = (DefaultTableModel)tbl.getModel();
        mytable.setRowCount(0);
         try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant_DB", u, p);
            Statement stmt = con.createStatement();
            String str="select * from Bills;";
            ResultSet rs=stmt.executeQuery(str);
            while(rs.next())
            {
                int n = rs.getInt("Bill_number");
                String tot = rs.getString("Amount");
                String timestamp = rs.getString("Time");
                Object [] Row = {n,tot, timestamp};
                SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        mytable.addRow(Row);
                    }
                }
                );
            }
            con.close();
            stmt.close();
        }
        catch(ClassNotFoundException | NumberFormatException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }        
    }//GEN-LAST:event_btn_ViewBillsActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        DefaultTableCellRenderer centreRenderer = new DefaultTableCellRenderer();
        centreRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        TableModel tableModel = tbl.getModel();
        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
        {
            tbl.getColumnModel().getColumn(columnIndex).setCellRenderer(centreRenderer);
        }
        tbl.setModel(null);
    }//GEN-LAST:event_formWindowActivated

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        Select_Operations so = new Select_Operations();
        so.setCredentials(u, p);
        so.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void btn_DeleteBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteBillsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mytable = (DefaultTableModel)tbl.getModel();
        int DialogueResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the selected bills?");
        if(DialogueResult == JOptionPane.YES_OPTION)
        {
            int x = tbl.getSelectedRow();
            int y = Integer.parseInt(mytable.getValueAt(x, 0).toString());
             try
            {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant_DB", u, p);
            Statement stmt = con.createStatement();
            String update = "delete from bills where Bill_number="+y+"";
            stmt.executeUpdate(update);
            }
            catch(ClassNotFoundException | SQLException e)
            {
                 JOptionPane.showMessageDialog(null, e);
            }
        }                                                
    }//GEN-LAST:event_btn_DeleteBillsActionPerformed

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
            java.util.logging.Logger.getLogger(View_Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new View_Bills().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton btn_DeleteBills;
    private javax.swing.JButton btn_ViewBills;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables

}
