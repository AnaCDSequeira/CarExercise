public class Car {
    private String brand;
    private String color;
    private Engine engine;
    private Radio radio;
    private Tyre tyre;

    public Car(String brand, String color, Engine engine, Radio radio, Tyre tyre) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.radio = radio;
        this.tyre = tyre;
    }

    public void accelerate(int fuel) {
        if (tyre.getIntegrity() <= 0) {
            System.out.println("Tyre has no integrity.");
            return;
        }

        int distance = engine.generateEnergy(fuel);

        if (distance <= 0) {
            System.out.println("No vrum, vrum for you! No fuel!");
        }

        System.out.println("Vrum, vrum for " + distance + "km.");

        boolean hasTyreExploded = tyre.spinTyre(distance);

        if (hasTyreExploded) {
            radio.playMusic();
        }
    }

    public void refuel(int fuel) {
        engine.setFuelLevel(fuel);
        System.out.println("Car has been refuelled!");
    }

    public void changeTyre(int integrity) {
        tyre.changeTyre(integrity);
        System.out.println("Tyre has been changed!");
    }

    public String getBrand(String brand) {
        return this.brand;
    }

    public String getColor(String color) {
        return this.color;
    }
}