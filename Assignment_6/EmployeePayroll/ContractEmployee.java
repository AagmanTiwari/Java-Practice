
package EmployeePayroll;

public class ContractEmployee extends Employee {
    double allowance;

    ContractEmployee(int empId, String empName, double basicSalary,
            double allowance) {
        super(empId, empName, basicSalary);
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance;
    }
}
