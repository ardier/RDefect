//Given the fact the Major might be able to handle mutation operators
//this class may not have been necessary, but it was created just in case

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Tokens<T> implements TokenInterface<T> {

    //Delimiters used in the CSV file
    private static final String COMMA_DELIMITER = ";";
    public HashMap<Integer, String> tokensMap;


    public Tokens() {

        tokensMap = new HashMap<Integer, String>();

    }

    public void add(File scanner) throws Exception {

        //parsing a CSV file into Scanner class constructor
        //TODO enable multiple CSV files
        Scanner sc = new Scanner((scanner));
        sc.useDelimiter(";");   //sets the delimiter pattern
        int index = 0;
        while (sc.hasNext())  //returns a boolean value
        {

            String tokener = sc.next();
            System.out.print(tokener);  //find and returns the next complete token from this scanner
            tokensMap.put(index, tokener);
            ++index;
        }
        System.out.println(tokensMap.size());
        sc.close();
        //closes the scanner


    }



    public String get(int key){
        return tokensMap.get(key);
    }
    public int size() {return tokensMap.size(); }







}