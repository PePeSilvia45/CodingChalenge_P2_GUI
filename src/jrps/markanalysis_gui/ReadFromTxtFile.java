package jrps.markanalysis_gui;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static jrps.markanalysis_gui.MarkAnalysis_UI.classMarksList;

/**
 * @author James Park
 */
public class ReadFromTxtFile {

    public static void readFromTxtFile(String filename) {

        String txtFile = filename + ".txt";
        File file = new File(txtFile);

        if (file.isFile()) {
            try (FileReader ReadTxtFromFile = new FileReader(file)) {

                classMarksList.clear();
                Scanner fileReader = new Scanner(file); 
                    while (fileReader.hasNextLine()) {
                        classMarksList.add(fileReader.nextLine());
                    }
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (!file.isFile()) {
            JOptionPane.showMessageDialog(null, "File Not Found", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println(txtFile + " Loaded");
    }
}
