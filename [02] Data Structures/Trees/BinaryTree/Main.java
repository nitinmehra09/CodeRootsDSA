import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(scanner);
    
    System.out.println("Tree structure:");
    tree.display();

    System.out.println("InOrder:");
    tree.inOrder();

    System.out.println("PreOrder:");
    tree.preOrder();

    System.out.println("PostOrder:");
    tree.postOrder();
  }
}
