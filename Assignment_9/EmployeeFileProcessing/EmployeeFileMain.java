package EmployeeFileProcessing;

import java.io.IOException;

public class EmployeeFileMain {

    public static void main(String[] args) {

        EmployeeFileReader reader = new EmployeeFileReader();

        try {
            System.out.println("Employee Details:");
            reader.readEmployeeDetails();

        } catch (IOException e) {
            System.out.println("Error: Unable to read employee.txt");
            System.out.println(e.getMessage());
        }
    }
}
