import java.io.File;
import java.util.NoSuchElementException;


/**
 *
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