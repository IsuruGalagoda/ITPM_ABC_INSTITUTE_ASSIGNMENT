
package workingDaysHours_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.util.Duration.hours;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeMath.min;
//import javax.swing.table.DefaultTableModel;



public class workingdayshours extends javax.swing.JFrame {
    
    int no_of_days;
    String hours;
    String days;
    String min ;
     
      addworkingdayshours adw = new addworkingdayshours();
    
    public workingdayshours() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Add_no_of_days = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        monday = new javax.swing.JCheckBox();
        tuesday = new javax.swing.JCheckBox();
        wednesday = new javax.swing.JCheckBox();
        thursday = new javax.swing.JCheckBox();
        friday = new javax.swing.JCheckBox();
        saturday = new javax.swing.JCheckBox();
        sunday = new javax.swing.JCheckBox();
        addresetbtn = new javax.swing.JButton();
        addsavebtn = new javax.swing.JButton();
        addexitbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        worktimemonhrs = new javax.swing.JTextField();
        worktimemonmin = new javax.swing.JTextField();
        worktimetuehrs = new javax.swing.JTextField();
        worktimetuemin = new javax.swing.JTextField();
        worktimewedhrs = new javax.swing.JTextField();
        worktimewedmin = new javax.swing.JTextField();
        worktimethuhrs = new javax.swing.JTextField();
        worktimefrihrs = new javax.swing.JTextField();
        worktimethumin = new javax.swing.JTextField();
        worktimefrimin = new javax.swing.JTextField();
        worktimesathrs = new javax.swing.JTextField();
        worktimesunmin = new javax.swing.JTextField();
        worktimesatmin = new javax.swing.JTextField();
        worktimesunhrs = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("ADD WORKING DAYS HOURS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Number Of Working Days");

        Add_no_of_days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_no_of_daysActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Working Time");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Working Days");

        monday.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        monday.setText("Monday");
        monday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayActionPerformed(evt);
            }
        });

        tuesday.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tuesday.setText("Tuesday");
        tuesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesdayActionPerformed(evt);
            }
        });

        wednesday.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        wednesday.setText("Wednesday");

        thursday.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        thursday.setText("Thursday");
        thursday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thursdayActionPerformed(evt);
            }
        });

        friday.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        friday.setText("Friday");

        saturday.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saturday.setText("Saturday");
        saturday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturdayActionPerformed(evt);
            }
        });

        sunday.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sunday.setText("Sunday");

        addresetbtn.setBackground(new java.awt.Color(255, 255, 255));
        addresetbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addresetbtn.setForeground(new java.awt.Color(255, 51, 51));
        addresetbtn.setText("RESET");
        addresetbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addresetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresetbtnActionPerformed(evt);
            }
        });

        addsavebtn.setBackground(new java.awt.Color(255, 255, 255));
        addsavebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addsavebtn.setForeground(new java.awt.Color(0, 204, 102));
        addsavebtn.setText("ADD");
        addsavebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsavebtnActionPerformed(evt);
            }
        });

        addexitbtn.setBackground(new java.awt.Color(255, 255, 255));
        addexitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addexitbtn.setForeground(new java.awt.Color(51, 0, 255));
        addexitbtn.setText("EXIT");
        addexitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addexitbtnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(51, 255, 102));
        jButton1.setForeground(new java.awt.Color(102, 0, 255));
        jButton1.setText("SESSIONS");

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setForeground(new java.awt.Color(102, 0, 255));
        jButton2.setText("NOT AVAILABLE TIME ALLOCATION");

        jButton3.setBackground(new java.awt.Color(51, 255, 102));
        jButton3.setForeground(new java.awt.Color(102, 0, 255));
        jButton3.setText("WORKING DAYS HOURS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(56, 56, 56)
                .addComponent(jButton2)
                .addGap(46, 46, 46)
                .addComponent(jButton3)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jButton1.getAccessibleContext().setAccessibleName("sessions_nav1");
        jButton2.getAccessibleContext().setAccessibleName("notavailable_nav2");
        jButton3.getAccessibleContext().setAccessibleName("workingdayshours_nav3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("to");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("from");

        worktimemonhrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimemonhrsActionPerformed(evt);
            }
        });

        worktimemonmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimemonminActionPerformed(evt);
            }
        });

        worktimetuehrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimetuehrsActionPerformed(evt);
            }
        });

        worktimetuemin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimetueminActionPerformed(evt);
            }
        });

        worktimewedhrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimewedhrsActionPerformed(evt);
            }
        });

        worktimewedmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimewedminActionPerformed(evt);
            }
        });

        worktimethuhrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimethuhrsActionPerformed(evt);
            }
        });

        worktimefrihrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimefrihrsActionPerformed(evt);
            }
        });

        worktimethumin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimethuminActionPerformed(evt);
            }
        });

        worktimefrimin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimefriminActionPerformed(evt);
            }
        });

        worktimesathrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimesathrsActionPerformed(evt);
            }
        });

        worktimesunmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimesunminActionPerformed(evt);
            }
        });

        worktimesatmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimesatminActionPerformed(evt);
            }
        });

        worktimesunhrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktimesunhrsActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(thursday)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(friday)
                                    .addComponent(saturday)
                                    .addComponent(sunday)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Add_no_of_days, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(ID))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(monday)
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tuesday)
                                .addGap(158, 158, 158))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(wednesday)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 50, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(worktimesunhrs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(worktimewedhrs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(worktimethuhrs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(worktimefrihrs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(worktimesathrs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(worktimewedmin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(worktimesunmin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(worktimefrimin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(worktimetuehrs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(worktimesatmin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(162, 264, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addexitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(worktimethumin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(addsavebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(worktimetuemin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(56, 56, 56)
                                                    .addComponent(addresetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(worktimemonhrs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(worktimemonmin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_no_of_days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monday)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(worktimemonhrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(worktimemonmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(worktimewedhrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(worktimewedmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wednesday))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thursday)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(worktimethuhrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(worktimethumin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(friday)
                            .addComponent(worktimefrihrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(worktimefrimin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saturday)
                            .addComponent(worktimesathrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(worktimesatmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sunday)
                            .addComponent(worktimesunhrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(worktimesunmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(tuesday))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(worktimetuemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(worktimetuehrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addresetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(addsavebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addexitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Add_no_of_days.getAccessibleContext().setAccessibleName("noofworkingdays_in");
        addresetbtn.getAccessibleContext().setAccessibleName("working_RESET");
        addsavebtn.getAccessibleContext().setAccessibleName("working_ADD");
        addexitbtn.getAccessibleContext().setAccessibleName("working_EXIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean verifText(){
        if(worktimesathrs.getSize()==null|| monday.getSelectedIcon().toString()== null|| worktimesunmin.getSize().toString()==null)
        {
            return false;
        }
        else{
            return true;
        }
    }
    private void Add_no_of_daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_no_of_daysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_no_of_daysActionPerformed

    private void addresetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresetbtnActionPerformed
        // TODO add your handling code here:
        Add_no_of_days.setText("");
        
//        monday.setText("");
//        tuesday.setText("");
//        wednesday.setText("");
//        thursday.setText("");
//        friday.setText("");
//        saturday.setText("");
//        sunday.setText("");
        
        worktimemonhrs.setText("");
        worktimetuehrs.setText("");
        worktimewedhrs.setText("");
        worktimethuhrs.setText("");
        worktimefrihrs.setText("");
        worktimesathrs.setText("");
        worktimesunmin.setText("");
        
        worktimemonmin.setText("");
        worktimetuemin.setText("");
        worktimewedmin.setText("");
        worktimefrihrs.setText("");
        worktimefrimin.setText("");
        worktimesunmin.setText("");
        worktimesunmin.setText("");
        
    }//GEN-LAST:event_addresetbtnActionPerformed

    //    Add btn click method
    private void addsavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsavebtnActionPerformed
          try {
              Connection con = null;
        
              try{
        
                  Class.forName("com.mysql.jdbc.Driver");
                  con=DriverManager.getConnection("jdbc:mysql://localhost/time_table_mgt","root","");
                  String sql=  "insert into workingdayshours values (?,?,?,?,?)";
        
                  PreparedStatement ps=con.prepareStatement(sql);
                  int SID = Integer.valueOf(ID.getText());
                  ps.setInt(1,SID);
                  
                int no_of_days = Integer.parseInt(Add_no_of_days.getText());
                 ps.setInt(2,no_of_days);
                                   
                   String valuesOfCheckBox = "";
              if (monday.isSelected()) {
                  valuesOfCheckBox += monday.getText();
              }
              if (tuesday.isSelected()) {
                  valuesOfCheckBox += tuesday.getText() + " ";
              }
              if (wednesday.isSelected()) {
                  valuesOfCheckBox += wednesday.getText() + " ";
              }
              if (thursday.isSelected()) {
                  valuesOfCheckBox += thursday.getText() + " ";
              }
              if (friday.isSelected()) {
                  valuesOfCheckBox += friday.getText() + " ";
              }
              if (saturday.isSelected()) {
                  valuesOfCheckBox += saturday.getText() + " ";
              }
              if (sunday.isSelected()) {
                  valuesOfCheckBox += sunday.getText() + " ";
              }

              ps.setString(3,valuesOfCheckBox);
              
              String hrs;
              hrs=worktimemonhrs.getSelectedText().toString();
              hrs=worktimetuehrs.getSelectedText().toString();
              hrs=worktimewedhrs.getSelectedText().toString();
              hrs=worktimethuhrs.getSelectedText().toString();
              hrs=worktimefrihrs.getSelectedText().toString();
              hrs=worktimesathrs.getSelectedText().toString();
              hrs=worktimesunmin.getSelectedText().toString();
              ps.setString(4,hrs);
              
              String min;
              min =worktimemonmin.getSelectedText().toString();
              min =worktimetuemin.getSelectedText().toString();
              min =worktimewedmin.getSelectedText().toString();
              min =worktimefrihrs.getSelectedText().toString();
              min =worktimefrimin.getSelectedText().toString();
              min =worktimesunmin.getSelectedText().toString();
              min =worktimesunmin.getSelectedText().toString();
              ps.setString(5,min);
              
              ps.executeUpdate();
              JOptionPane.showMessageDialog(this, "INSERTED SUCCESSFULLY!!");
              con.close();
              ps.close();
                  
              MyFunction func = new MyFunction();
              func.addWorks(SID,no_of_days,valuesOfCheckBox, hrs, min);
              
              }catch (Exception ex){
        
                  System.out.println(ex.getMessage());
    
              }
              // TODO add your handling code here:
                                        
              
          } catch (Exception ex) {
              Logger.getLogger(workingdayshours.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_addsavebtnActionPerformed
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
    private void addexitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addexitbtnActionPerformed
        // TODO add your handling code here:
//         this.dispose();
    }//GEN-LAST:event_addexitbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void worktimesunminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimesunminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimesunminActionPerformed

    private void worktimesunhrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimesunhrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimesunhrsActionPerformed

    private void worktimesatminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimesatminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimesatminActionPerformed

    private void worktimesathrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimesathrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimesathrsActionPerformed

    private void worktimefriminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimefriminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimefriminActionPerformed

    private void worktimefrihrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimefrihrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimefrihrsActionPerformed

    private void worktimethuminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimethuminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimethuminActionPerformed

    private void worktimethuhrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimethuhrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimethuhrsActionPerformed

    private void worktimewedminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimewedminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimewedminActionPerformed

    private void worktimewedhrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimewedhrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimewedhrsActionPerformed

    private void worktimetueminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimetueminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimetueminActionPerformed

    private void worktimetuehrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimetuehrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimetuehrsActionPerformed

    private void worktimemonminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimemonminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimemonminActionPerformed

    private void worktimemonhrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktimemonhrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktimemonhrsActionPerformed

    private void saturdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saturdayActionPerformed

    private void thursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thursdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thursdayActionPerformed

    private void tuesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuesdayActionPerformed

    private void mondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mondayActionPerformed


    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(workingdayshours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workingdayshours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workingdayshours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workingdayshours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new workingdayshours().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Add_no_of_days;
    private javax.swing.JTextField ID;
    private javax.swing.JButton addexitbtn;
    private javax.swing.JButton addresetbtn;
    private javax.swing.JButton addsavebtn;
    private javax.swing.JCheckBox friday;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox monday;
    private javax.swing.JCheckBox saturday;
    private javax.swing.JCheckBox sunday;
    private javax.swing.JCheckBox thursday;
    private javax.swing.JCheckBox tuesday;
    private javax.swing.JCheckBox wednesday;
    private javax.swing.JTextField worktimefrihrs;
    private javax.swing.JTextField worktimefrimin;
    private javax.swing.JTextField worktimemonhrs;
    private javax.swing.JTextField worktimemonmin;
    private javax.swing.JTextField worktimesathrs;
    private javax.swing.JTextField worktimesatmin;
    private javax.swing.JTextField worktimesunhrs;
    private javax.swing.JTextField worktimesunmin;
    private javax.swing.JTextField worktimethuhrs;
    private javax.swing.JTextField worktimethumin;
    private javax.swing.JTextField worktimetuehrs;
    private javax.swing.JTextField worktimetuemin;
    private javax.swing.JTextField worktimewedhrs;
    private javax.swing.JTextField worktimewedmin;
    // End of variables declaration//GEN-END:variables
}
