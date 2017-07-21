package ModelOOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Branch {

    private List<Leaf> leaves;
    private int size;

    public Branch(int size) {
        this.size = size;
        this.leaves = new ArrayList<Leaf>();
    }

    public void grow() {
        size++;
    }

    public void addLeafs() {
        for (int i = 0; i < size/12 + 1; i++) {//every year one leaves more
            leaves.add(new Leaf(getRandomSize())); //8 months of vegetation
        }
    }

    private int getRandomSize() {
        Random random = new Random();
        int randomSize = random.nextInt(8) + 1;
        while(randomSize > size){
            randomSize--;
        }
        return randomSize;
    }

    public void print() {
        System.out.println("BranchSize: " + size);
        System.out.println("LeavesSize: ");
        for (Leaf leaf : leaves) {
            leaf.print();
            System.out.print(" ");
        }
        System.out.println();
    }

    public void dumpAllLeaves() {
        Iterator<Leaf> iterator = leaves.iterator();
        while (iterator.hasNext()) {
            Leaf leaf = iterator.next();
            iterator.remove();
        }
    }

    public void growLeaves(int treeSize) {
        for (Leaf leaf : leaves) {
            leaf.grow();
        }
        addNewLeaves(treeSize);
    }

    private void addNewLeaves(int treeSize) {
        if(treeSize%13 == 0){ //January grow new leaves
            for (int i = 0; i < size/12 + 1; i++) {
                leaves.add(new Leaf(1));
            }
        }
    }

    public void dumpNeedlesIfOld() {
        Iterator<Leaf> iterator = leaves.iterator();
        while (iterator.hasNext()) {
            Leaf leaf = iterator.next();
            if(leaf.getSize() >= 10){
                int probability = getProbabilityBasedOnSize(leaf.getSize());
                if(probability >= 20){
                    iterator.remove();
                }
            }
        }
    }

    private int getProbabilityBasedOnSize(int size) {
        Random random = new Random();
        //return random.nextInt(max + 1 - min) + min;
        return random.nextInt(20 + 1 - size) + size;
    }
}
