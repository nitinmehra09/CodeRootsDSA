class A{
    private int x;
    A(){
        this.x = 20;
    }
    A(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getX());
        A b = new A(44);
        System.out.println(b.getX());
    }
}
