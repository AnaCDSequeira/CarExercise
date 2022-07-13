public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine();
        Radio radio = new Radio();
        Tyre tyre = new Tyre(100);

        Car car = new Car("BMW", "white", engine, radio, tyre);

        car.accelerate(100);
        car.accelerate(10);
        car.changeTyre(100);
        car.refuel(50);
        car.accelerate(10);
    }

}
