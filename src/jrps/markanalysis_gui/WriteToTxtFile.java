package jrps.markanalysis_gui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author James Park
 */
public class WriteToTxtFile {

    public static void writeToTxtFile(String fileName) {

        Scanner askUserToOverwrite = new Scanner(System.in);
        fileName = fileName + ".txt";
        File file = new File(fileName);

        if (file.isFile() == false) {
            try (FileWriter txtWriteToFile = new FileWriter(file, false)) {

                for (String data : CreateStudent.classMarksList) {

                    txtWriteToFile.write(data + "\n");

                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error Saving failed", "Failed", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("""
                                   File Already Exists
                                   Would you like to overwrite this file?<y / n>""");
            System.out.print(">>");
            String userReply = askUserToOverwrite.next();
            if ("y".equalsIgnoreCase(userReply)) {

                try (FileWriter txtWriteToFile = new FileWriter(file, false)) {

                    for (String data : CreateStudent.classMarksList) {

                        txtWriteToFile.write(data + "\n");

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if ("n".equalsIgnoreCase(userReply)) {
                JOptionPane.showMessageDialog(null, "Saving Canceled", "Canceled", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error Saving failed", "Failed", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

}
