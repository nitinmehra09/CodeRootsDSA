class Node<T>{
    T data;
    Node<T> next;

    public Node() {
        this.next = null;
    }

    public Node(T data){
        this.data = data;
        this.next= null;
    }
}

public class InsertionInLinkedList {
    Node<Integer> head;
    int size;

    public InsertionInLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public void DeletionFromHead(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node<Integer> temp = head;
        head = head.next;
        temp.next = null;
        size--;
    }

    public void DeletionFromTail(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node<Integer> temp = head;
        Node<Integer> prev = temp;
        //for single node;
        if(head.next == null){
            head = null;
            size--;
            return;
        }
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        size--;
    }

    public void InsertAtHead(int data){
        Node<Integer> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Insertion at head is Successful");
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
        System.out.println("Insertion at tail is Successful");
        size++;
    }
    public void InsertAtPosition(int n,int data){
        if (n>size+1 || n<=0 ) {
            System.out.println("Wrong Input");
            return;
        }
        if(n==size+1){
            InsertAtTail(data);
        }
        else if(n==1){
            InsertAtHead(data);
        }
        else{
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;
            int i = 1;
            while(i<n-1 && temp!=null){
                i++;
                temp = temp.next;
            }
            if (temp == null) return;
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Insertion at position " + n + " is Successful");
            size++;
        }
    }
    public static void main(String[] args) {
        InsertionInLinkedList l = new InsertionInLinkedList();

        System.out.println("=== INSERTION OPERATIONS ===");

        // Insert at Head
        l.InsertAtHead(10);
        l.InsertAtHead(20);
        l.InsertAtHead(30);
        l.printList();   // 30 -> 20 -> 10 -> null

        // Insert at Tail
        l.InsertAtTail(40);
        l.InsertAtTail(50);
        l.printList();   // 30 -> 20 -> 10 -> 40 -> 50 -> null

        // Insert at Position
        l.InsertAtPosition(1, 100);   // head
        l.printList();

        l.InsertAtPosition(4, 200);   // middle
        l.printList();

        l.InsertAtPosition(l.size + 1, 300); // tail
        l.printList();

        System.out.println("\n=== DELETION OPERATIONS ===");

        // Delete from Head
        l.DeletionFromHead();
        l.printList();

        // Delete from Tail
        l.DeletionFromTail();
        l.printList();

        // Multiple deletions
        l.DeletionFromHead();
        l.DeletionFromTail();
        l.printList();

        System.out.println("\n=== EDGE CASE TESTING ===");

        // Deleting all nodes
        while (l.size > 0) {
            l.DeletionFromHead();
            l.printList();
        }

        // Try deleting from empty list
        l.DeletionFromHead();
        l.DeletionFromTail();
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