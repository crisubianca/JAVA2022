
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adm
 */
public class Network {
    private List<Node> nodes = new ArrayList<>();
    
    public void addNode(Node node) {
        nodes.add(node);
    }

    @Override
    public String toString() {
        return "Network{" + "nodes=" + nodes + '}';
    }
    
    
}
