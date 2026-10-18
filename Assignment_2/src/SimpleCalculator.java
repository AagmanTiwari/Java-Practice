package Assignment_2.src;

import java.util.Scanner;

public class SimpleCalculator {

    public static double calculate(double a, double b, char operator) {

        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/') {
            if (b == 0) {
                return Double.NaN;
            }
            return a / b;
        } else {
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = calculate(num1, num2, operator);

        if (operator == '/' && num2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (Double.isNaN(result)) {
            System.out.println("Invalid operator");
        } else {
            System.out.println("Result = " + result);
        }

        sc.close();
    }
}
