package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("짜장", 4000, 3);
        orders[2] = createOrder("곱창", 6000, 4);

        printOrders(orders);
        int totalAmount = getTotalPrice(orders);
        System.out.println("총 결제금액 : " + totalAmount);

    }

    int totalAmount = 0;

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.quantity = quantity;
        order.price = price;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + "가격 : " + orders[i].price + "개수 : " + orders[i].quantity);
        }
    }

    static int getTotalPrice(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
