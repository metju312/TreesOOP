package ModelOOP;

public class LeafyTree extends Tree {

    public LeafyTree(int size) {
        super(size);
    }

    public void addLeafs() {
        for (Branch branch : branches) {
            branch.addLeafs();
        }
        dumpLeavesIfWinter();
    }

    protected void growLeaves() {
        for (Branch branch : branches) {
            branch.growLeaves(size);
        }
    }

    private void dumpLeavesIfWinter() { //if size % 10,11,12,13 == 0 :winter
        for (Branch branch : branches) {
            for (int i = 10; i <= 13; i++) {
                if(size%i == 0){
                    branch.dumpAllLeaves();
                }
            }
        }
    }

    protected void printTreeType() {
        System.out.println("#################");
        System.out.println("##  LeafyTree  ##");
        System.out.println("#################");
    }

    protected void setLeafType() {
        leafType = LeafType.LEAF;
    }

    protected void dropLeavesIfNeeded() {
        dumpLeavesIfWinter();
    }
}
