package Interfaces.OnlineDeliverySystem;

public class StandardDelivery implements DeliveryService {
    int orderId;
    String customerName;
    double distance;

    StandardDelivery(int orderId, String customerName, double distance) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.distance = distance;
    }

    @Override
    public double calculateDeliveryCharge(double distance) {
        return distance * 10;
    }

    @Override
    public void displayDeliveryDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Distance: " + distance + " km");
    }
}