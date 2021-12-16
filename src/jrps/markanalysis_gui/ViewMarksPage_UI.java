package jrps.markanalysis_gui;

import javax.swing.JOptionPane;
import static jrps.markanalysis_gui.CreateStudent.classMarksList;

/**
 * @author James Park
 */
public class ViewMarksPage_UI extends javax.swing.JFrame {

    public ViewMarksPage_UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDisplayNamesAndMarks = new javax.swing.JTextArea();
        btbRemoveStudentData = new javax.swing.JButton();
        txtRemoveStudentData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRefreshMarksDisplay = new javax.swing.JButton();
        btnViewStatisticsAndBreakDown = new javax.swing.JButton();
        btnCloseViewMarks = new javax.swing.JButton();

        btnExit.setText("Exit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Marks");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Vew Marks"));

        txtAreaDisplayNamesAndMarks.setEditable(false);
        txtAreaDisplayNamesAndMarks.setColumns(20);
        txtAreaDisplayNamesAndMarks.setRows(5);
        jScrollPane1.setViewportView(txtAreaDisplayNamesAndMarks);

        btbRemoveStudentData.setText("Remove");
        btbRemoveStudentData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbRemoveStudentDataActionPerformed(evt);
            }
        });

        txtRemoveStudentData.setText("Enter Student Name");
        txtRemoveStudentData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRemoveStudentDataMouseClicked(evt);
            }
        });

        jLabel1.setText("Remove Student Data:");

        btnRefreshMarksDisplay.setText("Refresh Marks");
        btnRefreshMarksDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshMarksDisplayActionPerformed(evt);
            }
        });

        btnViewStatisticsAndBreakDown.setText("View Statistics");
        btnViewStatisticsAndBreakDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStatisticsAndBreakDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRemoveStudentData, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btbRemoveStudentData))
                        .addGap(124, 124, 124))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewStatisticsAndBreakDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRefreshMarksDisplay)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRefreshMarksDisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewStatisticsAndBreakDown)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtRemoveStudentData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btbRemoveStudentData)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnCloseViewMarks.setText("CLose");
        btnCloseViewMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseViewMarksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCloseViewMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCloseViewMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        if (!fileDisplayed) {
            txtAreaDisplayNamesAndMarks.setText("");
            classMarksList.forEach(data -> {
                txtAreaDisplayNamesAndMarks.setText(
                        txtAreaDisplayNamesAndMarks.getText() + data + "\n");
            });
        }
        fileDisplayed = true;

    }//GEN-LAST:event_formWindowActivated

    private void btnCloseViewMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseViewMarksActionPerformed
        fileDisplayed = false;
        dispose();
    }//GEN-LAST:event_btnCloseViewMarksActionPerformed

    private void txtRemoveStudentDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRemoveStudentDataMouseClicked
        txtRemoveStudentData.setText("");
    }//GEN-LAST:event_txtRemoveStudentDataMouseClicked

    private void btbRemoveStudentDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbRemoveStudentDataActionPerformed
        nameToRemove = txtRemoveStudentData.getText();
        
        for (String data : classMarksList) {
            if (data.substring(0, data.indexOf(" ")).equals(nameToRemove)) {
//                JOptionPane.OK_CANCEL_OPTION.showConfirmDialog(null,"","");
//                classMarksList.remove(data);
//                nameFound = true;
//                JOptionPane.showMessageDialog(null, "Record Removed", "Removed", JOptionPane.INFORMATION_MESSAGE);
                new DeletingStudentDataWarning_UI().setVisible(true);
                break;
            }
        }
        
    }//GEN-LAST:event_btbRemoveStudentDataActionPerformed

    private void btnRefreshMarksDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshMarksDisplayActionPerformed
        txtAreaDisplayNamesAndMarks.setText("");
        classMarksList.forEach(data -> {
            txtAreaDisplayNamesAndMarks.setText(
                    txtAreaDisplayNamesAndMarks.getText() + data + "\n");
        });
    }//GEN-LAST:event_btnRefreshMarksDisplayActionPerformed

    private void btnViewStatisticsAndBreakDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStatisticsAndBreakDownActionPerformed
        MarkStatistics_UI ms = new MarkStatistics_UI();
        ms.setVisible(true);
    }//GEN-LAST:event_btnViewStatisticsAndBreakDownActionPerformed

    /**
     * @param args the command line arguments
     */
    static boolean fileDisplayed = false;
    static boolean yesRemove = false;
    static boolean cancelRemove = false;
    static String nameToRemove;

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
            java.util.logging.Logger.getLogger(ViewMarksPage_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMarksPage_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMarksPage_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMarksPage_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMarksPage_UI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbRemoveStudentData;
    private javax.swing.JButton btnCloseViewMarks;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefreshMarksDisplay;
    private javax.swing.JButton btnViewStatisticsAndBreakDown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaDisplayNamesAndMarks;
    private javax.swing.JTextField txtRemoveStudentData;
    // End of variables declaration//GEN-END:variables
}
