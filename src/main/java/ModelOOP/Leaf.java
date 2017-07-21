package ModelOOP;

public class Leaf {

    private int size;

    public Leaf(int size) {
        this.size = size;
    }

    public void print() {
        System.out.print(size);
    }

    public void grow() {
        size++;
    }

    public int getSize() {
        return size;
    }
}
