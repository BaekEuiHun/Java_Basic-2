package ex;

public class productOrderMain {
    public static void main(String[] args) {
        ProductOrder orders[] = new ProductOrder[3];
        ProductOrder order1 = new ProductOrder();
        order1.productName = "김치";
        order1.quantity = 5;
        order1.price = 2000;
        orders[0] = order1;


        ProductOrder order2 = new ProductOrder();
        order2.productName = "짜장";
        order2.quantity = 4;
        order2.price = 3000;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "두부";
        order3.quantity = 2;
        order3.price = 4000;
        orders[2] = order3;


        int sum = 0;
        for(int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + " 개수 : " + orders[i].quantity + " 가격 : " + orders[i].price);
            sum += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 가격 : " + sum + "원");
    }
}
