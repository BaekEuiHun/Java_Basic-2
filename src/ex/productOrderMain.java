package ex;

public class productOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 3000;
        order1.quantity = 5;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "짜장";
        order2.price = 4000;
        order2.quantity = 7;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "제육";
        order3.price = 2000;
        order3.quantity = 4;
        orders[2] = order3;

        int sum = 0;
        for(int i = 0; i < orders.length; i++) {
            System.out.println("음식명은 : " + orders[i].productName + "가격은 : " + orders[i].price + " 수량은 : " + orders[i].quantity);
            sum += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 합은 : " + sum);

    }
}
