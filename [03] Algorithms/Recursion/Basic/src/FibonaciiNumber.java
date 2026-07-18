public class FibonaciiNumber {
    public static int func(int n){
        if(n<=1) return n;
        return func(n-1) + func(n-2);
    }
    public static void main(String[] args) {
        System.out.println("No. at index 11th of seris : " +func(11));
    }
}
