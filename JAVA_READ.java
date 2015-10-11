
/**
 * Write a description of class JAVA_READ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;

public class JAVA_READ
{
    public static void main(String [] args) {

        String fileName = "Rabbil_Atul.txt";

        
        String line = null;

        try {
           
            FileReader fr = new FileReader(fileName);

          
            BufferedReader bufferedReader = new BufferedReader(fr);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

           
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" +  fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"  + fileName + "'");                  
            
        }
    }
}
