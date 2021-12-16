package jrps.markanalysis_gui;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static jrps.markanalysis_gui.CreateStudent.classMarksList;

/**
 * @author James Park
 */
public class ReadFromTxtFile {

    public static void readFromTxtFile(String fileName) {

        fileName = fileName + ".txt";
        File file = new File(fileName);

        if (file.isFile()) {
            try (FileReader ReadTxtFromFile = new FileReader(file)) {

                classMarksList.clear();
                try (Scanner fileReader = new Scanner(file)) {
                    while (fileReader.hasNextLine()) {
                        classMarksList.add(fileReader.nextLine());
                    }
                }
                classMarksList.forEach(data -> {
                    System.out.println(data);
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (!file.isFile()) {
            JOptionPane.showMessageDialog(null, "File Not Found", "Failed", JOptionPane.ERROR_MESSAGE);
        }

    }
}
