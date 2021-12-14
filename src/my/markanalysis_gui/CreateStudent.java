/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.markanalysis_gui;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author PARKj
 */
public class CreateStudent {
    static JSONArray classMarksList = new JSONArray();
    
    public static void createStudentList(String name, String marks){
        JSONObject studentMarks = new JSONObject();
        studentMarks.put("name", name);
        studentMarks.put("marks", marks);
        
        JSONObject studentObject = new JSONObject();
        studentObject.put("student", studentMarks);
        
        
        classMarksList.add(studentObject);
    }
    
}
