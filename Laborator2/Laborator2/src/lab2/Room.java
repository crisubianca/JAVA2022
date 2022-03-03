/*
 * FII JAVA 2022
 */
package lab2;

/**
 *
 * @author Adm
 */
public class Room {

    private String name;
    private int capacity;
    private RoomType type;

    public Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public Room(String name, int capacity, RoomType type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", capacity=" + capacity + ", type=" + type + '}';
    }

}
