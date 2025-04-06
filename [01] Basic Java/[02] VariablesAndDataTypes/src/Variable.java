public class Variable {
    // instance variable
    int b = 30;
    public static void main(String[] args) {
        // local variable 
        int a = 20;
        System.out.println(a);
        Variable sc = new Variable();
        sc.b += a; 
        System.out.println(sc.b);
    }
}
