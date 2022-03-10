
package lab3;

/**
 *
 * @author Adm
 */
public class Laborator3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer c1 = new Computer("100", 16, "A", "v1", "300");
        Computer c2 = new Computer("102", 8, "B", "v6", "302");
        
        Router r1 = new Router("100", "A", "v2", "300");
        Router r2 = new Router("102", "B", "v5", "302");
        
        Switch s1 = new Switch("A", "v3", "300");
        Switch s2 = new Switch("B", "v4", "302");
        
       Network n1 = new Network();
       n1.addNode(c1);
       n1.addNode(c2);
       n1.addNode(r1);
       n1.addNode(r2);
       n1.addNode(s1);
       n1.addNode(s2);
       
        System.out.println(n1);
    }
    
}
