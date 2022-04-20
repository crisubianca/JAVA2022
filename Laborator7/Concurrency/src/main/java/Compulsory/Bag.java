package Compulsory;
/**
 *
 * @author Adm
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bag {
    //declare a collection for tiles
    private final Queue<Character> letters = new LinkedList<>();

    public Bag() {
        for( char c = 'a'; c <= 'z' ; ++c ) {
            //add a new tile to the collection
            letters.add(c);
        }
    }
    // Add all the letters from 'a' to 'z' in the bag. }
    public synchronized final List<Character> extractLetters( int howMany ) {
        // Replace the dots so that the bag is thread-safe
        List<Character> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (letters.isEmpty()) break;
            //poll one tile from the collection
            extracted.add(letters.poll());
        }
        return extracted;
    }
}