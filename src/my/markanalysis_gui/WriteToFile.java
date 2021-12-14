package my.markanalysis_gui;

/**
 *  @author James Park
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static my.markanalysis_gui.CreateStudent.classMarksList;

public class WriteToFile {
    @SuppressWarnings("unchecked")
    
    
    public static void writeToJSONFile(String fileName)
    {
        Scanner askUserToOverwrite = new Scanner(System.in);
        try {
            File file = new File(fileName + ".json");
            if(file.isFile() == false)
            {
                FileWriter jsonWriteToFile = new FileWriter(file, false);
                jsonWriteToFile.write(classMarksList.toJSONString());
                jsonWriteToFile.flush();
            }else{
                System.out.println("""
                                   File Already Exists
                                   Would you like to overwrite this file?<y / n>
                                   """);
                System.out.print(">>");
                String userReply = askUserToOverwrite.next();
                if("y".equalsIgnoreCase(userReply)){
                    FileWriter jsonWriteToFile = new FileWriter(file, false);
                    jsonWriteToFile.write(classMarksList.toJSONString());
                    jsonWriteToFile.flush();
                }else if ("n".equalsIgnoreCase(userReply)){
                    System.out.println("Saving failed");
                }else{
                    System.out.println("Error Saving failed");
                }
            }
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
