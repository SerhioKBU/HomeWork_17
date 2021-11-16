
public class Node {
    public int value;
    public Node right;
    public Node left;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", right=" + right +
                ", left=" + left +
                '}';
    }
}
