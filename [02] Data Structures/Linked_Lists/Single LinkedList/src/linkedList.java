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

public class linkedList {
    Node<Integer> head;
    int size;

    public linkedList() {
        this.head = null;
        this.size = 0;
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
        linkedList l = new linkedList();
        System.out.println("=== Testing InsertAtHead ===");
        l.InsertAtHead(10);
        l.InsertAtHead(20);
        l.InsertAtHead(30);
        l.printList();   // 30 -> 20 -> 10 -> null

        System.out.println("\n=== Testing InsertAtTail ===");
        l.InsertAtTail(40);
        l.InsertAtTail(50);
        l.printList();   // 30 -> 20 -> 10 -> 40 -> 50 -> null

        System.out.println("\n=== Testing InsertAtPosition ===");
        l.InsertAtPosition(1, 999);     // insert at head
        l.printList();   

        l.InsertAtPosition(3, 777);     // insert in middle
        l.printList();   

        l.InsertAtPosition(l.size + 1, 555);  // insert at tail
        l.printList();   

        System.out.println("\n=== Testing Wrong Input ===");
        l.InsertAtPosition(0, 111);     // invalid
        l.InsertAtPosition(100, 222);   // invalid
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