package ModelOOP;

import java.util.ArrayList;
import java.util.List;

public abstract class Tree {
    public Trunk trunk;
    public List<Branch> branches;
    public LeafType leafType;
    public int size;

    public Tree(int size) {
        this.size = size;
        this.trunk = new Trunk(size);
        this.branches = new ArrayList<Branch>();
        addBranches();
        addLeafs();
    }

    private void addBranches() {
        for (int i = 0; i < size; i++) {
            branches.add(new Branch(size));
        }
    }

    public void grow(){
        size++;
        trunk.grow();
        for (Branch branch : branches) {
            branch.grow();
        }
        if(size%13 == 0){ //January grow
            for (int i = 0; i < size/12 + 1; i++) {//every year one more branch to grow pool
                branches.add(new Branch(1));
            }
        }

        dropLeavesIfNeeded();
        growLeaves();
    }

    public void addLeafs(){
        setLeafType();
    }

    public void print() {
        printTreeType();
        trunk.print();
        for (Branch branch : branches) {
            branch.print();
        }
        System.out.println();
    }

    protected abstract void growLeaves();

    protected abstract void printTreeType();

    protected abstract void setLeafType();

    protected abstract void dropLeavesIfNeeded();

}
