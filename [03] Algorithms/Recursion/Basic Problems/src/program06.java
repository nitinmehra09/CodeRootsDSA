public class program06 {
    int productOfDigits(int n){
        if(n<=0) return 1;
        return n%10 * productOfDigits(n/10);
    }
    public static void main(String[] args) {
        program06 p = new program06();
        int n = 1245;
        System.out.println(p.productOfDigits(n));
    }
}
