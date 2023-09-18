/*
Sam Freund
Section 401
This program calculates the area of the floor and the area of the walls of a room.
 */

public class RoomSize {
    public static void main(String[] args) {

        //declare variables
        double length = 15;
        double width = 25;
        double height = 10;
        String unit = "feet";

        //calculate area of floor
        double floorArea = width * length;

        //calculate area of walls
        double wallArea = (2 * length * height) + (2 * width * height);

        //print results
        System.out.println("The area of the floor of the room is " + floorArea + " square " + unit + ".");
        System.out.println("The area of the walls of the room is " + wallArea + " square " + unit + ".");
    }
}