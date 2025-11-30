class constructorO{
    int age,x;
    String name ,y;

    public constructorO() {
        x = 10;
        y = "Computer";
    }
    public constructorO(int age) {
        this();
        this.age = age;
    }
    public constructorO(String name) {
        this();
        this.name = name;
    }
    public constructorO(int age , String name) {
        this();
        this.name = name;
        this.age = age;
    }
    
}
public class constructorOverloading {
    public static void main(String[] args) {
        constructorO c = new constructorO(20,"nitin");
        System.out.printf("age = %d and x = %d\nname = %s and y = %s",c.age,c.x,c.name,c.y);
    }
}
