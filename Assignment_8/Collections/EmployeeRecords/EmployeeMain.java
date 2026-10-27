package Collections.EmployeeRecords;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class EmployeeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, Employee> employees = new HashMap<>();

        int choice;

        do {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Check Employee ID");
            System.out.println("7. Total Employees");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (employees.containsKey(id)) {
                        System.out.println("Employee ID already exists");
                        break;
                    }

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, dept, salary);
                    employees.put(id, emp);

                    System.out.println("Employee added successfully");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records available");
                    } else {
                        System.out.println("--- Employee Records ---");

                        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {

                            Employee e = entry.getValue();
                            e.displayEmployee();
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    Employee found = employees.get(searchId);

                    if (found != null) {
                        found.displayEmployee();
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();

                    Employee updateEmp = employees.get(updateId);

                    if (updateEmp != null) {
                        System.out.print("Enter New Salary: ");
                        double newSalary = sc.nextDouble();

                        updateEmp.salary = newSalary;
                        System.out.println("Salary updated successfully");
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();

                    Employee deleted = employees.remove(deleteId);

                    if (deleted != null) {
                        System.out.println("Employee deleted successfully");
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;

                case 6:
                    System.out.print("Enter Employee ID to check: ");
                    int checkId = sc.nextInt();

                    if (employees.containsKey(checkId)) {
                        System.out.println("Employee ID exists");
                    } else {
                        System.out.println("Employee ID not found");
                    }
                    break;

                case 7:
                    System.out.println("Total Employees: " + employees.size());
                    break;

                case 8:
                    System.out.println("Exiting Employee Management");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}
