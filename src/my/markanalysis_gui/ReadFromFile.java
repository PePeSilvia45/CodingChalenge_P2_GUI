package my.markanalysis_gui;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import static my.markanalysis_gui.CreateStudent.createStudentList;
/**
 * @author James Park
 */
public class ReadFromFile {
    @SuppressWarnings("Unchecked")
    
    public static void readFromJSONFile(String fileName){
        JSONParser parser = new JSONParser();
        try(FileReader jsonFileReader = new FileReader(fileName + ".json")){
            
            Object studentObj = parser.parse(jsonFileReader);
            JSONArray marksList = (JSONArray) studentObj;
            
            marksList.forEach(studentMark -> parseClassMarksList((JSONObject)studentMark));
                        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void parseClassMarksList(JSONObject classMarksList){
        JSONObject classMarksObj = (JSONObject) classMarksList.get("student");
        //get student name, marks
        String name = (String) classMarksObj.get("name");
        String marks = (String) classMarksObj.get("marks");
        
        createStudentList(name, marks);
    }
    
}
