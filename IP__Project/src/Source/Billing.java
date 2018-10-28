/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Billing extends javax.swing.JFrame 
{
    String u,p;
        public void setCredentials(String MySQL_Username, String MySQL_Password) 
        {
            u = MySQL_Username;
            p = MySQL_Password;
        }

    /**
     * Creates new form Billing
     */
    public Billing() 
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbItem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl.setFont(new java.awt.Font("Google Sans", 0, 12)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 370, 330));

        jLabel2.setFont(new java.awt.Font("Google Sans Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.darkGray);
        jLabel2.setText("Quantity");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 60, 20));

        txtQty.setFont(new java.awt.Font("Google Sans", 0, 11)); // NOI18N
        getContentPane().add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 70, 20));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        btnAdd.setForeground(java.awt.Color.darkGray);
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 60, -1));

        btnBill.setBackground(new java.awt.Color(255, 255, 255));
        btnBill.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        btnBill.setForeground(java.awt.Color.darkGray);
        btnBill.setText("<html><p align='center'>Display total amount<br>and<br>save bill</p></html>");
        btnBill.setBorder(null);
        btnBill.setBorderPainted(false);
        btnBill.setContentAreaFilled(false);
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });
        getContentPane().add(btnBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 130, 90));

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        btnClear.setForeground(java.awt.Color.darkGray);
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.setBorderPainted(false);
        btnClear.setContentAreaFilled(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        btnRemove.setBackground(new java.awt.Color(255, 255, 255));
        btnRemove.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        btnRemove.setForeground(java.awt.Color.darkGray);
        btnRemove.setText("Remove Item");
        btnRemove.setBorder(null);
        btnRemove.setBorderPainted(false);
        btnRemove.setContentAreaFilled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/cash.png")) );
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 62, 62));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/card.png")) );
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 62, 62));

        jLabel6.setFont(new java.awt.Font("Google Sans Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(java.awt.Color.darkGray);
        jLabel6.setText("Item");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 50, -1));
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 50, 20));

        Back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Back_black.png"))); // NOI18N
        Back_button.setBorder(null);
        Back_button.setBorderPainted(false);
        Back_button.setContentAreaFilled(false);
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 40));

        jLabel7.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.darkGray);
        jLabel7.setText("Total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, 20));

        cmbItem.setFont(new java.awt.Font("Google Sans Medium", 0, 12)); // NOI18N
        cmbItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemActionPerformed(evt);
            }
        });
        cmbItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbItemKeyPressed(evt);
            }
        });
        getContentPane().add(cmbItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/white.jpg")));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        DefaultTableCellRenderer centreRenderer = new DefaultTableCellRenderer();
        centreRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        TableModel tableModel = tbl.getModel();
        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
        {
            tbl.getColumnModel().getColumn(columnIndex).setCellRenderer(centreRenderer);
        }
        DefaultComboBoxModel cmbModel = new DefaultComboBoxModel();
        cmbModel = null;
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant_DB", u, p);
            Statement stmt = con.createStatement();
            String str="select * from menu;";
            ResultSet rs=stmt.executeQuery(str);
            while(rs.next())
            {
                cmbItem.addItem(rs.getString("Item"));                
            }
            con.close();
            stmt.close();
        }
        catch(ClassNotFoundException | NumberFormatException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_formWindowActivated
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mytable = (DefaultTableModel)tbl.getModel();
         try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant_DB", u, p);
            Statement stmt = con.createStatement();
            String str="select * from menu where Item = '"+cmbItem.getSelectedItem().toString()+"';";
            ResultSet rs=stmt.executeQuery(str);
            while(rs.next())
            {
                String i=rs.getString("Item");
                int p = rs.getInt("Price");
                int q;
                if(txtQty.getText().isEmpty())
                {
                    q=1;
                }
                else
                {
                    q=Integer.parseInt(txtQty.getText());
                }                
                int a = p*q;
                Object [] Row = {i,p,q,a};
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
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mytable = (DefaultTableModel)tbl.getModel();
        mytable.removeRow(tbl.getSelectedRow());
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mytable1 = (DefaultTableModel)tbl.getModel();
        mytable1.setRowCount(0);
        txtQty.setText("");
        lblTotal.setText("");
        cmbItem.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mytable2 = (DefaultTableModel)tbl.getModel();
        int total =0;
        for(int i=0; i<mytable2.getRowCount();i++)
        {
            total+=Integer.parseInt(tbl.getValueAt(i, 3).toString());
        }
        lblTotal.setText(""+total);
        try
        {
            Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant_DB", u, p);
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("Insert into Bills (Amount, Time) values('"+total+"', NOW());");
                    JOptionPane.showMessageDialog(null, "Bill saved");
                    stmt.close();
                    con.close();
        } 
               catch (HeadlessException | ClassNotFoundException | SQLException e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
    }//GEN-LAST:event_btnBillActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        Select_Operations so = new Select_Operations();
        so.setCredentials(u, p);
        so.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void cmbItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbItemActionPerformed

    private void cmbItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbItemKeyPressed
        // TODO add your handling code here:              
    }//GEN-LAST:event_cmbItemKeyPressed
      
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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Billing().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmbItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
