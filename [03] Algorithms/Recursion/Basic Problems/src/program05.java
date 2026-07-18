public class program05 {
    int sumOfDigits(int n){
        if(n<=0) return 0;
        return n%10 + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        program05 p = new program05();
        System.out.println(p.sumOfDigits(54321));
    }
}
