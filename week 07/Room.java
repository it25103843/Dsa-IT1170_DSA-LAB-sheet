package Q1;

class Room {
    int roomNumber;
    String guestName;
    int nights;

    public Room() {
        roomNumber = 0;
        guestName = "Unknown";
        nights = 0;
    }

    public Room(int roomNumber, String guestName, int nights) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.nights = nights;
    }

    public void displayRoomDetails() {
        System.out.println("Room No: " + roomNumber);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Nights: " + nights);
    }

    public double calculateRoomCost() {
        return 150.0 * nights;
    }

    public double calculateRoomCost(int discount) {
        return calculateRoomCost() - (discount * nights);
    }
}
