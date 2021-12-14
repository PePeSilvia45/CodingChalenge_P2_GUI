package my.markanalysis_gui;

import java.util.ArrayList;
import java.util.Scanner;
import static my.markanalysis_gui.CreateStudent.createStudentList;
import static my.markanalysis_gui.ReadFromFile.readFromJSONFile;
import static my.markanalysis_gui.WriteToFile.writeToJSONFile;
import static my.markanalysis_gui.CreateStudent.classMarksList;



/**
 *  @author James Park
 */
public class MarkAnalysisUI extends javax.swing.JFrame {

    //Globals
    static String fileName = "";
    static boolean loadedInformationMatchesCurrentInformation = false;
    
    
    public MarkAnalysisUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEnterFileName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEnterStudentName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEnterStudentMark = new javax.swing.JTextField();
        btnEnterStudentNameAndMark = new javax.swing.JButton();
        btnSaveMarksToJSONFile = new javax.swing.JButton();
        btnLoadFile = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Student Mark"));

        jLabel3.setText("Enter File Name");

        jLabel2.setText("Student Name: ");

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

        btnLoadFile.setText("Load File");
        btnLoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLoadFile)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEnterFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnterStudentNameAndMark)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEnterStudentName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(txtEnterStudentMark))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnSaveMarksToJSONFile)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEnterFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoadFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEnterStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEnterStudentMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnterStudentNameAndMark)
                    .addComponent(btnSaveMarksToJSONFile))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Enter New Class Marks", jPanel2);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterStudentNameAndMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterStudentNameAndMarkActionPerformed
        boolean studentMarksSet = false;
        boolean studentNameSet = false;
        boolean fileNameSet = false;
        
        String studentName = "";
        String studentMarks = "";
        
        loadedInformationMatchesCurrentInformation = false;
        studentName = txtEnterStudentName.getText();
        if (!"".equals(studentName)) {
            studentNameSet = true;
        } else {
            System.out.println("Enter Student Name"); //Change for error message
        }
        fileName = txtEnterFileName.getText();
        if (!"".equals(studentName)) {
            fileNameSet = true;
        }
        if (txtEnterStudentMark.getText().length() != 3) {
            //Make sure the user has entered a mark for each section
            System.err.println("Enter a mark for each section."); //Change for error message
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
                System.err.println("Enter a mark out of 5."); //Change for error handle
            }
        }
        if (studentNameSet && studentMarksSet && fileNameSet) {

              createStudentList(studentName, studentMarks);
        }
        
        txtEnterStudentMark.setText("");
        txtEnterStudentName.setText("");
        
    }//GEN-LAST:event_btnEnterStudentNameAndMarkActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Scanner askUserToSave = new Scanner(System.in);
        if(this.loadedInformationMatchesCurrentInformation){
        System.exit(0);
        }else{
            System.out.println("""
                               Warning exiting without saving. 
                               Do you want to save before exiting? <y / n>?""");
            System.out.print(">>");
            String userReply = askUserToSave.next();
            if("y".equalsIgnoreCase(userReply)){
                writeToJSONFile(this.fileName);
                this.loadedInformationMatchesCurrentInformation = true;
                System.out.println("Saved");
                System.exit(0);
            }else if("n".equalsIgnoreCase(userReply)){
                System.out.println("Exiting without saving");
                System.exit(0);
            }else{
                System.out.println("Save Failed");
            }
            
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveMarksToJSONFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMarksToJSONFileActionPerformed
        
        writeToJSONFile(this.fileName);
        this.loadedInformationMatchesCurrentInformation = true;
        
    }//GEN-LAST:event_btnSaveMarksToJSONFileActionPerformed

    private void btnLoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFileActionPerformed
        fileName = txtEnterFileName.getText();
        readFromJSONFile(fileName);
        System.out.println(classMarksList);
        this.loadedInformationMatchesCurrentInformation = true;
    }//GEN-LAST:event_btnLoadFileActionPerformed

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
            java.util.logging.Logger.getLogger(MarkAnalysisUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkAnalysisUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkAnalysisUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkAnalysisUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkAnalysisUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterStudentNameAndMark;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoadFile;
    private javax.swing.JButton btnSaveMarksToJSONFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtEnterFileName;
    private javax.swing.JTextField txtEnterStudentMark;
    private javax.swing.JTextField txtEnterStudentName;
    // End of variables declaration//GEN-END:variables
}
