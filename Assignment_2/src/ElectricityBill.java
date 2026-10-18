package Assignment_2.src;

import java.util.Scanner;

public class ElectricityBill {
    public static double calculateBill(int units) {
        double bill;
        if (units <= 100) {
            bill = (units * 2);
        } else if (units <= 200) {
            bill = 200 + (units - 100) * 3;
        } else if (units <= 300) {
            bill = 500 + (units - 200) * 5;
        } else {
            bill = 200 + 300 + 500 + (units - 300) * 7;
        }

        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units: ");

        int units = sc.nextInt();
        if (units < 0) {
            System.out.println("Invalid Input.");
        } else {
            double billamount = calculateBill(units);
            System.out.println("Total electricity bill : " + billamount);
        }

        sc.close();
    }
}