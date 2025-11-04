public class MyStack{
    int stack[];
    int size;
    int top;

    public MyStack(int stackSize) {
        stack = new int[stackSize];
        size = stackSize;
        top = -1;
    }

    public void push(int element) {
        if(top>=size-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = element;        
    }

    public int pop(){
        int val;
        if(top==-1){
            System.out.println("stack is empty ");
            return Integer.MIN_VALUE;
        }else{
            val = stack[top];
            top--;
        }
        return val;
    }

    public int peek(){
        if(top<=-1){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top<=-1;
    }

    public static void main(String[] args) {
        MyStack st = new MyStack(5);
        
        st.push(10);
        st.push(20);
        st.push(30);
        
        System.out.println("Top element: " + st.peek());
        
        System.out.println("Popped: " + st.pop());
        System.out.println("Popped: " + st.pop());
        System.out.println("Is stack empty? " + st.isEmpty());
    }
}