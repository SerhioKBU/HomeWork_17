public class Main{

    public static void main(String[] args) {
        CreateTree root1 = new CreateTree();
        Node r1 = root1.createNode(1);
        r1.left = root1.createNode(3);
        r1.right = root1.createNode(2);
        r1.left.left = root1.createNode(5);

        CreateTree root2 = new CreateTree();
        Node r2 = root2.createNode(2);
        r2.left = root2.createNode(1);
        r2.right = root2.createNode(3);
        r2.left.right = root2.createNode(4);
        r2.right.right = root2.createNode(7);

        CreateTree tree = new CreateTree();
        Node totalTree = tree.mergeTree(r1, r2);
        System.out.println("Tree: ");
        tree.printNewTree(totalTree);

        System.out.println("\nTree: ");
        System.out.println(totalTree);

    }
}
