// 3. Simple Interest
// Write a Java program to accept principal amount, rate of interest and time using variables and calculate the simple interest and total amount.
// Formula:
// Simple Interest = (P × R × T) / 100
// Amount = P + Simple Interest

public class SimpleInterest {
    public static void main(String[] args) {

        double principal = 10000;
        double rate = 5;
        double time = 2;

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("Principal Amount = " + principal);
        System.out.println("Rate of Interest = " + rate);
        System.out.println("Time = " + time);
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Total Amount = " + totalAmount);

    }
}
