package jrps.markanalysis_gui;

import java.util.ArrayList;

/**
 * @author James Park
 */
public class CreateStudent {

    static ArrayList<String> classMarksList = new ArrayList<String>();

    public static void createStudentList(String name, String marks) {

        String student = name + " : " + marks;

        classMarksList.add(student);

    }

}
