package OnlineShopping;

import java.util.Scanner;

public class ShoppingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of different products: ");
        int n = sc.nextInt();

        double[] prices = new double[n];
        int[] quantities = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of product " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();

            System.out.print("Enter quantity of product " + (i + 1) + ": ");
            quantities[i] = sc.nextInt();
        }

        ShoppingCart cart = new ShoppingCart(prices, quantities);

        try {
            double total = cart.calculateTotal();
            double average = cart.calculateAverage();

            System.out.println("Total Cost: " + total);
            System.out.println("Average Cost Per Item: " + average);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
