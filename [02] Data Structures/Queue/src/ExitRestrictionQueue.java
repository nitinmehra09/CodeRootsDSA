public class ExitRestrictionQueue{
    int rear,front;
    int queue[];
    int capacity,size;
    public ExitRestrictionQueue(int capacity){
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
    public int dequeue(){
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
        ExitRestrictionQueue queue = new ExitRestrictionQueue(5);

        System.out.println(queue.isEmpty()); // true

        queue.enqueueAtRear(10);
        queue.enqueueAtRear(20);
        queue.enqueueAtFront(5);
        queue.enqueueAtRear(1);
        queue.enqueueAtFront(30);

        queue.printDeque(); // Print full queue

        System.out.println("Front Element: " + queue.peekFront());
        System.out.println("Rear Element: " + queue.peekRear());

        System.out.println("Removed: " + queue.dequeue()); // from front
        System.out.println("Removed: " + queue.dequeue()); // from front again

        queue.printDeque(); // Print after removals

        System.out.println("Size: " + queue.getSize());
        System.out.println("Is Empty: " + queue.isEmpty());
    }  
}