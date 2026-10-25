package HospitalManagement;

import java.util.Scanner;

public class HospitalMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient[] patients = new Patient[3];

        for (int i = 0; i < patients.length; i++) {
            System.out.println("Enter Patient " + (i + 1) + "Details");

            System.out.println("Enter Patient Id: ");
            int pid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Patient Name: ");
            String pName = sc.nextLine();

            System.out.println("Enter Doctor ID: ");
            int did = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Doctor Name: ");
            String dName = sc.nextLine();

            System.out.println("Enter Doctor SPecilization: ");
            String dSpec = sc.nextLine();

            Doctor dr = new Doctor(did, dName, dSpec);
            patients[i] = new Patient(pid, pName, dr);

        }

        System.out.println("----------Hospital Patient Details---------------");

        for (int i = 0; i < patients.length; i++) {
            System.out.println("Patient :" + (i + 1));
            patients[i].displayPatient();
        }

        sc.close();
    }

}
