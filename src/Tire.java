public class Tire {

    private int integrity;

    public Tire(int integrity) {

        this.integrity = integrity;
    }

    public boolean spinTire(int distance) {
        boolean hasTireExploded = false;

        integrity -= (distance / 10);

        if (integrity <= 0) {
            hasTireExploded = true;
            System.out.println("Boooom!! Tyre exploded!");
        }

        return hasTireExploded;
    }

    public void changeTire(int newTyreIntegrity) {
        integrity = newTyreIntegrity;
    }

    public int getIntegrity() {
        return integrity;
    }
}