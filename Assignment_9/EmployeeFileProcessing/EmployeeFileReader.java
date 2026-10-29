package EmployeeFileProcessing;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EmployeeFileReader {

    void readEmployeeDetails() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
