
/**
 * Write a description of class JAVA_ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;

public class JAVA_
{
    public static void main(String [] args) {

       String fileName = "Rabbil_Atul.txt";

        try {
            
            FileWriter fw = new FileWriter(fileName);

          
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
  
            bufferedWriter.write("Name: Rabbil Atul Hadawiah Binti Che Yusoff");
            bufferedWriter.newLine();
            bufferedWriter.write("Matrix No: 2014831292");
            bufferedWriter.newLine();
            bufferedWriter.write("Gender: Female");
            bufferedWriter.newLine();
            bufferedWriter.write("Age: 24 Years Old");
            bufferedWriter.newLine();
            bufferedWriter.write("Emails: adayusoff@yahoo.com");
            
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error to write '" + fileName + "'");
            
        }
    }
}
