public class BST {
    class Node{
        int value;
        Node left;
        Node right;
        int height;
        public Node() {
        }

        public Node(int value){
            this.value = value;
        }
    }

    public BST(){

    }
    private Node root;

    int getHeight(Node node){
        return node == null ? -1 : node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    // insertion
    public void insert(int value){
        root = populate(value, root);
    }
    public void insertArray(int[] nums){
        for(int num : nums){
            root = populate(num, root);
        }
    }

    // populating
    private Node populate(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node; 
        }
        if(value > node.value){
            node.right = populate(value,node.right);
        }
        else if(value < node.value){
            node.left = populate(value, node.left);

        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) +1;
        return node;
    }

    public boolean balanced() {
        return balanced(root);
    }

    boolean balanced(Node node){
        if (node == null) {
            return true;
        }
        int x = Math.abs(getHeight(node.left) - getHeight(node.right));
        return x <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root,"");
    }

    //traversal techniques
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
}