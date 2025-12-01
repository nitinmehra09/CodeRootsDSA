abstract class A{
    abstract void display();
    int a;
    public A(int a) {
        this.a = a;
    }
    public void print(){
        System.out.println(a);
    }
    
}
class B extends A{
    public B(int a){
        super(a);
    }
    @Override
    void display() {
        System.out.println("Started from B \n");
    }
    
}
public class AbstractionInJava {
    public static void main(String[] args) {
        B b = new B(20);
        b.display();
        System.out.print(b.a);
    }
}
