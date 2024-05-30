package practice;

import ref.ex.ProductOrder;

public class ItemOrderMain {
    public static void main(String[] args) {

        ItemOrder orders[] = new ItemOrder[2];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("두부", 2000, 2);


        int sum = 0;

        for(int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].itemName + "가격 : " + orders[i].price + "개수 : " + orders[i].quantity);
            sum += orders[i].quantity * orders[i].price;
        }
        System.out.println("총 가격 : " + sum);


    }
        static ItemOrder createOrder(String itemName, int price, int quantity) {
            ItemOrder order = new ItemOrder();
            order.itemName = itemName;
            order.price = price;
            order.quantity = quantity;
            return order;
        }
}