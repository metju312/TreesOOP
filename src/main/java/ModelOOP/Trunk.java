package ModelOOP;

public class Trunk {

    private int size;

    public Trunk(int size) {
        this.size = size;

    }

    public void grow() {
        size++;
    }

    public void print() {
        System.out.println("TrunkSize: " + size);
    }
}
