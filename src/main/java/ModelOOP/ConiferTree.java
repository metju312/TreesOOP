package ModelOOP;

public class ConiferTree extends Tree {

    public ConiferTree(int size) {
        super(size);
    }

    public void addLeafs() {
        for (Branch branch : branches) {
            branch.addLeafs();
        }
        dumpNeedlesIfOld();
    }

    protected void growLeaves() {
        for (Branch branch : branches) {
            branch.growLeaves(size);
        }
    }

    private void dumpNeedlesIfOld() {
        for (Branch branch : branches){
            branch.dumpNeedlesIfOld();
        }
    }

    protected void printTreeType() {
        System.out.println("#################");
        System.out.println("## ConiferTree ##");
        System.out.println("#################");
    }

    protected void setLeafType() {
        leafType = LeafType.NEEDLE;
    }

    protected void dropLeavesIfNeeded() {
        dumpNeedlesIfOld();
    }
}
