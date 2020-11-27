/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Objects.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mrx
 */
public class FormStudent extends javax.swing.JFrame {
    private MainFor mainForm;
    /**
     * Creates new form FormStudent
     */
    public FormStudent() {
        initComponents();
        enterCodeStudent.setVisible(false);
        textCodeStudent.setVisible(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    public FormStudent(MainFor mainform) {
        initComponents();
        enterCodeStudent.setVisible(false);
        textCodeStudent.setVisible(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        mainForm=mainform;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterInfomation = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        enterName = new javax.swing.JLabel();
        TextEnterName = new javax.swing.JTextField();
        enterBirthDay = new javax.swing.JLabel();
        textBirthDay = new javax.swing.JTextField();
        EnterStudent = new javax.swing.JRadioButton();
        enterInformationStudent = new javax.swing.JPanel();
        enterCodeStudent = new javax.swing.JLabel();
        textCodeStudent = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter information");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        enterInfomation.setBackground(new java.awt.Color(168, 228, 236));

        title.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        title.setText("Enter information of me");

        enterName.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        enterName.setText("Name");

        TextEnterName.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        enterBirthDay.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        enterBirthDay.setText("Year of birth");

        textBirthDay.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        EnterStudent.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        EnterStudent.setText("Are you student?");
        EnterStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterStudentActionPerformed(evt);
            }
        });

        enterInformationStudent.setBackground(new java.awt.Color(168, 228, 236));

        enterCodeStudent.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        enterCodeStudent.setText("Code student");

        textCodeStudent.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout enterInformationStudentLayout = new javax.swing.GroupLayout(enterInformationStudent);
        enterInformationStudent.setLayout(enterInformationStudentLayout);
        enterInformationStudentLayout.setHorizontalGroup(
            enterInformationStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterInformationStudentLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(enterCodeStudent)
                .addGap(92, 92, 92)
                .addComponent(textCodeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        enterInformationStudentLayout.setVerticalGroup(
            enterInformationStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterInformationStudentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(enterInformationStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterCodeStudent)))
        );

        btnSave.setBackground(new java.awt.Color(199, 141, 215));
        btnSave.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enterInfomationLayout = new javax.swing.GroupLayout(enterInfomation);
        enterInfomation.setLayout(enterInfomationLayout);
        enterInfomationLayout.setHorizontalGroup(
            enterInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterInfomationLayout.createSequentialGroup()
                .addGroup(enterInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enterInfomationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enterInformationStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(enterInfomationLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(enterInfomationLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(EnterStudent)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(enterInfomationLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(enterInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterBirthDay))
                .addGap(34, 34, 34)
                .addGroup(enterInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(enterInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textBirthDay)
                        .addComponent(TextEnterName, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        enterInfomationLayout.setVerticalGroup(
            enterInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterInfomationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(enterInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextEnterName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(enterInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterBirthDay)
                    .addComponent(textBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(EnterStudent)
                .addGap(52, 52, 52)
                .addComponent(enterInformationStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSave)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterInfomation, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterInfomation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterStudentActionPerformed
        // TODO add your handling code here:
        if(EnterStudent.isSelected())
        {
            enterCodeStudent.setVisible(true);
            textCodeStudent.setVisible(true);
        }
        else{
            enterCodeStudent.setVisible(false);
            textCodeStudent.setVisible(false);
        }
    }//GEN-LAST:event_EnterStudentActionPerformed

    //funtion setData
    private void setData(){
        try {
            Statement s = con.createStatement();
            if(TextEnterName.getText().compareTo("")!=0){
                s.executeUpdate("update Human set Name='"+ TextEnterName.getText()+"',Birth="+textBirthDay.getText()
                        + "where ID = 1");
            }
            s.executeUpdate("update Student set CodeStudent='"+textCodeStudent.getText()+"' where idInfo = 1");
        } catch (SQLException ex) {
            Logger.getLogger(FormStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //funtion getData
    private void getData(){
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from Human");
            while(rs.next()){
                TextEnterName.setText(rs.getString(2));
                textBirthDay.setText(rs.getString(3));
            }
            rs = s.executeQuery("select * from Student");
            while(rs.next()){
                textCodeStudent.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //Store data
        setData();
        //Close form
        mainForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        mainForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHIBAGF\\SQLEXPRESS:1433;databaseName=ManagerStudentDatabase;user"
                        + "=sa;password=sa2008");
            } catch (SQLException ex) {
                Logger.getLogger(FormStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        getData();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormStudent().setVisible(true);
            }
        });
    }
    //connection
    private Date date;
    private Connection con;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton EnterStudent;
    private javax.swing.JTextField TextEnterName;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel enterBirthDay;
    private javax.swing.JLabel enterCodeStudent;
    private javax.swing.JPanel enterInfomation;
    private javax.swing.JPanel enterInformationStudent;
    private javax.swing.JLabel enterName;
    private javax.swing.JTextField textBirthDay;
    private javax.swing.JTextField textCodeStudent;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
