package OnlineShoppingBillingSystem;

import java.util.Scanner;

public class ShoppingMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Billing bill = new Billing();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        System.out.println("Single Product Bill: "
                + bill.calculateBill(price));

        System.out.println("Multiple Products Bill: "
                + bill.calculateBill(price, quantity));

        System.out.println("Bill After Discount: "
                + bill.calculateBill(price, quantity, discount));

        sc.close();

    }

}
