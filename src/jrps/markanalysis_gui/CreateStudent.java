package jrps.markanalysis_gui;


import static jrps.markanalysis_gui.MarkAnalysis_UI.classMarksList;
import static jrps.markanalysis_gui.MarkAnalysis_UI.studentsJSONArray;
import org.json.simple.JSONObject;

/**
 * @author James Park
 */
public class CreateStudent {


    public static void createStudentList(String name, String marks) {

        String student = name + " : " + marks;

        classMarksList.add(student);
        creatStudentJSONList(name, marks);
    }

    public static void creatStudentJSONList(String name, String mark) {

        JSONObject data = new JSONObject();

        data.put("name", name);
        data.put("mark", mark);
        
        studentsJSONArray.add(data);
    }

}
