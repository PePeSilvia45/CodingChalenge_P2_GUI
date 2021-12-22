package jrps.markanalysis_gui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static jrps.markanalysis_gui.MarkAnalysis_UI.classMarksList;
import static jrps.markanalysis_gui.MarkAnalysis_UI.studentsJSONArray;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author James Park
 */
public class ReadFromJSONFile {

    @SuppressWarnings("unchecked")
    public static void getFromJSONReader(String filename) {
        
        String JSONFile = filename + ".json";
        classMarksList.clear();
        JSONParser jsonParser = new JSONParser();
        
        try {
            JSONObject classInformation = (JSONObject) jsonParser.parse(new FileReader(JSONFile));
            studentsJSONArray = (JSONArray) classInformation.get("students");
            for(int i = 0; i < studentsJSONArray.size(); i++){
            JSONObject student = (JSONObject) studentsJSONArray.get(i);
            String name = (String) student.get("name");
            String mark = (String) student.get("mark");
            classMarksList.add(name + " : " + mark);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(JSONFile + " Loaded");
    }

    public static void parseStudentObject(JSONObject student){
        
        
        
    }
    
}
