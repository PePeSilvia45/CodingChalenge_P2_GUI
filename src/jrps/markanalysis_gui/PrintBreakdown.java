package jrps.markanalysis_gui;

import java.util.ArrayList;
import static jrps.markanalysis_gui.MarkAnalysis_UI.classMarksList;

/**
 * @author James Park
 */
public class PrintBreakdown {

    public static String printBreakdown() {
        String breakdown = "";

        breakdown += """
                     Full Paper Pass Rate
                     ---------
                     """;

        ArrayList<String> marks = new ArrayList<>();

        for (int i = 0; i < classMarksList.size(); i++) {
            String data = classMarksList.get(i);
            String mark = data.substring(data.lastIndexOf(" ") + 1);
            marks.add(mark);
        }

        //Create variables to store the persentages of pass rates in a class
        int fullMarks = 0;
        int borderLine = 0;
        int fullPaper = 0;
        int failSec1 = 0;
        int failSec2 = 0;
        int failSec3 = 0;

        /*Use for loop to loop through the results to Find how many got full
          marks and how many landed on the pass line*/
        for (String mark : marks) {
            if ("555".equals(mark)) {
                fullMarks++;
            } else if ("333".equals(mark)) {
                borderLine++;
            }
        }

        //This loop checks if the value in each section is 3 or more for each
        for (String mark : marks) {
            if ((3 <= Character.getNumericValue(mark.charAt(0)))
                    && (3 <= Character.getNumericValue(mark.charAt(1)))
                    && (3 <= Character.getNumericValue(mark.charAt(2)))) {
                fullPaper++;
            }
        }
        try {

            //This loop checks to see how many times each section was failed
            for (int i = 0; i < marks.size(); i++) {
                for (int j = 0; j < marks.get(i).length(); j++) {
                    int sectionMark = Character.getNumericValue(marks.get(i).charAt(j));
                    switch (j) {
                        case 0 -> {
                            if (sectionMark < 3) {
                                failSec1++;
                            }
                        }
                        case 1 -> {
                            if (sectionMark < 3) {
                                failSec2++;
                            }
                        }
                        case 2 -> {
                            if (sectionMark < 3) {
                                failSec3++;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        double fullMarksPassPercent = (Double.valueOf(fullMarks)
                / Double.valueOf(marks.size()))
                * Double.valueOf(100);
        //Prints each value to the console
        breakdown += "Full Marks 555: "
                + String.format("%.2f", fullMarksPassPercent) + "%\n";

        double borderlinePassPercent = (Double.valueOf(borderLine)
                / Double.valueOf(marks.size()))
                * Double.valueOf(100);
        breakdown += "Borderline 333: "
                + String.format("%.2f", borderlinePassPercent) + "%\n";

        double fullPaperPassPercent = (Double.valueOf(fullPaper)
                / Double.valueOf(marks.size()))
                * Double.valueOf(100);
        breakdown += "Full paper pass all sections passed: "
                + String.format("%.2f", fullPaperPassPercent) + "%\n";

        breakdown += """
                     \nEach Section Fail Rate
                     ---------
                     """;

        double sectionOneFailPercent = (Double.valueOf(failSec1)
                / Double.valueOf(marks.size()))
                * Double.valueOf(100);
        breakdown += "failed Section 1 less than 3: "
                + String.format("%.2f", sectionOneFailPercent) + "%\n";

        double sectionTwoFailPercent = (Double.valueOf(failSec2)
                / Double.valueOf(marks.size())
                * Double.valueOf(100));
        breakdown += "failed Section 2 less than 3: "
                + String.format("%.2f", sectionTwoFailPercent) + "%\n";

        double sectionThreeFailPercent = (Double.valueOf(failSec3)
                / Double.valueOf(marks.size()))
                * Double.valueOf(100);
        breakdown += "failed Section 3 less than 3: "
                + String.format("%.2f", sectionThreeFailPercent) + "%\n";

        return breakdown;
    }

}
