/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liquidhub;
import java.sql.*;
import java.security.*;
import javax.swing.*;
import java.util.*;


/**
 *
 * @author bharatPC
 */
public class TIMESLOT_NEW extends javax.swing.JFrame {
 int r;
 long x,y,z,total;
   static int amt;
    ResultSet rs=null;
    static String reference;
    /** Creates new form TIMESLOT_NEW */
    public TIMESLOT_NEW() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rb5 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        mm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\bharatPC\\Desktop\\the_one.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 70);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rb5.setText("<12h");
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });

        rb2.setText("3h-6h");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        rb1.setText("0h-3h");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        rb4.setText("9h-12h");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });

        rb3.setText("6h-9h");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        jLabel3.setText("will be deducted from your account..");

        j1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Select your time slot...");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("TIME IN :");

        hh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hhActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Car Number :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("24 hours [HH:MM]");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Select the Date :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText(":");

        mm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(j1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mm))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb4)
                            .addComponent(rb5)
                            .addComponent(rb3)
                            .addComponent(rb2)
                            .addComponent(rb1))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(rb1)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(rb2)
                        .addGap(18, 18, 18)
                        .addComponent(rb3)
                        .addGap(18, 18, 18)
                        .addComponent(rb4)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)))
                .addComponent(rb5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
j1.setText("100");
        timeslot="0-9";        // TODO add your handling code here:
    }//GEN-LAST:event_rb3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
tiime time=new tiime();
        PARKING_NEW park=new PARKING_NEW();
     String b=jTextField1.getText();
      reference=park.ref;
      String t=hh.getText();
     int h=Integer.parseInt(t);
     if(h>24)
     {
         JOptionPane.showMessageDialog(null,"Wrong time entered");
         hh.setText("");
     }
     else
     {
       x=h*3600000;  
     }
     String r8=mm.getText();
     int j=Integer.parseInt(r8);
     if(j>60)
     {
         JOptionPane.showMessageDialog(null,"Wrong time entered");
     mm.setText("");
     }
     else
     {
       y=h*60000;  
     }
      z=x+y;
       total=time.z+z;
     System.out.println(reference);
     if(rb1.isSelected())
     {
         amt=40;
     }
     else if(rb2.isSelected())
             {
                amt=70; 
             }
     else if(rb3.isSelected())
             {
               amt=100; 
             }
     else if(rb4.isSelected())
             {
                amt=150; 
             }
     else if(rb5.isSelected())
             {
               amt=200;  
             }
     j1.setText(Integer.toString(amt));
     
   
        try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/liquidhub","root","Bharat@1996");
    PreparedStatement stmt = conn.prepareStatement("insert into liquidhub.parkingdetail values (?,?,?,?,?,?,?)");
    
     rs=stmt.executeQuery("select * from parkingdetail");
     
 while(rs.next())
 {
  r=rs.getInt("Sr No.");
 }
stmt.setInt(1, ++r);
 stmt.setString(2, b);
 stmt.setString(3, timeslot);
 stmt.setInt(4, amt);
 stmt.setString(5, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
 stmt.setString(6,hh.getText());
 stmt.setString(7, reference);
int rows=stmt.executeUpdate();
    stmt.close();
 conn.close();
}
catch(Exception ex)
{
    System.out.println(ex);
}
        ACCOUNTDETAILS_NEW acc=new ACCOUNTDETAILS_NEW();
        no_money ille=new no_money();
        if((acc.sum-amt)>=0 && h<24 && j<60)
        {
        BOOKED_NEW book= new BOOKED_NEW();
        book.setVisible(true);
        }
        else 
        {
            ille.setVisible(true);
        }
        
        
        
        if(rb1.isSelected())
        {
            new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                             try{
        Class.forName("com.mysql.jdbc.Driver");
Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/liquidhub","root","Bharat@1996");
Statement s=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s1=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s2=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs1=s.executeQuery("select * from parkingdetail");
while(rs1.next())
{
     if(reference.equals(rs1.getString("PRefId")))
             {
               String sql1="delete from parkingdetail where PRefId='" + reference + "'";
               s1.executeUpdate(sql1);
               
               String sql2="delete from parkspot where PRefId='" + reference + "'";
               s2.executeUpdate(sql2); 
             }
}
s.close();
s1.close();
s2.close();
conn.close();
}
catch(Exception ex)
{
    System.out.println(ex);
}
            }
        }, 
        10800000+total
);
        }
        else if(rb2.isSelected())
                {
                    new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                try{
        Class.forName("com.mysql.jdbc.Driver");
Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/liquidhub","root","Bharat@1996");
Statement s=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s1=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s2=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs1=s.executeQuery("select * from parkingdetail");
while(rs1.next())
{
     if(reference.equals(rs1.getString("PRefId")))
             {
               String sql1="delete from parkingdetail where PRefId='" + reference + "'";
               s1.executeUpdate(sql1);
               
               String sql2="delete from parkspot where PRefId='" + reference + "'";
               s2.executeUpdate(sql2); 
             }
}
s.close();
s1.close();
s2.close();
conn.close();
}
catch(Exception ex)
{
    System.out.println(ex);
}
            }
        }, 
       21600000+total
);
                }
        else if(rb3.isSelected())
                {
                    new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
               try{
        Class.forName("com.mysql.jdbc.Driver");
Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/liquidhub","root","Bharat@1996");
Statement s=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s1=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s2=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs1=s.executeQuery("select * from parkingdetail");
while(rs1.next())
{
     if(reference.equals(rs1.getString("PRefId")))
             {
               String sql1="delete from parkingdetail where PRefId='" + reference + "'";
               s1.executeUpdate(sql1);
               
               String sql2="delete from parkspot where PRefId='" + reference + "'";
               s2.executeUpdate(sql2); 
             }
}
s.close();
s1.close();
s2.close();
conn.close();
}
catch(Exception ex)
{
    System.out.println(ex);
}
            }
        }, 
        32400000+total 
);
                }
        else  if(rb4.isSelected())
                {
                    new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
               try{
        Class.forName("com.mysql.jdbc.Driver");
Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/liquidhub","root","Bharat@1996");
Statement s=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s1=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s2=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs1=s.executeQuery("select * from parkingdetail");
while(rs1.next())
{
     if(reference.equals(rs1.getString("PRefId")))
             {
               String sql1="delete from parkingdetail where PRefId='" + reference + "'";
               s1.executeUpdate(sql1);
               
               String sql2="delete from parkspot where PRefId='" + reference + "'";
               s2.executeUpdate(sql2); 
             }
}
s.close();
s1.close();
s2.close();
conn.close();
}
catch(Exception ex)
{
    System.out.println(ex);
}
            }
        }, 
        43200000+total 
);
                }
        else  if(rb5.isSelected())
                {
                    new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
              try{
        Class.forName("com.mysql.jdbc.Driver");
Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/liquidhub","root","Bharat@1996");
Statement s=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s1=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
Statement s2=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs1=s.executeQuery("select * from parkingdetail");
while(rs1.next())
{
     if(reference.equals(rs1.getString("PRefId")))
             {
               String sql1="delete from parkingdetail where PRefId='" + reference + "'";
               s1.executeUpdate(sql1);
               
               String sql2="delete from parkspot where PRefId='" + reference + "'";
               s2.executeUpdate(sql2); 
             }
}
s.close();
s1.close();
s2.close();
conn.close();
}
catch(Exception ex)
{
    System.out.println(ex);
}
            }
        }, 
        86400000+total
);
                }
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
bg.add(rb1);bg.add(rb2);bg.add(rb3);bg.add(rb4);bg.add(rb5);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
j1.setText("150");
     timeslot="0-12";        // TODO add your handling code here:
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
       j1.setText("200");
        timeslot="0-24";   // TODO add your handling code here:
    }//GEN-LAST:event_rb5ActionPerformed

    private void hhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hhActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
      timeslot="0-6";
j1.setText("70");    // TODO add your handling code here:

    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
j1.setText("40");
        timeslot="0-3";        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void mmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmActionPerformed

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
            java.util.logging.Logger.getLogger(TIMESLOT_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIMESLOT_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIMESLOT_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIMESLOT_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIMESLOT_NEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JTextField hh;
    private javax.swing.JLabel j1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mm;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    // End of variables declaration//GEN-END:variables
static String timeslot;
}
