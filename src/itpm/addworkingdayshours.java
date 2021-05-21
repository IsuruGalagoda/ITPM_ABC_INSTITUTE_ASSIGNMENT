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


public class addworkingdayshours {
    
    public void insertUpdateDeleteWorkingdayshours(char operation,String id, String noofworkingdays, String workingdays, String workingtime ){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
         if(operation == 'u'){
            try {
                ps = con.prepareStatement("UPDATE `workingdayshours` SET `noofworkingdays`= ?,`workingdays`= ?,`workingtime`= ? WHERE `id`= ?");
                
                ps.setString(1,id);
                ps.setString(2, noofworkingdays);
                ps.setString(3, workingdays);
                ps.setString(4, workingtime);
               
                                
                if(ps.executeUpdate()> 0 ){
                    JOptionPane.showMessageDialog(null, "(Working days hours) Data Updated");
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(addworkingdayshours.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
         
         if(operation == 'i'){
            try {
                ps = con.prepareStatement("INSERT INTO workingdayshours(id, noofworkingdays, workingdays, workingtime) VALUES (?,?,?,?)");
                
                ps.setString(1,id);
                ps.setString(2, noofworkingdays);
                ps.setString(3, workingdays);
                ps.setString(4, workingtime);
                
                
                if(ps.executeUpdate()> 0 ){
                    JOptionPane.showMessageDialog(null, " data Inserted");
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(addworkingdayshours.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
         if(operation == 'd'){
            try {
                ps = con.prepareStatement("DELETE FROM `workingdayshours` WHERE `id` = ?");
                
                
                ps.setString(1, id);
                
                if(ps.executeUpdate()> 0 ){
                    JOptionPane.showMessageDialog(null, "(Working days hours) Data Deleted");
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(addworkingdayshours.class.getName()).log(Level.SEVERE, null, ex);
            }
   
}
    }

    public void fillWorkingdayshoursJtable(JTable table, String valueToSearch){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `workingdayshours` WHERE concat ('noofworkingdays','workingdays',  'workingtime') LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
           DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                
                
               row = new Object[3];
                
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                
               
                model.addRow(row);
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(addworkingdayshours.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
