public class QueueImplementation {
    int Queue[];
    int rear,front;
    int capacity;
    public QueueImplementation(int capacity){
        this.capacity = capacity;
        Queue = new int[capacity];
        rear = -1;front = -1;
    }
    public boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public boolean isFull(){
        return rear==capacity-1;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return Queue[front];
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = Queue[front];
        if(rear == front){
            rear = -1;
            front = -1;
        }else{
            front++;
        }
        return val;
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty()){
            rear = 0;
            front = 0;
        }
        else{
            rear++;
        }
        Queue[rear] = val;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        while(i<=rear){
            System.out.print(Queue[i]);
            if(i!=rear){
                System.out.print("\t");
            }
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20

        q.dequeue(); // 20
        q.dequeue(); // 30
        q.dequeue(); // queue empty
    }
}
