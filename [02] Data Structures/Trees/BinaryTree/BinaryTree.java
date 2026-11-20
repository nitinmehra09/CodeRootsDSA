import java.util.Scanner;
public class BinaryTree {

    public BinaryTree() {
    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    private Node root;

    //insertion
    public void populate(Scanner sc) {
        System.out.println("Enter root node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }

    private void populate(Scanner sc , Node node){
        System.out.println("Do you want to enter left of " + node.val);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter value : ");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter right of " + node.val);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter value : ");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc,node.right);
        }
    }

    // display
    public void display() {
        display(root, "");
    }
    public void inOrder() {
        inOrder(root, "");
    }
    public void preOrder() {
        preOrder(root, "");
    }
    public void postOrder() {
        postOrder(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    //traversal techniques
    private void inOrder(Node node, String indent) {
        if (node == null) {
            return;
        }

        inOrder(node.left, indent + "\t");
        System.out.println(indent + node.val);
        inOrder(node.right, indent + "\t");
    }
    private void preOrder(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.val);
        preOrder(node.left, indent + "\t");
        preOrder(node.right, indent + "\t");
    }
    private void postOrder(Node node, String indent) {
        if (node == null) {
            return;
        }

        postOrder(node.left, indent + "\t");
        postOrder(node.right, indent + "\t");
        System.out.println(indent + node.val);
    }
}