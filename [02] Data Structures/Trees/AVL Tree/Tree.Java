public class Tree{
    class Node{
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    //insertion
    public void insert(int Value){
        if(root == null){
            root = new Node(value);
        }else{
            insert(root,value);
        }
    }

    public void insert(Node node,int value){
        if(node == null){
            node = new Node(value);
            return;
        }
        else if(node.value > value){
            insert(node.left,value);
        }
        else{
            insert(node.right,value);
        }
        if(!isBalance()){
            rotation(node);
        }
    }

    //isBalance-function
    boolean isBalance(Node node){
        if(node==null){
            return true;
        }
        int x = Math.abs((node.left.height - node.right.height))
        return x <= 1 && isBalance(node.left) && isBalance(node.right));
    }

    // rotations
    void rotation(Node){
        Node p = node;
        Node c = p.left;
        Node g = c.left;
    }

    // ratation functions : 
    void rrRotation(Node p, Node c, Node g){
        Node temp = c.right;
        c.right = p;
        p.left = temp;
    }
    void llRotation(Node p, Node c, Node g){
        Node temp = c.left;
        c.left = p;
        p.right = temp;
    }
    void lrRotation(Node p, Node c, Node g){
        Node temp1 = g.right;
        Node temp2 = g.left;
        g.right = p;
        g.left = c;
        p.left = temp1;
        c.right = temp2;
    }
    void rlRotation(Node p, Node c, Node g){
        Node temp1 = g.left;
        Node temp2 = g.right;
        g.left = p;
        g.right = c;
        p.right = temp1;
        c.left = temp2;
    }
}