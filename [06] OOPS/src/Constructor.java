class A{
    int age;
    String name;
    //Defualt
    public A(){
        this.age = 20;
        this.name = "Nitin";
    }
    //parametriz
    public A(int age, String name){
        this.age = age;
        this.name = name;
    }
    //copy 
    public A(A M){
        this.age = M.age;
        this.name = M.name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.age);
        System.out.println(a.name);
        A b = new A(19, "kriti");
        System.out.println(b.age);
        System.out.println(b.name);
        b.name = "Hindi";
        A c = new A(b);
        System.out.println(c.name);
        System.out.println(c.age);
        // System.out.println(b.name);
        
        A d = b;
        System.out.println(d.name);
        System.out.println(d.age);
        b.name = "Kirti";
        System.out.println(d.name);
        System.out.println(d.age);
    }
}
