/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bustiket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SOUHARDO
 */
public class srch extends javax.swing.JFrame {

    /**
     * Creates new form srch
     */
     Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    private void Updatetable()
    {
      try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/busticket", "root", "");
                DefaultTableModel t1 = (DefaultTableModel)jTable1.getModel();
                String sql="SELECT `id`, `time`, `starting_point`, `ending_point`, `name`, `phoneno`, `seatno`, `date`, `price` FROM `sales_product`";
                Statement S=con.createStatement();
                ResultSet R=S.executeQuery(sql);
                while(R.next())
                {  
                    String id=R.getString(1);
                    String name=R.getString(5);
                    String phone=R.getString(6);
                    String seat=R.getString(7);
                    String to=R.getString(4);
                    String from=R.getString(3);
                    String date=R.getString(8);
                    String time=R.getString(2);
                    String price=R.getString(9);
                    //String price=R.getString(10);
                    Object[] O={id,name,phone,seat,to,from,date,time,price };
                    t1.addRow(O);
                    }
                }
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(busticket.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public srch() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnUpdate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtSeat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setForeground(new java.awt.Color(0, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Phone", "Seat", "To", "From", "Date", "Time", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTextArea1.setBackground(new java.awt.Color(255, 204, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 204));
        jTextArea1.setRows(5);
        jTextArea1.setText("For Update:First Click on Search Buton And Then Select Your Data From Jtable.\nAfter,Field Data in jtextField and Click on Update.\n\nFor Delete:Click on search Button and Select Data From Display list.\nThen,click on Delete Button.");
        jScrollPane1.setViewportView(jTextArea1);

        btnUpdate.setBackground(new java.awt.Color(51, 255, 0));
        btnUpdate.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("To:");

        txtTo.setBackground(new java.awt.Color(0, 255, 0));
        txtTo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("From:");

        txtFrom.setBackground(new java.awt.Color(0, 255, 0));
        txtFrom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Departure Time:");

        txtTime.setBackground(new java.awt.Color(0, 255, 0));
        txtTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel19.setBackground(new java.awt.Color(51, 51, 255));
        jLabel19.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("Price:");

        txtPrice.setBackground(new java.awt.Color(0, 255, 0));
        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 255, 102));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Journey Date:");

        txtDate.setBackground(new java.awt.Color(0, 255, 0));
        txtDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        txtSeat.setBackground(new java.awt.Color(0, 255, 0));
        txtSeat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Seat No:");

        btnsearch.setBackground(new java.awt.Color(0, 255, 0));
        btnsearch.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(0, 0, 204));
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 255, 0));
        btnDelete.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel19))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTime, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtPrice)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnsearch)
                                .addGap(51, 51, 51)
                                .addComponent(btnDelete)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2)))
                        .addContainerGap(536, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtSeat)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(1534, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel9))
                            .addComponent(txtSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(268, 268, 268)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnsearch)
                            .addComponent(btnDelete))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/busticket", "root", "");
            int row=jTable1.getSelectedRow();
            String col=jTable1.getModel().getValueAt(row, 0).toString();
            String value1=txtSeat.getText();
            String value2=txtFrom.getText();
            String value3=txtTime.getText();
            String value4=txtTo.getText();
            String value5=txtDate.getText();
            String value6=txtPrice.getText();
            String sql="UPDATE sales_product SET seatno='"+value1+"',starting_point='"+value2+"',time='"+value3+"',ending_point='"+value4+"',date='"+value5+"',price='"+value6+"' WHERE id="+col;
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Booking Modified Successful" );
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(srch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        Updatetable();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row=jTable1.getSelectedRow();
        String col=jTable1.getModel().getValueAt(row, 0).toString();
        String sql="DELETE FROM sales_product WHERE id= "+col;
        try{
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Booking Cancel Successful" );
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(srch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(srch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(srch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(srch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new srch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSeat;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}