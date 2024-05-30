package oop1.ex;

public class answer {
    public static void main(String[] args) {
        int width = 8;
        int height = 10;

        int area = calculateArea(width,height);
        System.out.println("넓이 : " + area);

        int perimeter = calculatePerimeter(width,height);
        System.out.println("둘레 : " + perimeter);

    }
    static int calculateArea(int width, int height) {
        return width * height;
    }
    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }
}
