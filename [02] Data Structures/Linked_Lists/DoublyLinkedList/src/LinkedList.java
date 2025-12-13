

class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;
    public Node(){
        this.next = null;
        this.prev = null;
    }
    public Node(T data){
        this();
        this.data = data;
    }

}
public class LinkedList {
    Node<Integer> head;
    int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void InsertAtHead(int data){
        Node<Integer> temp = new Node<>(data);
        if(head == null){
            head = temp;
            size++;
            return;
        }
        head.prev = temp;
        temp.next = head ;
        head = temp;
        size++;
    }
    
    public void InsertAtTail(int data){
        Node<Integer> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        Node<Integer> temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }

    public void DeleteFromHead(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            size--;
            return;
        } 
        Node<Integer> temp = head;
        head = head.next;
        head.prev = null;     
        temp = null;
        size--;      
    }

    public void DeleteFromTail(){
        Node<Integer> temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node<Integer> prevNode = temp;
        while(temp.next!=null){
            prevNode = temp;
            temp = temp.next;
        }
        temp.prev = null;
        prevNode.next = null;
        size--;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        System.out.println("=== Insert at Head ===");
        l.InsertAtHead(10);
        l.InsertAtHead(20);
        l.InsertAtHead(30);
        l.printList();

        System.out.println("\n=== Insert at Tail ===");
        l.InsertAtTail(40);
        l.InsertAtTail(50);
        l.printList();

        System.out.println("\n=== Delete from Head ===");
        l.DeleteFromHead();
        l.printList();

        System.out.println("\n=== Delete from Tail ===");
        l.DeleteFromTail();
        l.printList();

        System.out.println("\n=== Print Reverse ===");
        l.printReverse();
    }

    public void printReverse(){
        Node<Integer> temp = head;  
        while (temp.next != null) {      
            temp = temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null"); 
    }

    public void printList() {
        Node<Integer> temp = head;  
        while (temp != null) {      
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); 
    }

}
