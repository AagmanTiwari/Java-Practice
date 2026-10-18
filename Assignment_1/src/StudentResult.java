// 10. Student Result
// Write a Java program to accept marks of a student and check whether the student has passed or failed.
// Marks >= 40 → Pass
// Marks < 40  → Fail

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println("Student has Passed");
        } else {
            System.out.println("Student has Failed");
        }

        sc.close();
    }
}
