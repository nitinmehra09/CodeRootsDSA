class A{
    static int y; 
    int x;
    static class B{
        public void dispaly(){
            System.out.println("Displaying..");
        }
        public static void printHello(){
            // System.out.println("Hello"+x); can't becoz b can only access static 
            System.out.println("Hello"+y);
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        A a = new A();
        A.B b = new A.B();
        A.y = 20;
        a.x =20;
        A.B.printHello();
        b.dispaly();
    }
}