package lab4.laborator4;

import java.util.stream.IntStream;

/**
 *
 * @author Adm
 */
public class Main {
    
    public static void main(String[] args) {
        var nodes = IntStream.rangeClosed(0, 3)
                    .mapToObj(i -> new Intersection("v" + i) )
                    .toArray(Intersection[]::new);  
    }




}



