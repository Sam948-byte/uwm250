public class RoomSize{
    public static void main(String[] args){
        double length = 15;
        double width = 25;
        double height = 10;
        String unit = "feet";

        double floorArea = width * length;

        double wallArea = (2 * length * height) + (2 * width * height);

        System.out.println("The area of the floor of the room is " + floorArea + " square "+ unit + ".");
        System.out.printn("The area of the walls of the room is " + wallArea + " square " + unit + ".");
    }
}