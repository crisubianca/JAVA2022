package lab5.main;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
/**
 *
 * @author Adm
 */
public class Catalog implements Serializable {
    private final String path;
    private final List<Item> itemList;

    public Catalog(String path) throws CustomException {
        if (!Files.exists(Path.of(path))) {
            throw new CustomException("Catalog Constructor : File does not exist!");
        }
        this.path = path;
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) throws CustomException {
        if (item == null) {
            throw new CustomException("Add item : Cannot add a null item!");
        }
        item.setId(Integer.toString(itemList.size()));
        itemList.add(item);
    }

    public String getPath() {
        return path;
    }

    public List<Item> getItemList() {
        return itemList;
    }
}

