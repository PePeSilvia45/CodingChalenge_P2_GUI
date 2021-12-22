package jrps.markanalysis_gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static jrps.markanalysis_gui.CreateStudent.creatStudentJSONList;
import static jrps.markanalysis_gui.MarkAnalysis_UI.classMarksList;
import static jrps.markanalysis_gui.MarkAnalysis_UI.studentsJSONArray;
import org.json.simple.JSONObject;

/**
 * @author James Park
 */
public class WriteToJSONFile {

    public static void writeToJSON(String filename) {

        filename = filename + ".JSON";
        JSONObject studentInformation = new JSONObject();
        
        
        
        for (int i = 0; i < classMarksList.size(); i++) {

            String data = classMarksList.get(i);

            String name = data.substring(0, data.indexOf(" "));
            String mark = data.substring(data.lastIndexOf(" ") + 1);
            creatStudentJSONList(name, mark);
            
           
        }
         studentInformation.put("students", studentsJSONArray);
        try {
            Files.write(Paths.get(filename), studentInformation.toJSONString().getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
