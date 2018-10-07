package Source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shivansh
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSerialInsert = new javax.swing.JTextField();
        txtItem = new javax.swing.JTextField();
        txtSerialSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btn_ShowMenu = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Google Sans", 0, 11)); // NOI18N

        tbl.setFont(new java.awt.Font("Google Sans", 0, 11)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial no.", "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        tbl.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 0, 540, 300));

        jLabel2.setFont(new java.awt.Font("Google Sans", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Serial no.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 326, 60, -1));

        jLabel3.setFont(new java.awt.Font("Google Sans", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 326, -1, -1));

        jLabel4.setFont(new java.awt.Font("Google Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 326, -1, -1));
        getContentPane().add(txtSerialInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 351, 67, -1));
        getContentPane().add(txtItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 353, 130, -1));
        getContentPane().add(txtSerialSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 462, 50, -1));

        jLabel5.setFont(new java.awt.Font("Google Sans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter serial no.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 464, 94, 20));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 353, 61, -1));

        btnDelete.setFont(new java.awt.Font("Google Sans Medium", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, -1));

        btnSearch.setFont(new java.awt.Font("Google Sans Medium", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        btnInsert.setFont(new java.awt.Font("Google Sans Medium", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insert");
        btnInsert.setBorder(null);
        btnInsert.setBorderPainted(false);
        btnInsert.setContentAreaFilled(false);
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Google Sans Medium", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        btn_ShowMenu.setFont(new java.awt.Font("Google Sans Medium", 1, 14)); // NOI18N
        btn_ShowMenu.setForeground(new java.awt.Color(255, 255, 255));
        btn_ShowMenu.setText("Show menu");
        btn_ShowMenu.setBorder(null);
        btn_ShowMenu.setBorderPainted(false);
        btn_ShowMenu.setContentAreaFilled(false);
        btn_ShowMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ShowMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        Back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/arrowhead-thin-outline-to-the-left (1).png"))); // NOI18N
        Back_button.setBorder(null);
        Back_button.setBorderPainted(false);
        Back_button.setContentAreaFilled(false);
        Back_button.setMaximumSize(new java.awt.Dimension(32, 32));
        Back_button.setMinimumSize(new java.awt.Dimension(32, 32));
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Google Sans Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/Menu_background.jpg")));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 234, 539));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/Menu_colour.png")));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 780, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
                try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ip_project", "root", "123456");
            Statement stmt = con.createStatement();
            String s="delete from menu where serial_no ="+txtSerialSearch.getText()+";";
            stmt.executeUpdate(s);
            JOptionPane.showMessageDialog(null, "Record Deleted");
            con.close();
            stmt.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
               try
        {
            Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ip_project", "root", "123456");
                    Statement stmt = con.createStatement();
                    String s = "Insert into menu values('"+txtSerialInsert.getText()+"', '"+txtItem.getText()+"', "+txtPrice.getText()+");";
                    stmt.executeUpdate(s);
                    JOptionPane.showMessageDialog(null, "Record saved");
                    stmt.close();
                    con.close();
        } 
               catch (Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ip_project","root","123456");
            Statement stmt=con.createStatement();
            String s="update menu set item='"+txtItem.getText()+"' where serial_no="+txtSerialInsert.getText()+";";
            stmt.executeUpdate(s);
            String s1="update menu set Price='"+txtPrice.getText()+"' where serial_no="+txtSerialInsert.getText()+";";
            stmt.executeUpdate(s1);
            JOptionPane.showMessageDialog(null,"Record Updated");
             stmt.close();
             con.close();
             txtSerialInsert.setText(" ");
             txtItem.setText(" ");
             txtPrice.setText(" ");
             txtSerialSearch.setText(" ");
         }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ip_project", "root", "123456");
            Statement stmt = con.createStatement();
            String str="select * from menu where serial_no ="+txtSerialSearch.getText()+";";
            ResultSet rs=stmt.executeQuery(str);
            rs.next();
            int s=rs.getInt("Serial_No");txtSerialInsert.setText(""+s);
            String i=rs.getString("Item");txtItem.setText(""+i);
            int p=rs.getInt("Price");txtPrice.setText(""+p);
            con.close();
            stmt.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btn_ShowMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowMenuActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mytable = (DefaultTableModel)tbl.getModel();
        mytable.setRowCount(0);
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ip_project", "root", "123456");
            Statement stmt = con.createStatement();
            String str="select * from menu;";
            ResultSet rs=stmt.executeQuery(str);
            while(rs.next())
            {
                String i=rs.getString("Item");
                int s = rs.getInt("Serial_No");
                int p = rs.getInt("Price");
                Object [] Row = {s,i,p};
                mytable.addRow(Row);
            }
            con.close();
            stmt.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }                                        
    }//GEN-LAST:event_btn_ShowMenuActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:             
        DefaultTableCellRenderer centreRenderer = new DefaultTableCellRenderer();
        centreRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        TableModel tableModel = tbl.getModel();
        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
        {
            tbl.getColumnModel().getColumn(columnIndex).setCellRenderer(centreRenderer);
        }
    }//GEN-LAST:event_formWindowActivated

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        new Select_Operations().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_ShowMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSerialInsert;
    private javax.swing.JTextField txtSerialSearch;
    // End of variables declaration//GEN-END:variables
}
