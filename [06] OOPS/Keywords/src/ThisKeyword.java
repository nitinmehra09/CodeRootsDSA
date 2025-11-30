class Thiskey{
    int a,b; // fixed
    int x,y; // variable
    public Thiskey() {
        a = 10;
        b = 20;
    }
    
    public Thiskey(int x ,int y){
        this();
        System.out.println("this is parametrize constructor");
        this.x = x;
        this.y = y;
    }
    public void printAll() {
        System.out.printf("a = %d \nb = %d \nx = %d \ny = %d",this.a,this.b,this.x,this.y);
    }    
}
public class ThisKeyword {
    public static void main(String[] args) {
        Thiskey t = new Thiskey(44,99);
        t.printAll();
    }
    
}
