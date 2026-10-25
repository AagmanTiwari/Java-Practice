package BankingTransactions;

public class BankAccount {
    long accountNumber;
    String holderName;
    double balance;

    BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit 1: Only amount
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    // Deposit 2: Amount and transaction reference
    void deposit(double amount, String transactionReference) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Transaction Reference: " + transactionReference);
        System.out.println("Updated Balance: " + balance);
    }

    // Deposit 3: Amount, reference, and mode
    void deposit(double amount, String transactionReference, String depositMode) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Transaction Reference: " + transactionReference);
        System.out.println("Deposit Mode: " + depositMode);
        System.out.println("Updated Balance: " + balance);
    }

    void displayAccount() {
        System.out.println("\n--- Final Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Final Balance: " + balance);
    }

}
