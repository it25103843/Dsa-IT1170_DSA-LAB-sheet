package Q2;

class ComboMeal extends Meal {
    boolean extra;

    public ComboMeal(String orderID, String customerName, int quantity, boolean extra) {
        super(orderID, customerName, quantity);
        this.extra = extra;
    }

    @Override
    public double calculateBill() {
        double total = 15.0 * quantity;
        if (extra) {
            total += 5;
        }
        return total;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Includes Drink & Dessert: " + (extra ? "Yes" : "No"));
        System.out.println("Total Bill: " + calculateBill());
    }
}
