package Assignment_2.src;

import java.util.Scanner;

public class BusTicketFare {

    public static int calculateFare(int age) {

        if (age < 5) {
            return 0;
        } else if (age <= 12) {
            return 20;
        } else if (age <= 59) {
            return 40;
        } else {
            return 25;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Passenger Age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            int fare = calculateFare(age);

            System.out.println("Passenger Name = " + name);
            System.out.println("Passenger Age = " + age);
            System.out.println("Ticket Fare = Rs. " + fare);
        }

        sc.close();
    }
}
