/*
 * FII JAVA 2022
 */
package lab2;

/**
 *
 * @author Adm
 */
public class Problem {

    private Event[] events = new Event[6];
    private Room[] rooms = new Room[5];
    private int nrOfRooms = 0;
    private int nrOfEvents = 0;

    public Problem() {
    }

    

    public Problem(Event[] events) {
        this.events = events;
    }

    public Problem(Room[] rooms) {
        this.rooms = rooms;
    }
    
    public Event[] getEvents() {
        return events;
    }

    public void addEvent(Event event) {
        events[nrOfEvents ++] = event;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void addRoom (Room room) {
        rooms[nrOfRooms ++] = room;
    }

    @Override
    public String toString() {
        return "Problem{" + "events=" + events + ", rooms=" + rooms + '}';
    }
    
    
}
