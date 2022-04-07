package Compulsory;
/**
 *
 * @author Adm
 */
public class Tile {
    private final char letter;
    private final int points;

    //constructor
    public Tile(char letter, int points) {
        this.letter = letter;
        this.points = points;
    }

    //getters
    public char getLetter() {
        return letter;
    }

    public int getPoints() {
        return points;
    }

    //toString
    @Override
    public String toString() {
        return "Tile{" + "letter=" + letter + ", points=" + points + '}';
    }
    
    
    
}
