package Interfaces.PaymentProcessingInterface;

public class CreditCardPayment implements Payment {
    String cardHolderName;
    String cardNumber;
    String bankName;

    CreditCardPayment(String cardHolderName, String cardNumber, String bankName) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.bankName = bankName;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("--- Credit Card Payment ---");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Payment Amount: " + amount);
    }
}