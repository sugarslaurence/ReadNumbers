package readnumbers;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {

    private String path;
    
    //This method reads the text file and parses the data into an array called Text Data
    
    public ReadFile (String file_path) {
        
        path =  file_path;
        
    }

    public int [] OpenFile () throws IOException {
    
        FileReader fr = new FileReader (path);
        // The FileReader needs the name of file to open. For us, the file path and name is held in the field variable called path.

        BufferedReader textReader = new BufferedReader (fr);
        // The BufferedReader is handed the FileReader object between its round brackets. All the characters from the file are then held in memory waiting to be manipulated. They are held under the variable name textReader.

        int numberOfLines = readLines();
        
        int [] textData;
        textData = new int [numberOfLines];

        int i;

        for (i=0; i < numberOfLines; i++) {
               
        textData[ i ] = Integer.parseInt(textReader.readLine());

    }
        
    textReader.close();
    return textData;    
    
    }
    
    //This method reads the text file number of lines 
    
    int readLines () throws IOException {
        
        FileReader file_to_read = new FileReader (path);
        BufferedReader bf = new BufferedReader (file_to_read);
        
        String aLine;
        int numberOfLines;
        numberOfLines = 0;
        
        while ((aLine =bf.readLine()) != null) {
            
            numberOfLines++;
            
        }
        //System.out.println(numberOfLines);
        bf.close();
        return numberOfLines;
           
    }    
}
