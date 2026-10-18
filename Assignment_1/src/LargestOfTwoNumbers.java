// 8. Largest of Two Numbers
// Write a Java program to accept two numbers and find the larger number using if-else. If both numbers are equal, display an appropriate message.

import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the Largest Number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the Largest Number");
        } else {
            System.out.println("Both numbers are Equal");
        }

        sc.close();
    }
}
