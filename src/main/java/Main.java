import ModelOOP.ConiferTree;
import ModelOOP.LeafyTree;

public class Main {
    public static void main(String[] args){
        scenario1(2,26);
        //scenario2(2,26);
    }

    private static void scenario1(int treeSize, int vegetationIterations) {
        LeafyTree leafyTree = new LeafyTree(treeSize);
        leafyTree.print();
        for (int i = 0; i < vegetationIterations; i++) {
            leafyTree.grow();
            leafyTree.print();
        }
    }

    private static void scenario2(int treeSize, int vegetationIterations) {
        ConiferTree coniferTree = new ConiferTree(treeSize);
        coniferTree.print();
        for (int i = 0; i < vegetationIterations; i++) {
            coniferTree.grow();
            coniferTree.print();
        }
    }
}
