
public class CreateTree {

    /**
     * Create new node with data;
     * @param value of Node;
     * @return new Node;
     */
    public Node createNode(int value) {
        return new Node(value);
    }

    /**
     * Merge two binary trees
     * @param root1 - tree #1
     * @param root2 - tree #2
     * @return - total tree
     */
    public Node mergeTree(Node root1, Node root2){
        if (root1 == null) {
            return root2;
        }

        if (root2 == null) {
            return root1;
        }
        root1.value += root2.value;
        root1.right = mergeTree(root1.right, root2.right);
        root1.left = mergeTree(root1.left, root2.left);
        return root1;
    }

    /**
     * In new binary tree, print all nodes in order
     * using recursion
     * @param node is result of two nodes sum
     */
    public void printNewTree(Node node) {
        if (node == null)
            return;

        printNewTree(node.left);
        System.out.print("( " + node.value + " )");
        printNewTree(node.right);
    }
}
