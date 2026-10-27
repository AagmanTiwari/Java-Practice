package Collections.QueueCustomerServiceTicketManagement;

public class Ticket {
    int ticketid;
    String customerName;
    String Description;

    Ticket(int ticketid, String customerName, String Description) {
        this.ticketid = ticketid;
        this.customerName = customerName;
        this.Description = Description;
    }

    void displayTicket() {
        System.out.println("Ticket ID: " + ticketid);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Issue Description: " + Description);
    }

}
