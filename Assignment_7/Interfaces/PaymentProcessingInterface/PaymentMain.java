package Interfaces.PaymentProcessingInterface;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Credit Card Details:");
        System.out.print("Card Holder Name: ");
        String holder = sc.nextLine();

        System.out.print("Card Number (use dummy data): ");
        String cardNumber = sc.nextLine();

        System.out.print("Bank Name: ");
        String bank = sc.nextLine();

        System.out.print("Payment Amount: ");
        double cardAmount = sc.nextDouble();
        sc.nextLine();

        Payment p = new CreditCardPayment(holder, cardNumber, bank);
        p.makePayment(cardAmount);

        System.out.println("\nEnter UPI Details:");
        System.out.print("UPI ID: ");
        String upiId = sc.nextLine();

        System.out.print("Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Payment Amount: ");
        double upiAmount = sc.nextDouble();

        p = new UPIPayment(upiId, mobile);
        p.makePayment(upiAmount);

        sc.close();
    }
}
