
package lab3;

/**
 *
 * @author Adm
 */
public class Switch extends Node{

    public Switch(String name, String location, String hardwareAddress) {
        super(name, location, hardwareAddress);
    }
    
    public String toString(){
        return name + ", location:" + location + ", hardwareAddress:" + hardwareAddress;
    }
    
}
