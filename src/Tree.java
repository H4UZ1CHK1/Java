class Tree {
    private Branch branch;
    private Leaf leaf;

    public Tree(String branchState, String leafColor) {
        this.branch = new Branch(branchState);
        this.leaf = new Leaf(leafColor);
    }

    public void bloom() {
        branch.bloom();
        leaf.bloom();
    }

    public void fallLeaves() {
        leaf.fall();
    }

    public void coverWithFrost() {
        branch.freeze();
        leaf.freeze();
    }

    public void showState() {
        System.out.println("Состояние ветки: " + branch.getState());
        System.out.println("Цвет листка: " + leaf.getColor());
    }
}
