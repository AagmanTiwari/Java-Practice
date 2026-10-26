package Interfaces.OnlineDeliverySystem;

public class ExpressDelivery implements DeliveryService {
    int orderId;
    String customerName;
    double distance;

    ExpressDelivery(int orderId, String customerName, double distance) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.distance = distance;
    }

    @Override
    public double calculateDeliveryCharge(double distance) {
        return (distance * 20) + 50;
    }

    @Override
    public void displayDeliveryDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Distance: " + distance + " km");
    }
}
