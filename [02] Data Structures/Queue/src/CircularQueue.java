

public class CircularQueue {
    int rear,front;
    int queue[];
    int capacity, size;
    public CircularQueue(int capacity){
        this.capacity = capacity;
        rear = -1;
        front = -1;
        queue = new int[capacity];
        size = 0;
    }
    public boolean isEmpty(){
        return rear ==-1 && front ==-1;
    }
    public boolean isFull(){
        return (front==0 && rear == capacity-1) || (front!=0 && rear==(front-1+capacity)%capacity);
    }
    public int peek(){
        if(front == -1 && rear ==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }
        else{
            int val = queue[front];
            if(rear == front){
                front = -1;
                rear = -1;
            }else{
                front = (front+1)%capacity;
            }
            size--;
            return val;
        }
    }
    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full ");
            return;
        }
        if(isEmpty()){
            rear = 0;
            front = 0;
        }else{
            rear = (rear+1)%capacity;
        }
        queue[rear] = x;
        size++;
    }

    public int getSize() {
        return size;
    }
    public void printCircularQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return;
        }
        System.out.print("Queue elements: ");
        if(rear<front){
            for (int i =front;i<capacity;i++){
                System.out.print(queue[i]);
                if(i!=rear){
                    System.out.print("\t");
                }
            }
            for (int i =0;i<=rear;i++){
                System.out.print(queue[i]);
                if(i!=rear){
                    System.out.print("\t");
                }
            }
        }else{
            for (int i =front;i<=rear;i++){
                System.out.print(queue[i]);
                if(i!=rear){
                    System.out.print("\t");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        System.out.println(queue.isEmpty());  
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printCircularQueue();
        queue.enqueue(60);

        queue.dequeue();
        queue.enqueue(60);
        queue.printCircularQueue(); 

        System.out.println(queue.isEmpty()); 
    }
}