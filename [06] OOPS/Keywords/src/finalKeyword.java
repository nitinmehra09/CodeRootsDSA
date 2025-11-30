class Finalk{
    final int x;

    public Finalk(int x) {
        this.x = x;
    }
}
public class finalKeyword {
    public static void main(String[] args) {
        Finalk f = new Finalk(20);
        // f.x = 30; --> gives error
        System.out.println(f.x);
    }
}
