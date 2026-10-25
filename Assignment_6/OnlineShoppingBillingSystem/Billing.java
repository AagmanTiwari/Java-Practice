package OnlineShoppingBillingSystem;

public class Billing {

    double calculateBill(double price) {
        return price;
    }

    double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    double calculateBill(double price, int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * discount / 100;
        return total - discountAmount;
    }

}
