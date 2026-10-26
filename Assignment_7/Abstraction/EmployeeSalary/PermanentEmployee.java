
package Abstraction.EmployeeSalary;

public class PermanentEmployee extends Employee {

    PermanentEmployee(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    @Override
    double calculateSalary() {
        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;
        return basicSalary + hra + da;
    }
}
