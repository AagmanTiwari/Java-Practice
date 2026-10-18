// 9. Voting Eligibility
// Write a Java program to accept a person's age and check whether the person is eligible to vote.
// Age >= 18 → Eligible
// Age < 18  → Not Eligible

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        sc.close();
    }
}
