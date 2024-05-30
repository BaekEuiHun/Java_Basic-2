package oop1.ex;

public class answer3 {
    public static void main(String[] args) {

        answer2 answer = new answer2();
        answer.width = 10;
        answer.height = 20;

        int nulbe = answer.area();
        System.out.println("넓이:"+nulbe);
        int doole = answer.area2();
        System.out.println("둘레:"+ doole);
    }
}
