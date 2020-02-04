import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Map;

/**
 * Priority queue where objects have a priority that is provided extrinsically,
 * i.e., priorities are supplied as an argument during insertion and can be changed
 * using the changePriority method. Cannot contain duplicate items.
 */
public interface TokenInterface<T> {

    /**
     * Adds an item
     * @throws Exception when needed
     */
    void add(File Scanner) throws Exception;



    /**
     * Returns the item with the smallest priority.
     * @throws NoSuchElementException if the PQ is empty
     */




    String get(int key);


}