
package OnlineShoppingOrder;

public class Order {
    int orderId;
    String orderDate;
    double orderAmount;

    Order(int orderId, String orderDate, double orderAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Amount: " + orderAmount);
    }
}
