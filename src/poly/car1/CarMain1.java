package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량뱐경 model3로
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
        //Car 타입으로 가보니 car가 있는데 오버라이딩이 되있으므로 car가 아닌 model3car로 호출된다.

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
