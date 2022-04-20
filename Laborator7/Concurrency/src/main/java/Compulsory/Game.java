package Compulsory;
/**
 *
 * @author Adm
 */
import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Bag bag = new Bag();
    private final Board board = new Board();
    private Dictionary dictionary;
    private final List<Player> players = new ArrayList<>();
    
    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }
    

    public Bag getBag() {
        return bag;
    }

    public Board getBoard() {
        return board;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
    
    public List<Player> getPlayers() {
        return players;
    }

    public void start() {
        for( Player p : players ) {
            //start a new Thread representing the player
            new Thread(p).start();
        }
    }
    //Create getters and setters
    //Create the method that will start the game: start one thread for each player
    
    Tile A = new Tile('A', 1);
        Tile E = new Tile('E', 1);
        Tile I = new Tile('I', 1);
        Tile O = new Tile('O', 1);
        Tile U = new Tile('U', 1);
        Tile L = new Tile('L', 1);
        Tile N = new Tile('N', 1);
        Tile S = new Tile('S', 1);
        Tile T = new Tile('T', 1);
        Tile R = new Tile('R', 1);
        
        Tile D = new Tile('D', 2);
        Tile G = new Tile('G', 2);
        
        Tile B = new Tile('B', 3);
        Tile C = new Tile('C', 3);
        Tile M = new Tile('M', 3);
        Tile P = new Tile('P', 3);
        
        Tile F = new Tile('F', 4);
        Tile H = new Tile('H', 4);
        Tile V = new Tile('V', 4);
        Tile W = new Tile('W', 4);
        Tile Y = new Tile('Y', 4);
        
        Tile K = new Tile('K', 5);
        
        Tile J = new Tile('J', 8);
        Tile X = new Tile('X', 8);
        
        Tile Q = new Tile('A', 10);
        Tile Z = new Tile('A', 10);
}
