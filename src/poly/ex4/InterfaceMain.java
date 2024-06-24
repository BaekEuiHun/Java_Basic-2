package poly.ex4;


public class InterfaceMain {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(cow);
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move(); //오버라이딩 떄문에
        System.out.println("동물 이동 테스트 종료");
    }
}
