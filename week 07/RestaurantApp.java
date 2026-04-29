package Q2;

public class RestaurantApp {
    public static void main(String[] args) {

        RegularMeal r1 = new RegularMeal();
        r1.orderID = "R101";
        r1.customerName = "Kamal";
        r1.quantity = 2;

        ComboMeal c1 = new ComboMeal("C201", "Nimal", 3, true);

        System.out.println("Regular Meal:");
        System.out.println("Bill (No Coupon): " + r1.calculateBill());
        System.out.println("Bill (With Coupon): " + r1.calculateBill(5));
        r1.displayOrderDetails();

        System.out.println("\nCombo Meal:");
        System.out.println("Bill (No Coupon): " + c1.calculateBill());
        System.out.println("Bill (With Coupon): " + c1.calculateBill(10));
        c1.displayOrderDetails();
    }
}
