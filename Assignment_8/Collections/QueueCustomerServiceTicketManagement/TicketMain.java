package Collections.QueueCustomerServiceTicketManagement;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class TicketMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Ticket> tickets = new LinkedList<>();

        int choice;

        do {
            System.out.println("--- Customer Service Ticket Menu ---");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. View Next Ticket");
            System.out.println("4. Display All Pending Tickets");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Issue Description: ");
                    String issue = sc.nextLine();

                    Ticket t = new Ticket(id, name, issue);
                    tickets.offer(t);

                    System.out.println("Ticket added successfully");
                    break;

                case 2:
                    if (tickets.isEmpty()) {
                        System.out.println("No tickets pending");
                    } else {
                        Ticket processed = tickets.poll();
                        System.out.println("Processing Ticket:");
                        processed.displayTicket();
                    }
                    break;

                case 3:
                    if (tickets.isEmpty()) {
                        System.out.println("No tickets pending");
                    } else {
                        System.out.println("Next Ticket:");
                        tickets.peek().displayTicket();
                    }
                    break;

                case 4:
                    if (tickets.isEmpty()) {
                        System.out.println("No tickets pending");
                    } else {
                        System.out.println("--- Pending Tickets ---");

                        for (Ticket ticket : tickets) {
                            ticket.displayTicket();
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting Ticket System");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
