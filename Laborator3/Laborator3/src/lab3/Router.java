
package lab3;

/**
 *
 * @author Adm
 */
public class Router extends Node implements Identifiable{
    private String ipAddress;

    public Router(String ipAddress, String name, String location, String hardwareAddress) {
        super(name, location, hardwareAddress);
        this.ipAddress = ipAddress;
    }
    
    
    
    @Override
    public String getAddress(){
        return ipAddress;
    }

    @Override
    public String toString() {
        return "Router{" + "ipAddress=" + ipAddress + '}';
    }
    
    
}
