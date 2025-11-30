class A{
    public A(){
        System.out.println("Constructor of A");
    }
}
class B extends A{
    public B(){
        System.out.println("Constructor of B");
    }
}
class C extends A{
    public C(){
        System.out.println("Constructor of C");
    }
}
class D extends B{
    public D(){
        System.out.println("Constructor of D");
    }
}
public class main2{
    public static void main(String[] args) {
        System.out.println("creating object of A");
        A a = new A();
        System.out.println("Creating object of B");
        B b = new B();
        System.out.println("Creating object of C");
        C c = new C();
        System.out.println("Creating object of D");
        D d = new D();
    }
}
