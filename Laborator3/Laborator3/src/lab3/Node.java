
package lab3;

/**
 *
 * @author Adm
 */
public abstract class Node implements Comparable <Node> {
    protected String name;
    protected String location;
    protected String hardwareAddress;

    public Node(String name, String location, String hardwareAddress) {
        this.name = name;
        this.location = location;
        this.hardwareAddress = hardwareAddress;
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
    public int compareTo(Node o) {
        if(o.getName() == null)
            throw new NullPointerException();
        return this.name.compareTo(o.getName());
    }
    
}
