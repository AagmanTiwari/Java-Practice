package EmployeePayroll;

public class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int empId, String empName, double basicSalary,
            double hra, double da) {
        super(empId, empName, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra + da;
    }

}
