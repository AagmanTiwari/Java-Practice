// 7. Positive, Negative or Zero
// Write a Java program to accept an integer and check whether it is positive, negative, or zero using if and if-else.

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is a Positive Number");
        } else if (number < 0) {
            System.out.println(number + " is a Negative Number");
        } else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}
