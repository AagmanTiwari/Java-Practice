
package EmployeePayroll;

import java.util.Scanner;

public class PayrollMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Permanent Employee ---");
        System.out.print("Enter Employee ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary1 = sc.nextDouble();

        System.out.print("Enter HRA Amount: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA Amount: ");
        double da = sc.nextDouble();

        Employee emp = new PermanentEmployee(id1, name1, salary1, hra, da);

        System.out.println("\n--- Permanent Employee Details ---");
        emp.displayEmployee();
        System.out.println("Calculated Salary: " + emp.calculateSalary());

        System.out.println("\n--- Contract Employee ---");
        System.out.print("Enter Employee ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary2 = sc.nextDouble();

        System.out.print("Enter Agreed Allowance: ");
        double allowance = sc.nextDouble();

        emp = new ContractEmployee(id2, name2, salary2, allowance);

        System.out.println("\n--- Contract Employee Details ---");
        emp.displayEmployee();
        System.out.println("Calculated Salary: " + emp.calculateSalary());

        sc.close();
    }
}
