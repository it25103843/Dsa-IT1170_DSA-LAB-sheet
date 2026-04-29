package Q1;

class StandardRoom extends Room {
    boolean wifi;

    public StandardRoom() {
        super();
        wifi = true;
    }

    @Override
    public double calculateRoomCost() {
        return 100.0 * nights;
    }

    @Override
    public void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("WiFi: " + (wifi ? "Yes" : "No"));
        System.out.println("Total Cost: " + calculateRoomCost());
    }
}