public class EntryRestrictedQueue {
    int rear,front;
    int queue[];
    int capacity,size;
    public EntryRestrictedQueue(int capacity){
        this.capacity = capacity;
        rear = -1;
        front = -1;
        queue = new int[capacity];
        size=0; 
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return (front==0 && rear == capacity-1) || (front!=0 && rear ==(front-1+capacity)%capacity);
    }
    public int peekRear(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[rear];
    }
    public int peekFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }
    public int getSize(){
        return size;
    }
    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            rear = 0;
            front = 0;
        }else if(rear == capacity-1){
            rear = 0;
        }
        else{
            rear++;
        }
        queue[rear] = x;
        size++;
    }
    public int dequeueAtRear(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else {
            int x = queue[rear];
            if(rear == front){
                front = -1;
                rear = -1;
            }else if(rear==0){
                rear = capacity-1;
            }else {
                rear--;
            }
            size--;
            return x;
        }
    }
    public int dequeueAtFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }else{
            int x = queue[front];
            if(rear == front){
                front = -1;
                rear = -1;
            }
            else if(front==capacity-1){
                front=0;
            }
            else{
                front++;
            }
            size--;
            return x;
        }
    }
    public void printDeque(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return;
        }
        System.out.print("Queue elements: ");
        if (rear < front) {
            for (int i = front; i < capacity; i++) {
                System.out.print(queue[i] + "\t");
            }
            for (int i = 0; i <= rear; i++) { 
                System.out.print(queue[i] + "\t");
            }
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + "\t");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        EntryRestrictedQueue queue = new EntryRestrictedQueue(5);

        System.out.println(queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(1);
        queue.enqueue(30);

        queue.printDeque(); 

        System.out.println(queue.peekFront());
        System.out.println(queue.peekRear());

        System.out.println(queue.dequeueAtFront());
        System.out.println(queue.dequeueAtRear());

        queue.printDeque(); 

        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
    }
}
