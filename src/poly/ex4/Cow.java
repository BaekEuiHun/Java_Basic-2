package poly.ex4;

import poly.ex2.Animal;

public class Cow implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("음매");

    }

    @Override
    public void move() {
        System.out.println("소 이동");

    }
}
