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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class RdefectMain {

    long startTime = System.currentTimeMillis();


    // Throws an exception if the file passed is empty
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {


        //Pass in Tokens
        Tokens tokengenerator = new Tokens();

        try {
            //TODO itemize these files in some sort of a list and feed them to the file reader
            String tokenType = "ror";
            tokengenerator.add(new File("tokens/" + tokenType + ".csv"));

        } catch (Exception e) {
            //  Block of code to handle errors
            System.err.println("Token file load error");
        }









        //TODO: Generate mml file
        //MML generator. Might be moved to its own class
        int mmlIndex = 0;
        String tokenType = "test";

        //1- Add the original tokens to the list
        //read the tokens from the token map list
        //TODO FIX the Mutator
        HashMap<String, ArrayList<String>> mutantsKeeper = new HashMap<String, ArrayList<String>>();
        ArrayList<String> mutantShortlist = new ArrayList<String>();



        //adding mutants for those tokens
        //TODO make this for all the mutants
        File scanner = new File("mutants/"+tokengenerator.get(0)+".csv");

        //parsing a CSV file into Scanner class constructor
        //TODO enable multiple CSV files
        Scanner sc = new Scanner((scanner));
        sc.useDelimiter(";");   //sets the delimiter pattern
        int index = 0;
        while (sc.hasNext())  //returns a boolean value
        {

            String mutant = sc.next();
            System.out.println("mutants: "+ mutant);  //find and returns the next complete token from this scanner
            //make sure this is the correct syntax
            mutantShortlist.add(mutant);
            ++index;
        }

        sc.close();
        //closes the scanner


        //add mutants to list with their corresponding tokens

        mutantsKeeper.put(tokengenerator.get(0), mutantShortlist);






        System.out.print("Total mutants add for " + tokengenerator.get(0) + " token ");
        System.out.println(mutantsKeeper.get(tokengenerator.get(0)).size());


        //3- output the mml file
        ArrayList<String> mmlList = new ArrayList<String>();

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
    
