public class program04 {
    int summation1ToN(int n){
        if(n==0) return 0;
        return n+summation1ToN(--n);
    }

    public static void main(String[] args) {
        program04 p = new program04();
        int n = 5;
        System.out.println(p.summation1ToN(n));
    }
}
