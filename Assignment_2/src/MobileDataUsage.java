package Assignment_2.src;

import java.util.Scanner;

public class MobileDataUsage {

    public static double calculateCharge(double dataUsed) {

        if (dataUsed <= 1) {
            return 50;
        } else if (dataUsed <= 5) {
            return 100;
        } else if (dataUsed <= 10) {
            return 200;
        } else {
            return 350;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Enter Data Usage in GB: ");
        double dataUsed = sc.nextDouble();

        if (dataUsed < 0) {
            System.out.println("Invalid data usage");
        } else {
            double charge = calculateCharge(dataUsed);

            System.out.println("Mobile Number = " + mobileNumber);
            System.out.println("Data Used = " + dataUsed + " GB");
            System.out.println("Total Charge = Rs. " + charge);
        }

        sc.close();
    }
}
