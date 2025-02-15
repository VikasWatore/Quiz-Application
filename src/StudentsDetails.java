import java.sql.*;
import Project.ConnectionProvider;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vikas watore
 */
public class StudentsDetails extends javax.swing.JFrame {

    /**
     * Creates new form StudentsDetails
     */
    public StudentsDetails() {
        initComponents();
        jTextArea1.setEditable(false);
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel4.setText(dFormat.format(date));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student_icon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("Fill Up The Form");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setText("Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 50, 53, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 37, 150, 32));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-64.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 20, 140, 60));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-64.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1429, 19, 70, 66));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 105, 1550, 9));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 255));
        jLabel5.setText("Roll NO           :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 129, 134, -1));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("Name              :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 180, 134, -1));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("Father Name   :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 228, 134, -1));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("Mother Name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 276, 134, -1));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setText("Gender            :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 327, 134, -1));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText("Contact NO     :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 378, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 255, 255));
        jLabel11.setText("Email               :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 429, 134, -1));

        jLabel12.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 255, 255));
        jLabel12.setText("Address           :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 480, 134, -1));

        jTextField1.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 126, 550, -1));

        jTextField2.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 177, 550, -1));

        jTextField3.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 222, 550, -1));

        jTextField4.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 273, 550, -1));

        jComboBox1.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 324, -1, -1));

        jTextField5.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 375, 550, -1));

        jTextField6.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 426, 550, -1));

        jTextField7.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 477, 550, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64.png"))); // NOI18N
        jButton3.setText("Save ");
        jButton3.setBorder(null);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, 63));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(" Some General Instructions to Fill Out a Form Correctly:\n1].Roll Number:\nUse the provided text field to enter the alphanumeric characters assigned to you by the institution or organization.\n2]Name:\nEnter your full name as it appears on official documents.Ensure that the spelling is accurate and matches your \nidentification documents.\n3]Email Address:\nEnter your email address in the designated field.\n4]Address:\nEnter your complete postal address, including house number, street name,city, state/province, postal/ZIP code, and country.\n5]Review and Submit:\nReview all the information you've entered for accuracy and completeness.Make any necessary corrections or adjustments.\nOnce you're satisfied that the form is complete, click the \"Submit\"  button to finalize your submission.\n\n");
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 810, 310));

        jLabel14.setForeground(new java.awt.Color(153, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginAdmin.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit Apllication","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        { 
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String rollNo = jTextField1.getText().trim();
        String name = jTextField2.getText().trim();
        String fathername = jTextField3.getText().trim();
        String mothername = jTextField4.getText().trim();
        String gender = (String) jComboBox1.getSelectedItem();
        String contactNo = jTextField5.getText().trim();
        String email = jTextField6.getText().trim();
        String address = jTextField7.getText().trim();
        String marks = "0";

                // Perform validation
                if (rollNo.isEmpty() || name.isEmpty() || fathername.isEmpty() || mothername.isEmpty() || contactNo.isEmpty() || email.isEmpty() || address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else if (!contactNo.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(null, "Invalid contact number. Please enter a 10-digit number.");
            } else if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                JOptionPane.showMessageDialog(null, "Invalid email address. Please enter a valid email.");
            } else {
                try {
                    Connection con = ConnectionProvider.getCon();
                    // Check if roll number or name already exists in the database
                    PreparedStatement checkStmt = con.prepareStatement("SELECT * FROM student WHERE rollNo = ? ");
                    checkStmt.setString(1, rollNo);
                   
                    ResultSet rs = checkStmt.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Roll number already exists. Please enter your Correct Roll No.");
                    } else {
                        // Roll number and name do not exist, proceed with insertion
                        PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?,?,?,?,?)");
                        ps.setString(1, rollNo);
                        ps.setString(2, name);
                        ps.setString(3, fathername);
                        ps.setString(4, mothername);
                        ps.setString(5, gender);
                        ps.setString(6, contactNo);
                        ps.setString(7, email);
                        ps.setString(8, address);
                        ps.setString(9, marks);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent(rollNo).setVisible(true);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
