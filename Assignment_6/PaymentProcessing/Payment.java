
package PaymentProcessing;

public class Payment {
    int paymentId;
    double amount;

    Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    void processPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Payment Amount: " + amount);
    }
}
