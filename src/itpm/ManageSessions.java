/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm;

import java.awt.Font;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class ManageSessions extends javax.swing.JFrame {

    /**
     * Creates new form ManageLecturer
     */
    public ManageSessions() {
        initComponents();

        jTable1.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
        jTable1.setRowHeight(50);
        //change the alignment of the table
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(jLabel1.CENTER);
        jTable1.setDefaultRenderer(String.class, centerRenderer);
        for (int x = 0; x < jTable1.getColumnCount(); x++) {

            jTable1.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);

        }
        loadlecdetais();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(255, 190, 190));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 130, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(124, 221, 250));
        jLabel1.setText("Manage Sessions");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 160, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecturer 1", "Lecturer 2", "Subject Name", "Group Id", "Tag", "Student Count", "Duration Hour", "Duration Min"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 790, 270));

        jButton1.setBackground(new java.awt.Color(225, 231, 44));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 160, 30));

        jButton4.setBackground(new java.awt.Color(124, 221, 250));
        jButton4.setText("View");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 160, 30));

        jButton2.setBackground(new java.awt.Color(146, 232, 78));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 160, 30));

        jButton3.setBackground(new java.awt.Color(225, 231, 44));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 160, 30));

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, 30));

        jButton5.setBackground(new java.awt.Color(225, 231, 44));
        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 160, 30));

        jButton6.setBackground(new java.awt.Color(146, 232, 78));
        jButton6.setText("Add Session");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 160, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpmpro/676549.jpg"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 251, 19), 4));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 410));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Best-universities-in-Australia-for-international-undergraduate-students-in-2020-ranking.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 530));

        setSize(new java.awt.Dimension(995, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            try {
                int i = jTable1.getSelectedRow();

                System.out.println(i);
                if (i < 0) {
                    JOptionPane.showMessageDialog(this, "<html>Select Valid Row..</html>", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
                    String id = (String) jTable1.getValueAt(i, 0);
                    String sta = "Delete";
                    DB.iud("delete from  addnewsession where id='" + id + "'");
                    JOptionPane.showMessageDialog(this, "<html>Data Removed..</html>", "Sucess", JOptionPane.OK_OPTION);
                    this.dispose();
                    Thread.sleep(100);
                    new ManageSessions().setVisible(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            try {
                int i = jTable1.getSelectedRow();

                System.out.println(i);
                if (i < 0) {
                    JOptionPane.showMessageDialog(this, "<html>Select Valid Row..</html>", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
                    String id = (String) jTable1.getValueAt(i, 0);
                    String lec1 = (String) jTable1.getValueAt(i, 1);
                    String lec2 = (String) jTable1.getValueAt(i, 2);
                    String subname = (String) jTable1.getValueAt(i, 3);
                    String grpid = (String) jTable1.getValueAt(i, 4);
                    String tag = (String) jTable1.getValueAt(i, 5);
                    String stdcount = (String) jTable1.getValueAt(i, 6);
                    String durhr = (String) jTable1.getValueAt(i, 7);
                    String durmin = (String) jTable1.getValueAt(i, 8);
                    String sta = "Delete";
                    DB.iud("UPDATE\n"
                            + " `addnewsession`\n"
                            + "SET\n"
                            + "  `lect1` = '" + lec1 + "',\n"
                            + "  `lect2` = '" + lec2 + "',\n"
                            + "  `subname` = '" + subname + "',\n"
                            + "  `grpid` = '" + grpid + "',\n"
                            + "  `tagz` = '" + grpid + "',\n"
                            + "  `studentcount` = '" + stdcount + "',\n"
                            + "  `durationhr` = '" + durhr + "',\n"
                            + "  `durationmin` = '" + durmin + "'\n"
                            + "WHERE `id` = '" + id + "';");
                    JOptionPane.showMessageDialog(this, "<html>Data updated..</html>", "Sucess", JOptionPane.OK_OPTION);
                    loadlecdetais();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            loadlecdetais();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        new AddSession().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        try {
            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
            defaultTableModel.setRowCount(0);
            ResultSet resultSet = DB.search("select * from addnewsession where id like '%" + jTextField7.getText() + "%'");
            while (resultSet.next()) {
                Vector v = new Vector();

                v.add(resultSet.getString("id"));
                v.add(resultSet.getString("lect1"));
                v.add(resultSet.getString("lect2"));
                v.add(resultSet.getString("subname"));
                v.add(resultSet.getString("grpid"));
                v.add(resultSet.getString("tagz"));
                v.add(resultSet.getString("studentcount"));
                v.add(resultSet.getString("durationhr"));
                v.add(resultSet.getString("durationmin"));
                defaultTableModel.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Dashboard_member2().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSessions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    private void loadlecdetais() {
        try {
            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
            defaultTableModel.setRowCount(0);
            ResultSet resultSet = DB.search("select * from addnewsession");
            while (resultSet.next()) {
                Vector v = new Vector();

                v.add(resultSet.getString("id"));
                v.add(resultSet.getString("lect1"));
                v.add(resultSet.getString("lect2"));
                v.add(resultSet.getString("subname"));
                v.add(resultSet.getString("grpid"));
                v.add(resultSet.getString("tagz"));
                v.add(resultSet.getString("studentcount"));
                v.add(resultSet.getString("durationhr"));
                v.add(resultSet.getString("durationmin"));
                defaultTableModel.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
