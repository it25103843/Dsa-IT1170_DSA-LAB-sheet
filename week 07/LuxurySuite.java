package Q1;

class LuxurySuite extends Room {
    boolean extraServices;

    public LuxurySuite(int roomNumber, String guestName, int nights, boolean extraServices) {
        super(roomNumber, guestName, nights);
        this.extraServices = extraServices;
    }

    @Override
    public double calculateRoomCost() {
        double cost = 200.0 * nights;
        if (extraServices) {
            cost += 75;
        }
        return cost;
    }

    @Override
    public void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("Extra Services: " + (extraServices ? "Yes" : "No"));
        System.out.println("Total Cost: " + calculateRoomCost());
    }
}
