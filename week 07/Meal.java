package Q2;

class Meal {
    String orderID;
    String customerName;
    int quantity;

    public Meal() {
        orderID = "0";
        customerName = "Unknown";
        quantity = 0;
    }

    public Meal(String orderID, String customerName, int quantity) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.quantity = quantity;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
    }

    public double calculateBill() {
        return 12.0 * quantity;
    }

    public double calculateBill(int coupon) {
        return calculateBill() - coupon;
    }
}
