class Display<T>{
    T x;

    public void printHello() {
        System.out.println("Hello"+x+" Type of x = "+x.getClass());
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Display<Integer> d = new Display<>();
        Display<Double> f = new Display<>();
        f.x = 20.0;
        d.x = 20;
        System.out.println("calling through d");
        d.printHello();
        System.out.println("calling through f");
        f.printHello();
    }
}
