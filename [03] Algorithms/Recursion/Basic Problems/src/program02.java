public class program02 {
    void print1ToN(int n){
        if(n==0) return;
        print1ToN(--n);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        program02 p = new program02();
        p.print1ToN(n);
    }
}
