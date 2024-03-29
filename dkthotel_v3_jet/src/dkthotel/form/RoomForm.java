/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dkthotel.form;

import dkthotel.Room;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import static dkthotel.MyConnection.getConnection;

/**
 *
 * @author Thanh Phan
 */
public class RoomForm extends JFrame {

    /**
     * Creates new form
     */
    public RoomForm() {
        initComponents();
        getConnection();
        showRoomDisplay();
    }
    
    Connection con=null;
    Statement st=null;

    public ArrayList<Room> getRoomList() {
        ArrayList<Room> rl = new ArrayList<Room>();
        Connection con = getConnection();
        try {
            st = con.createStatement();
            String sql = "SELECT * FROM Room";

            ResultSet rs = st.executeQuery(sql);

            Room rm;
            while (rs.next()) {
                rm = new Room(rs.getString("RoomId"), rs.getString("RoomType"), rs.getString("RoomName"), rs.getFloat("RoomPrice"), rs.getString("RoomStatus"), rs.getString("BookingId"));

                //Thêm vào danh sách
                rl.add(rm);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rl;
    }
     public void showRoomDisplay() {
        String[] colTitle1 = new String[]{"Room Id", "Room Type", "Room Name", "Roome Price", "Room Status","Booking ID"};
        ArrayList<Room> rl = getRoomList();

        DefaultTableModel model = new DefaultTableModel(colTitle1, 0);

        Object[] row;

        for (int i = 0; i < rl.size(); i++) {

            row = new Object[6];

            // GÁN GIÁ TRỊ
            row[0] = rl.get(i).getRoomId();
            row[1] = rl.get(i).getRoomType();
            row[2] = rl.get(i).getRoomName();
            row[3] = rl.get(i).getRoomPrice();
            row[4] = rl.get(i).getRoomStatus();
            row[5] = rl.get(i).getBookingId();

            model.addRow(row);
        }
        
        //    }catch(ArrayIndexOutOfBoundsException ex){

        jTableRoom.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new JPanel();
        jPanel20 = new JPanel();
        jLabel31 = new JLabel();
        jPanel21 = new JPanel();
        jLabel32 = new JLabel();
        jLabel33 = new JLabel();
        jLabel34 = new JLabel();
        jLabel35 = new JLabel();
        jLabel36 = new JLabel();
        jLabel37 = new JLabel();
        jTextFieldRoomId = new JTextField();
        jTextFieldRoomType = new JTextField();
        jTextFieldRoomName = new JTextField();
        jTextFieldRoomPrice = new JTextField();
        jTextFieldRoomStatus = new JTextField();
        jTextFieldBookingId = new JTextField();
        add4 = new JButton();
        edit4 = new JButton();
        delete4 = new JButton();
        exit4 = new JButton();
        jButtonclear4 = new JButton();
        jPanel22 = new JPanel();
        jScrollPane5 = new JScrollPane();
        jTableRoom = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel31.setText("Room");

        GroupLayout jPanel20Layout = new GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31))
        );

        jPanel21.setBorder(BorderFactory.createTitledBorder("Room Infomation"));

        jLabel32.setText("Room Id");

        jLabel33.setText("Room Type");

        jLabel34.setText("Room Name");

        jLabel35.setText("Room Price");

        jLabel36.setText("Room Status");
        jLabel37.setText("Booking Id");

        jTextFieldRoomId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRoomIdActionPerformed(evt);
            }
        });

        jTextFieldRoomName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRoomNameActionPerformed(evt);
            }
        });

        add4.setIcon(new ImageIcon(getClass().getResource("/dkthotel/img/add.png"))); // NOI18N
        add4.setText("Add");
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });

        edit4.setIcon(new ImageIcon(getClass().getResource("/dkthotel/img/edit.png"))); // NOI18N
        edit4.setText("Edit");
        edit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit4ActionPerformed(evt);
            }
        });

        delete4.setIcon(new ImageIcon(getClass().getResource("/dkthotel/img/delete.png"))); // NOI18N
        delete4.setText("Delete");
        delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete4ActionPerformed(evt);
            }
        });

        exit4.setIcon(new ImageIcon(getClass().getResource("/dkthotel/img/exit.png"))); // NOI18N
        exit4.setText("Exit");
        exit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit4ActionPerformed(evt);
            }
        });

        jButtonclear4.setIcon(new ImageIcon(getClass().getResource("/dkthotel/img/clear.png"))); // NOI18N
        jButtonclear4.setText("Clear");
        jButtonclear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclear4ActionPerformed(evt);
            }
        });

        GroupLayout jPanel21Layout = new GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                        .addComponent(jLabel37)
                    .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(delete4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(edit4)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonclear4))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldRoomStatus, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(jTextFieldBookingId)
                            .addComponent(jTextFieldRoomPrice)
                            .addComponent(jTextFieldRoomName)
                            .addComponent(jTextFieldRoomType)
                            .addComponent(jTextFieldRoomId)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(exit4)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextFieldRoomId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jTextFieldRoomType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jTextFieldRoomName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jTextFieldRoomPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jTextFieldRoomStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jTextFieldBookingId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(add4)
                    .addComponent(edit4)
                    .addComponent(jButtonclear4))
                .addGap(26, 26, 26)
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(delete4)
                    .addComponent(exit4))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTableRoom.setModel(new DefaultTableModel(
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
        jTableRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRoomMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableRoom);

        GroupLayout jPanel22Layout = new GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanel22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jPanel20, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRoomIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRoomIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRoomIdActionPerformed

    private void jTextFieldRoomNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRoomNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRoomNameActionPerformed

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add4ActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = con.createStatement();
            String query = "INSERT INTO Room(RoomId, RoomType, RoomName, RoomPrice, RoomStatus, BookingId) VALUES('" + jTextFieldRoomId.getText() + "',"
            + "'" + jTextFieldRoomType.getText() + "','" + jTextFieldRoomName.getText() + "', '" + jTextFieldRoomPrice.getText() + "', '" + jTextFieldRoomStatus.getText() + "','" + jTextFieldBookingId.getText() + "')";

            st.execute(query);

            showRoomDisplay();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_add4ActionPerformed

    private void edit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit4ActionPerformed
        // TODO add your handling code here:
        if (jTableRoom.getSelectedRow()==-1) {
            if (jTableRoom.getRowCount()==0) {
                // lblError.setText("Table is empty");
            }
            else{
                //  lblError.setText("You must select a Tennis Player");
            }
        }
        else{
            DefaultTableModel model = (DefaultTableModel) jTableRoom.getModel();
            model.setValueAt(jTextFieldRoomId.getText(), jTableRoom.getSelectedRow(), 0);
            model.setValueAt(jTextFieldRoomType.getText(), jTableRoom.getSelectedRow(), 1);
            model.setValueAt(jTextFieldRoomName.getText(), jTableRoom.getSelectedRow(), 2);
            model.setValueAt(jTextFieldRoomPrice.getText(), jTableRoom.getSelectedRow(), 3);
            model.setValueAt(jTextFieldRoomStatus.getText(), jTableRoom.getSelectedRow(), 4);
            model.setValueAt(jTextFieldBookingId.getText(), jTableRoom.getSelectedRow(), 5);
        }

    }//GEN-LAST:event_edit4ActionPerformed

    private void delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete4ActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = con.createStatement();
            String query = "DELETE FROM Room WHERE RoomId = '" + jTextFieldRoomId.getText() + "'";
            st.executeUpdate(query);
            showRoomDisplay();

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
        jTextFieldRoomId.setText("");
        jTextFieldRoomType.setText("");
        jTextFieldRoomName.setText("");
        jTextFieldRoomPrice.setText("");
        jTextFieldRoomStatus.setText("");
        jTextFieldBookingId.setText("");
        jTextFieldRoomId.requestFocus();

    }//GEN-LAST:event_jButtonclear4ActionPerformed

    private void jTableRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRoomMouseClicked
        // TODO add your handling code here:
        int i = jTableRoom.getSelectedRow();
        TableModel model = jTableRoom.getModel();
        jTextFieldRoomId.setText(model.getValueAt(i, 0).toString());
        jTextFieldRoomType.setText(model.getValueAt(i, 1).toString());
        jTextFieldRoomName.setText(model.getValueAt(i, 2).toString());
        jTextFieldRoomPrice.setText(model.getValueAt(i, 3).toString());
        jTextFieldRoomStatus.setText(model.getValueAt(i, 4).toString());
        jTextFieldBookingId.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_jTableRoomMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButtonclear4;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;

    private JLabel jLabel37;
    private JPanel jPanel20;
    private JPanel jPanel21;
    private JPanel jPanel22;
    private JPanel jPanel6;
    private JScrollPane jScrollPane5;
    private JTable jTableRoom;
    private JTextField jTextFieldRoomStatus;
    private JTextField jTextFieldBookingId;
    private JTextField jTextFieldRoomId;
    private JTextField jTextFieldRoomType;
    private JTextField jTextFieldRoomName;
    private JTextField jTextFieldRoomPrice;
    private JButton edit4;
    private JButton add4;
    private JButton exit4;
    private JButton delete4;
    // End of variables declaration//GEN-END:variables
}
