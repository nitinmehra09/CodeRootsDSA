class SParent{
    public void Eating(){
        System.out.println("Eating...");
    }
}
class SChild extends SParent{
    public void Singing(){
        System.out.println("I can Sing.....");
    }

}
public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("I am Parent ");
        SParent p = new SParent();
        p.Eating();
        // p.sing() X
        SChild c = new SChild();
        System.out.println("I am child ");
        c.Eating();
        c.Singing();
    }
}
