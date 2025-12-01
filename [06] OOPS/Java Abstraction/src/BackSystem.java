abstract class Bank{
    abstract void rate();
    abstract void displayBank();
}
class pnb extends Bank{
    @Override
    void rate() {
        System.out.println("Rate in pnb = 10%");
    }
    @Override
    void displayBank(){
        System.out.println("Pnb");
    }
    
}
class hdfc extends Bank{
    @Override
    void rate(){
        System.out.println("Rate in hdfc = 13%");
    }
    @Override
    void displayBank(){
        System.out.println("hdfc");
    }
}
class sbi extends Bank{
    @Override
    void rate(){
        System.out.println("Rate in sbi = 12%");
    }
    @Override
    void displayBank(){
        System.out.println("sbi");
    }
}
public class BackSystem {
    public static void main(String[] args) {
        sbi s = new sbi();
        pnb b = new pnb();
        hdfc h = new hdfc();
        s.displayBank();
        s.rate();
        b.displayBank();
        b.rate();
        h.displayBank();
        h.rate();
    }
}
