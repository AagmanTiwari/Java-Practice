
package PaymentProcessing;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Credit Card Payment ---");
        System.out.print("Enter Payment ID: ");
        int cardId = sc.nextInt();

        System.out.print("Enter Payment Amount: ");
        double cardAmount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Card Transaction Reference: ");
        String cardRef = sc.nextLine();

        System.out.print("Enter Processing Fee Amount: ");
        double fee = sc.nextDouble();

        Payment p = new CreditCardPayment(cardId, cardAmount, cardRef, fee);
        System.out.println("\n--- Credit Card Payment Details ---");
        p.processPayment();

        System.out.println("\n--- UPI Payment ---");
        System.out.print("Enter Payment ID: ");
        int upiId = sc.nextInt();

        System.out.print("Enter Payment Amount: ");
        double upiAmount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter UPI Transaction Reference: ");
        String upiRef = sc.nextLine();

        System.out.print("Enter Transaction Details: ");
        String details = sc.nextLine();

        p = new UPIPayment(upiId, upiAmount, upiRef, details);
        System.out.println("\n--- UPI Payment Details ---");
        p.processPayment();

        sc.close();
    }
}
