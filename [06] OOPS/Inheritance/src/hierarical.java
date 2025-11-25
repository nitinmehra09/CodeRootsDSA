class Animal{
    public void eating(){
        System.out.println("Eating....");
    }
}
class dog extends Animal{
    public void barking(){
        System.out.println("Barking....");
    }
}
class cow extends Animal{
    public void giveMilk(){
        System.out.println("Give milk to us");
    }
}
public class hierarical {
    public static void main(String[] args) {
        System.out.println("I am dog ");
        dog d = new dog();
        d.eating();
        d.barking();
        System.out.println("I am cow ");
        cow c = new cow();
        c.eating();
        c.giveMilk();
    }
}
