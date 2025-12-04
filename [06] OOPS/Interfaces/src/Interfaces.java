interface A{
    public void display();
    static void printSomthing(){
        System.out.println("Somthing");
    }
    private void greetUser(){
        System.out.println("Hello Everone");
    }
    void calculateArea(int x);

}
class B implements A{
    public void display(){
        System.out.println("Displaying...");
    }
    public void calculateArea(int x){
        System.out.println(x*x*3.14);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        B b = new B();
        // b.greetUser(); ccan't becoz greetUser is private method

        b.calculateArea(5);
        b.display();
        A.printSomthing();

    }
}