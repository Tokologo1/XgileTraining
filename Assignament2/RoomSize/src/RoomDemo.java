
public class RoomDemo extends Room {
    

    public RoomDemo(int height, int width, int breadth) {
        super(height, width, breadth);
        
    }

    public static void main(String[] args) throws Exception {
              

        Room room = new Room(10, 20, 30);
        System.out.println("The volume of the room is " + room.volumes());
    }
}
    

