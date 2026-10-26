
package Abstraction.HospitalBillingAbstract;

import java.util.Scanner;

public class HospitalBillingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- InPatient Details ---");
        System.out.print("Enter Patient ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Number of Admission Days: ");
        int days = sc.nextInt();

        Patient p1 = new InPatient(id1, name1, days);

        System.out.println("\n--- InPatient Bill ---");
        p1.displayPatientDetails();
        System.out.println("Total Bill: " + p1.calculateBill());

        System.out.println("\n--- OutPatient Details ---");
        System.out.print("Enter Patient ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Medicine Charges: ");
        double medicine = sc.nextDouble();

        Patient p2 = new OutPatient(id2, name2, medicine);

        System.out.println("\n--- OutPatient Bill ---");
        p2.displayPatientDetails();
        System.out.println("Total Bill: " + p2.calculateBill());

        sc.close();
    }
}
