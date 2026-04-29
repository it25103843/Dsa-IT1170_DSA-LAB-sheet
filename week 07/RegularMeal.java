package Q2;

class RegularMeal extends Meal {
    boolean isVegetarian;

    public RegularMeal() {
        super();
        isVegetarian = true;
    }

    @Override
    public double calculateBill() {
        return 10.0 * quantity;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Meal Type: " + (isVegetarian ? "Vegetarian" : "Non-Vegetarian"));
        System.out.println("Total Bill: " + calculateBill());
    }
}
