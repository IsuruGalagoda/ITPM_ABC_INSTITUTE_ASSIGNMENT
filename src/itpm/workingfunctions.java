/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingDaysHours_Package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author charith
 */
public class workingfunctions {
    public void insertUpdateDeleteWorkinghours(char operation, int id, String noofworkingdays, String workingdays, String workingtimehrs,String workingtimemin){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if(operation == 'u'){
            try {
                ps = con.prepareStatement("UPDATE `workingdayshours` SET `noofworkingdays`= ?,`workingdays`= ?,`workingtimehrs`= ?,`workingtimemin`= ? WHERE `id`= ?");
                
                ps.setString(1, noofworkingdays);
                ps.setString(2, workingdays);
                ps.setString(3, workingtimehrs);
                ps.setString(4, workingtimemin);
               
                ps.setInt(5, id);
                
                if(ps.executeUpdate()> 0 ){
                    JOptionPane.showMessageDialog(null, "  Updated");
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(workingdayshours.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
         
         if(operation == 'i'){
            try {
                ps = con.prepareStatement("INSERT INTO `workingdayshours`(`id`, `noofworkingdays`, `workingdays`, `workingtimehrs`,'workingtimemin') VALUES (?,?,?,?,?)");
                ps.setInt(1, id);
                ps.setString(2, noofworkingdays);
                ps.setString(3, workingdays);
                ps.setString(4, workingtimehrs);
                ps.setString(5, workingtimemin);
               
                
                
                
                if(ps.executeUpdate()> 0 ){
                    JOptionPane.showMessageDialog(null, " Data Inserted");
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(workingdayshours.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
         if(operation == 'd'){
            try {
                ps = con.prepareStatement("DELETE FROM `workingdayshours` WHERE `id` = ?");
                
                
                ps.setInt(1, id);
                
                if(ps.executeUpdate()> 0 ){
                    JOptionPane.showMessageDialog(null, "Data Deleted");
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(workingdayshours.class.getName()).log(Level.SEVERE, null, ex);
            }
   
}
    }

    public void fillStudentJtable(JTable table, String valueToSearch){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `workingdayshours` WHERE concat (`id`,`noofworkingdays`,`workingdays`,`workingtimehrs`,'workingtimemin') LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
           DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                
                
               row = new Object[5];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                
               
                model.addRow(row);
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(workingdayshours.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
