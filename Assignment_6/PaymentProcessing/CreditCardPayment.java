
package PaymentProcessing;

public class CreditCardPayment extends Payment {
    String cardReference;
    double processingFee;

    CreditCardPayment(int paymentId, double amount,
            String cardReference, double processingFee) {
        super(paymentId, amount);
        this.cardReference = cardReference;
        this.processingFee = processingFee;
    }

    @Override
    void processPayment() {
        super.processPayment();
        System.out.println("Card Transaction Reference: " + cardReference);
        System.out.println("Processing Fee: " + processingFee);
        System.out.println("Total Amount: " + (amount + processingFee));
    }
}
