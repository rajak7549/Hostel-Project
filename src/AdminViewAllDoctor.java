
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author GAURAV
 */
public class AdminViewAllDoctor extends javax.swing.JFrame {

    /**
     * Creates new form ViewAllDoctor
     */
    public AdminViewAllDoctor() {
        initComponents();
        showall();
    }

    public void showall() {
        String department = cmbdepartment.getSelectedItem().toString();
        DefaultTableModel model = new DefaultTableModel();

        jTable2.setModel(model);
        model.addColumn("Doctor id");
        model.addColumn("Name of Doctor");
        model.addColumn(" fathers name");
        model.addColumn("BloodGroup");
        model.addColumn("Address");
        model.addColumn("ContectNo");
        model.addColumn("Department");
        model.addColumn("Email");
        model.addColumn(" shedule");
        model.addColumn("Password");
        model.addColumn("DOB");
        model.addColumn("Gender");
        model.addColumn("MaritialStatus");
        model.addColumn(" JoiningDate");
        model.addColumn("Experience");
        model.addColumn("Fee");
        try {
            Database db = new Database();
            String rg = "select * from doctor";
            PreparedStatement pst = db.con.prepareStatement(rg);

            // ResultSet rs=rg.executeQuery("select * from paitents");
            ResultSet aa = pst.executeQuery(rg);

            while (aa.next()) {
                model.addRow(new Object[]{aa.getString(1), aa.getString(2), aa.getString(3), aa.getString(4), aa.getString(5), aa.getString(6), aa.getString(7), aa.getString(8), aa.getString(9), aa.getString(10), aa.getString(11), aa.getString(12), aa.getString(13), aa.getString(14), aa.getString(15), aa.getString(16)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Buttonshow = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Buttonhome = new javax.swing.JButton();
        cmbdepartment = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD", "EXPERIENCE", "SPECIALIZATION"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        Buttonshow.setBackground(new java.awt.Color(51, 51, 51));
        Buttonshow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buttonshow.setForeground(new java.awt.Color(255, 255, 255));
        Buttonshow.setText("SHOW ");
        Buttonshow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ButtonshowMouseMoved(evt);
            }
        });
        Buttonshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonshowActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DOCTORS LIST ");
        jLabel8.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOSPITAL MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" VIEW DOCTOR  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("DOCTOR'S DEPARTMENT");

        Buttonhome.setBackground(new java.awt.Color(51, 51, 51));
        Buttonhome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buttonhome.setForeground(new java.awt.Color(255, 255, 255));
        Buttonhome.setText("HOME");
        Buttonhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonhomeActionPerformed(evt);
            }
        });

        cmbdepartment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbdepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " <SELECT>", "Pediatrics", "Obstetrics and Gynecology", "Surgery", "Orthopedics", "Cardiology", "Oncology", "Neurology", "Dermatology", "Radiology", "Anesthesiology", "Emergency Medicine", "Psychiatry", "Ophthalmology", "Otolaryngology (ENT)", "Gastroenterology", "Nephrology", "Infectious Diseases" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Buttonhome)
                        .addGap(471, 471, 471))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Buttonshow)
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Buttonshow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Buttonhome)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonshowActionPerformed
        if (cmbdepartment.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Enter Doctor Department");
            return;
        }
        String department = cmbdepartment.getSelectedItem().toString();
        DefaultTableModel model = new DefaultTableModel();

        jTable2.setModel(model);
        model.addColumn("Doctor id");
        model.addColumn("Name of Doctor");
        model.addColumn(" fathers name");
        model.addColumn("BloodGroup");
        model.addColumn("Address");
        model.addColumn("ContectNo");
        model.addColumn("Email");
        model.addColumn(" shedule");
        model.addColumn("Password");
        model.addColumn("DOB");
        model.addColumn("Gender");
        model.addColumn("MaritialStatus");
        model.addColumn(" JoiningDate");
        model.addColumn("Experience");
        model.addColumn("Fee");

        try {
            Database db = new Database();
            String rg = "select * from doctor where department = '" + department + "'";
            PreparedStatement pst = db.con.prepareStatement(rg);

            // ResultSet rs=rg.executeQuery("select * from paitents");
            ResultSet aa = pst.executeQuery(rg);
            int c = 0;
            while (aa.next()) {
                model.addRow(new Object[]{aa.getString(1), aa.getString(2), aa.getString(3), aa.getString(4), aa.getString(5), aa.getString(6), aa.getString(8), aa.getString(9), aa.getString(10), aa.getString(11), aa.getString(12), aa.getString(13), aa.getString(14), aa.getString(15), aa.getString(16)});
                c++;
            }
            if (c == 0) {
                JOptionPane.showMessageDialog(this, "not found");
                showall();
                cmbdepartment.setSelectedIndex(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_ButtonshowActionPerformed

    private void ButtonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonhomeActionPerformed
        new AdminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonhomeActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void ButtonshowMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonshowMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonshowMouseMoved

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        showall();
        cmbdepartment.setSelectedIndex(0);  // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(AdminViewAllDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewAllDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewAllDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewAllDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewAllDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonhome;
    private javax.swing.JButton Buttonshow;
    private javax.swing.JComboBox<String> cmbdepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
