
package Abstraction.EmployeeSalary;

import java.util.Scanner;

public class EmployeeMain {
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

        Employee e1 = new PermanentEmployee(id1, name1, salary1);

        System.out.println("\n--- Permanent Employee Salary ---");
        e1.displayDetails();
        System.out.println("Total Salary: " + e1.calculateSalary());

        System.out.println("\n--- Contract Employee ---");
        System.out.print("Enter Employee ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary2 = sc.nextDouble();

        Employee e2 = new ContractEmployee(id2, name2, salary2);

        System.out.println("\n--- Contract Employee Salary ---");
        e2.displayDetails();
        System.out.println("Total Salary: " + e2.calculateSalary());

        sc.close();
    }
}
