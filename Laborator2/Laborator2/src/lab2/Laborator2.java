package lab2;

/**
 *
 * @author Adm
 */
public class Laborator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Problem pb = new Problem();

        Event c1 = new Event("C1", 100, 8, 10);
        Event c2 = new Event("C2", 100, 10, 12);
        Event l1 = new Event("L1", 30, 8, 10);
        Event l2 = new Event("L2", 30, 8, 10);
        Event l3 = new Event("L3", 30, 10, 12);
        
        pb.addEvent(c1);
        pb.addEvent(c2);
        pb.addEvent(l1);
        pb.addEvent(l2);
        pb.addEvent(l3);
        
       // System.out.println("Events:");
      //  System.out.println(c1);
       // System.out.println(c2);
      //  System.out.println(l1);
      //  System.out.println(l2);
      //  System.out.println(l3);

        Room r1 = new Room("401", 30, RoomType.COMPUTER_LAB);
        Room r2 = new Room("403", 30, RoomType.COMPUTER_LAB);
        Room r3 = new Room("405", 30, RoomType.COMPUTER_LAB);
        Room r4 = new Room("309", 100, RoomType.LECTURE_HALL);
        
        
        pb.addRoom(r1);
        pb.addRoom(r2);
        pb.addRoom(r3);
        pb.addRoom(r4);
        
        //System.out.println("Rooms:");
        //System.out.println(r1);
        //System.out.println(r2);
        //System.out.println(r3);
        //System.out.println(r4);
        
        
        System.out.println(pb);

        
    }

}
