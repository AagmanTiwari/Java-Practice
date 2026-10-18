package Assignment_2.src;

import java.util.Scanner;

public class EmployeeSalary {

    public static double calculateSalary(double basicSalary) {

        double hra;

        if (basicSalary >= 50000) {
            hra = basicSalary * 0.20;
        } else {
            hra = basicSalary * 0.10;
        }

        return basicSalary + hra;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        if (basicSalary < 0) {
            System.out.println("Invalid salary");
        } else {
            double finalSalary = calculateSalary(basicSalary);

            System.out.println("Basic Salary = Rs. " + basicSalary);
            System.out.println("Final Salary = Rs. " + finalSalary);
        }

        sc.close();
    }
}
