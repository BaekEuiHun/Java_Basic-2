package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final  지역변수
        final int data1;
        data1 = 10; //최초 한 번만 할당 가능

        //final 지역 변수 2
        final int data2 = 10;
        method(10);


    }

    static void method(final int parameter) {

    }

}
