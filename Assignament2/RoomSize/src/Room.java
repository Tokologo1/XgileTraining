public class Room {

    private int height =0;
    private int width =0;
    private int breadth =0;

    public Room(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double volumes() {
        return height * width * breadth;
    }
    
}
