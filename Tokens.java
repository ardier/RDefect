//Given the fact the Major might be able to handle mutation operators
//this class may not have been necessary, but it was created just in case

import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Map;

public class Tokens<T> implements TokenInterface<T>{

    //Delimiters used in the CSV file
    private static final String COMMA_DELIMITER = ";";
    public HashMap<Integer, String> tokensMap;


    public Tokens(){

        tokensMap =  new HashMap<Integer, String>();

    }

    public void add(File Scanner) throws Exception{

        //parsing a CSV file into Scanner class constructor
        //TODO enable multiple CSV files
        Scanner sc = new Scanner((Scanner));
        sc.useDelimiter(";");   //sets the delimiter pattern
        int index=0;
        while (sc.hasNext())  //returns a boolean value
        {

            String tokener=sc.next();
            System.out.print(tokener);  //find and returns the next complete token from this scanner
            tokensMap.put(index, tokener);
            ++index;
        }
        System.out.println(tokensMap.size());
        sc.close();  //closes the scanner

        //TODO: Generate mml file

    }



    public String get(int key){
        return tokensMap.get(key);
    }







}