package jrps.markanalysis_gui;

import java.util.ArrayList;
import static jrps.markanalysis_gui.MarkAnalysis_UI.classMarksList;

/**
 * @author James Park
 */
public class PrintStatistics {

    public static String printStatistics() {
        String statistics = "";

        statistics += """
                     Section Questions Pass Rate
                     ---------
                     """;

        ArrayList<String> marks = new ArrayList<>();

        for (int i = 0; i < classMarksList.size(); i++) {
            String data = classMarksList.get(i);
            String mark = data.substring(data.lastIndexOf(" ") + 1);
            marks.add(mark);
        }

        //Create arrays to split the each set of marks into each section
        int[] section1 = {};
        int[] section2 = {};
        int[] section3 = {};

        //This section uses for loops to to count the frequency of results in each section
        for (int i = 0; i < 3; i++) {
            int zero = 0;
            int one = 0;
            int two = 0;
            int three = 0;
            int four = 0;
            int five = 0;

            for (String mark : marks) {
                switch (mark.charAt(i)) {
                    case '0' ->
                        zero++;
                    case '1' ->
                        one++;
                    case '2' ->
                        two++;
                    case '3' ->
                        three++;
                    case '4' ->
                        four++;
                    case '5' ->
                        five++;
                }
            }
            switch (i)//Use switch statement to populate each section array with the correct results
            {
                case 0 ->
                    section1 = new int[]{zero, one, two, three, four, five};
                case 1 ->
                    section2 = new int[]{zero, one, two, three, four, five};
                case 2 ->
                    section3 = new int[]{zero, one, two, three, four, five};
            }
        }
        //Print the percentage of which each result shows up in Section 1
        int i = 0;
        statistics += "\nSection 1:\n";
        for (int mark : section1) {
            double percentage = (Double.valueOf(mark)
                    / Double.valueOf(marks.size()))
                    * Double.valueOf(100);
            statistics += "Number correct " + i + ": " + (int) percentage + "%\n";
            i++;
        }
        i = 0;
        //Print the percentage of which each result shows up in Section 2
        statistics += "\nSection 2\n:";
        for (int mark : section2) {
            double percentage = (Double.valueOf(mark)
                    / Double.valueOf(marks.size()))
                    * Double.valueOf(100);
            statistics += "Number correct " + i + ": " + (int) percentage + "%\n";
            i++;
        }
        i = 0;
        //Print the percentage of which each result shows up in Section 3
        statistics += "\nSection 3:\n";
        for (int mark : section3) {
            double percentage = (Double.valueOf(mark)
                    / Double.valueOf(marks.size()))
                    * Double.valueOf(100);
            statistics += "Number correct " + i + ": " + (int) percentage + "%\n";
            i++;
        }

        return statistics;
    }

}
