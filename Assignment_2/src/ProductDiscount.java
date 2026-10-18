package Assignment_2.src;

import java.util.Scanner;

public class ProductDiscount {

    public static double calculateFinalPrice(double price) {

        double discount;

        if (price >= 10000) {
            discount = price * 0.20;
        } else if (price >= 5000) {
            discount = price * 0.10;
        } else if (price >= 2000) {
            discount = price * 0.05;
        } else {
            discount = 0;
        }

        return price - discount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        if (price < 0) {
            System.out.println("Invalid product price");
        } else {
            double finalPrice = calculateFinalPrice(price);

            System.out.println("Product ID = " + productId);
            System.out.println("Product Name = " + productName);
            System.out.println("Original Price = Rs. " + price);
            System.out.println("Final Price = Rs. " + finalPrice);
        }

        sc.close();
    }
}
