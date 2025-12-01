class A{
    String aname = "Aname";
    int aAge = 10;
    public void displayA(){
        System.out.println("I am form A");
        System.out.printf("name = %s and age = %d\n",aname,aAge);
    }
    public void test(){
        System.out.println("From A");
    }
}
class B extends A{
    String bname = "Bname";
    int bAge = 20;
    public void displayB(){
        System.out.println("I am from B");
        System.out.printf("name = %s and age = %d\n",bname,bAge);
    }
    @Override
    public void test(){
        super.test();
        System.out.println("From B");
    }
}
public class FunctionOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A a1 = new B();
        // B b1 = new A(); //error becoz child can't hold parent 
        a.displayA();
        b.displayA();
        a1.displayA();
        // a.displayB(); parent con't acces child method
        b.displayB();
        // a1.displayB(); becoz a1 can access only Aname , aAge , DisplayA but in class B it only access overriden method only
        // a1.bname = "Bname"; can't access
        a.test();  //From A
        b.test();  // From B
        a1.test(); // From B --> test is overriden by B , can only acces for a1
        
    }
}
