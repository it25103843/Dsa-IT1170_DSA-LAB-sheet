package Q1;

public class HotelApp {
    public static void main(String[] args) {

        StandardRoom s1 = new StandardRoom();
        s1.roomNumber = 101;
        s1.guestName = "John";
        s1.nights = 3;

        LuxurySuite l1 = new LuxurySuite(201, "Alice", 2, true);

        System.out.println("Standard Room:");
        System.out.println("Cost (No Discount): " + s1.calculateRoomCost());
        System.out.println("Cost (With Discount): " + s1.calculateRoomCost(10));
        s1.displayRoomDetails();

        System.out.println("\nLuxury Suite:");
        System.out.println("Cost (No Discount): " + l1.calculateRoomCost());
        System.out.println("Cost (With Discount): " + l1.calculateRoomCost(20));
        l1.displayRoomDetails();
    }
}