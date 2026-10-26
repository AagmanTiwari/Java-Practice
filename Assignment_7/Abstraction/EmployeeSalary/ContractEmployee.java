
package Abstraction.EmployeeSalary;

public class ContractEmployee extends Employee {

    ContractEmployee(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 3000;
    }
}
