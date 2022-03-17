
package lab3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adm
 */
public abstract class Node implements Comparable <Node> {
    protected String name;
    protected String location;
    protected String hardwareAddress;
    
    private Map<Node, Integer> cost = new HashMap<>();

    public Node(String name, String location, String hardwareAddress) {
        this.name = name;
        this.location = location;
        this.hardwareAddress = hardwareAddress;
    }

    public void getCost() {
        for(Map.Entry<Node, Integer> entry : cost.entrySet())
            System.out.println("To: " + entry.getKey() + ", Cost: " + entry.getValue());
    }

    public void setCost(Map<Node, Integer> cost) {
        this.cost = cost;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHardwareAddress() {
        return hardwareAddress;
    }

    public void setHardwareAddress(String hardwareAddress) {
        this.hardwareAddress = hardwareAddress;
    }

    @Override
    public int compareTo(Node node) {
        if(node.getName() == null)
            throw new NullPointerException();
        return this.name.compareTo(node.getName());
    }
    
    public void setCost(Node node, int value) {
        cost.put(node, value);
    } 
    
}
