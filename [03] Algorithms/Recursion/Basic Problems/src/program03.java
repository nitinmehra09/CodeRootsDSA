public class program03 {
    int productNto1(int n){
        if(n==1) return 1;
        return n * productNto1(--n);
    }

    public static void main(String[] args) {
        int n = 5;
        program03 p = new program03();
        System.out.println(p.productNto1(n));
    }
}
