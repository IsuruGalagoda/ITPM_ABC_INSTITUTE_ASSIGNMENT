/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddSession extends javax.swing.JFrame {

    /**
     * Creates new form AddSession
     */
    public AddSession() {
        initComponents();
        combogroup1.setVisible(false);
        combosubject.setVisible(false);
        combonoofstudents.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jLabel1.setVisible(false);
        jLabel6.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel5.setVisible(false);
        jLabel2.setVisible(false);
        
        getTags();;
        getStudent();
        getLectures();
        getGroup();
        getSubject();
    }
    
    
    
    private void getTags(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            combotag.removeAllItems();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/institutemanageslitt", "root", "");
            
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM tags";
                ResultSet rs = statement.executeQuery(query);

                while (rs.next())
                {                             
                   combotag.addItem(rs.getString("Tag_name"));
                }//end while
            
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void getStudent(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            combonoofstudents.removeAllItems();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/institutemanageslitt", "root", "");
            
                Statement statement = connection.createStatement();
                String query = "SELECT COUNT(*) as sumStudent FROM student";
                ResultSet rs = statement.executeQuery(query);
                
                if(rs.next()){
//                    JOptionPane.showMessageDialog(this,"count "+ rs.getString("sumStudent"));  
                    for(int i=1 ;i< Integer.parseInt(rs.getString("sumStudent")); i++){
                        combonoofstudents.addItem(String.valueOf(i));
                    }
                }
       
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void getLectures(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            combolecture2.removeAllItems();
            combolecture1.removeAllItems();
            jComboBox6.removeAllItems();
            

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/institutemanageslitt", "root", "");
            
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM lecturedetails";
                ResultSet rs = statement.executeQuery(query);

                while (rs.next())
                {                             
                   combolecture2.addItem(rs.getString("lecname"));
                   combolecture1.addItem(rs.getString("lecname"));
                   jComboBox6.addItem(rs.getString("lecname"));
                }//end while
            
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void getGroup(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            combogroup1.removeAllItems();
            
            

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/institutemanageslitt", "root", "");
            
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM student";
                ResultSet rs = statement.executeQuery(query);

                while (rs.next())
                {                             
                   combogroup1.addItem(rs.getString("Generate ID"));
                  
                }//end while
            
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void getSubject(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            combosubject.removeAllItems();
            
            

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/institutemanageslitt", "root", "");
            
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM subjectdetails";
                ResultSet rs = statement.executeQuery(query);

                while (rs.next())
                {                             
                   combosubject.addItem(rs.getString("subname"));
                  
                }//end while
            
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        combogroup1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        combosubject = new javax.swing.JComboBox<>();
        combonoofstudents = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        combolecture2 = new javax.swing.JComboBox<>();
        combolecture1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        combotag = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lebel144 = new javax.swing.JLabel();
        lebel154 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Select Group And Subject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Select Lectures & Tag");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 40));

        jButton9.setBackground(new java.awt.Color(30, 144, 255));
        jButton9.setText("Manage Session");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Select Subject");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("No of students");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Duration");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        combogroup1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "GRP1", "GRP2", "GRP3" }));
        combogroup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combogroup1ActionPerformed(evt);
            }
        });
        getContentPane().add(combogroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 150, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Hours");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Min");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Group");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        combosubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Sub1", "Sub2", "Sub3" }));
        combosubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combosubjectActionPerformed(evt);
            }
        });
        getContentPane().add(combosubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 150, 30));

        combonoofstudents.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6" }));
        combonoofstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combonoofstudentsActionPerformed(evt);
            }
        });
        getContentPane().add(combonoofstudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 150, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 60, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Lecturer 1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Lecturer 2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Additional Lecturer");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel16.setText("Add Session");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 150, 30));

        combolecture2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Lec1", "Lec2", "Lec3" }));
        getContentPane().add(combolecture2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, 30));

        combolecture1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Lec1", "Lec2", "Lec3" }));
        combolecture1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combolecture1ActionPerformed(evt);
            }
        });
        getContentPane().add(combolecture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 150, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Select tag 1");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        combotag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Tag1", "Tag2", "Tag3" }));
        combotag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotagActionPerformed(evt);
            }
        });
        getContentPane().add(combotag, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 150, 30));

        jButton3.setBackground(new java.awt.Color(124, 221, 250));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 40));

        jButton4.setBackground(new java.awt.Color(250, 92, 95));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Clear");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, 40));

        jButton5.setBackground(new java.awt.Color(225, 231, 44));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, 40));

        lebel144.setBackground(new java.awt.Color(255, 255, 255));
        lebel144.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 251, 19), 4));
        getContentPane().add(lebel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 640, 400));
        getContentPane().add(lebel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        setSize(new java.awt.Dimension(708, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combolecture1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combolecture1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combolecture1ActionPerformed

    private void combotagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combotagActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        combogroup1.setVisible(false);
        combosubject.setVisible(false);
        combotag.setVisible(false);
        combonoofstudents.setVisible(true);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jLabel1.setVisible(false);
        jLabel6.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel5.setVisible(false);
        jLabel2.setVisible(false);

        jComboBox6.setVisible(true);
        combolecture2.setVisible(true);
        combolecture1.setVisible(true);
        jLabel7.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combonoofstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combonoofstudentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combonoofstudentsActionPerformed

    private void combogroup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combogroup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combogroup1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        combogroup1.setVisible(true);
        combosubject.setVisible(true);
        combonoofstudents.setVisible(true);

        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jLabel1.setVisible(true);
        jLabel6.setVisible(true);
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel5.setVisible(true);
        jLabel2.setVisible(true);

        jComboBox6.setVisible(false);
        combolecture2.setVisible(false);
        combolecture1.setVisible(false);
        combotag.setVisible(false);
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (jTextField3.getText().equals("") || jTextField4.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "<html>Fill All The Feilds..</html>", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                DB.iud("INSERT INTO `addnewsession` (\n"
                        + "  `lect1`,\n"
                        + "  `lect2`,\n"
                        + "  `subname`,\n"
                        + "  `grpid`,\n"
                        + "  `tagz`,\n"
                        + "  `studentcount`,\n"
                        + "  `durationhr`,\n"
                        + "  `durationmin`\n"
                        + ")\n"
                        + "VALUES\n"
                        + "  (\n"
                        + "    '"+combolecture1.getSelectedItem().toString()+"',\n"
                        + "    '"+combolecture2.getSelectedItem().toString()+"',\n"
                        + "    '"+combosubject.getSelectedItem().toString()+"',\n"
                        + "    '"+combogroup1.getSelectedItem().toString()+"',\n"
                        + "    '"+combotag.getSelectedItem().toString()+"',\n"
                        + "    '"+combonoofstudents.getSelectedItem().toString()+"',\n"
                        + "    '"+jTextField3.getText()+"',\n"
                        + "    '"+jTextField4.getText()+"'\n"
                        + "  );");
                JOptionPane.showMessageDialog(this, "<html>Data Saved..</html>", "Sucess", JOptionPane.OK_OPTION);
                this.dispose();
                Thread.sleep(100);
                new AddSession().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Dashboard_member2().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ManageSessions al = new ManageSessions();
        al.setVisible(true);
        al.pack();
        al.setLocationRelativeTo(null);
        al.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void combosubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combosubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combosubjectActionPerformed

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
            java.util.logging.Logger.getLogger(AddSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combogroup1;
    private javax.swing.JComboBox<String> combolecture1;
    private javax.swing.JComboBox<String> combolecture2;
    private javax.swing.JComboBox<String> combonoofstudents;
    private javax.swing.JComboBox<String> combosubject;
    private javax.swing.JComboBox<String> combotag;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lebel144;
    private javax.swing.JLabel lebel154;
    // End of variables declaration//GEN-END:variables
}
