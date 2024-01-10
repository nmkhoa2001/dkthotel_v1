/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dkthotel.form;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import dkthotel.Booking;
import static dkthotel.MyConnection.getConnection;
/**
 *
 * @author Thanh Phan
 */
public class BookingForm extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public BookingForm() {
        initComponents();
        getConnection();
        showBookingList();
    }
    
    Connection con=null;
    Statement st=null;
    
    public ArrayList<Booking> getBookingList() {
        ArrayList<Booking> bkl = new ArrayList<Booking>();
        Connection con = getConnection();
        try {
            st = (Statement) con.createStatement();
            String sql = "SELECT * FROM Booking";
            ResultSet rs = st.executeQuery(sql);

            Booking bk;
            while (rs.next()) {
                bk = new Booking(rs.getString("BookingId"), rs.getDate("CheckInDate"), rs.getDate("CheckOutDate"), rs.getString("RoomNote"), rs.getString("BookingStatus") );

                //add to list
                bkl.add(bk);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return bkl;
    }
     public void showBookingList() {
        String colTitle1[] = new String[]{"Booking Id", "Check In Date", "Check Out Date", "Roome Note", "Booking Status"};
        ArrayList<Booking> bkl = getBookingList();

        DefaultTableModel model = new DefaultTableModel(colTitle1, 0);

        Object[] row;

        for (int i = 0; i < bkl.size(); i++) {

            row = new Object[5];

            // GÁN GIÁ TRỊ
            row[0] = bkl.get(i).getBookingId();
            row[1] = bkl.get(i).getCheckInDate();
            row[2] = bkl.get(i).getCheckOutDate();
            row[3] = bkl.get(i).getRoomNote();
            row[4] = bkl.get(i).getBookingStatus();

            model.addRow(row);
        }
        
        //    }catch(ArrayIndexOutOfBoundsException ex){

        jTableBooking.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextFieldBookingId = new javax.swing.JTextField();
        jTextFieldCheckInDate = new javax.swing.JTextField();
        jTextFieldCheckOutDate = new javax.swing.JTextField();
        jTextFieldRoomNote = new javax.swing.JTextField();
        jTextFieldBookingStatus = new javax.swing.JTextField();
        add4 = new javax.swing.JButton();
        edit4 = new javax.swing.JButton();
        delete4 = new javax.swing.JButton();
        exit4 = new javax.swing.JButton();
        jButtonclear4 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableBooking = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel31.setText("Booking");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Booking Infomation"));

        jLabel32.setText("Booking Id");

        jLabel33.setText("Check In Date");

        jLabel34.setText("Check Out Date");

        jLabel35.setText("Room Note");

        jLabel36.setText("Booking Status");

        jTextFieldBookingId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBookingIdActionPerformed(evt);
            }
        });

        jTextFieldCheckOutDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCheckOutDateActionPerformed(evt);
            }
        });

        add4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dkthotel/img/add.png"))); // NOI18N
        add4.setText("Add");
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });

        edit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dkthotel/img/edit.png"))); // NOI18N
        edit4.setText("Edit");
        edit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit4ActionPerformed(evt);
            }
        });

        delete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dkthotel/img/delete.png"))); // NOI18N
        delete4.setText("Delete");
        delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete4ActionPerformed(evt);
            }
        });

        exit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dkthotel/img/exit.png"))); // NOI18N
        exit4.setText("Exit");
        exit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit4ActionPerformed(evt);
            }
        });

        jButtonclear4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dkthotel/img/clear.png"))); // NOI18N
        jButtonclear4.setText("Clear");
        jButtonclear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclear4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(delete4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(edit4)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonclear4))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBookingStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jTextFieldRoomNote)
                            .addComponent(jTextFieldCheckOutDate)
                            .addComponent(jTextFieldCheckInDate)
                            .addComponent(jTextFieldBookingId)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(exit4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextFieldBookingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jTextFieldCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jTextFieldCheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jTextFieldRoomNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jTextFieldBookingStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add4)
                    .addComponent(edit4)
                    .addComponent(jButtonclear4))
                .addGap(26, 26, 26)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete4)
                    .addComponent(exit4))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTableBooking.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBookingMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableBooking);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBookingIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBookingIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBookingIdActionPerformed

    private void jTextFieldCheckOutDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCheckOutDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCheckOutDateActionPerformed

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add4ActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "INSERT INTO Booking(BookingId,CheckInDate, CheckOutDate, RoomNote, BookingStatus) VALUES('" + jTextFieldBookingId.getText() + "',"
            + "'" + jTextFieldCheckInDate.getText() + "','" + jTextFieldCheckOutDate.getText() + "', '" + jTextFieldRoomNote.getText() + "', '" + jTextFieldBookingStatus.getText() + "')";

            st.execute(query);
            showBookingList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_add4ActionPerformed

    private void edit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit4ActionPerformed
        // TODO add your handling code here:
        if (jTableBooking.getSelectedRow()==-1) {
            if (jTableBooking.getRowCount()==0) {
                // lblError.setText("Table is empty");
            }
            else{
                //  lblError.setText("You must select a Tennis Player");
            }
        }
        else{
            DefaultTableModel model = (DefaultTableModel) jTableBooking.getModel();
            model.setValueAt(jTextFieldBookingId.getText(), jTableBooking.getSelectedRow(), 0);
            model.setValueAt(jTextFieldCheckInDate.getText().toString(), jTableBooking.getSelectedRow(), 1);
            model.setValueAt(jTextFieldCheckOutDate.getText(), jTableBooking.getSelectedRow(), 2);
            model.setValueAt(jTextFieldRoomNote.getText(), jTableBooking.getSelectedRow(), 3);
            model.setValueAt(jTextFieldBookingStatus.getText(), jTableBooking.getSelectedRow(), 4);
        }

    }//GEN-LAST:event_edit4ActionPerformed

    private void delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete4ActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "DELETE FROM Booking WHERE BookingId = '" + jTextFieldBookingId.getText() + "'";
            st.executeUpdate(query);
            showBookingList();

        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }//GEN-LAST:event_delete4ActionPerformed

    private void exit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit4ActionPerformed
        // TODO add your handling code here:
        exit4.setToolTipText("Click exit ");
        int selected = JOptionPane.showConfirmDialog(this, "Would you like"
            + " exit?", "Message", JOptionPane.YES_NO_CANCEL_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_exit4ActionPerformed

    private void jButtonclear4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclear4ActionPerformed
        // TODO add your handling code here:
        jTextFieldBookingId.setText("");
        jTextFieldCheckInDate.setText("");
        jTextFieldCheckOutDate.setText("");
        jTextFieldRoomNote.setText("");
        jTextFieldBookingStatus.setText("");
        jTextFieldBookingId.requestFocus();

    }//GEN-LAST:event_jButtonclear4ActionPerformed

    private void jTableBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBookingMouseClicked
        // TODO add your handling code here:
        int i = jTableBooking.getSelectedRow();
        TableModel model = jTableBooking.getModel();
        jTextFieldBookingId.setText(model.getValueAt(i, 0).toString());
        jTextFieldCheckInDate.setText(model.getValueAt(i, 1).toString());
        jTextFieldCheckOutDate.setText(model.getValueAt(i, 2).toString());
        jTextFieldRoomNote.setText(model.getValueAt(i, 3).toString());
        jTextFieldBookingStatus.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_jTableBookingMouseClicked

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
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonclear4;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableBooking;
    private javax.swing.JTextField jTextFieldBookingStatus;
    private javax.swing.JTextField jTextFieldBookingId;
    private javax.swing.JTextField jTextFieldCheckInDate;
    private javax.swing.JTextField jTextFieldCheckOutDate;
    private javax.swing.JTextField jTextFieldRoomNote;
    private javax.swing.JButton edit4;
    private javax.swing.JButton add4;
    private javax.swing.JButton exit4;
    private javax.swing.JButton delete4;
    // End of variables declaration//GEN-END:variables
}
