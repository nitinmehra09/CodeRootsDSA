public class DoubleEndedQueue {
    int rear,front;
    int queue[];
    int capacity,size;
    public DoubleEndedQueue(int capacity){
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
    public void enqueueAtRear(int x){
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
    public void enqueueAtFront(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            rear = 0;
            front = 0;
        }
        else if(front==0){
            front = capacity-1;
        }
        else{
            front--;
        }
        queue[front] = x;
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
    }
    public static void main(String[] args) {
        DoubleEndedQueue queue = new DoubleEndedQueue(5);

        System.out.println(queue.isEmpty());

        queue.enqueueAtRear(10);
        queue.enqueueAtRear(20);
        queue.enqueueAtFront(5);
        queue.enqueueAtFront(1);
        queue.enqueueAtRear(30);

        queue.printDeque(); // print before deletions

        System.out.println(queue.peekFront());
        System.out.println(queue.peekRear());

        System.out.println(queue.dequeueAtFront());
        System.out.println(queue.dequeueAtRear());

        queue.printDeque(); // print after deletions

        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
    }
}