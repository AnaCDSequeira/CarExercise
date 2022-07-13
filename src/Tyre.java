public class Tyre {

    private int integrity;

    public Tyre(int integrity) {
        this.integrity = integrity;
    }

    public boolean spinTyre(int distance) {
        boolean hasTyreExploded = false;

        integrity -= (distance / 10);

        if (integrity <= 0) {
            hasTyreExploded = true;
            System.out.println("Boooom!! Tyre exploded!");
        }

        return hasTyreExploded;
    }

    public void changeTyre(int newTyreIntegrity) {
        integrity = newTyreIntegrity;
    }

    public int getIntegrity() {
        return integrity;
    }
}