
package lab3;

/**
 *
 * @author Adm
 */
public class Computer extends Node implements Identifiable, Storage{
    private String ipAddress;
    private int storageCapacity;

    public Computer(String ipAddress, int storageCapacity, String name, String location, String hardwareAddress) {
        super(name, location, hardwareAddress);
        this.ipAddress = ipAddress;
        this.storageCapacity = storageCapacity;
    }
    
    

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    
    @Override
    public String getAddress(){
        return ipAddress;
    }
    
    @Override
    public int getStorageCapacity(){
        return storageCapacity;
    }

    @Override
    public String toString() {
        return "Computer{name=" + name + ", ipAddress=" + ipAddress + ", storageCapacity=" + storageCapacity + '}';
    }
    
    
}
