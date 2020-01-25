//Reads a Java Class and creates possible tokens
//The tokens are then saved into a CSV for mutation

import java.io.*;
import java.util.stream.Stream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class RdefectMain {



       // Throws an exception if the file passed is empty
       public static void main(String[] args) throws FileNotFoundException,
       IOException, ClassNotFoundException {
           if (args.length != 1) {
               System.err.println("usage: java RdefectMain <filename>");
               System.exit(1);
           }

           long startTime = System.currentTimeMillis();
        
           // Printing the first few lines to make sure the file is passed in
        File file = new File(args[0]); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
  
        String st; 
            while ((st = br.readLine()) != null) {
                System.out.println(st); 
                if (st.contains("usage")){
                    System.out.println("bingo"); 
                }
            }

        //TODO: Tokenize


              
        
        
        
        
        
        
        
        }
        
        
} 
    
