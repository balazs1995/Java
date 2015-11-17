package BinTree;

public class Node {

    private char value;
    private Node right;
    private Node left;

    public Node(char value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public char getValue() {
        return value;
    }

}
