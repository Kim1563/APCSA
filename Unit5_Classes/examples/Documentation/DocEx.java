package Unit5_Classes.examples.Documentation;

public class DocEx {
    /**
        * calcCost calculates the cost per person at a banquet
        * @param numGuests Number of guests
        * @param totalCost Total cost
        * @return the cost for one guest
     */
    public double calcCost(int numGuests, double totalCost){
        return totalCost / numGuests;
    }

    /**
        * findRoomDimensions calculates the area of a room given width and length
        * @param width Width of room
        * @param length Length of room
        * @return Area of the the room
     */
    public double findRoomDimensions(double width, double length){
        return width * length;
    }
}
