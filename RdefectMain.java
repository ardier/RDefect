//Reads a Java Class and creates possible tokens
//The tokens are then saved into a CSV for mutation


import java.io.*;
import java.util.stream.Stream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
import java.util.NoSuchElementException;



public class RdefectMain {

    long startTime = System.currentTimeMillis();
        HashMap <String, Integer> tokens = new HashMap<String, Integer>();


       // Throws an exception if the file passed is empty
       public static void main(String[] args) throws FileNotFoundException,
       IOException, ClassNotFoundException {


           //Pass in Tokens

           try {
               Tokens tokengenerator = new Tokens();
               //TODO itemize these files in some sort of a list and feed them to the file reader
               String tokentype="ror";
               tokengenerator.add(new File("tokens/"+tokentype+".csv"));
           } catch(Exception e) {
               //  Block of code to handle errors
               System.err.println("Token file load error");
           }






           if (args.length < 1) {
               System.err.println("usage: java RdefectMain <filename>");
               System.exit(1);
           }


        
           // Printing the first few lines to make sure the file is passed in
        File file = new File(args[0]); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 

        //TODO replace with output generator
        String st; 
            while ((st = br.readLine()) != null) {
                System.out.println(st); 
                if (st.contains("usage")){
                    System.out.println("bingo"); 
                }
            }



        //TODO mutate the file using the mml file (may have to be done without major)

        //TODO generate training and test sets for ML modelling using a dominator table










       }
        
        
} 
    
