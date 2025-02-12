
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author GAURAV
 */
public class AdmitPatient extends javax.swing.JFrame {

    /**
     * Creates new form AdmitPatient
     */
    public AdmitPatient() {
        initComponents();
        try {
            Database db = new Database();

            String query = "SELECT dname FROM doctor";
            PreparedStatement pst = db.con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            comboBoxModel.addElement(" < Select > "); // Add "Select" option at index 0

            while (rs.next()) {
                String dname = rs.getString("dname");
                comboBoxModel.addElement(dname);
            }

            cmbdname.setModel(comboBoxModel);

            rs.close();
            pst.close();
            db.con.close();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Buttonbook = new javax.swing.JButton();
        Buttonhome = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        DateChooserdate = new com.toedter.calendar.JDateChooser();
        Buttonfeatch = new javax.swing.JButton();
        cmbsurgery = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cmbroomtype = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtroomrent = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtsurgeryamount = new javax.swing.JTextField();
        txtdays = new javax.swing.JTextField();
        cmbdname = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOSPITAL MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMIT FORM");

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
                        .addGap(400, 400, 400)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("PID");

        txtpid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("NAME");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("DAYS");

        Buttonbook.setBackground(new java.awt.Color(51, 51, 51));
        Buttonbook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buttonbook.setForeground(new java.awt.Color(255, 255, 255));
        Buttonbook.setText("BOOK");
        Buttonbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbookActionPerformed(evt);
            }
        });

        Buttonhome.setBackground(new java.awt.Color(51, 51, 51));
        Buttonhome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buttonhome.setForeground(new java.awt.Color(255, 255, 255));
        Buttonhome.setText("HOME");
        Buttonhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonhomeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DATE");

        Buttonfeatch.setBackground(new java.awt.Color(51, 51, 51));
        Buttonfeatch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buttonfeatch.setForeground(new java.awt.Color(255, 255, 255));
        Buttonfeatch.setText("FETCH");
        Buttonfeatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonfeatchActionPerformed(evt);
            }
        });

        cmbsurgery.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbsurgery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "EYE", "NOSE", "EAR", "STOMACH", "BRAIN", "BONE", "DELIVERY", "MOUTH", " ", " " }));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("SURGERY");

        cmbroomtype.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "STANDARD", "DELUX", "LUXURY", " ", " " }));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("ROOM TYPE");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("ROOM RENT");

        txtroomrent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("SURGERY AMOUNT");

        txtsurgeryamount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtdays.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cmbdname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbdname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", " ", " " }));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("DOCTOR NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(Buttonbook, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonhome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbdname, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbsurgery, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbroomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsurgeryamount, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtroomrent, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DateChooserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdays, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111)
                        .addComponent(Buttonfeatch)))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buttonfeatch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsurgery, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsurgeryamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(cmbroomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtroomrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(DateChooserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbdname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonbook, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonhome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText(" INFORMATIONS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbookActionPerformed
        if (txtpid.getText().isEmpty() || txtname.getText().isEmpty()
                || cmbsurgery.getSelectedItem() == null || txtsurgeryamount.getText().isEmpty()
                || cmbroomtype.getSelectedItem() == null || txtroomrent.getText().isEmpty()
                || DateChooserdate.getDate() == null || txtdays.getText().isEmpty() || cmbdname.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
            return;
        }
        int pid = Integer.parseInt(txtpid.getText());
        String pname = txtname.getText();
        String surgery = cmbsurgery.getSelectedItem().toString();
        String surgeryamount = txtsurgeryamount.getText();
        String roomtype = cmbroomtype.getSelectedItem().toString();
        String roomrent = txtroomrent.getText();
        String dname = cmbdname.getSelectedItem().toString();
        String date = new SimpleDateFormat("dd/MM/yyyy").format(DateChooserdate.getDate());

        int days = Integer.parseInt(txtdays.getText());

        try {

            Database db = new Database();

            String sql = "INSERT INTO admit (pid, pname, surgery, surgeryamount, roomtype, roomrent, date, days,dname) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement statement = db.con.prepareStatement(sql);
            // pst.setDate(2, new Date(utilPackageDate.getTime()));
            statement.setInt(1, pid);
            statement.setString(2, pname);
            statement.setString(3, surgery);
            statement.setString(4, surgeryamount);
            statement.setString(5, roomtype);
            statement.setString(6, roomrent);
            statement.setString(7, date);
            statement.setInt(8, days);
            statement.setString(9, dname);

            int aa = statement.executeUpdate();
            if (aa == 1) {
                JOptionPane.showMessageDialog(this, "Add Success");

                txtname.setText("");
                txtpid.setText("");
                txtname.setText("");
                cmbsurgery.setSelectedIndex(0);
                txtsurgeryamount.setText("");
                cmbroomtype.setSelectedIndex(0);
                txtroomrent.setText("");
                DateChooserdate.setDate(null);
                txtdays.setText("");
                cmbdname.setSelectedItem(null);
            } else {
                JOptionPane.showMessageDialog(null, "Someting went wrong");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }//GEN-LAST:event_ButtonbookActionPerformed

    private void ButtonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonhomeActionPerformed
        new ReceptionistDashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonhomeActionPerformed

    private void ButtonfeatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonfeatchActionPerformed
        try {
            String input = txtpid.getText().trim();
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter the patient ID");
            } else {
                int pid = Integer.parseInt(input);

                Database db = new Database();
                String query = "SELECT pname FROM patient WHERE pid=?";
                PreparedStatement pst = db.con.prepareStatement(query);
                pst.setInt(1, pid);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String pname = rs.getString("pname");
                    txtname.setText(pname);
                } else {
                    JOptionPane.showMessageDialog(this, "Patient not registered");
                }

                rs.close();
                pst.close();
                db.con.close();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid patient ID");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_ButtonfeatchActionPerformed

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
            java.util.logging.Logger.getLogger(AdmitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmitPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonbook;
    private javax.swing.JButton Buttonfeatch;
    private javax.swing.JButton Buttonhome;
    private com.toedter.calendar.JDateChooser DateChooserdate;
    private javax.swing.JComboBox<String> cmbdname;
    private javax.swing.JComboBox<String> cmbroomtype;
    private javax.swing.JComboBox<String> cmbsurgery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtdays;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextField txtroomrent;
    private javax.swing.JTextField txtsurgeryamount;
    // End of variables declaration//GEN-END:variables
}
