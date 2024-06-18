/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Source_code.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Grades extends javax.swing.JFrame {

     Connection con=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
    private int grade;
    public Grades() {
        initComponents();
         con=DBconnect.connect();
    }
    public double createGrade(String m)
    {
     
       double gradeValue=0;
//       
                        if (m.equals("A")){
				gradeValue= 4.00;
			}
			else if(m.equals("A-")){
				gradeValue= 3.70;
			}
			else if(m.equals("B+")){
				gradeValue= 3.30;
			}
			else if(m.equals("B")){
				gradeValue= 3.00;
			}
			else if(m.equals("B-")){
				gradeValue= 2.70;
			}
			else if(m.equals("C+")){
				gradeValue=  3.30;
			}
			else if(m.equals("C")){
				gradeValue= 2.00;
			}
			else if(m.equals("C-")){
				gradeValue=  1.70;
			}
			else if(m.equals("D+")){
				gradeValue=  1.30;
			}
			else if(m.equals("D")){
				gradeValue=  1.00;
			}
			else if(m.equals("D-")){
				gradeValue= 0.70;
			}
                  System.out.println(gradeValue);
                 return  gradeValue;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        psbox = new javax.swing.JTextField();
        stbox = new javax.swing.JTextField();
        sebox = new javax.swing.JTextField();
        dbmsbox = new javax.swing.JTextField();
        cgmbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 723));

        psbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psboxActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Calculate GPA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Subject", "Probability and Statistics - (PS)", "Software Technology I - (ST I)", "Software Technology II - (ST II)", "Software Engineering I - (SE I)", "Software Engineering II - (SE II)", "Computer Graphics and Multimedia - (CGM)", "Database Management System I - (DBMS I)", "Database Management System II - (DBMS II)", "Computer Fundamentals - (CF)", "Data Communication and Computer Networks I - (DCCN I)", "Data Communication and Computer Networks II - (DCCN II)", "Introduction to Programming Environment - (IPE)", "Mathematics for Information Technology - (MIT)", " ", " ", " ", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Subject", "Probability and Statistics - (PS)", "Software Technology I - (ST I)", "Software Technology II - (ST II)", "Software Engineering I - (SE I)", "Software Engineering II - (SE II)", "Computer Graphics and Multimedia - (CGM)", "Database Management System I - (DBMS I)", "Database Management System II - (DBMS II)", "Computer Fundamentals - (CF)", "Data Communication and Computer Networks I - (DCCN I)", "Data Communication and Computer Networks II - (DCCN II)", "Introduction to Programming Environment - (IPE)", "Mathematics for Information Technology - (MIT)", "Internet Technology Applications - (ITA)", " ", " ", " ", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Subject", "Probability and Statistics - (PS)", "Software Technology I - (ST I)", "Software Technology II - (ST II)", "Software Engineering I - (SE I)", "Software Engineering II - (SE II)", "Computer Graphics and Multimedia - (CGM)", "Database Management System I - (DBMS I)", "Database Management System II - (DBMS II)", "Computer Fundamentals - (CF)", "Data Communication and Computer Networks I - (DCCN I)", "Data Communication and Computer Networks II - (DCCN II)", "Introduction to Programming Environment - (IPE)", "Mathematics for Information Technology - (MIT)", "Internet Technology Applications - (ITA)", " ", " ", " ", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Subject", "Probability and Statistics - (PS)", "Software Technology I - (ST I)", "Software Technology II - (ST II)", "Software Engineering I - (SE I)", "Software Engineering II - (SE II)", "Computer Graphics and Multimedia - (CGM)", "Database Management System I - (DBMS I)", "Database Management System II - (DBMS II)", "Computer Fundamentals - (CF)", "Data Communication and Computer Networks I - (DCCN I)", "Data Communication and Computer Networks II - (DCCN II)", "Introduction to Programming Environment - (IPE)", "Mathematics for Information Technology - (MIT)", "Internet Technology Applications - (ITA)", " ", " ", " ", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Subject", "Probability and Statistics - (PS)", "Software Technology I - (ST I)", "Software Technology II - (ST II)", "Software Engineering I - (SE I)", "Software Engineering II - (SE II)", "Computer Graphics and Multimedia - (CGM)", "Database Management System I - (DBMS I)", "Database Management System II - (DBMS II)", "Computer Fundamentals - (CF)", "Data Communication and Computer Networks I - (DCCN I)", "Data Communication and Computer Networks II - (DCCN II)", "Introduction to Programming Environment - (IPE)", "Mathematics for Information Technology - (MIT)", "Internet Technology Applications - (ITA)", " ", " ", " ", " " }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 153, 0));
        jTextField1.setText("       FACULTY OF COMPUTING ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(157, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dbmsbox, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(sebox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stbox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(psbox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cgmbox))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(c2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c5))
                .addGap(307, 307, 307))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(psbox, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(c1))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(c4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dbmsbox))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cgmbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void psboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here: 
       
        String marks1=psbox.getText();
        String marks2=sebox.getText();
        String marks3=dbmsbox.getText();
        String marks4=cgmbox.getText();
        String marks5=stbox.getText();
          
        String cre1=c1.getText();
        String cre2=c2.getText();
        String cre3=c3.getText();
        String cre4=c4.getText();
        String cre5=c5.getText();
    
        double cr1=Double.parseDouble(cre1);
        double cr2=Double.parseDouble(cre2);
        double cr3=Double.parseDouble(cre3);
        double cr4=Double.parseDouble(cre4);
        double cr5=Double.parseDouble(cre5);
        

        
       
        double gpa=((cr1*createGrade(marks1))+(cr2*createGrade(marks2))+(cr3*createGrade(marks3))+(cr4*createGrade(marks4))+(cr5*createGrade(marks5)))/(cr1+cr2+cr3+cr4+cr5);

        DecimalFormat formatter=new DecimalFormat("#0.00");
         String gpa1=formatter.format(gpa);
         double a=Double.parseDouble(gpa1);
      
        JOptionPane.showMessageDialog(null," Your GPA is" + a,"GPA", JOptionPane.INFORMATION_MESSAGE);
     
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Main_window m1=new Main_window();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grades().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField cgmbox;
    private javax.swing.JTextField dbmsbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField psbox;
    private javax.swing.JTextField sebox;
    private javax.swing.JTextField stbox;
    // End of variables declaration//GEN-END:variables

   
}