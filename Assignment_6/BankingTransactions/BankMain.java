package BankingTransactions;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Account number:");
        long number = sc.nextLong();
        sc.nextLine();

        System.out.println("Account Holder Name: ");
        String name = sc.nextLine();

        System.out.println("Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(number, name, balance);

        System.out.print("\nEnter First Deposit Amount: ");
        double amount1 = sc.nextDouble();
        account.deposit(amount1);

        System.out.print("\nEnter Second Deposit Amount: ");
        double amount2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Transaction Reference: ");
        String reference2 = sc.nextLine();
        account.deposit(amount2, reference2);

        System.out.print("\nEnter Third Deposit Amount: ");
        double amount3 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Transaction Reference: ");
        String reference3 = sc.nextLine();
        System.out.print("Enter Deposit Mode: ");
        String mode = sc.nextLine();
        account.deposit(amount3, reference3, mode);

        account.displayAccount();
        sc.close();
    }

}
