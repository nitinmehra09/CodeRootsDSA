class ParentMost{
    int x;
    public ParentMost(){
        System.out.println("i am constructor of parent");
    }   
    public ParentMost(int x){
        this.x = x+10;
        System.out.println(this.x);
    }   
    public void display(){
        System.out.println("this is parent");
    }
}
public class superKeywoad extends ParentMost{
    public superKeywoad() {
        System.out.println("I am constructor of child class");
    }
    public superKeywoad(int x) {
        super(x);
        x = this.x+10;
        System.out.println(x);
    }
    @Override
    public void display(){
        super.display();
        System.out.println("this is child");
    }
    public static void main(String[] args) {
        superKeywoad s = new superKeywoad(10);
    }
}
