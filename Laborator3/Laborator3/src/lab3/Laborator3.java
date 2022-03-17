
package lab3;

/**
 *
 * @author Adm
 */
public class Laborator3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Computer v1 = new Computer("100", 16, "Computer A", "v1", "300");
        Computer v6 = new Computer("102", 8, "Computer B", "v6", "302");
        
        v1.setUnitOfStorageCapacity("GB");
        v6.setUnitOfStorageCapacity("GB");
        v1.setStorageCapacity(v1.changeUnitOfStorageCapacity("Megabyte", 16));
        v1.setUnitOfStorageCapacity("MB");
        
        Router v2 = new Router("100", "Router A", "v2", "300");
        Router v5 = new Router("102", "Router B", "v5", "302");
        
        Switch v3 = new Switch("Switch A", "v3", "300");
        Switch v4 = new Switch("Switch B", "v4", "302");
        
        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 20);
        v3.setCost(v4, 10);
        v4.setCost(v5, 30);
        v4.setCost(v6, 10);
        v5.setCost(v6, 20);
        
        Network n1 = new Network();
        n1.addNode(v1);
        n1.addNode(v2);
        n1.addNode(v3);
        n1.addNode(v4);
        n1.addNode(v5);
        n1.addNode(v6);
        
        System.out.println(n1);
        
        System.out.println("The complete network:");
        System.out.println("From: " + v1.name);
        v1.getCost();
        
        System.out.println("From: " + v2.name);
        v2.getCost();
        
        System.out.println("From: " + v3.name);
        v3.getCost();
        
        System.out.println("From: " + v4.name);
        v4.getCost();
        
        System.out.println("From: " + v5.name);
        v5.getCost();

    }
    
}
