package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;

        int nulbe = area(width, height);
        System.out.println("넓이:" + nulbe);
        int doole = area2(width, height);
        System.out.println("둘레:" + doole);


    }
    static int area(int width, int height) {
        return width * height;
    }
    static int area2(int width, int height) {
        return 2 * (width + height);
    }
}
