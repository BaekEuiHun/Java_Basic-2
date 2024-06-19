package extends1.overriding;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();


        GasCar gascar = new GasCar();
        gascar.move();
        gascar.fillup();
        gascar.openDoor();

        HydrogdenCar hydrogdenCar = new HydrogdenCar();
        hydrogdenCar.move();
        hydrogdenCar.fillHydrogen();
        hydrogdenCar.openDoor();
    }
}
