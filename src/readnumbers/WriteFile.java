package readnumbers;

//http://www.homeandlearn.co.uk/java/write_to_textfile.html

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
    
   private String path;
   private boolean appendToFile = false;
   
   public WriteFile (String file_name) {
       
        path = file_name;
       
   }
   
   
   public WriteFile( String file_path , boolean append_value ) {

        path = file_path;
        appendToFile = append_value;

    }
   
   
   public void writeToFile(String textLine) throws IOException {
       
       FileWriter write = new FileWriter(path, appendToFile);
       //If a file of the name you pass over does not exist, the FileWriter creates one for you.
       
       PrintWriter print_line = new PrintWriter( write );
       //The FileWriter write bytes, however. But we can hand the FileWriter plain text with the aid of the PrintWriter class. The PrintWriter has a few handy print methods for this. 
       
       print_line.printf("%s" + "%n"  , textLine);
       // A good reason for using printf is to handle new line characters. 
       //The %s between double quotes means a string of characters of any length. The %n means a newline.
       
       print_line.close();
       //This line closes the text file and frees up any resources it was using.

       
    }
    
}
