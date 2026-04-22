// Day 95 : Enum usage example

enum OrderStatus {
    PLACED, SHIPPED, DELIVERED, CANCELLED
}

public class Day_95 {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;

        if (status == OrderStatus.PLACED) {
            System.out.println("Order is placed.");
        } else if (status == OrderStatus.SHIPPED) {
            System.out.println("Order is on the way.");
        } else if (status == OrderStatus.DELIVERED) {
            System.out.println("Order delivered successfully.");
        } else {
            System.out.println("Order cancelled.");
        }
    }
}