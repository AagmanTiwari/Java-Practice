package Interfaces.OnlineDeliverySystem;

import java.util.Scanner;

public class DeliveryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Standard Delivery Input ---");
        System.out.print("Enter Order ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Distance (km): ");
        double distance1 = sc.nextDouble();

        DeliveryService delivery = new StandardDelivery(id1, name1, distance1);

        System.out.println("\n--- Standard Delivery Details ---");
        delivery.displayDeliveryDetails();
        System.out.println("Delivery Charge: " + delivery.calculateDeliveryCharge(distance1));

        System.out.println("\n--- Express Delivery Input ---");
        System.out.print("Enter Order ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Distance (km): ");
        double distance2 = sc.nextDouble();

        delivery = new ExpressDelivery(id2, name2, distance2);

        System.out.println("\n--- Express Delivery Details ---");
        delivery.displayDeliveryDetails();
        System.out.println("Delivery Charge: " + delivery.calculateDeliveryCharge(distance2));

        sc.close();
    }
}
