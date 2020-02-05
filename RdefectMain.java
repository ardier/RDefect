//Reads a Java Class and creates possible tokens
//The tokens are then saved into a CSV for mutation


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class RdefectMain {

    long startTime = System.currentTimeMillis();
    HashMap<String, Integer> tokens = new HashMap<String, Integer>();


    // Throws an exception if the file passed is empty
    public static void main(String[] args) throws
            IOException, ClassNotFoundException {


        //Pass in Tokens

        try {
            Tokens tokengenerator = new Tokens();
            //TODO itemize these files in some sort of a list and feed them to the file reader
            String tokentype = "ror";
            tokengenerator.add(new File("tokens/" + tokentype + ".csv"));
        } catch (Exception e) {
            //  Block of code to handle errors
            System.err.println("Token file load error");
        }


        //TODO: Generate mml file
        //MML generator. Might be moved to its own class
        int mmlIndex = 0;
        String tokenType = "test";

        //1- Add the original tokens to the list

        //2- Add the mutated tokens

        //3- output the mml file
        List<String> mmlList = Arrays.asList();

        //start of the section
        mmlList.add("targetOp {");

        //add the mutant operators

        //end of the section
        mmlList.add("}");

        Path mmlFile = Paths.get("mml/mml" + mmlIndex + ".bin");
        Files.write(mmlFile, mmlList, StandardCharsets.UTF_8);


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

        //TODO Find or create Java file for tokenization

        //TODO mutate the file using the mml file (may have to be done without major)

        //TODO generate training and test sets for ML modelling using a dominator table










       }
        
        
} 
    
