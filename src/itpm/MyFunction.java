package workingDaysHours_Package;


import workingDaysHours_Package.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MyFunction {

    
    public static int countData(String tableName) 
    {
        int total = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try{
             st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+tableName);
             while(rs.next()){
                 total = rs.getInt(1);
             }
        }catch(SQLException ex){
           Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
        
    }
    
     public void addWorks(int id, int no_of_days, String days, String hours, String min) throws Exception{

        Connection con = MyConnection.getConnection();
        Statement st;
        
        String sql= "insert into workingdayshours values (?,?,?,?,?)";
;
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setInt(2,no_of_days);
        ps.setString(3,days);
        ps.setString(4,hours);
        ps.setString(5,min);
        ps.executeUpdate();
        con.close();
        ps.close();
    }
     
     
     public void fillStudentJtable(JTable table, String valueToSearch){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `workingdayshours` WHERE concat (`id `,`noofworkingdays`,`workingdays`,`workingtimehrs`,'workingtimemin') LIKE ?");
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
