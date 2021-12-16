package jrps.markanalysis_gui;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static jrps.markanalysis_gui.CreateStudent.classMarksList;
import static jrps.markanalysis_gui.CreateStudent.createStudentList;
import static jrps.markanalysis_gui.WriteToTxtFile.writeToTxtFile;
import static jrps.markanalysis_gui.ReadFromTxtFile.readFromTxtFile;

/**
 * @author James Park
 */
public class MarkAnalysis_UI extends javax.swing.JFrame {

    public MarkAnalysis_UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnLoadFile = new javax.swing.JButton();
        txtEnterStudentFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEnterStudentMark = new javax.swing.JTextField();
        btnEnterStudentNameAndMark = new javax.swing.JButton();
        btnSaveMarksToJSONFile = new javax.swing.JButton();
        btnMoveToViewMarksPage = new javax.swing.JButton();
        txtEnterFileName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEnterStudentSecondName = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mark Analysis");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter New Marks"));

        jLabel3.setText("Enter File Name: ");

        btnLoadFile.setText("Load File");
        btnLoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFileActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name: ");

        jLabel1.setText("Student Mark: ");

        btnEnterStudentNameAndMark.setText("Enter");
        btnEnterStudentNameAndMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterStudentNameAndMarkActionPerformed(evt);
            }
        });

        btnSaveMarksToJSONFile.setText("Save Marks");
        btnSaveMarksToJSONFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMarksToJSONFileActionPerformed(evt);
            }
        });

        btnMoveToViewMarksPage.setText("View Marks");
        btnMoveToViewMarksPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveToViewMarksPageActionPerformed(evt);
            }
        });

        jLabel4.setText("Second Name: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEnterStudentMark, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEnterStudentNameAndMark))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEnterFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEnterStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEnterStudentSecondName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnLoadFile))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMoveToViewMarksPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSaveMarksToJSONFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEnterStudentNameAndMark, btnLoadFile, btnMoveToViewMarksPage, btnSaveMarksToJSONFile});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEnterFileName, txtEnterStudentFirstName});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtEnterFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoadFile)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnterStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnterStudentSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEnterStudentMark)
                    .addComponent(btnEnterStudentNameAndMark))
                .addGap(39, 39, 39)
                .addComponent(btnSaveMarksToJSONFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoveToViewMarksPage)
                .addContainerGap())
        );

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Scanner askUserToSave = new Scanner(System.in);
        if (MarkAnalysis_UI.loadedInformationMatchesCurrentInformation) {
            System.exit(0);
        } else {
            System.out.println("""
                               Warning exiting without saving. 
                               Do you want to save before exiting? <y / n>?""");    //CHANGE FOR WINDOW JPANE
            System.out.print(">>");
            String userReply = askUserToSave.next();
            if ("y".equalsIgnoreCase(userReply)) {
                writeToTxtFile(this.fileName);
                MarkAnalysis_UI.loadedInformationMatchesCurrentInformation = true;
                JOptionPane.showMessageDialog(null, "File Saved", "Saved", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else if ("n".equalsIgnoreCase(userReply)) {
                JOptionPane.showMessageDialog(null, "Exiting Without Saving");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Save Failed", "Failed", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMoveToViewMarksPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveToViewMarksPageActionPerformed
        if (classMarksList.size() > 0) {
            ViewMarksPage_UI vmp = new ViewMarksPage_UI();
            vmp.setVisible(true);
        } else {
            //NO MARKS IN MEMORY
        }

    }//GEN-LAST:event_btnMoveToViewMarksPageActionPerformed

    private void btnSaveMarksToJSONFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMarksToJSONFileActionPerformed
        fileName = txtEnterFileName.getText();
        if ("".equals(fileName)) {
            JOptionPane.showMessageDialog(null, "File Not Found This time", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            writeToTxtFile(MarkAnalysis_UI.fileName);
            MarkAnalysis_UI.loadedInformationMatchesCurrentInformation = true;

        }
    }//GEN-LAST:event_btnSaveMarksToJSONFileActionPerformed

    private void btnEnterStudentNameAndMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterStudentNameAndMarkActionPerformed
        boolean studentMarksSet = false;
        boolean studentNameSet = false;

        String studentFullName;
        String studentFirstName;
        String studentSecondName;
        String studentMarks = "";

        MarkAnalysis_UI.loadedInformationMatchesCurrentInformation = false;
        studentFirstName = txtEnterStudentFirstName.getText();
        studentSecondName = txtEnterStudentSecondName.getText();
        studentFullName = txtEnterStudentFirstName.getText() + "_" + txtEnterStudentSecondName.getText();

        if (!"".equals(studentFirstName) && !"".equals(studentSecondName)) {
            studentNameSet = true;
        } else {
            JOptionPane.showMessageDialog(null, "Student Name Not Entered", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        if (txtEnterStudentMark.getText().length() != 3) {
            //Make sure the user has entered a mark for each section
            if (txtEnterStudentMark.getText().length() < 3) {
                JOptionPane.showMessageDialog(null, "Enter Marks For All 3 Sections", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (txtEnterStudentMark.getText().length() > 3) {
                JOptionPane.showMessageDialog(null, "Enter Marks For Only The 3 Sections", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            //Make sure that the numbers entered are all between 0 and 5
            if (((Character.getNumericValue(txtEnterStudentMark.getText().charAt(0)) <= 5)
                    && (Character.getNumericValue(txtEnterStudentMark.getText().charAt(0)) >= 0))
                    && ((Character.getNumericValue(txtEnterStudentMark.getText().charAt(1)) <= 5)
                    && (Character.getNumericValue(txtEnterStudentMark.getText().charAt(1)) >= 0))
                    && ((Character.getNumericValue(txtEnterStudentMark.getText().charAt(2)) <= 5)
                    && (Character.getNumericValue(txtEnterStudentMark.getText().charAt(2)) >= 0))) {
                // Add the valid mark to the ArrayList
                studentMarks = txtEnterStudentMark.getText();
                studentMarksSet = true;
            } else {
                //Ask the user to enter a mark between 0-5
                JOptionPane.showMessageDialog(null, "Enter Marks Out Of Five", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (studentNameSet && studentMarksSet) {

            createStudentList(studentFullName, studentMarks);
        }

        txtEnterStudentMark.setText("");
        txtEnterStudentFirstName.setText("");
        txtEnterStudentSecondName.setText("");

    }//GEN-LAST:event_btnEnterStudentNameAndMarkActionPerformed

    private void btnLoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFileActionPerformed
        if (!"".equalsIgnoreCase(txtEnterFileName.getText())) {
            fileName = txtEnterFileName.getText();
//        readFromJSONFile(fileName);   //READ JSON BROKE
            readFromTxtFile(fileName);
            MarkAnalysis_UI.loadedInformationMatchesCurrentInformation = true;
        } else {
            // new FileNotFound_UI().setVisible(true);
            JOptionPane.showMessageDialog(null, "File Not Found", "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoadFileActionPerformed

    /**
     * @param args the command line arguments
     */
    //Globals
    static String fileName = "";
    static String msg = "";
    static boolean loadedInformationMatchesCurrentInformation = true;

    public static void main(String args[]) throws InstantiationException {
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
            java.util.logging.Logger.getLogger(MarkAnalysis_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkAnalysis_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkAnalysis_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkAnalysis_UI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterStudentNameAndMark;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoadFile;
    private javax.swing.JButton btnMoveToViewMarksPage;
    private javax.swing.JButton btnSaveMarksToJSONFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtEnterFileName;
    private javax.swing.JTextField txtEnterStudentFirstName;
    private javax.swing.JTextField txtEnterStudentMark;
    private javax.swing.JTextField txtEnterStudentSecondName;
    // End of variables declaration//GEN-END:variables
}
