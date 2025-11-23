
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public int dequeue(){
        if(stack1.isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }
        return stack1.pop();
    }
    public boolean  isEmpty(){
        return stack1.isEmpty();
    }
    public int peek(){
        if(stack1.isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }
        return stack1.peek();
    }
    public void enqueue(int x){
        if(stack1.isEmpty()){
            stack1.push(x);
        }else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(x);

            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); 
        System.out.println(q.peek());    

        q.enqueue(40);
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }
}