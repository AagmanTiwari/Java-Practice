package Assignment_2.src;

import java.util.Scanner;

public class VotingEligibility {

    public static boolean isEligible(int age) {

        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            boolean eligible = isEligible(age);

            if (eligible) {
                System.out.println("Eligible to Vote");
            } else {
                System.out.println("Not Eligible to Vote");
            }
        }

        sc.close();
    }
}
