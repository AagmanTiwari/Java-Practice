
package PaymentProcessing;

public class UPIPayment extends Payment {
    String upiReference;
    String transactionDetails;

    UPIPayment(int paymentId, double amount,
            String upiReference, String transactionDetails) {
        super(paymentId, amount);
        this.upiReference = upiReference;
        this.transactionDetails = transactionDetails;
    }

    @Override
    void processPayment() {
        super.processPayment();
        System.out.println("UPI Transaction Reference: " + upiReference);
        System.out.println("Transaction Details: " + transactionDetails);
    }
}
